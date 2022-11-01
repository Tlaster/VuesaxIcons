import org.jetbrains.compose.compose
import org.gradle.api.JavaVersion
import java.util.*

plugins {
    kotlin("multiplatform") version "1.7.20"
    id("org.jetbrains.compose") version "1.2.0"
    id("com.android.library") version "7.3.0"
    id("maven-publish")
    id("signing")
}

group = "moe.tlaster"
version = "1.0.0"

kotlin {
    macosX64()
    macosArm64()
    ios("uikit")
    android {
        publishLibraryVariants("release", "debug")
    }
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.foundation)
                api(compose.ui)
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("androidx.compose.ui:ui:1.2.1")
                implementation("androidx.compose.foundation:foundation:1.2.1")
            }
        }
    }
}

android {
    compileSdk = 33
    buildToolsVersion = "33.0.0"
    namespace = "moe.tlaster.icons.vuesax"
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

ext {
    val publishPropFile = rootProject.file("publish.properties")
    if (publishPropFile.exists()) {
        Properties().apply {
            load(publishPropFile.inputStream())
        }.forEach { name, value ->
            set(name.toString(), value)
        }
    } else {
        set("signing.keyId", System.getenv("SIGNING_KEY_ID"))
        set("signing.password", System.getenv("SIGNING_PASSWORD"))
        set("signing.secretKeyRingFile", System.getenv("SIGNING_SECRET_KEY_RING_FILE"))
        set("ossrhUsername", System.getenv("OSSRH_USERNAME"))
        set("ossrhPassword", System.getenv("OSSRH_PASSWORD"))
    }
}

val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    if (rootProject.file("publish.properties").exists()) {
        signing {
            sign(publishing.publications)
        }
        repositories {
            maven {
                val releasesRepoUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
                val snapshotsRepoUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                url = if (version.toString().endsWith("SNAPSHOT")) {
                    uri(snapshotsRepoUrl)
                } else {
                    uri(releasesRepoUrl)
                }
                credentials {
                    username = project.ext.get("ossrhUsername").toString()
                    password = project.ext.get("ossrhPassword").toString()
                }
            }
        }
    }

    publications.withType<MavenPublication> {
        artifact(javadocJar)
        pom {
            name.set("VuesaxIcons")
            description.set("VuesaxIcons for Compose multiplatform")
            url.set("https://github.com/Tlaster/VuesaxIcons")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }
            developers {
                developer {
                    id.set("Tlaster")
                    name.set("James Tlaster")
                    email.set("tlaster@outlook.com")
                }
            }
            scm {
                url.set("https://github.com/Tlaster/VuesaxIcons")
                connection.set("scm:git:git://github.com/Tlaster/VuesaxIcons.git")
                developerConnection.set("scm:git:git://github.com/Tlaster/VuesaxIcons.git")
            }
        }
    }
}
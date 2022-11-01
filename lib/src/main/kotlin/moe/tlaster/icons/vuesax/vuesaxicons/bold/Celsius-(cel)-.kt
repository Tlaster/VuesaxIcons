package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Celsius-(cel)-`: ImageVector
    get() {
        if (`_celsius-(cel)-` != null) {
            return `_celsius-(cel)-`!!
        }
        `_celsius-(cel)-` = Builder(name = "Celsius-(cel)-", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.93f, 15.74f)
                curveTo(15.75f, 17.3f, 13.95f, 18.19f, 12.0f, 18.19f)
                curveTo(8.59f, 18.19f, 5.81f, 15.41f, 5.81f, 12.0f)
                curveTo(5.81f, 8.59f, 8.59f, 5.81f, 12.0f, 5.81f)
                curveTo(13.35f, 5.81f, 14.64f, 6.24f, 15.72f, 7.05f)
                curveTo(16.05f, 7.3f, 16.12f, 7.77f, 15.87f, 8.1f)
                curveTo(15.62f, 8.43f, 15.15f, 8.5f, 14.82f, 8.25f)
                curveTo(14.0f, 7.63f, 13.03f, 7.31f, 12.0f, 7.31f)
                curveTo(9.42f, 7.31f, 7.31f, 9.41f, 7.31f, 12.0f)
                curveTo(7.31f, 14.59f, 9.41f, 16.69f, 12.0f, 16.69f)
                curveTo(13.48f, 16.69f, 14.84f, 16.01f, 15.74f, 14.83f)
                curveTo(15.99f, 14.5f, 16.46f, 14.44f, 16.79f, 14.69f)
                curveTo(17.12f, 14.94f, 17.18f, 15.41f, 16.93f, 15.74f)
                close()
                moveTo(17.42f, 11.34f)
                curveTo(16.77f, 11.34f, 16.25f, 10.82f, 16.25f, 10.17f)
                curveTo(16.25f, 9.52f, 16.77f, 9.0f, 17.42f, 9.0f)
                curveTo(18.07f, 9.0f, 18.59f, 9.52f, 18.59f, 10.17f)
                curveTo(18.59f, 10.82f, 18.07f, 11.34f, 17.42f, 11.34f)
                close()
            }
        }
        .build()
        return `_celsius-(cel)-`!!
    }

private var `_celsius-(cel)-`: ImageVector? = null

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

public val BoldGroup.`Percentage-circle`: ImageVector
    get() {
        if (`_percentage-circle` != null) {
            return `_percentage-circle`!!
        }
        `_percentage-circle` = Builder(name = "Percentage-circle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.73f, 7.66f)
                curveTo(9.54f, 7.66f, 10.21f, 8.32f, 10.21f, 9.14f)
                curveTo(10.21f, 9.95f, 9.55f, 10.62f, 8.73f, 10.62f)
                curveTo(7.92f, 10.62f, 7.25f, 9.96f, 7.25f, 9.14f)
                curveTo(7.25f, 8.32f, 7.91f, 7.66f, 8.73f, 7.66f)
                close()
                moveTo(8.85f, 15.8f)
                curveTo(8.7f, 15.95f, 8.51f, 16.02f, 8.32f, 16.02f)
                curveTo(8.13f, 16.02f, 7.94f, 15.95f, 7.79f, 15.8f)
                curveTo(7.5f, 15.51f, 7.5f, 15.03f, 7.79f, 14.74f)
                lineTo(14.34f, 8.19f)
                curveTo(14.63f, 7.9f, 15.11f, 7.9f, 15.4f, 8.19f)
                curveTo(15.69f, 8.48f, 15.69f, 8.96f, 15.4f, 9.25f)
                lineTo(8.85f, 15.8f)
                close()
                moveTo(15.27f, 16.34f)
                curveTo(14.46f, 16.34f, 13.79f, 15.68f, 13.79f, 14.86f)
                curveTo(13.79f, 14.05f, 14.45f, 13.38f, 15.27f, 13.38f)
                curveTo(16.08f, 13.38f, 16.75f, 14.04f, 16.75f, 14.86f)
                curveTo(16.75f, 15.68f, 16.09f, 16.34f, 15.27f, 16.34f)
                close()
            }
        }
        .build()
        return `_percentage-circle`!!
    }

private var `_percentage-circle`: ImageVector? = null

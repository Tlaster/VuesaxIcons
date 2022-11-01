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

public val BoldGroup.`Video-circle`: ImageVector
    get() {
        if (`_video-circle` != null) {
            return `_video-circle`!!
        }
        `_video-circle` = Builder(name = "Video-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.66f, 13.73f)
                lineTo(13.38f, 14.47f)
                lineTo(12.1f, 15.21f)
                curveTo(10.45f, 16.16f, 9.1f, 15.38f, 9.1f, 13.48f)
                verticalLineTo(12.0f)
                verticalLineTo(10.52f)
                curveTo(9.1f, 8.61f, 10.45f, 7.84f, 12.1f, 8.79f)
                lineTo(13.38f, 9.53f)
                lineTo(14.66f, 10.27f)
                curveTo(16.31f, 11.22f, 16.31f, 12.78f, 14.66f, 13.73f)
                close()
            }
        }
        .build()
        return `_video-circle`!!
    }

private var `_video-circle`: ImageVector? = null

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

public val BoldGroup.`Video-octagon`: ImageVector
    get() {
        if (`_video-octagon` != null) {
            return `_video-octagon`!!
        }
        `_video-octagon` = Builder(name = "Video-octagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5119f, 5.85f)
                lineTo(13.5719f, 2.42f)
                curveTo(12.6019f, 1.86f, 11.4019f, 1.86f, 10.4219f, 2.42f)
                lineTo(4.4919f, 5.85f)
                curveTo(3.5219f, 6.41f, 2.9219f, 7.45f, 2.9219f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(2.9219f, 16.54f, 3.5219f, 17.58f, 4.4919f, 18.15f)
                lineTo(10.4319f, 21.58f)
                curveTo(11.4019f, 22.14f, 12.6019f, 22.14f, 13.5819f, 21.58f)
                lineTo(19.5219f, 18.15f)
                curveTo(20.4919f, 17.59f, 21.0919f, 16.55f, 21.0919f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(21.0819f, 7.45f, 20.4819f, 6.42f, 19.5119f, 5.85f)
                close()
                moveTo(14.2519f, 13.4f)
                lineTo(13.2119f, 14.0f)
                lineTo(12.1719f, 14.6f)
                curveTo(10.8419f, 15.37f, 9.7519f, 14.74f, 9.7519f, 13.2f)
                verticalLineTo(12.0f)
                verticalLineTo(10.8f)
                curveTo(9.7519f, 9.26f, 10.8419f, 8.63f, 12.1719f, 9.4f)
                lineTo(13.2119f, 10.0f)
                lineTo(14.2519f, 10.6f)
                curveTo(15.5819f, 11.37f, 15.5819f, 12.63f, 14.2519f, 13.4f)
                close()
            }
        }
        .build()
        return `_video-octagon`!!
    }

private var `_video-octagon`: ImageVector? = null

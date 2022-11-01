package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Video-play`: ImageVector
    get() {
        if (`_video-play` != null) {
            return `_video-play`!!
        }
        `_video-play` = Builder(name = "Video-play", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7295f, 2.0f)
                horizontalLineTo(9.2695f)
                verticalLineTo(6.36f)
                horizontalLineTo(14.7295f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2305f, 2.0f)
                verticalLineTo(6.36f)
                horizontalLineTo(21.8705f)
                curveTo(21.3605f, 3.61f, 19.3305f, 2.01f, 16.2305f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.8594f)
                verticalLineTo(16.1894f)
                curveTo(2.0f, 19.8294f, 4.17f, 21.9994f, 7.81f, 21.9994f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 21.9994f, 22.0f, 19.8294f, 22.0f, 16.1894f)
                verticalLineTo(7.8594f)
                horizontalLineTo(2.0f)
                close()
                moveTo(14.44f, 16.1794f)
                lineTo(12.36f, 17.3794f)
                curveTo(11.92f, 17.6294f, 11.49f, 17.7594f, 11.09f, 17.7594f)
                curveTo(10.79f, 17.7594f, 10.52f, 17.6894f, 10.27f, 17.5494f)
                curveTo(9.69f, 17.2194f, 9.37f, 16.5394f, 9.37f, 15.6594f)
                verticalLineTo(13.2594f)
                curveTo(9.37f, 12.3794f, 9.69f, 11.6994f, 10.27f, 11.3694f)
                curveTo(10.85f, 11.0294f, 11.59f, 11.0894f, 12.36f, 11.5394f)
                lineTo(14.44f, 12.7394f)
                curveTo(15.21f, 13.1794f, 15.63f, 13.7994f, 15.63f, 14.4694f)
                curveTo(15.63f, 15.1394f, 15.2f, 15.7294f, 14.44f, 16.1794f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7689f, 2.0f)
                curveTo(4.6689f, 2.01f, 2.6389f, 3.61f, 2.1289f, 6.36f)
                horizontalLineTo(7.7689f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return `_video-play`!!
    }

private var `_video-play`: ImageVector? = null

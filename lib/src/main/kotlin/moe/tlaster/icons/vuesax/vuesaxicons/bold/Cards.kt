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

public val BoldGroup.Cards: ImageVector
    get() {
        if (_cards != null) {
            return _cards!!
        }
        _cards = Builder(name = "Cards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.22f, 6.5508f)
                horizontalLineTo(5.78f)
                curveTo(5.5f, 6.5508f, 5.24f, 6.5608f, 5.0f, 6.5708f)
                curveTo(2.63f, 6.7108f, 2.0f, 7.5808f, 2.0f, 10.2808f)
                verticalLineTo(10.8608f)
                curveTo(2.0f, 11.4108f, 2.45f, 11.8608f, 3.0f, 11.8608f)
                horizontalLineTo(18.0f)
                curveTo(18.55f, 11.8608f, 19.0f, 11.4108f, 19.0f, 10.8608f)
                verticalLineTo(10.2808f)
                curveTo(19.0f, 7.3008f, 18.24f, 6.5508f, 15.22f, 6.5508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.3594f)
                curveTo(2.45f, 13.3594f, 2.0f, 13.8094f, 2.0f, 14.3594f)
                verticalLineTo(17.2694f)
                curveTo(2.0f, 20.2494f, 2.76f, 20.9994f, 5.78f, 20.9994f)
                horizontalLineTo(15.22f)
                curveTo(18.19f, 20.9994f, 18.97f, 20.2794f, 19.0f, 17.4294f)
                verticalLineTo(14.3594f)
                curveTo(19.0f, 13.8094f, 18.55f, 13.3594f, 18.0f, 13.3594f)
                horizontalLineTo(3.0f)
                close()
                moveTo(6.96f, 18.5594f)
                horizontalLineTo(5.25f)
                curveTo(4.84f, 18.5594f, 4.5f, 18.2194f, 4.5f, 17.8094f)
                curveTo(4.5f, 17.3994f, 4.84f, 17.0594f, 5.25f, 17.0594f)
                horizontalLineTo(6.97f)
                curveTo(7.38f, 17.0594f, 7.72f, 17.3994f, 7.72f, 17.8094f)
                curveTo(7.72f, 18.2194f, 7.38f, 18.5594f, 6.96f, 18.5594f)
                close()
                moveTo(12.55f, 18.5594f)
                horizontalLineTo(9.11f)
                curveTo(8.7f, 18.5594f, 8.36f, 18.2194f, 8.36f, 17.8094f)
                curveTo(8.36f, 17.3994f, 8.7f, 17.0594f, 9.11f, 17.0594f)
                horizontalLineTo(12.55f)
                curveTo(12.96f, 17.0594f, 13.3f, 17.3994f, 13.3f, 17.8094f)
                curveTo(13.3f, 18.2194f, 12.97f, 18.5594f, 12.55f, 18.5594f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0016f, 13.3316f)
                verticalLineTo(8.0916f)
                curveTo(22.0016f, 4.9616f, 20.2116f, 3.6016f, 17.5116f, 3.6016f)
                horizontalLineTo(8.5816f)
                curveTo(7.8216f, 3.6016f, 7.1416f, 3.7116f, 6.5416f, 3.9416f)
                curveTo(6.0716f, 4.1116f, 5.6516f, 4.3616f, 5.3116f, 4.6916f)
                curveTo(5.1316f, 4.8616f, 5.2716f, 5.1416f, 5.5316f, 5.1416f)
                horizontalLineTo(16.4016f)
                curveTo(18.6516f, 5.1416f, 20.4716f, 6.9616f, 20.4716f, 9.2116f)
                verticalLineTo(16.3816f)
                curveTo(20.4716f, 16.6316f, 20.7416f, 16.7716f, 20.9216f, 16.5916f)
                curveTo(21.6116f, 15.8616f, 22.0016f, 14.7916f, 22.0016f, 13.3316f)
                close()
            }
        }
        .build()
        return _cards!!
    }

private var _cards: ImageVector? = null

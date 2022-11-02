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

public val BoldGroup.Gallery: ImageVector
    get() {
        if (_gallery != null) {
            return _gallery!!
        }
        _gallery = Builder(name = "Gallery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5808f, 19.0112f)
                lineTo(2.5608f, 19.0312f)
                curveTo(2.2908f, 18.4413f, 2.1208f, 17.7713f, 2.0508f, 17.0312f)
                curveTo(2.1208f, 17.7613f, 2.3108f, 18.4212f, 2.5808f, 19.0112f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0011f, 10.3811f)
                curveTo(10.3155f, 10.3811f, 11.3811f, 9.3155f, 11.3811f, 8.0011f)
                curveTo(11.3811f, 6.6867f, 10.3155f, 5.6211f, 9.0011f, 5.6211f)
                curveTo(7.6867f, 5.6211f, 6.6211f, 6.6867f, 6.6211f, 8.0011f)
                curveTo(6.6211f, 9.3155f, 7.6867f, 10.3811f, 9.0011f, 10.3811f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2.0f, 17.28f, 2.19f, 18.23f, 2.56f, 19.03f)
                curveTo(3.42f, 20.93f, 5.26f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 22.0f, 22.0f, 19.83f, 22.0f, 16.19f)
                verticalLineTo(13.9f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(20.37f, 12.5f)
                curveTo(19.59f, 11.83f, 18.33f, 11.83f, 17.55f, 12.5f)
                lineTo(13.39f, 16.07f)
                curveTo(12.61f, 16.74f, 11.35f, 16.74f, 10.57f, 16.07f)
                lineTo(10.23f, 15.79f)
                curveTo(9.52f, 15.17f, 8.39f, 15.11f, 7.59f, 15.65f)
                lineTo(3.85f, 18.16f)
                curveTo(3.63f, 17.6f, 3.5f, 16.95f, 3.5f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(3.5f, 4.99f, 4.99f, 3.5f, 7.81f, 3.5f)
                horizontalLineTo(16.19f)
                curveTo(19.01f, 3.5f, 20.5f, 4.99f, 20.5f, 7.81f)
                verticalLineTo(12.61f)
                lineTo(20.37f, 12.5f)
                close()
            }
        }
        .build()
        return _gallery!!
    }

private var _gallery: ImageVector? = null

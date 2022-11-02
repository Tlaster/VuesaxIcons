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

public val BoldGroup.Glass1: ImageVector
    get() {
        if (_glass1 != null) {
            return _glass1!!
        }
        _glass1 = Builder(name = "Glass1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7098f, 2.0f)
                horizontalLineTo(16.7598f)
                curveTo(16.3698f, 2.0f, 16.0498f, 2.32f, 16.0498f, 2.71f)
                curveTo(16.0498f, 3.11f, 16.3698f, 3.43f, 16.7598f, 3.43f)
                horizontalLineTo(17.7098f)
                curveTo(19.4198f, 3.43f, 20.8098f, 4.82f, 20.8098f, 6.52f)
                verticalLineTo(12.4f)
                curveTo(20.4498f, 12.21f, 20.0498f, 12.11f, 19.6198f, 12.11f)
                horizontalLineTo(15.8098f)
                curveTo(14.3698f, 12.11f, 13.1898f, 13.28f, 13.1898f, 14.73f)
                verticalLineTo(16.29f)
                horizontalLineTo(10.8098f)
                verticalLineTo(14.73f)
                curveTo(10.8098f, 13.28f, 9.6298f, 12.11f, 8.1898f, 12.11f)
                horizontalLineTo(4.3798f)
                curveTo(3.9498f, 12.11f, 3.5498f, 12.21f, 3.1898f, 12.4f)
                verticalLineTo(6.52f)
                curveTo(3.1898f, 4.82f, 4.5798f, 3.43f, 6.2898f, 3.43f)
                horizontalLineTo(7.2398f)
                curveTo(7.6298f, 3.43f, 7.9498f, 3.11f, 7.9498f, 2.71f)
                curveTo(7.9498f, 2.32f, 7.6298f, 2.0f, 7.2398f, 2.0f)
                horizontalLineTo(6.2898f)
                curveTo(3.7898f, 2.0f, 1.7598f, 4.03f, 1.7598f, 6.52f)
                verticalLineTo(14.73f)
                verticalLineTo(19.38f)
                curveTo(1.7598f, 20.83f, 2.9398f, 22.0f, 4.3798f, 22.0f)
                horizontalLineTo(8.1898f)
                curveTo(9.6298f, 22.0f, 10.8098f, 20.83f, 10.8098f, 19.38f)
                verticalLineTo(17.71f)
                horizontalLineTo(13.1898f)
                verticalLineTo(19.38f)
                curveTo(13.1898f, 20.83f, 14.3698f, 22.0f, 15.8098f, 22.0f)
                horizontalLineTo(19.6198f)
                curveTo(21.0598f, 22.0f, 22.2398f, 20.83f, 22.2398f, 19.38f)
                verticalLineTo(14.73f)
                verticalLineTo(6.52f)
                curveTo(22.2398f, 4.03f, 20.2098f, 2.0f, 17.7098f, 2.0f)
                close()
            }
        }
        .build()
        return _glass1!!
    }

private var _glass1: ImageVector? = null

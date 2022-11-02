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

public val BoldGroup.Brush1: ImageVector
    get() {
        if (_brush1 != null) {
            return _brush1!!
        }
        _brush1 = Builder(name = "Brush1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6494f, 4.79f)
                horizontalLineTo(16.3694f)
                curveTo(16.2694f, 4.0f, 15.9794f, 3.37f, 15.5194f, 2.9f)
                curveTo(14.9194f, 2.3f, 14.0494f, 2.0f, 12.9294f, 2.0f)
                horizontalLineTo(7.3494f)
                curveTo(5.0994f, 2.0f, 3.8594f, 3.24f, 3.8594f, 5.49f)
                curveTo(3.8594f, 6.61f, 4.1594f, 7.48f, 4.7594f, 8.08f)
                curveTo(5.3594f, 8.68f, 6.2294f, 8.98f, 7.3494f, 8.98f)
                horizontalLineTo(12.9294f)
                curveTo(14.9294f, 8.98f, 16.1294f, 7.99f, 16.3694f, 6.19f)
                horizontalLineTo(16.6494f)
                curveTo(18.7394f, 6.19f, 18.7394f, 6.47f, 18.7394f, 8.28f)
                verticalLineTo(10.14f)
                curveTo(18.7394f, 11.95f, 18.7394f, 12.23f, 16.6494f, 12.23f)
                horizontalLineTo(12.9294f)
                curveTo(9.9394f, 12.23f, 9.5094f, 13.65f, 9.4494f, 15.03f)
                curveTo(8.5494f, 15.09f, 7.5794f, 15.51f, 7.5794f, 17.11f)
                verticalLineTo(19.9f)
                curveTo(7.5794f, 21.63f, 8.7194f, 21.99f, 9.6694f, 21.99f)
                horizontalLineTo(10.5994f)
                curveTo(11.5494f, 21.99f, 12.6894f, 21.63f, 12.6894f, 19.9f)
                verticalLineTo(17.11f)
                curveTo(12.6894f, 15.53f, 11.7394f, 15.09f, 10.8394f, 15.03f)
                curveTo(10.8894f, 14.02f, 11.1794f, 13.62f, 12.9194f, 13.62f)
                horizontalLineTo(16.6394f)
                curveTo(19.8894f, 13.62f, 20.1294f, 12.3f, 20.1294f, 10.13f)
                verticalLineTo(8.28f)
                curveTo(20.1394f, 6.11f, 19.8994f, 4.79f, 16.6494f, 4.79f)
                close()
            }
        }
        .build()
        return _brush1!!
    }

private var _brush1: ImageVector? = null

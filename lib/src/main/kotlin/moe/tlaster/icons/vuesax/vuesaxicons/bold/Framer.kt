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

public val BoldGroup.Framer: ImageVector
    get() {
        if (_framer != null) {
            return _framer!!
        }
        _framer = Builder(name = "Framer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 10.4881f)
                verticalLineTo(16.4281f)
                curveTo(4.5f, 16.7381f, 4.64f, 17.0381f, 4.87f, 17.2381f)
                lineTo(10.23f, 21.8281f)
                curveTo(10.93f, 22.4281f, 12.0f, 21.9281f, 12.0f, 21.0181f)
                verticalLineTo(16.9181f)
                horizontalLineTo(16.91f)
                curveTo(17.86f, 16.9181f, 18.34f, 15.7681f, 17.67f, 15.0881f)
                lineTo(12.0f, 9.4181f)
                horizontalLineTo(5.57f)
                curveTo(4.98f, 9.4081f, 4.5f, 9.8881f, 4.5f, 10.4881f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4298f, 1.9102f)
                horizontalLineTo(7.0898f)
                curveTo(6.1398f, 1.9102f, 5.6598f, 3.0601f, 6.3298f, 3.7401f)
                lineTo(11.9998f, 9.4102f)
                horizontalLineTo(18.4298f)
                curveTo(19.0198f, 9.4102f, 19.4998f, 8.9302f, 19.4998f, 8.3401f)
                verticalLineTo(2.9802f)
                curveTo(19.4998f, 2.3902f, 19.0198f, 1.9102f, 18.4298f, 1.9102f)
                close()
            }
        }
        .build()
        return _framer!!
    }

private var _framer: ImageVector? = null

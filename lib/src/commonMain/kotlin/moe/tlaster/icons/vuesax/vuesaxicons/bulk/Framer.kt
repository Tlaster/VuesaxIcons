package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Framer: ImageVector
    get() {
        if (_framer != null) {
            return _framer!!
        }
        _framer = Builder(name = "Framer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 10.4901f)
                verticalLineTo(16.4301f)
                curveTo(4.5f, 16.7401f, 4.64f, 17.0401f, 4.87f, 17.2401f)
                lineTo(10.23f, 21.8301f)
                curveTo(10.93f, 22.4301f, 12.0f, 21.9301f, 12.0f, 21.0201f)
                verticalLineTo(16.9201f)
                horizontalLineTo(16.91f)
                curveTo(17.86f, 16.9201f, 18.34f, 15.7701f, 17.67f, 15.0901f)
                lineTo(12.0f, 9.4201f)
                horizontalLineTo(5.57f)
                curveTo(4.98f, 9.4101f, 4.5f, 9.8901f, 4.5f, 10.4901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4298f, 1.9102f)
                horizontalLineTo(7.0898f)
                curveTo(6.1398f, 1.9102f, 5.6598f, 3.0602f, 6.3298f, 3.7402f)
                lineTo(11.9998f, 9.4102f)
                horizontalLineTo(18.4298f)
                curveTo(19.0198f, 9.4102f, 19.4998f, 8.9302f, 19.4998f, 8.3401f)
                verticalLineTo(2.9801f)
                curveTo(19.4998f, 2.3902f, 19.0198f, 1.9102f, 18.4298f, 1.9102f)
                close()
            }
        }
        .build()
        return _framer!!
    }

private var _framer: ImageVector? = null

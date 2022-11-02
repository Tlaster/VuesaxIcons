package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Flashslash: ImageVector
    get() {
        if (_flashslash != null) {
            return _flashslash!!
        }
        _flashslash = Builder(name = "Flashslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1797f, 18.0402f)
                verticalLineTo(20.4802f)
                curveTo(9.1797f, 22.1602f, 10.0897f, 22.5002f, 11.1997f, 21.2402f)
                lineTo(18.7697f, 12.6402f)
                curveTo(19.6997f, 11.5902f, 19.3097f, 10.7202f, 17.8997f, 10.7202f)
                horizontalLineTo(16.9697f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.82f, 8.8399f)
                verticalLineTo(3.5199f)
                curveTo(14.82f, 1.8399f, 13.91f, 1.4999f, 12.8f, 2.7599f)
                lineTo(5.23f, 11.3599f)
                curveTo(4.3f, 12.4099f, 4.69f, 13.2799f, 6.1f, 13.2799f)
                horizontalLineTo(9.19f)
                verticalLineTo(14.4599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _flashslash!!
    }

private var _flashslash: ImageVector? = null

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

public val TwotoneGroup.Frame2: ImageVector
    get() {
        if (_frame2 != null) {
            return _frame2!!
        }
        _frame2 = Builder(name = "Frame2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.4405f, 8.8999f)
                curveTo(20.0405f, 9.2099f, 21.5105f, 11.0599f, 21.5105f, 15.1099f)
                verticalLineTo(15.2399f)
                curveTo(21.5105f, 19.7099f, 19.7205f, 21.4999f, 15.2505f, 21.4999f)
                horizontalLineTo(8.7405f)
                curveTo(4.2705f, 21.4999f, 2.4805f, 19.7099f, 2.4805f, 15.2399f)
                verticalLineTo(15.1099f)
                curveTo(2.4805f, 11.0899f, 3.9305f, 9.2399f, 7.4705f, 8.9099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(14.88f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3504f, 12.6504f)
                lineTo(12.0004f, 16.0004f)
                lineTo(8.6504f, 12.6504f)
            }
        }
        .build()
        return _frame2!!
    }

private var _frame2: ImageVector? = null

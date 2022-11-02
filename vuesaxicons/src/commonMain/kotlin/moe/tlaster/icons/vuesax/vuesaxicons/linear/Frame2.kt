package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Frame2: ImageVector
    get() {
        if (_frame2 != null) {
            return _frame2!!
        }
        _frame2 = Builder(name = "Frame2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.44f, 8.8999f)
                curveTo(20.04f, 9.2099f, 21.51f, 11.0599f, 21.51f, 15.1099f)
                verticalLineTo(15.2399f)
                curveTo(21.51f, 19.7099f, 19.72f, 21.4999f, 15.25f, 21.4999f)
                horizontalLineTo(8.74f)
                curveTo(4.27f, 21.4999f, 2.48f, 19.7099f, 2.48f, 15.2399f)
                verticalLineTo(15.1099f)
                curveTo(2.48f, 11.0899f, 3.93f, 9.2399f, 7.47f, 8.9099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(14.88f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.35f, 12.6499f)
                lineTo(12.0f, 15.9999f)
                lineTo(8.65f, 12.6499f)
            }
        }
        .build()
        return _frame2!!
    }

private var _frame2: ImageVector? = null

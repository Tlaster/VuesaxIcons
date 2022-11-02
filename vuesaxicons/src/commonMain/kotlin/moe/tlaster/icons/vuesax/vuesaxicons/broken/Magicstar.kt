package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Magicstar: ImageVector
    get() {
        if (_magicstar != null) {
            return _magicstar!!
        }
        _magicstar = Builder(name = "Magicstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.2703f, 6.42f)
                curveTo(3.6803f, 4.52f, 4.7403f, 3.47f, 6.6303f, 4.09f)
                lineTo(9.5803f, 5.06f)
                curveTo(10.0803f, 5.22f, 10.8303f, 5.11f, 11.2503f, 4.8f)
                lineTo(14.3303f, 2.58f)
                curveTo(16.0003f, 1.38f, 17.3302f, 2.08f, 17.2902f, 4.13f)
                lineTo(17.2202f, 7.92f)
                curveTo(17.2102f, 8.44f, 17.5403f, 9.13f, 17.9603f, 9.44f)
                lineTo(20.4403f, 11.32f)
                curveTo(22.0303f, 12.52f, 21.7703f, 13.99f, 19.8703f, 14.59f)
                lineTo(16.6403f, 15.6f)
                curveTo(16.1003f, 15.77f, 15.5303f, 16.36f, 15.3903f, 16.91f)
                lineTo(14.6203f, 19.85f)
                curveTo(14.0103f, 22.17f, 12.4902f, 22.4f, 11.2302f, 20.36f)
                lineTo(9.4702f, 17.51f)
                curveTo(9.1502f, 16.99f, 8.3902f, 16.6f, 7.7902f, 16.63f)
                lineTo(4.4503f, 16.8f)
                curveTo(2.0603f, 16.92f, 1.3803f, 15.54f, 2.9403f, 13.72f)
                lineTo(4.9202f, 11.42f)
                curveTo(5.1102f, 11.2f, 5.2403f, 10.9f, 5.3103f, 10.58f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9108f, 22.0f)
                lineTo(18.8809f, 18.97f)
            }
        }
        .build()
        return _magicstar!!
    }

private var _magicstar: ImageVector? = null

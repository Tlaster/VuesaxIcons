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

public val BrokenGroup.Send2: ImageVector
    get() {
        if (_send2 != null) {
            return _send2!!
        }
        _send2 = Builder(name = "Send2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8897f, 3.4899f)
                curveTo(19.6997f, 2.2199f, 21.7697f, 4.2999f, 20.5097f, 8.1099f)
                lineTo(17.6797f, 16.5999f)
                curveTo(15.7797f, 22.3099f, 12.6597f, 22.3099f, 10.7597f, 16.5999f)
                lineTo(9.9197f, 14.0799f)
                lineTo(7.3997f, 13.2399f)
                curveTo(1.6897f, 11.3399f, 1.6897f, 8.2299f, 7.3997f, 6.3199f)
                lineTo(11.9997f, 4.7899f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.1094f, 13.6501f)
                lineTo(13.6894f, 10.0601f)
            }
        }
        .build()
        return _send2!!
    }

private var _send2: ImageVector? = null

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

public val TwotoneGroup.Send2: ImageVector
    get() {
        if (_send2 != null) {
            return _send2!!
        }
        _send2 = Builder(name = "Send2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.3997f, 6.3201f)
                lineTo(15.8897f, 3.4901f)
                curveTo(19.6997f, 2.2201f, 21.7697f, 4.3001f, 20.5097f, 8.1102f)
                lineTo(17.6797f, 16.6002f)
                curveTo(15.7797f, 22.3102f, 12.6597f, 22.3102f, 10.7597f, 16.6002f)
                lineTo(9.9197f, 14.0802f)
                lineTo(7.3997f, 13.2402f)
                curveTo(1.6897f, 11.3402f, 1.6897f, 8.2302f, 7.3997f, 6.3201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1094f, 13.6501f)
                lineTo(13.6894f, 10.0601f)
            }
        }
        .build()
        return _send2!!
    }

private var _send2: ImageVector? = null

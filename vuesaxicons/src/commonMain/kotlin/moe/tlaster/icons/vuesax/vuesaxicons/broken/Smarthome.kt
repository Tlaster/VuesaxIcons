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

public val BrokenGroup.Smarthome: ImageVector
    get() {
        if (_smarthome != null) {
            return _smarthome!!
        }
        _smarthome = Builder(name = "Smarthome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9693f, 11.2799f)
                curveTo(22.1293f, 10.2999f, 21.6293f, 8.9899f, 20.8593f, 8.3699f)
                lineTo(13.9293f, 2.8298f)
                curveTo(12.8593f, 1.9698f, 11.1293f, 1.9698f, 10.0693f, 2.8198f)
                lineTo(3.1393f, 8.3699f)
                curveTo(2.3593f, 8.9899f, 1.8593f, 10.2999f, 2.0293f, 11.2799f)
                lineTo(2.3093f, 12.9599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4004f, 21.8101f)
                horizontalLineTo(17.6004f)
                curveTo(19.0304f, 21.8101f, 20.4004f, 20.65f, 20.6404f, 19.24f)
                lineTo(21.2704f, 15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                curveTo(3.76f, 19.04f, 4.96f, 20.24f, 5.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                curveTo(2.52f, 16.01f, 3.02f, 16.0701f, 3.5f, 16.1801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9995f, 22.0001f)
                curveTo(7.9894f, 21.2401f, 7.8595f, 20.5301f, 7.6295f, 19.8801f)
                curveTo(7.3595f, 19.1201f, 6.9594f, 18.4501f, 6.4394f, 17.8901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9955f, 22.0f)
                horizontalLineTo(2.0045f)
            }
        }
        .build()
        return _smarthome!!
    }

private var _smarthome: ImageVector? = null

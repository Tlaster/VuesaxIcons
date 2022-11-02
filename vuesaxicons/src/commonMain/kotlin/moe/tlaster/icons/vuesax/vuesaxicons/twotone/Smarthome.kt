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

public val TwotoneGroup.Smarthome: ImageVector
    get() {
        if (_smarthome != null) {
            return _smarthome!!
        }
        _smarthome = Builder(name = "Smarthome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.3993f, 21.81f)
                horizontalLineTo(17.5993f)
                curveTo(19.0293f, 21.81f, 20.3993f, 20.6499f, 20.6393f, 19.2399f)
                lineTo(21.9693f, 11.2799f)
                curveTo(22.1293f, 10.2999f, 21.6293f, 8.9899f, 20.8593f, 8.3699f)
                lineTo(13.9293f, 2.8298f)
                curveTo(12.8593f, 1.9698f, 11.1293f, 1.9698f, 10.0693f, 2.8198f)
                lineTo(3.1393f, 8.3699f)
                curveTo(2.3593f, 8.9899f, 1.8593f, 10.2999f, 2.0293f, 11.2799f)
                lineTo(2.3093f, 12.9599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                curveTo(3.76f, 19.04f, 4.96f, 20.24f, 5.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                curveTo(7.99f, 21.24f, 7.86f, 20.53f, 7.63f, 19.88f)
                curveTo(7.04f, 18.21f, 5.78f, 16.96f, 4.12f, 16.37f)
                curveTo(3.47f, 16.14f, 2.76f, 16.01f, 2.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.9955f, 22.0f)
                horizontalLineTo(2.0045f)
            }
        }
        .build()
        return _smarthome!!
    }

private var _smarthome: ImageVector? = null

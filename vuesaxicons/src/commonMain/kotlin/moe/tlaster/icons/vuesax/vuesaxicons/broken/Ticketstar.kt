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

public val BrokenGroup.Ticketstar: ImageVector
    get() {
        if (_ticketstar != null) {
            return _ticketstar!!
        }
        _ticketstar = Builder(name = "Ticketstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.2398f, 15.27f)
                curveTo(2.8598f, 15.41f, 2.4398f, 15.49f, 2.0098f, 15.49f)
                curveTo(2.0998f, 19.08f, 3.1698f, 20.0f, 6.9998f, 20.0f)
                horizontalLineTo(16.9998f)
                curveTo(20.9998f, 20.0f, 21.9998f, 19.0f, 21.9998f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.9998f, 5.0f, 20.9998f, 4.0f, 16.9998f, 4.0f)
                horizontalLineTo(6.9998f)
                curveTo(3.1698f, 4.0f, 2.0998f, 4.92f, 2.0098f, 8.5f)
                curveTo(3.9398f, 8.5f, 5.4998f, 10.07f, 5.4998f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                verticalLineTo(7.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 16.5f)
                verticalLineTo(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8599f, 14.2099f)
                curveTo(14.7399f, 14.1499f, 14.5899f, 14.1499f, 14.4699f, 14.2099f)
                lineTo(13.2399f, 14.8599f)
                curveTo(12.9299f, 15.0199f, 12.5799f, 14.7599f, 12.6399f, 14.4199f)
                lineTo(12.8799f, 13.0499f)
                curveTo(12.8999f, 12.9099f, 12.8599f, 12.7799f, 12.7599f, 12.6799f)
                lineTo(11.7699f, 11.7099f)
                curveTo(11.5199f, 11.4699f, 11.6599f, 11.0499f, 11.9999f, 10.9999f)
                lineTo(13.3799f, 10.7999f)
                curveTo(13.5199f, 10.7799f, 13.6299f, 10.6999f, 13.6899f, 10.5699f)
                lineTo(14.2999f, 9.3199f)
                curveTo(14.4499f, 9.0099f, 14.8899f, 9.0099f, 15.0399f, 9.3199f)
                lineTo(15.6599f, 10.5699f)
                curveTo(15.7199f, 10.6899f, 15.8399f, 10.7799f, 15.9699f, 10.7999f)
                lineTo(17.3499f, 10.9999f)
                curveTo(17.6899f, 11.0499f, 17.8299f, 11.4699f, 17.5799f, 11.7099f)
                lineTo(16.5799f, 12.6799f)
                curveTo(16.4799f, 12.7699f, 16.4399f, 12.9099f, 16.4599f, 13.0499f)
            }
        }
        .build()
        return _ticketstar!!
    }

private var _ticketstar: ImageVector? = null

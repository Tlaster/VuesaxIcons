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

public val BrokenGroup.Ticketexpired: ImageVector
    get() {
        if (_ticketexpired != null) {
            return _ticketexpired!!
        }
        _ticketexpired = Builder(name = "Ticketexpired", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.75f)
                verticalLineTo(9.83f)
                curveTo(22.0f, 6.13f, 21.08f, 5.21f, 17.38f, 5.21f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9102f, 20.0001f)
                horizontalLineTo(17.3802f)
                curveTo(21.0802f, 20.0001f, 22.0002f, 19.0801f, 22.0002f, 15.3801f)
                curveTo(20.7202f, 15.3801f, 19.6902f, 14.3401f, 19.6902f, 13.0701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9994f, 16.9999f)
                verticalLineTo(19.9999f)
                horizontalLineTo(8.2294f)
                curveTo(6.7494f, 19.9999f, 5.8794f, 18.9899f, 4.9194f, 16.6699f)
                lineTo(4.7394f, 16.2199f)
                curveTo(5.9494f, 15.7399f, 6.5394f, 14.3399f, 6.0294f, 13.1299f)
                curveTo(5.5394f, 11.9199f, 4.1494f, 11.3399f, 2.9294f, 11.8399f)
                lineTo(2.7594f, 11.4099f)
                curveTo(1.3194f, 7.8899f, 1.8194f, 6.6599f, 5.3394f, 5.2099f)
                lineTo(7.9794f, 4.1299f)
                lineTo(10.9994f, 11.4499f)
                verticalLineTo(13.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.17f, 20.0f)
                horizontalLineTo(8.0f)
            }
        }
        .build()
        return _ticketexpired!!
    }

private var _ticketexpired: ImageVector? = null

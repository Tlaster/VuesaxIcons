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

public val LinearGroup.Ticketexpired: ImageVector
    get() {
        if (_ticketexpired != null) {
            return _ticketexpired!!
        }
        _ticketexpired = Builder(name = "Ticketexpired", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9023f, 19.8701f)
                horizontalLineTo(17.3723f)
                curveTo(21.0723f, 19.8701f, 21.9923f, 18.9501f, 21.9923f, 15.2501f)
                curveTo(20.7123f, 15.2501f, 19.6823f, 14.2101f, 19.6823f, 12.9401f)
                curveTo(19.6823f, 11.6601f, 20.7123f, 10.6201f, 21.9923f, 10.6201f)
                verticalLineTo(9.7001f)
                curveTo(21.9923f, 6.0001f, 21.0723f, 5.0801f, 17.3723f, 5.0801f)
                horizontalLineTo(10.9923f)
                verticalLineTo(11.8701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9936f, 16.87f)
                verticalLineTo(19.87f)
                horizontalLineTo(8.2236f)
                curveTo(6.7436f, 19.87f, 5.8736f, 18.86f, 4.9136f, 16.54f)
                lineTo(4.7336f, 16.09f)
                curveTo(5.9436f, 15.61f, 6.5336f, 14.21f, 6.0236f, 13.0f)
                curveTo(5.5336f, 11.79f, 4.1436f, 11.21f, 2.9236f, 11.71f)
                lineTo(2.7536f, 11.28f)
                curveTo(1.3136f, 7.76f, 1.8136f, 6.53f, 5.3336f, 5.08f)
                lineTo(7.9736f, 4.0f)
                lineTo(10.9936f, 11.32f)
                verticalLineTo(13.87f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1622f, 19.8701f)
                horizontalLineTo(7.9922f)
            }
        }
        .build()
        return _ticketexpired!!
    }

private var _ticketexpired: ImageVector? = null

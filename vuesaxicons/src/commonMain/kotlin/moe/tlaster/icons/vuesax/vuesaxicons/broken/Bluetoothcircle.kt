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

public val BrokenGroup.Bluetoothcircle: ImageVector
    get() {
        if (_bluetoothcircle != null) {
            return _bluetoothcircle!!
        }
        _bluetoothcircle = Builder(name = "Bluetoothcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5898f, 15.56f)
                lineTo(15.2098f, 9.49f)
                curveTo(15.4898f, 9.24f, 15.4798f, 8.84f, 15.1898f, 8.6f)
                lineTo(13.1299f, 6.88f)
                curveTo(12.5899f, 6.43f, 12.1599f, 6.64f, 12.1599f, 7.34f)
                verticalLineTo(16.67f)
                curveTo(12.1599f, 17.37f, 12.5999f, 17.57f, 13.1299f, 17.13f)
                lineTo(15.1898f, 15.41f)
                curveTo(15.4798f, 15.17f, 15.4898f, 14.77f, 15.2098f, 14.52f)
                lineTo(8.5898f, 8.4501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _bluetoothcircle!!
    }

private var _bluetoothcircle: ImageVector? = null

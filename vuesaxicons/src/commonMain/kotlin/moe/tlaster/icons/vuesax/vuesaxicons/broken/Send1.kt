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

public val BrokenGroup.Send1: ImageVector
    get() {
        if (_send1 != null) {
            return _send1!!
        }
        _send1 = Builder(name = "Send1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0693f, 8.5099f)
                curveTo(21.9093f, 10.4299f, 21.9093f, 13.5699f, 18.0693f, 15.4899f)
                lineTo(9.5093f, 19.7699f)
                curveTo(3.7493f, 22.6499f, 1.3993f, 20.2899f, 4.2793f, 14.5399f)
                lineTo(5.1493f, 12.8099f)
                curveTo(5.3693f, 12.3699f, 5.3693f, 11.6399f, 5.1493f, 11.1999f)
                lineTo(4.2793f, 9.4599f)
                curveTo(1.3993f, 3.7099f, 3.7593f, 1.3499f, 9.5093f, 4.2299f)
                lineTo(14.0193f, 6.4899f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4394f, 12.0f)
                horizontalLineTo(10.8395f)
            }
        }
        .build()
        return _send1!!
    }

private var _send1: ImageVector? = null

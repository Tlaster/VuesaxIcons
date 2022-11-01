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

public val LinearGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6799f, 16.9599f)
                lineTo(18.5499f, 9.6499f)
                curveTo(17.4899f, 7.1699f, 15.5399f, 7.0699f, 14.2299f, 9.4299f)
                lineTo(12.3399f, 12.8399f)
                curveTo(11.3799f, 14.5699f, 9.5899f, 14.7199f, 8.3499f, 13.1699f)
                lineTo(8.1299f, 12.8899f)
                curveTo(6.8399f, 11.2699f, 5.0199f, 11.4699f, 4.0899f, 13.3199f)
                lineTo(2.3699f, 16.7699f)
                curveTo(1.1599f, 19.1699f, 2.9099f, 21.9999f, 5.5899f, 21.9999f)
                horizontalLineTo(18.3499f)
                curveTo(20.9499f, 21.9999f, 22.6999f, 19.3499f, 21.6799f, 16.9599f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.97f, 8.0f)
                curveTo(8.6268f, 8.0f, 9.97f, 6.6568f, 9.97f, 5.0f)
                curveTo(9.97f, 3.3431f, 8.6268f, 2.0f, 6.97f, 2.0f)
                curveTo(5.3131f, 2.0f, 3.97f, 3.3431f, 3.97f, 5.0f)
                curveTo(3.97f, 6.6568f, 5.3131f, 8.0f, 6.97f, 8.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null

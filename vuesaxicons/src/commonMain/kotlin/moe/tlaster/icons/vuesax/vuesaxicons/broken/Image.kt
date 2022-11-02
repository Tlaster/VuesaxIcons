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

public val BrokenGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.3298f, 12.8399f)
                curveTo(11.3698f, 14.5699f, 9.5798f, 14.7199f, 8.3398f, 13.1699f)
                lineTo(8.1198f, 12.8899f)
                curveTo(6.8298f, 11.2699f, 5.0098f, 11.4699f, 4.0798f, 13.3199f)
                lineTo(2.3598f, 16.7699f)
                curveTo(1.1598f, 19.1699f, 2.9098f, 21.9999f, 5.5898f, 21.9999f)
                horizontalLineTo(18.3498f)
                curveTo(20.9398f, 21.9999f, 22.6898f, 19.3499f, 21.6698f, 16.9599f)
                lineTo(18.5398f, 9.6499f)
                curveTo(17.4798f, 7.1699f, 15.5298f, 7.0699f, 14.2198f, 9.4299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.9707f, 5.0f)
                curveTo(9.9707f, 6.66f, 8.6307f, 8.0f, 6.9707f, 8.0f)
                curveTo(5.3107f, 8.0f, 3.9707f, 6.66f, 3.9707f, 5.0f)
                curveTo(3.9707f, 3.34f, 5.3107f, 2.0f, 6.9707f, 2.0f)
                curveTo(7.3307f, 2.0f, 7.6707f, 2.06f, 7.9807f, 2.18f)
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null

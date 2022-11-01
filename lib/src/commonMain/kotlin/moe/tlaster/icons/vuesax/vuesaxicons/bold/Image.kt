package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0187f, 16.8203f)
                lineTo(18.8887f, 9.5003f)
                curveTo(18.3187f, 8.1603f, 17.4687f, 7.4003f, 16.4987f, 7.3503f)
                curveTo(15.5387f, 7.3003f, 14.6087f, 7.9703f, 13.8987f, 9.2503f)
                lineTo(11.9987f, 12.6603f)
                curveTo(11.5987f, 13.3803f, 11.0287f, 13.8103f, 10.4087f, 13.8603f)
                curveTo(9.7787f, 13.9203f, 9.1487f, 13.5903f, 8.6387f, 12.9403f)
                lineTo(8.4187f, 12.6603f)
                curveTo(7.7087f, 11.7703f, 6.8287f, 11.3403f, 5.9287f, 11.4303f)
                curveTo(5.0287f, 11.5203f, 4.2587f, 12.1403f, 3.7487f, 13.1503f)
                lineTo(2.0187f, 16.6003f)
                curveTo(1.3987f, 17.8503f, 1.4587f, 19.3003f, 2.1887f, 20.4803f)
                curveTo(2.9187f, 21.6603f, 4.1887f, 22.3703f, 5.5787f, 22.3703f)
                horizontalLineTo(18.3387f)
                curveTo(19.6787f, 22.3703f, 20.9287f, 21.7003f, 21.6687f, 20.5803f)
                curveTo(22.4287f, 19.4603f, 22.5487f, 18.0503f, 22.0187f, 16.8203f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9698f, 8.3811f)
                curveTo(8.8366f, 8.3811f, 10.3498f, 6.8678f, 10.3498f, 5.0011f)
                curveTo(10.3498f, 3.1344f, 8.8366f, 1.6211f, 6.9698f, 1.6211f)
                curveTo(5.1031f, 1.6211f, 3.5898f, 3.1344f, 3.5898f, 5.0011f)
                curveTo(3.5898f, 6.8678f, 5.1031f, 8.3811f, 6.9698f, 8.3811f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null

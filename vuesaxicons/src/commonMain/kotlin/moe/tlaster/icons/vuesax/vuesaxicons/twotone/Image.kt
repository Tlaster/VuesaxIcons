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

public val TwotoneGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6809f, 16.9601f)
                lineTo(18.5509f, 9.6501f)
                curveTo(17.4909f, 7.1701f, 15.5409f, 7.0701f, 14.2309f, 9.4301f)
                lineTo(12.3409f, 12.8401f)
                curveTo(11.3809f, 14.5701f, 9.5909f, 14.7201f, 8.3509f, 13.1701f)
                lineTo(8.1309f, 12.8901f)
                curveTo(6.8409f, 11.2701f, 5.0209f, 11.4701f, 4.0909f, 13.3201f)
                lineTo(2.3709f, 16.7701f)
                curveTo(1.1609f, 19.1701f, 2.9109f, 22.0001f, 5.5909f, 22.0001f)
                horizontalLineTo(18.3509f)
                curveTo(20.9509f, 22.0001f, 22.7009f, 19.3501f, 21.6809f, 16.9601f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9707f, 8.0f)
                curveTo(8.6276f, 8.0f, 9.9707f, 6.6568f, 9.9707f, 5.0f)
                curveTo(9.9707f, 3.3431f, 8.6276f, 2.0f, 6.9707f, 2.0f)
                curveTo(5.3138f, 2.0f, 3.9707f, 3.3431f, 3.9707f, 5.0f)
                curveTo(3.9707f, 6.6568f, 5.3138f, 8.0f, 6.9707f, 8.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0206f, 16.8198f)
                lineTo(18.8906f, 9.4998f)
                curveTo(18.3206f, 8.1598f, 17.4706f, 7.3998f, 16.5006f, 7.3498f)
                curveTo(15.5406f, 7.2998f, 14.6106f, 7.9698f, 13.9006f, 9.2498f)
                lineTo(12.0006f, 12.6598f)
                curveTo(11.6006f, 13.3798f, 11.0306f, 13.8098f, 10.4106f, 13.8598f)
                curveTo(9.7806f, 13.9198f, 9.1506f, 13.5898f, 8.6406f, 12.9398f)
                lineTo(8.4206f, 12.6598f)
                curveTo(7.7106f, 11.7698f, 6.8306f, 11.3398f, 5.9306f, 11.4298f)
                curveTo(5.0306f, 11.5198f, 4.2606f, 12.1398f, 3.7506f, 13.1498f)
                lineTo(2.0206f, 16.5998f)
                curveTo(1.4006f, 17.8498f, 1.4606f, 19.2998f, 2.1906f, 20.4798f)
                curveTo(2.9206f, 21.6598f, 4.1906f, 22.3698f, 5.5806f, 22.3698f)
                horizontalLineTo(18.3406f)
                curveTo(19.6806f, 22.3698f, 20.9306f, 21.6998f, 21.6706f, 20.5798f)
                curveTo(22.4306f, 19.4598f, 22.5506f, 18.0498f, 22.0206f, 16.8198f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9698f, 8.3801f)
                curveTo(8.8366f, 8.3801f, 10.3498f, 6.8668f, 10.3498f, 5.0001f)
                curveTo(10.3498f, 3.1334f, 8.8366f, 1.6201f, 6.9698f, 1.6201f)
                curveTo(5.1031f, 1.6201f, 3.5898f, 3.1334f, 3.5898f, 5.0001f)
                curveTo(3.5898f, 6.8668f, 5.1031f, 8.3801f, 6.9698f, 8.3801f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null

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

public val BoldGroup.Bucket: ImageVector
    get() {
        if (_bucket != null) {
            return _bucket!!
        }
        _bucket = Builder(name = "Bucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0408f, 10.6406f)
                lineTo(9.6908f, 3.2906f)
                lineTo(8.8208f, 2.4206f)
                curveTo(8.5308f, 2.1306f, 8.0508f, 2.1306f, 7.7608f, 2.4206f)
                curveTo(7.4708f, 2.7106f, 7.4708f, 3.1906f, 7.7608f, 3.4806f)
                lineTo(8.6308f, 4.3506f)
                lineTo(3.0008f, 9.9806f)
                curveTo(2.3608f, 10.6206f, 2.0208f, 11.2706f, 2.0008f, 11.9206f)
                curveTo(1.9808f, 12.6106f, 2.3208f, 13.3006f, 3.0008f, 13.9906f)
                lineTo(7.0108f, 18.0006f)
                curveTo(8.3508f, 19.3306f, 9.6908f, 19.3306f, 11.0208f, 18.0006f)
                lineTo(17.0408f, 11.9806f)
                curveTo(17.2408f, 11.7806f, 17.3308f, 11.5106f, 17.3108f, 11.2506f)
                curveTo(17.3008f, 11.0306f, 17.2008f, 10.8006f, 17.0408f, 10.6406f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 22.75f)
                horizontalLineTo(3.0f)
                curveTo(2.59f, 22.75f, 2.25f, 22.41f, 2.25f, 22.0f)
                curveTo(2.25f, 21.59f, 2.59f, 21.25f, 3.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 21.25f, 16.75f, 21.59f, 16.75f, 22.0f)
                curveTo(16.75f, 22.41f, 16.41f, 22.75f, 16.0f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.35f, 14.7803f)
                curveTo(19.09f, 14.5003f, 18.61f, 14.5003f, 18.35f, 14.7803f)
                curveTo(18.04f, 15.1203f, 16.5f, 16.8503f, 16.5f, 18.1703f)
                curveTo(16.5f, 19.4703f, 17.55f, 20.5203f, 18.85f, 20.5203f)
                curveTo(20.15f, 20.5203f, 21.2f, 19.4703f, 21.2f, 18.1703f)
                curveTo(21.2f, 16.8603f, 19.66f, 15.1203f, 19.35f, 14.7803f)
                close()
            }
        }
        .build()
        return _bucket!!
    }

private var _bucket: ImageVector? = null

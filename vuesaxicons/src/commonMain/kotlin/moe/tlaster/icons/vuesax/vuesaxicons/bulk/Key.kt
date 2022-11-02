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

public val BulkGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.7906f, 4.2201f)
                curveTo(16.8306f, 1.2701f, 12.0306f, 1.2701f, 9.0906f, 4.2201f)
                curveTo(7.0206f, 6.2701f, 6.4006f, 9.2201f, 7.2006f, 11.8201f)
                lineTo(2.5006f, 16.5201f)
                curveTo(2.1706f, 16.8601f, 1.9406f, 17.5301f, 2.0106f, 18.0101f)
                lineTo(2.3106f, 20.1901f)
                curveTo(2.4206f, 20.9101f, 3.0906f, 21.5901f, 3.8106f, 21.6901f)
                lineTo(5.9906f, 21.9901f)
                curveTo(6.4706f, 22.0601f, 7.1406f, 21.8401f, 7.4806f, 21.4901f)
                lineTo(8.3006f, 20.6701f)
                curveTo(8.5006f, 20.4801f, 8.5006f, 20.1601f, 8.3006f, 19.9601f)
                lineTo(6.3606f, 18.0201f)
                curveTo(6.0706f, 17.7301f, 6.0706f, 17.2501f, 6.3606f, 16.9601f)
                curveTo(6.6506f, 16.6701f, 7.1306f, 16.6701f, 7.4206f, 16.9601f)
                lineTo(9.3706f, 18.9101f)
                curveTo(9.5606f, 19.1001f, 9.8806f, 19.1001f, 10.0706f, 18.9101f)
                lineTo(12.1906f, 16.8001f)
                curveTo(14.7806f, 17.6101f, 17.7306f, 16.9801f, 19.7906f, 14.9301f)
                curveTo(22.7406f, 11.9801f, 22.7406f, 7.1701f, 19.7906f, 4.2201f)
                close()
                moveTo(14.5006f, 12.0001f)
                curveTo(13.1206f, 12.0001f, 12.0006f, 10.8801f, 12.0006f, 9.5001f)
                curveTo(12.0006f, 8.1201f, 13.1206f, 7.0001f, 14.5006f, 7.0001f)
                curveTo(15.8806f, 7.0001f, 17.0006f, 8.1201f, 17.0006f, 9.5001f)
                curveTo(17.0006f, 10.8801f, 15.8806f, 12.0001f, 14.5006f, 12.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.0f)
                curveTo(15.8807f, 12.0f, 17.0f, 10.8807f, 17.0f, 9.5f)
                curveTo(17.0f, 8.1193f, 15.8807f, 7.0f, 14.5f, 7.0f)
                curveTo(13.1193f, 7.0f, 12.0f, 8.1193f, 12.0f, 9.5f)
                curveTo(12.0f, 10.8807f, 13.1193f, 12.0f, 14.5f, 12.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7887f, 4.2203f)
                curveTo(16.8287f, 1.2703f, 12.0287f, 1.2703f, 9.0887f, 4.2203f)
                curveTo(7.0187f, 6.2703f, 6.3987f, 9.2203f, 7.1987f, 11.8203f)
                lineTo(2.4987f, 16.5203f)
                curveTo(2.1687f, 16.8603f, 1.9387f, 17.5303f, 2.0087f, 18.0103f)
                lineTo(2.3087f, 20.1903f)
                curveTo(2.4187f, 20.9103f, 3.0887f, 21.5903f, 3.8087f, 21.6903f)
                lineTo(5.9887f, 21.9903f)
                curveTo(6.4687f, 22.0603f, 7.1387f, 21.8403f, 7.4787f, 21.4903f)
                lineTo(8.2987f, 20.6703f)
                curveTo(8.4987f, 20.4803f, 8.4987f, 20.1603f, 8.2987f, 19.9603f)
                lineTo(6.3587f, 18.0203f)
                curveTo(6.0687f, 17.7303f, 6.0687f, 17.2503f, 6.3587f, 16.9603f)
                curveTo(6.6487f, 16.6703f, 7.1287f, 16.6703f, 7.4187f, 16.9603f)
                lineTo(9.3687f, 18.9103f)
                curveTo(9.5587f, 19.1003f, 9.8787f, 19.1003f, 10.0687f, 18.9103f)
                lineTo(12.1887f, 16.8003f)
                curveTo(14.7787f, 17.6103f, 17.7287f, 16.9803f, 19.7887f, 14.9303f)
                curveTo(22.7387f, 11.9803f, 22.7387f, 7.1703f, 19.7887f, 4.2203f)
                close()
                moveTo(14.4987f, 12.0003f)
                curveTo(13.1187f, 12.0003f, 11.9987f, 10.8803f, 11.9987f, 9.5003f)
                curveTo(11.9987f, 8.1203f, 13.1187f, 7.0003f, 14.4987f, 7.0003f)
                curveTo(15.8787f, 7.0003f, 16.9987f, 8.1203f, 16.9987f, 9.5003f)
                curveTo(16.9987f, 10.8803f, 15.8787f, 12.0003f, 14.4987f, 12.0003f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null

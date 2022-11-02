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

public val BoldGroup.Shieldsecurity: ImageVector
    get() {
        if (_shieldsecurity != null) {
            return _shieldsecurity!!
        }
        _shieldsecurity = Builder(name = "Shieldsecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5408f, 4.1706f)
                lineTo(13.0408f, 2.1106f)
                curveTo(12.4708f, 1.9006f, 11.5408f, 1.9006f, 10.9708f, 2.1106f)
                lineTo(5.4708f, 4.1706f)
                curveTo(4.4108f, 4.5706f, 3.5508f, 5.8106f, 3.5508f, 6.9406f)
                verticalLineTo(15.0406f)
                curveTo(3.5508f, 15.8506f, 4.0808f, 16.9206f, 4.7308f, 17.4006f)
                lineTo(10.2308f, 21.5106f)
                curveTo(11.2008f, 22.2406f, 12.7908f, 22.2406f, 13.7608f, 21.5106f)
                lineTo(19.2608f, 17.4006f)
                curveTo(19.9108f, 16.9106f, 20.4408f, 15.8506f, 20.4408f, 15.0406f)
                verticalLineTo(6.9406f)
                curveTo(20.4508f, 5.8106f, 19.5908f, 4.5706f, 18.5408f, 4.1706f)
                close()
                moveTo(12.7508f, 12.8706f)
                verticalLineTo(15.5006f)
                curveTo(12.7508f, 15.9106f, 12.4108f, 16.2506f, 12.0008f, 16.2506f)
                curveTo(11.5908f, 16.2506f, 11.2508f, 15.9106f, 11.2508f, 15.5006f)
                verticalLineTo(12.8706f)
                curveTo(10.2408f, 12.5506f, 9.5008f, 11.6106f, 9.5008f, 10.5006f)
                curveTo(9.5008f, 9.1206f, 10.6208f, 8.0006f, 12.0008f, 8.0006f)
                curveTo(13.3808f, 8.0006f, 14.5008f, 9.1206f, 14.5008f, 10.5006f)
                curveTo(14.5008f, 11.6206f, 13.7608f, 12.5506f, 12.7508f, 12.8706f)
                close()
            }
        }
        .build()
        return _shieldsecurity!!
    }

private var _shieldsecurity: ImageVector? = null

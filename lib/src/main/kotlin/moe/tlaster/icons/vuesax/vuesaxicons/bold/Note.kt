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

public val BoldGroup.Note: ImageVector
    get() {
        if (_note != null) {
            return _note!!
        }
        _note = Builder(name = "Note", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5503f, 20.1619f)
                curveTo(13.2903f, 20.2719f, 13.0103f, 20.3719f, 12.7103f, 20.4719f)
                lineTo(11.1303f, 20.9919f)
                curveTo(7.1603f, 22.2719f, 5.0703f, 21.2019f, 3.7803f, 17.2319f)
                lineTo(2.5003f, 13.2819f)
                curveTo(1.2203f, 9.3119f, 2.2803f, 7.2119f, 6.2503f, 5.9319f)
                lineTo(7.7903f, 5.4219f)
                curveTo(7.6003f, 5.9019f, 7.4403f, 6.4519f, 7.2903f, 7.0719f)
                lineTo(6.3103f, 11.2619f)
                curveTo(5.2103f, 15.9719f, 6.8203f, 18.5719f, 11.5303f, 19.6919f)
                lineTo(13.2103f, 20.0919f)
                curveTo(13.3203f, 20.1219f, 13.4403f, 20.1419f, 13.5503f, 20.1619f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1702f, 3.2085f)
                lineTo(15.5002f, 2.8185f)
                curveTo(12.1602f, 2.0285f, 10.1702f, 2.6785f, 9.0002f, 5.0985f)
                curveTo(8.7002f, 5.7085f, 8.4602f, 6.4485f, 8.2602f, 7.2985f)
                lineTo(7.2802f, 11.4885f)
                curveTo(6.3002f, 15.6685f, 7.5902f, 17.7285f, 11.7602f, 18.7185f)
                lineTo(13.4402f, 19.1185f)
                curveTo(14.0202f, 19.2585f, 14.5602f, 19.3485f, 15.0602f, 19.3885f)
                curveTo(18.1802f, 19.6885f, 19.8402f, 18.2285f, 20.6802f, 14.6185f)
                lineTo(21.6602f, 10.4385f)
                curveTo(22.6402f, 6.2585f, 21.3602f, 4.1885f, 17.1702f, 3.2085f)
                close()
            }
        }
        .build()
        return _note!!
    }

private var _note: ImageVector? = null

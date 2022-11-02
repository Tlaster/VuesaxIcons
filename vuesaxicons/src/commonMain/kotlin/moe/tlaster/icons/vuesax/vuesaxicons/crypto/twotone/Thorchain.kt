package moe.tlaster.icons.vuesax.vuesaxicons.crypto.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.TwotoneGroup

public val TwotoneGroup.Thorchain: ImageVector
    get() {
        if (_thorchain != null) {
            return _thorchain!!
        }
        _thorchain = Builder(name = "Thorchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0795f, 21.9102f)
                lineTo(16.3795f, 17.5702f)
                curveTo(17.0895f, 17.2702f, 17.2695f, 16.3602f, 16.7295f, 15.8102f)
                lineTo(12.6695f, 11.7002f)
                lineTo(4.8595f, 20.1802f)
                curveTo(4.0795f, 21.0302f, 5.0096f, 22.3602f, 6.0795f, 21.9102f)
                close()
                moveTo(8.6295f, 7.6002f)
                lineTo(12.6795f, 11.7002f)
                lineTo(19.1695f, 3.7702f)
                curveTo(19.8795f, 2.9002f, 18.9495f, 1.6502f, 17.9095f, 2.0902f)
                lineTo(8.9695f, 5.8402f)
                curveTo(8.2695f, 6.1302f, 8.0895f, 7.0502f, 8.6295f, 7.6002f)
                close()
            }
        }
        .build()
        return _thorchain!!
    }

private var _thorchain: ImageVector? = null

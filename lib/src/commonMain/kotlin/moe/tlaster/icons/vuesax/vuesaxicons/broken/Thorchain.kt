package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Thorchain: ImageVector
    get() {
        if (_thorchain != null) {
            return _thorchain!!
        }
        _thorchain = Builder(name = "Thorchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.6795f, 11.6999f)
                lineTo(19.1695f, 3.7699f)
                curveTo(19.8795f, 2.8999f, 18.9495f, 1.6499f, 17.9095f, 2.0899f)
                lineTo(8.9695f, 5.8399f)
                curveTo(8.2595f, 6.1399f, 8.0795f, 7.0499f, 8.6195f, 7.5999f)
                lineTo(9.8996f, 8.8999f)
                moveTo(6.0795f, 21.9099f)
                lineTo(16.3795f, 17.5699f)
                curveTo(17.0895f, 17.2699f, 17.2695f, 16.3599f, 16.7295f, 15.8099f)
                lineTo(12.6695f, 11.6999f)
                lineTo(4.8595f, 20.1799f)
                curveTo(4.0795f, 21.0299f, 5.0096f, 22.3599f, 6.0795f, 21.9099f)
                close()
            }
        }
        .build()
        return _thorchain!!
    }

private var _thorchain: ImageVector? = null

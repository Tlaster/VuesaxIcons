package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Link2: ImageVector
    get() {
        if (_link2 != null) {
            return _link2!!
        }
        _link2 = Builder(name = "Link2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0601f, 10.9399f)
                curveTo(15.3101f, 13.1899f, 15.3101f, 16.8299f, 13.0601f, 19.0699f)
                curveTo(10.8101f, 21.3099f, 7.1701f, 21.3199f, 4.9301f, 19.0699f)
                curveTo(2.6901f, 16.8199f, 2.6801f, 13.1799f, 4.9301f, 10.9399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.59f, 13.4099f)
                curveTo(8.25f, 11.0699f, 8.25f, 7.2699f, 10.59f, 4.9199f)
                curveTo(12.93f, 2.5699f, 16.73f, 2.5799f, 19.08f, 4.9199f)
                curveTo(21.43f, 7.2599f, 21.42f, 11.0599f, 19.08f, 13.4099f)
            }
        }
        .build()
        return _link2!!
    }

private var _link2: ImageVector? = null

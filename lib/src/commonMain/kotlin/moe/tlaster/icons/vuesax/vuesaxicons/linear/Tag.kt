package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1699f, 15.3f)
                lineTo(8.6999f, 19.83f)
                curveTo(10.5599f, 21.69f, 13.5799f, 21.69f, 15.4499f, 19.83f)
                lineTo(19.8399f, 15.44f)
                curveTo(21.6999f, 13.58f, 21.6999f, 10.56f, 19.8399f, 8.6901f)
                lineTo(15.2999f, 4.1701f)
                curveTo(14.3499f, 3.2201f, 13.0399f, 2.7101f, 11.6999f, 2.7801f)
                lineTo(6.6999f, 3.0201f)
                curveTo(4.6999f, 3.11f, 3.1099f, 4.7f, 3.0099f, 6.6901f)
                lineTo(2.7699f, 11.69f)
                curveTo(2.7099f, 13.04f, 3.2199f, 14.35f, 4.1699f, 15.3f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 12.0f)
                curveTo(10.8807f, 12.0f, 12.0f, 10.8807f, 12.0f, 9.5f)
                curveTo(12.0f, 8.1193f, 10.8807f, 7.0f, 9.5f, 7.0f)
                curveTo(8.1193f, 7.0f, 7.0f, 8.1193f, 7.0f, 9.5f)
                curveTo(7.0f, 10.8807f, 8.1193f, 12.0f, 9.5f, 12.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null

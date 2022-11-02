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

public val BoldGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.8305f, 8.6998f)
                lineTo(15.3005f, 4.1698f)
                curveTo(14.3505f, 3.2198f, 13.0405f, 2.7098f, 11.7005f, 2.7798f)
                lineTo(6.7005f, 3.0198f)
                curveTo(4.7005f, 3.1098f, 3.1105f, 4.6998f, 3.0105f, 6.6898f)
                lineTo(2.7705f, 11.6898f)
                curveTo(2.7105f, 13.0298f, 3.2105f, 14.3398f, 4.1605f, 15.2898f)
                lineTo(8.6905f, 19.8198f)
                curveTo(10.5505f, 21.6798f, 13.5705f, 21.6798f, 15.4405f, 19.8198f)
                lineTo(19.8305f, 15.4298f)
                curveTo(21.7005f, 13.5798f, 21.7005f, 10.5598f, 19.8305f, 8.6998f)
                close()
                moveTo(9.5005f, 12.3798f)
                curveTo(7.9105f, 12.3798f, 6.6205f, 11.0898f, 6.6205f, 9.4998f)
                curveTo(6.6205f, 7.9098f, 7.9105f, 6.6198f, 9.5005f, 6.6198f)
                curveTo(11.0905f, 6.6198f, 12.3805f, 7.9098f, 12.3805f, 9.4998f)
                curveTo(12.3805f, 11.0898f, 11.0905f, 12.3798f, 9.5005f, 12.3798f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null

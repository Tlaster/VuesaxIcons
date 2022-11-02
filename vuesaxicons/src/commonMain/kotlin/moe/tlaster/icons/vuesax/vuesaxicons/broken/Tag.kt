package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8305f, 15.45f)
                curveTo(21.6905f, 13.59f, 21.6905f, 10.57f, 19.8305f, 8.7001f)
                lineTo(15.3005f, 4.1701f)
                curveTo(14.3505f, 3.2201f, 13.0405f, 2.7101f, 11.7005f, 2.7801f)
                lineTo(6.7005f, 3.0201f)
                curveTo(4.7005f, 3.11f, 3.1105f, 4.7f, 3.0105f, 6.6901f)
                lineTo(2.7705f, 11.69f)
                curveTo(2.7105f, 13.03f, 3.2105f, 14.34f, 4.1605f, 15.29f)
                lineTo(8.6905f, 19.82f)
                curveTo(10.5505f, 21.68f, 13.5705f, 21.68f, 15.4405f, 19.82f)
                lineTo(16.9605f, 18.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.5f)
                curveTo(7.0f, 10.88f, 8.12f, 12.0f, 9.5f, 12.0f)
                curveTo(10.88f, 12.0f, 12.0f, 10.88f, 12.0f, 9.5f)
                curveTo(12.0f, 8.12f, 10.88f, 7.0f, 9.5f, 7.0f)
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null

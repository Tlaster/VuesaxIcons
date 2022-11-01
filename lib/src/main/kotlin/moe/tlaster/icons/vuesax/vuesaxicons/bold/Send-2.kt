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

public val BoldGroup.`Send-2`: ImageVector
    get() {
        if (`_send-2` != null) {
            return `_send-2`!!
        }
        `_send-2` = Builder(name = "Send-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1391f, 2.9591f)
                lineTo(7.1091f, 5.9591f)
                curveTo(1.0391f, 7.9891f, 1.0391f, 11.2991f, 7.1091f, 13.3191f)
                lineTo(9.7891f, 14.2091f)
                lineTo(10.6791f, 16.8891f)
                curveTo(12.6991f, 22.9591f, 16.0191f, 22.9591f, 18.0391f, 16.8891f)
                lineTo(21.0491f, 7.8691f)
                curveTo(22.3891f, 3.8191f, 20.1891f, 1.6091f, 16.1391f, 2.9591f)
                close()
                moveTo(16.4591f, 8.3391f)
                lineTo(12.6591f, 12.1591f)
                curveTo(12.5091f, 12.3091f, 12.3191f, 12.3791f, 12.1291f, 12.3791f)
                curveTo(11.9391f, 12.3791f, 11.7491f, 12.3091f, 11.5991f, 12.1591f)
                curveTo(11.3091f, 11.8691f, 11.3091f, 11.3891f, 11.5991f, 11.0991f)
                lineTo(15.3991f, 7.2791f)
                curveTo(15.6891f, 6.9891f, 16.1691f, 6.9891f, 16.4591f, 7.2791f)
                curveTo(16.7491f, 7.5691f, 16.7491f, 8.0491f, 16.4591f, 8.3391f)
                close()
            }
        }
        .build()
        return `_send-2`!!
    }

private var `_send-2`: ImageVector? = null

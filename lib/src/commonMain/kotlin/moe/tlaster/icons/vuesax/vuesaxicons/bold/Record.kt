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

public val BoldGroup.Record: ImageVector
    get() {
        if (_record != null) {
            return _record!!
        }
        _record = Builder(name = "Record", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.6297f, 7.2384f)
                curveTo(19.9297f, 7.7084f, 19.7697f, 8.3384f, 19.2897f, 8.6284f)
                lineTo(18.6997f, 8.9784f)
                lineTo(5.5897f, 16.8384f)
                curveTo(5.1097f, 17.1284f, 4.4797f, 16.9684f, 4.1997f, 16.4784f)
                curveTo(3.1997f, 14.7384f, 2.7497f, 12.6184f, 3.1397f, 10.3984f)
                curveTo(3.7997f, 6.6284f, 6.8997f, 3.6284f, 10.6897f, 3.0884f)
                curveTo(14.4397f, 2.5584f, 17.8297f, 4.3584f, 19.6297f, 7.2384f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8892f, 13.4308f)
                curveTo(20.2092f, 17.6808f, 16.4492f, 20.9308f, 12.1392f, 21.0008f)
                curveTo(10.2392f, 21.0308f, 8.4792f, 20.4808f, 7.0192f, 19.4908f)
                curveTo(6.3992f, 19.0808f, 6.4192f, 18.1608f, 7.0592f, 17.7808f)
                lineTo(19.4692f, 10.4908f)
                curveTo(20.1192f, 10.1108f, 20.9192f, 10.5508f, 20.9792f, 11.3008f)
                curveTo(21.0292f, 12.0008f, 20.9992f, 12.7108f, 20.8892f, 13.4308f)
                close()
            }
        }
        .build()
        return _record!!
    }

private var _record: ImageVector? = null

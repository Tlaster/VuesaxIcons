package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Record: ImageVector
    get() {
        if (_record != null) {
            return _record!!
        }
        _record = Builder(name = "Record", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.12f, 8.13f)
                lineTo(18.7f, 8.98f)
                lineTo(4.76f, 17.34f)
                curveTo(3.66f, 15.85f, 3.0f, 14.0f, 3.0f, 12.0f)
                curveTo(3.0f, 7.03f, 7.03f, 3.0f, 12.0f, 3.0f)
                curveTo(15.58f, 3.0f, 18.68f, 5.1f, 20.12f, 8.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9999f, 12.0002f)
                curveTo(20.9999f, 16.9702f, 16.9699f, 21.0002f, 11.9999f, 21.0002f)
                curveTo(9.5299f, 21.0002f, 7.2999f, 20.0102f, 5.6699f, 18.3902f)
                lineTo(5.7599f, 18.3402f)
                lineTo(19.6999f, 9.9802f)
                lineTo(20.6299f, 9.4302f)
                curveTo(20.8699f, 10.2502f, 20.9999f, 11.1102f, 20.9999f, 12.0002f)
                close()
            }
        }
        .build()
        return _record!!
    }

private var _record: ImageVector? = null

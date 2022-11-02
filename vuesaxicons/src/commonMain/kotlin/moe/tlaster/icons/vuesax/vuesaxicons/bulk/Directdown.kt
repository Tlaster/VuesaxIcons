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

public val BulkGroup.Directdown: ImageVector
    get() {
        if (_directdown != null) {
            return _directdown!!
        }
        _directdown = Builder(name = "Directdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0192f, 2.7202f)
                lineTo(13.5392f, 4.4602f)
                curveTo(12.5692f, 4.9402f, 11.4392f, 4.9402f, 10.4692f, 4.4602f)
                lineTo(6.9792f, 2.7102f)
                curveTo(3.9992f, 1.2202f, 0.8492f, 4.4402f, 2.4092f, 7.3902f)
                lineTo(3.2292f, 8.9302f)
                curveTo(3.3392f, 9.1402f, 3.5192f, 9.3102f, 3.7392f, 9.4102f)
                lineTo(16.3892f, 15.1002f)
                curveTo(16.9092f, 15.3302f, 17.5192f, 15.1202f, 17.7792f, 14.6202f)
                lineTo(21.5892f, 7.3802f)
                curveTo(23.1392f, 4.4402f, 19.9992f, 1.2202f, 17.0192f, 2.7202f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.6004f, 16.3102f)
                lineTo(7.3204f, 12.5802f)
                curveTo(6.3905f, 12.1602f, 5.4504f, 13.1602f, 5.9304f, 14.0602f)
                lineTo(8.9705f, 19.8302f)
                curveTo(10.2604f, 22.2802f, 13.7604f, 22.2802f, 15.0504f, 19.8302f)
                lineTo(16.1204f, 17.7902f)
                curveTo(16.4004f, 17.2402f, 16.1604f, 16.5702f, 15.6004f, 16.3102f)
                close()
            }
        }
        .build()
        return _directdown!!
    }

private var _directdown: ImageVector? = null

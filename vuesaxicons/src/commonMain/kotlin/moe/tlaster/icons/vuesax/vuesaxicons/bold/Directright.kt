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

public val BoldGroup.Directright: ImageVector
    get() {
        if (_directright != null) {
            return _directright!!
        }
        _directright = Builder(name = "Directright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7091f, 17.0192f)
                lineTo(4.4491f, 13.5392f)
                curveTo(4.9291f, 12.5692f, 4.9291f, 11.4392f, 4.4491f, 10.4692f)
                lineTo(2.7091f, 6.9792f)
                curveTo(1.2191f, 3.9992f, 4.4291f, 0.8492f, 7.3791f, 2.4092f)
                lineTo(8.9191f, 3.2292f)
                curveTo(9.1391f, 3.3392f, 9.3091f, 3.5192f, 9.3991f, 3.7392f)
                lineTo(15.0891f, 16.3892f)
                curveTo(15.3191f, 16.9092f, 15.1091f, 17.5192f, 14.6091f, 17.7792f)
                lineTo(7.3691f, 21.5892f)
                curveTo(4.4291f, 23.1492f, 1.2191f, 19.9992f, 2.7091f, 17.0192f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3093f, 15.6004f)
                lineTo(12.5793f, 7.3204f)
                curveTo(12.1593f, 6.3905f, 13.1593f, 5.4504f, 14.0593f, 5.9304f)
                lineTo(19.8293f, 8.9705f)
                curveTo(22.2793f, 10.2604f, 22.2793f, 13.7604f, 19.8293f, 15.0504f)
                lineTo(17.7893f, 16.1204f)
                curveTo(17.2393f, 16.4004f, 16.5693f, 16.1704f, 16.3093f, 15.6004f)
                close()
            }
        }
        .build()
        return _directright!!
    }

private var _directright: ImageVector? = null

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

public val BulkGroup.Directright: ImageVector
    get() {
        if (_directright != null) {
            return _directright!!
        }
        _directright = Builder(name = "Directright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7091f, 17.0202f)
                lineTo(4.4491f, 13.5402f)
                curveTo(4.9291f, 12.5702f, 4.9291f, 11.4402f, 4.4491f, 10.4702f)
                lineTo(2.7091f, 6.9802f)
                curveTo(1.2191f, 4.0002f, 4.4291f, 0.8502f, 7.3791f, 2.4102f)
                lineTo(8.9191f, 3.2302f)
                curveTo(9.1391f, 3.3402f, 9.3091f, 3.5202f, 9.3991f, 3.7402f)
                lineTo(15.0891f, 16.3902f)
                curveTo(15.3191f, 16.9102f, 15.1091f, 17.5202f, 14.6091f, 17.7802f)
                lineTo(7.3691f, 21.5902f)
                curveTo(4.4291f, 23.1502f, 1.2191f, 20.0002f, 2.7091f, 17.0202f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3093f, 15.6f)
                lineTo(12.5793f, 7.32f)
                curveTo(12.1593f, 6.39f, 13.1593f, 5.45f, 14.0593f, 5.93f)
                lineTo(19.8293f, 8.97f)
                curveTo(22.2793f, 10.26f, 22.2793f, 13.76f, 19.8293f, 15.05f)
                lineTo(17.7893f, 16.12f)
                curveTo(17.2393f, 16.4f, 16.5693f, 16.17f, 16.3093f, 15.6f)
                close()
            }
        }
        .build()
        return _directright!!
    }

private var _directright: ImageVector? = null

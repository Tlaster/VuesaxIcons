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

public val BulkGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9f, 7.66f)
                lineTo(20.12f, 8.13f)
                lineTo(19.63f, 8.43f)
                lineTo(18.7f, 8.98f)
                lineTo(4.76f, 17.34f)
                lineTo(4.67f, 17.39f)
                lineTo(4.14f, 17.71f)
                lineTo(3.53f, 18.08f)
                curveTo(3.17f, 17.19f, 3.0f, 16.07f, 3.0f, 14.7f)
                verticalLineTo(9.3f)
                curveTo(3.0f, 4.8f, 4.8f, 3.0f, 9.3f, 3.0f)
                horizontalLineTo(14.7f)
                curveTo(18.61f, 3.0f, 20.48f, 4.36f, 20.9f, 7.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0005f, 9.2002f)
                verticalLineTo(14.7002f)
                curveTo(21.0005f, 19.2002f, 19.2005f, 21.0002f, 14.7005f, 21.0002f)
                horizontalLineTo(9.3005f)
                curveTo(6.8605f, 21.0002f, 5.2105f, 20.4702f, 4.2305f, 19.2602f)
                lineTo(4.5305f, 19.0802f)
                lineTo(5.1405f, 18.7102f)
                lineTo(5.6705f, 18.3902f)
                lineTo(5.7605f, 18.3402f)
                lineTo(19.7005f, 9.9802f)
                lineTo(20.6305f, 9.4302f)
                lineTo(21.0005f, 9.2002f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null

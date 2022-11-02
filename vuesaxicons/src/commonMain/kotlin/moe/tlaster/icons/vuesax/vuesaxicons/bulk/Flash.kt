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

public val BulkGroup.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = Builder(name = "Flash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0005f, 3.6699f)
                verticalLineTo(20.3299f)
                lineTo(11.2005f, 21.2399f)
                curveTo(10.0905f, 22.4999f, 9.1805f, 22.1599f, 9.1805f, 20.4799f)
                verticalLineTo(13.2799f)
                horizontalLineTo(6.0905f)
                curveTo(4.6905f, 13.2799f, 4.3005f, 12.4199f, 5.2305f, 11.3699f)
                lineTo(12.0005f, 3.6699f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.77f, 12.6299f)
                lineTo(12.0f, 20.3299f)
                verticalLineTo(3.6699f)
                lineTo(12.8f, 2.7599f)
                curveTo(13.91f, 1.4999f, 14.82f, 1.8399f, 14.82f, 3.5199f)
                verticalLineTo(10.7199f)
                horizontalLineTo(17.91f)
                curveTo(19.31f, 10.7199f, 19.7f, 11.5799f, 18.77f, 12.6299f)
                close()
            }
        }
        .build()
        return _flash!!
    }

private var _flash: ImageVector? = null

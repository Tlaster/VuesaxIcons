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

public val BulkGroup.Flashslash: ImageVector
    get() {
        if (_flashslash != null) {
            return _flashslash!!
        }
        _flashslash = Builder(name = "Flashslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7709f, 2.2299f)
                curveTo(21.4709f, 1.9299f, 20.9809f, 1.9299f, 20.6809f, 2.2299f)
                lineTo(2.2309f, 20.6899f)
                curveTo(1.9309f, 20.9899f, 1.9309f, 21.4799f, 2.2309f, 21.7799f)
                curveTo(2.3809f, 21.9199f, 2.5709f, 21.9999f, 2.7709f, 21.9999f)
                curveTo(2.9709f, 21.9999f, 3.1609f, 21.9199f, 3.3109f, 21.7699f)
                lineTo(21.7709f, 3.3099f)
                curveTo(22.0809f, 3.0099f, 22.0809f, 2.5299f, 21.7709f, 2.2299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.8205f, 3.5199f)
                verticalLineTo(9.1799f)
                lineTo(9.1805f, 14.8199f)
                verticalLineTo(13.2799f)
                horizontalLineTo(6.0905f)
                curveTo(4.6905f, 13.2799f, 4.3005f, 12.4199f, 5.2305f, 11.3699f)
                lineTo(12.0005f, 3.6699f)
                lineTo(12.8005f, 2.7599f)
                curveTo(13.9105f, 1.4999f, 14.8205f, 1.8399f, 14.8205f, 3.5199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.7697f, 12.63f)
                lineTo(11.9997f, 20.33f)
                lineTo(11.1997f, 21.24f)
                curveTo(10.0897f, 22.5f, 9.1797f, 22.16f, 9.1797f, 20.48f)
                verticalLineTo(17.82f)
                lineTo(16.2797f, 10.72f)
                horizontalLineTo(17.9097f)
                curveTo(19.3097f, 10.72f, 19.6997f, 11.58f, 18.7697f, 12.63f)
                close()
            }
        }
        .build()
        return _flashslash!!
    }

private var _flashslash: ImageVector? = null

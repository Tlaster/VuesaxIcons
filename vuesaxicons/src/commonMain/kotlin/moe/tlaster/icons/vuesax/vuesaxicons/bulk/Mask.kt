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

public val BulkGroup.Mask: ImageVector
    get() {
        if (_mask != null) {
            return _mask!!
        }
        _mask = Builder(name = "Mask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.04f, 18.26f, 21.21f, 13.41f, 21.9f)
                curveTo(12.95f, 21.97f, 12.48f, 22.0f, 12.0f, 22.0f)
                curveTo(9.24f, 22.0f, 6.74f, 20.88f, 4.93f, 19.07f)
                curveTo(3.12f, 17.26f, 2.0f, 14.76f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(14.76f, 2.0f, 17.26f, 3.12f, 19.07f, 4.93f)
                curveTo(20.88f, 6.74f, 22.0f, 9.24f, 22.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.83f, 10.2299f)
                lineTo(12.3499f, 12.7099f)
                lineTo(18.8799f, 19.2399f)
                curveTo(18.5199f, 19.5899f, 18.1299f, 19.9099f, 17.7199f, 20.1999f)
                lineTo(11.2899f, 13.7699f)
                lineTo(8.82f, 16.2399f)
                lineTo(13.9399f, 21.3699f)
                curveTo(14.0499f, 21.4799f, 14.12f, 21.6199f, 14.15f, 21.7599f)
                curveTo(14.15f, 21.7599f, 14.15f, 21.7599f, 14.15f, 21.7699f)
                curveTo(13.91f, 21.8199f, 13.6599f, 21.8699f, 13.4099f, 21.8999f)
                curveTo(13.0899f, 21.9499f, 12.7699f, 21.9799f, 12.4399f, 21.9899f)
                lineTo(7.76f, 17.2999f)
                lineTo(5.4799f, 19.5799f)
                curveTo(5.2899f, 19.4199f, 5.1099f, 19.2499f, 4.9299f, 19.0699f)
                curveTo(4.7499f, 18.8899f, 4.5799f, 18.7099f, 4.4199f, 18.5199f)
                lineTo(18.52f, 4.4199f)
                curveTo(18.71f, 4.5799f, 18.8899f, 4.7499f, 19.0699f, 4.9299f)
                curveTo(19.2499f, 5.1099f, 19.42f, 5.2899f, 19.58f, 5.4799f)
                lineTo(15.89f, 9.1699f)
                lineTo(21.58f, 14.8599f)
                curveTo(21.42f, 15.3899f, 21.2199f, 15.8899f, 20.9799f, 16.3799f)
                lineTo(14.83f, 10.2299f)
                close()
            }
        }
        .build()
        return _mask!!
    }

private var _mask: ImageVector? = null

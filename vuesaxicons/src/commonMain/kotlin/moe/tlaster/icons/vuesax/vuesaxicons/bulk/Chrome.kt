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

public val BulkGroup.Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(name = "Chrome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.47f, 17.61f, 21.91f, 12.16f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(11.39f, 22.0f, 10.79f, 21.94f, 10.21f, 21.84f)
                curveTo(5.54f, 20.99f, 2.0f, 16.91f, 2.0f, 12.0f)
                curveTo(2.0f, 10.29f, 2.43f, 8.68f, 3.19f, 7.27f)
                curveTo(3.5f, 6.7f, 3.86f, 6.15f, 4.27f, 5.65f)
                curveTo(6.11f, 3.42f, 8.89f, 2.0f, 12.0f, 2.0f)
                curveTo(15.56f, 2.0f, 18.68f, 3.86f, 20.45f, 6.66f)
                curveTo(20.8f, 7.21f, 21.1f, 7.8f, 21.34f, 8.42f)
                curveTo(21.77f, 9.53f, 22.0f, 10.74f, 22.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0995f, 8.0199f)
                curveTo(17.1795f, 7.8499f, 19.2695f, 7.9799f, 21.3395f, 8.4199f)
                curveTo(21.0995f, 7.7999f, 20.7995f, 7.2099f, 20.4495f, 6.6599f)
                curveTo(17.5795f, 6.1899f, 14.6795f, 6.2799f, 11.8195f, 6.8999f)
                curveTo(9.3895f, 6.9799f, 7.4095f, 8.7799f, 7.0395f, 11.1299f)
                curveTo(5.8794f, 9.4499f, 4.9394f, 7.6199f, 4.2695f, 5.6499f)
                curveTo(3.8595f, 6.1499f, 3.4994f, 6.6999f, 3.1895f, 7.2699f)
                curveTo(4.2495f, 9.9599f, 5.7394f, 12.3599f, 7.6494f, 14.4699f)
                curveTo(7.6694f, 14.4899f, 7.6995f, 14.4999f, 7.7194f, 14.5199f)
                curveTo(8.6294f, 15.9899f, 10.2395f, 16.8999f, 11.9695f, 16.8999f)
                curveTo(12.5795f, 16.8999f, 13.1695f, 16.7799f, 13.7195f, 16.5699f)
                curveTo(12.8095f, 18.4799f, 11.6495f, 20.2499f, 10.2095f, 21.8399f)
                curveTo(10.7895f, 21.9399f, 11.3895f, 21.9999f, 11.9995f, 21.9999f)
                horizontalLineTo(12.1595f)
                curveTo(14.0095f, 19.7399f, 15.4095f, 17.1799f, 16.3495f, 14.2999f)
                curveTo(16.7595f, 13.5599f, 16.9795f, 12.7299f, 16.9795f, 11.8899f)
                curveTo(16.9795f, 10.3199f, 16.2395f, 8.9399f, 15.0995f, 8.0199f)
                close()
                moveTo(14.9295f, 13.6099f)
                curveTo(14.3295f, 14.6599f, 13.1895f, 15.3199f, 11.9695f, 15.3199f)
                curveTo(10.7495f, 15.3199f, 9.6194f, 14.6599f, 9.0094f, 13.6099f)
                curveTo(8.6994f, 13.0699f, 8.5494f, 12.4999f, 8.5494f, 11.8899f)
                curveTo(8.5494f, 9.9999f, 10.0795f, 8.4699f, 11.9695f, 8.4699f)
                curveTo(13.8595f, 8.4699f, 15.3995f, 9.9999f, 15.3995f, 11.8899f)
                curveTo(15.3995f, 12.4999f, 15.2395f, 13.0699f, 14.9295f, 13.6099f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null

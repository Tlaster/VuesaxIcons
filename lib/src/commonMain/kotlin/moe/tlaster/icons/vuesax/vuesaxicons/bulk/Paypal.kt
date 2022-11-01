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

public val BulkGroup.Paypal: ImageVector
    get() {
        if (_paypal != null) {
            return _paypal!!
        }
        _paypal = Builder(name = "Paypal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9992f, 7.0f)
                curveTo(18.9992f, 7.18f, 18.9892f, 7.35f, 18.9692f, 7.52f)
                curveTo(18.8492f, 8.97f, 18.2092f, 10.28f, 17.2392f, 11.24f)
                curveTo(16.1592f, 12.33f, 14.6592f, 13.0f, 12.9992f, 13.0f)
                horizontalLineTo(9.8692f)
                curveTo(9.3692f, 13.0f, 8.9492f, 13.37f, 8.8792f, 13.86f)
                lineTo(8.1192f, 19.14f)
                curveTo(8.0592f, 19.53f, 7.7792f, 19.85f, 7.4092f, 19.95f)
                curveTo(7.3192f, 19.99f, 7.2292f, 20.0f, 7.1292f, 20.0f)
                horizontalLineTo(5.1792f)
                curveTo(4.5592f, 20.0f, 4.0892f, 19.45f, 4.1892f, 18.84f)
                lineTo(6.5792f, 4.51f)
                curveTo(6.8192f, 3.06f, 8.0692f, 2.0f, 9.5392f, 2.0f)
                horizontalLineTo(13.9992f)
                curveTo(16.7592f, 2.0f, 18.9992f, 4.24f, 18.9992f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9995f, 11.0f)
                curveTo(20.9995f, 12.38f, 20.4395f, 13.63f, 19.5395f, 14.54f)
                curveTo(18.6295f, 15.44f, 17.3795f, 16.0f, 15.9995f, 16.0f)
                horizontalLineTo(13.8495f)
                curveTo(13.3595f, 16.0f, 12.9395f, 16.35f, 12.8595f, 16.84f)
                lineTo(12.1395f, 21.16f)
                curveTo(12.0595f, 21.65f, 11.6395f, 22.0f, 11.1495f, 22.0f)
                horizontalLineTo(8.2195f)
                curveTo(7.5895f, 22.0f, 7.1195f, 21.42f, 7.2395f, 20.8f)
                lineTo(7.4095f, 19.95f)
                curveTo(7.7795f, 19.85f, 8.0595f, 19.53f, 8.1195f, 19.14f)
                lineTo(8.8795f, 13.86f)
                curveTo(8.9495f, 13.37f, 9.3695f, 13.0f, 9.8695f, 13.0f)
                horizontalLineTo(12.9995f)
                curveTo(14.6595f, 13.0f, 16.1595f, 12.33f, 17.2395f, 11.24f)
                curveTo(18.2095f, 10.28f, 18.8495f, 8.97f, 18.9695f, 7.52f)
                curveTo(20.1795f, 8.21f, 20.9995f, 9.51f, 20.9995f, 11.0f)
                close()
            }
        }
        .build()
        return _paypal!!
    }

private var _paypal: ImageVector? = null

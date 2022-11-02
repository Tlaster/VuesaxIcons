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

public val BulkGroup.Heartslash: ImageVector
    get() {
        if (_heartslash != null) {
            return _heartslash!!
        }
        _heartslash = Builder(name = "Heartslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0009f, 8.6901f)
                curveTo(22.0009f, 9.8801f, 21.8108f, 10.9801f, 21.4808f, 12.0001f)
                curveTo(19.9008f, 17.0001f, 15.0309f, 19.9901f, 12.6209f, 20.8101f)
                curveTo(12.2809f, 20.9301f, 11.7209f, 20.9301f, 11.3809f, 20.8101f)
                curveTo(10.7409f, 20.5901f, 9.9309f, 20.2201f, 9.0609f, 19.7001f)
                curveTo(8.5008f, 19.3701f, 8.4108f, 18.5901f, 8.8708f, 18.1301f)
                lineTo(20.1509f, 6.8501f)
                curveTo(20.6909f, 6.3101f, 21.6409f, 6.5401f, 21.8309f, 7.2801f)
                curveTo(21.9409f, 7.7301f, 22.0009f, 8.2001f, 22.0009f, 8.6901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5295f, 1.4699f)
                curveTo(22.2395f, 1.1799f, 21.7595f, 1.1799f, 21.4695f, 1.4699f)
                lineTo(19.1295f, 3.8099f)
                curveTo(18.3395f, 3.3599f, 17.4195f, 3.1f, 16.4395f, 3.1f)
                curveTo(14.6295f, 3.1f, 13.0095f, 3.9799f, 11.9995f, 5.3299f)
                curveTo(10.9895f, 3.9799f, 9.3695f, 3.1f, 7.5595f, 3.1f)
                curveTo(4.4895f, 3.1f, 1.9995f, 5.5999f, 1.9995f, 8.6899f)
                curveTo(1.9995f, 9.8799f, 2.1895f, 10.9799f, 2.5195f, 11.9999f)
                curveTo(3.1695f, 14.0699f, 4.3895f, 15.8f, 5.7695f, 17.17f)
                lineTo(1.4694f, 21.4699f)
                curveTo(1.1795f, 21.7599f, 1.1795f, 22.2399f, 1.4694f, 22.5299f)
                curveTo(1.6194f, 22.6799f, 1.8095f, 22.7499f, 1.9995f, 22.7499f)
                curveTo(2.1895f, 22.7499f, 2.3795f, 22.6799f, 2.5295f, 22.5299f)
                lineTo(22.5295f, 2.5299f)
                curveTo(22.8195f, 2.2399f, 22.8195f, 1.7599f, 22.5295f, 1.4699f)
                close()
            }
        }
        .build()
        return _heartslash!!
    }

private var _heartslash: ImageVector? = null

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

public val BulkGroup.Arrowup: ImageVector
    get() {
        if (_arrowup != null) {
            return _arrowup!!
        }
        _arrowup = Builder(name = "Arrowup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5295f, 10.9699f)
                lineTo(12.5295f, 7.9699f)
                curveTo(12.2395f, 7.6799f, 11.7595f, 7.6799f, 11.4695f, 7.9699f)
                lineTo(8.4694f, 10.9699f)
                curveTo(8.1795f, 11.2599f, 8.1795f, 11.7399f, 8.4694f, 12.0299f)
                curveTo(8.7594f, 12.3199f, 9.2395f, 12.3199f, 9.5295f, 12.0299f)
                lineTo(11.2495f, 10.3099f)
                verticalLineTo(15.4999f)
                curveTo(11.2495f, 15.9099f, 11.5895f, 16.2499f, 11.9995f, 16.2499f)
                curveTo(12.4095f, 16.2499f, 12.7495f, 15.9099f, 12.7495f, 15.4999f)
                verticalLineTo(10.3099f)
                lineTo(14.4695f, 12.0299f)
                curveTo(14.6195f, 12.1799f, 14.8095f, 12.2499f, 14.9995f, 12.2499f)
                curveTo(15.1895f, 12.2499f, 15.3795f, 12.1799f, 15.5295f, 12.0299f)
                curveTo(15.8195f, 11.7399f, 15.8195f, 11.2599f, 15.5295f, 10.9699f)
                close()
            }
        }
        .build()
        return _arrowup!!
    }

private var _arrowup: ImageVector? = null

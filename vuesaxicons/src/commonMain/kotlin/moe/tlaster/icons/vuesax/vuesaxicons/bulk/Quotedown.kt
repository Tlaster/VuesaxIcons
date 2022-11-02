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

public val BulkGroup.Quotedown: ImageVector
    get() {
        if (_quotedown != null) {
            return _quotedown!!
        }
        _quotedown = Builder(name = "Quotedown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9101f, 12.3699f)
                horizontalLineTo(20.6001f)
                curveTo(20.5201f, 17.0399f, 19.6001f, 17.8099f, 16.7301f, 19.5099f)
                curveTo(16.4001f, 19.7099f, 16.2901f, 20.1299f, 16.4901f, 20.4699f)
                curveTo(16.6901f, 20.7999f, 17.1101f, 20.91f, 17.4501f, 20.71f)
                curveTo(20.8301f, 18.71f, 22.0101f, 17.4899f, 22.0101f, 11.6699f)
                verticalLineTo(6.28f)
                curveTo(22.0101f, 4.57f, 20.6201f, 3.1899f, 18.9201f, 3.1899f)
                horizontalLineTo(15.9201f)
                curveTo(14.1601f, 3.1899f, 12.8301f, 4.52f, 12.8301f, 6.28f)
                verticalLineTo(9.28f)
                curveTo(12.8201f, 11.04f, 14.1501f, 12.3699f, 15.9101f, 12.3699f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0898f, 12.3699f)
                horizontalLineTo(9.7798f)
                curveTo(9.6998f, 17.0399f, 8.7798f, 17.8099f, 5.9098f, 19.5099f)
                curveTo(5.5798f, 19.7099f, 5.4698f, 20.1299f, 5.6698f, 20.4699f)
                curveTo(5.8698f, 20.7999f, 6.2898f, 20.91f, 6.6298f, 20.71f)
                curveTo(10.0098f, 18.71f, 11.1898f, 17.4899f, 11.1898f, 11.6699f)
                verticalLineTo(6.28f)
                curveTo(11.1898f, 4.57f, 9.7998f, 3.1899f, 8.0998f, 3.1899f)
                horizontalLineTo(5.0998f)
                curveTo(3.3398f, 3.1899f, 2.0098f, 4.52f, 2.0098f, 6.28f)
                verticalLineTo(9.28f)
                curveTo(1.9998f, 11.04f, 3.3298f, 12.3699f, 5.0898f, 12.3699f)
                close()
            }
        }
        .build()
        return _quotedown!!
    }

private var _quotedown: ImageVector? = null

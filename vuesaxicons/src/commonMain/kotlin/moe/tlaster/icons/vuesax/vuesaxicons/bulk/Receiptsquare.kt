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

public val BulkGroup.Receiptsquare: ImageVector
    get() {
        if (_receiptsquare != null) {
            return _receiptsquare!!
        }
        _receiptsquare = Builder(name = "Receiptsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9002f, 16.5299f)
                curveTo(9.3802f, 16.0099f, 10.1203f, 16.0499f, 10.5403f, 16.6199f)
                lineTo(11.1403f, 17.4199f)
                curveTo(11.6103f, 18.0499f, 12.3902f, 18.0499f, 12.8602f, 17.4199f)
                lineTo(13.4503f, 16.6299f)
                curveTo(13.8703f, 16.0699f, 14.6102f, 16.0299f, 15.0902f, 16.5399f)
                curveTo(16.1402f, 17.6599f, 16.9902f, 17.2899f, 16.9902f, 15.7199f)
                verticalLineTo(9.0899f)
                curveTo(16.9902f, 6.7199f, 16.4302f, 6.1299f, 14.2102f, 6.1299f)
                horizontalLineTo(9.7702f)
                curveTo(7.5502f, 6.1299f, 6.9902f, 6.7199f, 6.9902f, 9.0899f)
                verticalLineTo(15.7199f)
                curveTo(7.0002f, 17.2699f, 7.8602f, 17.6399f, 8.9002f, 16.5299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
            }
        }
        .build()
        return _receiptsquare!!
    }

private var _receiptsquare: ImageVector? = null

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

public val BulkGroup.Judge: ImageVector
    get() {
        if (_judge != null) {
            return _judge!!
        }
        _judge = Builder(name = "Judge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5393f, 19.04f)
                curveTo(20.3893f, 19.19f, 20.1993f, 19.26f, 20.0093f, 19.26f)
                curveTo(19.8193f, 19.26f, 19.6293f, 19.19f, 19.4793f, 19.04f)
                lineTo(14.5293f, 14.09f)
                lineTo(15.0593f, 13.56f)
                lineTo(15.5893f, 13.03f)
                lineTo(20.5393f, 17.98f)
                curveTo(20.8293f, 18.27f, 20.8293f, 18.75f, 20.5393f, 19.04f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.4694f, 9.2801f)
                lineTo(12.2694f, 15.0801f)
                curveTo(12.6594f, 15.4701f, 12.6594f, 16.1001f, 12.2694f, 16.4901f)
                lineTo(11.3694f, 17.4001f)
                curveTo(10.5594f, 18.2001f, 9.2794f, 18.2001f, 8.4794f, 17.4001f)
                lineTo(4.1394f, 13.0601f)
                curveTo(3.3494f, 12.2701f, 3.3494f, 10.9801f, 4.1394f, 10.1801f)
                lineTo(5.0494f, 9.2701f)
                curveTo(5.4394f, 8.8901f, 6.0794f, 8.8901f, 6.4694f, 9.2801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5895f, 10.1899f)
                lineTo(14.7795f, 13.9899f)
                curveTo(14.3795f, 14.3899f, 13.7395f, 14.3899f, 13.3395f, 13.9899f)
                lineTo(7.5695f, 8.2199f)
                curveTo(7.1695f, 7.8199f, 7.1695f, 7.1799f, 7.5695f, 6.7799f)
                lineTo(11.3795f, 2.9699f)
                curveTo(12.1695f, 2.1799f, 13.4595f, 2.1799f, 14.2595f, 2.9699f)
                lineTo(18.5995f, 7.3099f)
                curveTo(19.3795f, 8.0999f, 19.3795f, 9.3799f, 18.5895f, 10.1899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.75f, 1.25f, 21.41f, 1.25f, 21.0f)
                curveTo(1.25f, 20.59f, 1.59f, 20.25f, 2.0f, 20.25f)
                horizontalLineTo(8.0f)
                curveTo(8.41f, 20.25f, 8.75f, 20.59f, 8.75f, 21.0f)
                curveTo(8.75f, 21.41f, 8.41f, 21.75f, 8.0f, 21.75f)
                close()
            }
        }
        .build()
        return _judge!!
    }

private var _judge: ImageVector? = null

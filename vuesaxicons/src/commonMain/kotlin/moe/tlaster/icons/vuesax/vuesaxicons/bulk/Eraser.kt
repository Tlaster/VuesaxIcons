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

public val BulkGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0303f, 22.0f)
                horizontalLineTo(13.9902f)
                curveTo(13.5702f, 22.0f, 13.2402f, 21.66f, 13.2402f, 21.25f)
                curveTo(13.2402f, 20.84f, 13.5802f, 20.5f, 13.9902f, 20.5f)
                horizontalLineTo(21.0303f)
                curveTo(21.4503f, 20.5f, 21.7803f, 20.84f, 21.7803f, 21.25f)
                curveTo(21.7803f, 21.66f, 21.4503f, 22.0f, 21.0303f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.41f, 16.3401f)
                lineTo(10.66f, 21.0901f)
                curveTo(9.55f, 22.2001f, 7.77f, 22.2601f, 6.59f, 21.2701f)
                curveTo(6.52f, 21.2101f, 6.46f, 21.1501f, 6.4f, 21.0901f)
                lineTo(5.53f, 20.2201f)
                lineTo(3.74f, 18.4301f)
                lineTo(2.88f, 17.5701f)
                curveTo(2.81f, 17.5001f, 2.75f, 17.4301f, 2.69f, 17.3601f)
                curveTo(1.71f, 16.1801f, 1.78f, 14.4201f, 2.88f, 13.3201f)
                lineTo(6.57f, 9.6401f)
                lineTo(7.63f, 8.5801f)
                lineTo(15.41f, 16.3401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1208f, 10.6399f)
                lineTo(15.4108f, 16.3399f)
                lineTo(7.6309f, 8.5799f)
                lineTo(13.3409f, 2.8799f)
                curveTo(14.5109f, 1.7099f, 16.4308f, 1.7099f, 17.6008f, 2.8799f)
                lineTo(21.1208f, 6.3899f)
                curveTo(22.2908f, 7.5599f, 22.2908f, 9.4699f, 21.1208f, 10.6399f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null

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

public val BulkGroup.Eraser1: ImageVector
    get() {
        if (_eraser1 != null) {
            return _eraser1!!
        }
        _eraser1 = Builder(name = "Eraser1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5794f, 14.6899f)
                lineTo(11.2594f, 17.0099f)
                curveTo(10.6194f, 17.6599f, 9.5695f, 17.6599f, 8.9194f, 17.0099f)
                lineTo(6.9894f, 15.0799f)
                curveTo(6.3394f, 14.4299f, 6.3394f, 13.3799f, 6.9894f, 12.7399f)
                lineTo(9.3095f, 10.4199f)
                lineTo(13.5794f, 14.6899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0105f, 11.2599f)
                lineTo(13.5806f, 14.6899f)
                lineTo(9.3105f, 10.4199f)
                lineTo(12.7406f, 6.9899f)
                curveTo(13.3806f, 6.3399f, 14.4306f, 6.3399f, 15.0806f, 6.9899f)
                lineTo(17.0105f, 8.9199f)
                curveTo(17.6605f, 9.5699f, 17.6605f, 10.6199f, 17.0105f, 11.2599f)
                close()
            }
        }
        .build()
        return _eraser1!!
    }

private var _eraser1: ImageVector? = null

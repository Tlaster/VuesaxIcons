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

public val BulkGroup.Arrowleft1: ImageVector
    get() {
        if (_arrowleft1 != null) {
            return _arrowleft1!!
        }
        _arrowleft1 = Builder(name = "Arrowleft1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.3299f)
                verticalLineTo(14.6699f)
                curveTo(18.0f, 17.9899f, 15.65f, 19.3399f, 12.78f, 17.6899f)
                lineTo(11.5f, 16.9499f)
                curveTo(11.19f, 16.7699f, 11.0f, 16.4399f, 11.0f, 16.0799f)
                verticalLineTo(7.9199f)
                curveTo(11.0f, 7.5599f, 11.19f, 7.2299f, 11.5f, 7.0499f)
                lineTo(12.78f, 6.3099f)
                curveTo(15.65f, 4.6599f, 18.0f, 6.0099f, 18.0f, 9.3299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0005f, 8.7901f)
                verticalLineTo(15.2201f)
                curveTo(10.0005f, 15.6101f, 9.5806f, 15.8501f, 9.2506f, 15.6501f)
                lineTo(8.1505f, 15.0101f)
                curveTo(5.2806f, 13.3601f, 5.2806f, 10.6401f, 8.1505f, 8.9901f)
                lineTo(9.2506f, 8.3501f)
                curveTo(9.5806f, 8.1601f, 10.0005f, 8.4001f, 10.0005f, 8.7901f)
                close()
            }
        }
        .build()
        return _arrowleft1!!
    }

private var _arrowleft1: ImageVector? = null

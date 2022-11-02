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

public val BulkGroup.Shieldslash: ImageVector
    get() {
        if (_shieldslash != null) {
            return _shieldslash!!
        }
        _shieldslash = Builder(name = "Shieldslash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3608f, 4.6401f)
                lineTo(5.8308f, 18.1701f)
                lineTo(4.7308f, 17.3501f)
                curveTo(4.0808f, 16.8601f, 3.5508f, 15.8001f, 3.5508f, 14.9801f)
                verticalLineTo(6.8901f)
                curveTo(3.5508f, 5.7601f, 4.4108f, 4.5201f, 5.4608f, 4.1201f)
                lineTo(10.9608f, 2.0601f)
                curveTo(11.5308f, 1.8501f, 12.4708f, 1.8501f, 13.0408f, 2.0601f)
                lineTo(18.5408f, 4.1201f)
                curveTo(18.8308f, 4.2301f, 19.1108f, 4.4101f, 19.3608f, 4.6401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.4491f, 6.8901f)
                verticalLineTo(14.9801f)
                curveTo(20.4491f, 15.8001f, 19.9191f, 16.8601f, 19.2691f, 17.3501f)
                lineTo(13.7691f, 21.4601f)
                curveTo(12.7891f, 22.1801f, 11.2091f, 22.1801f, 10.2291f, 21.4601f)
                lineTo(7.5391f, 19.4601f)
                lineTo(20.4191f, 6.5801f)
                curveTo(20.4391f, 6.6801f, 20.4491f, 6.7901f, 20.4491f, 6.8901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7709f, 2.2299f)
                curveTo(21.4709f, 1.9299f, 20.9809f, 1.9299f, 20.6809f, 2.2299f)
                lineTo(2.2309f, 20.6899f)
                curveTo(1.9309f, 20.9899f, 1.9309f, 21.4799f, 2.2309f, 21.7799f)
                curveTo(2.3809f, 21.9199f, 2.5709f, 21.9999f, 2.7709f, 21.9999f)
                curveTo(2.9709f, 21.9999f, 3.1609f, 21.9199f, 3.3109f, 21.7699f)
                lineTo(21.7709f, 3.3099f)
                curveTo(22.0809f, 3.0099f, 22.0809f, 2.5299f, 21.7709f, 2.2299f)
                close()
            }
        }
        .build()
        return _shieldslash!!
    }

private var _shieldslash: ImageVector? = null

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

public val BulkGroup.Useredit: ImageVector
    get() {
        if (_useredit != null) {
            return _useredit!!
        }
        _useredit = Builder(name = "Useredit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0002f, 14.5f)
                curveTo(6.9902f, 14.5f, 2.9102f, 17.86f, 2.9102f, 22.0f)
                curveTo(2.9102f, 22.28f, 3.1302f, 22.5f, 3.4102f, 22.5f)
                horizontalLineTo(20.5902f)
                curveTo(20.8702f, 22.5f, 21.0902f, 22.28f, 21.0902f, 22.0f)
                curveTo(21.0902f, 17.86f, 17.0102f, 14.5f, 12.0002f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4291f, 14.7401f)
                curveTo(20.5291f, 13.8401f, 19.8191f, 14.1301f, 19.2091f, 14.7401f)
                lineTo(15.669f, 18.2801f)
                curveTo(15.529f, 18.4201f, 15.3991f, 18.6801f, 15.3691f, 18.8701f)
                lineTo(15.1791f, 20.2201f)
                curveTo(15.1091f, 20.7101f, 15.4491f, 21.0501f, 15.9391f, 20.9801f)
                lineTo(17.289f, 20.7901f)
                curveTo(17.479f, 20.7601f, 17.7491f, 20.6301f, 17.8791f, 20.4901f)
                lineTo(21.419f, 16.9501f)
                curveTo(22.039f, 16.3501f, 22.3291f, 15.6401f, 21.4291f, 14.7401f)
                close()
            }
        }
        .build()
        return _useredit!!
    }

private var _useredit: ImageVector? = null

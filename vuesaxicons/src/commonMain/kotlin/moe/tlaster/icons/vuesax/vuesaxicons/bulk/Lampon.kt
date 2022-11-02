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

public val BulkGroup.Lampon: ImageVector
    get() {
        if (_lampon != null) {
            return _lampon!!
        }
        _lampon = Builder(name = "Lampon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2107f, 6.36f)
                curveTo(18.1707f, 4.26f, 16.1607f, 2.71f, 13.8307f, 2.2f)
                curveTo(11.3907f, 1.66f, 8.8907f, 2.24f, 6.9807f, 3.78f)
                curveTo(5.0607f, 5.31f, 3.9707f, 7.6f, 3.9707f, 10.05f)
                curveTo(3.9707f, 12.64f, 5.5207f, 15.35f, 7.8607f, 16.92f)
                verticalLineTo(17.75f)
                curveTo(7.8507f, 18.03f, 7.8407f, 18.46f, 8.1807f, 18.81f)
                curveTo(8.5307f, 19.17f, 9.0507f, 19.21f, 9.4607f, 19.21f)
                horizontalLineTo(14.5907f)
                curveTo(15.1307f, 19.21f, 15.5407f, 19.06f, 15.8207f, 18.78f)
                curveTo(16.2007f, 18.39f, 16.1907f, 17.89f, 16.1807f, 17.62f)
                verticalLineTo(16.92f)
                curveTo(19.2807f, 14.83f, 21.2307f, 10.42f, 19.2107f, 6.36f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2592f, 21.9999f)
                curveTo(15.1992f, 21.9999f, 15.1292f, 21.9899f, 15.0692f, 21.9699f)
                curveTo(13.0592f, 21.3999f, 10.9492f, 21.3999f, 8.9392f, 21.9699f)
                curveTo(8.5692f, 22.0699f, 8.1792f, 21.8599f, 8.0792f, 21.4899f)
                curveTo(7.9692f, 21.1199f, 8.1892f, 20.7299f, 8.5592f, 20.6299f)
                curveTo(10.8192f, 19.9899f, 13.1992f, 19.9899f, 15.4592f, 20.6299f)
                curveTo(15.8292f, 20.7399f, 16.0492f, 21.1199f, 15.9392f, 21.4899f)
                curveTo(15.8392f, 21.7999f, 15.5592f, 21.9999f, 15.2592f, 21.9999f)
                close()
            }
        }
        .build()
        return _lampon!!
    }

private var _lampon: ImageVector? = null

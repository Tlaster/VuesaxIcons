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

public val BulkGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6702f, 6.9499f)
                curveTo(21.0302f, 4.7799f, 19.2202f, 2.9699f, 17.0502f, 2.3299f)
                curveTo(15.4002f, 1.8499f, 14.2602f, 1.8899f, 13.4702f, 2.4799f)
                curveTo(12.5202f, 3.1899f, 12.4102f, 4.4699f, 12.4102f, 5.3799f)
                verticalLineTo(7.8699f)
                curveTo(12.4102f, 10.3299f, 13.5302f, 11.5799f, 15.7302f, 11.5799f)
                horizontalLineTo(18.6002f)
                curveTo(19.5002f, 11.5799f, 20.7902f, 11.4699f, 21.5002f, 10.5199f)
                curveTo(22.1102f, 9.7399f, 22.1602f, 8.5999f, 21.6702f, 6.9499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9094f, 13.3597f)
                curveTo(18.6494f, 13.0597f, 18.2694f, 12.8897f, 17.8794f, 12.8897f)
                horizontalLineTo(14.2994f)
                curveTo(12.5394f, 12.8897f, 11.1094f, 11.4597f, 11.1094f, 9.6997f)
                verticalLineTo(6.1197f)
                curveTo(11.1094f, 5.7297f, 10.9394f, 5.3497f, 10.6394f, 5.0897f)
                curveTo(10.3494f, 4.8297f, 9.9494f, 4.7097f, 9.5694f, 4.7597f)
                curveTo(7.2194f, 5.0597f, 5.0594f, 6.3497f, 3.6494f, 8.2897f)
                curveTo(2.2294f, 10.2397f, 1.7094f, 12.6197f, 2.1594f, 14.9997f)
                curveTo(2.8094f, 18.4397f, 5.5594f, 21.1897f, 9.0094f, 21.8397f)
                curveTo(9.5594f, 21.9497f, 10.1094f, 21.9997f, 10.6594f, 21.9997f)
                curveTo(12.4694f, 21.9997f, 14.2194f, 21.4397f, 15.7094f, 20.3497f)
                curveTo(17.6494f, 18.9397f, 18.9394f, 16.7797f, 19.2394f, 14.4297f)
                curveTo(19.2894f, 14.0397f, 19.1694f, 13.6497f, 18.9094f, 13.3597f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null

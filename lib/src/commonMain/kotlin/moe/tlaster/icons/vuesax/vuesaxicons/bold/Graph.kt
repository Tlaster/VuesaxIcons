package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6702f, 6.9494f)
                curveTo(21.0302f, 4.7794f, 19.2202f, 2.9694f, 17.0502f, 2.3294f)
                curveTo(15.4002f, 1.8494f, 14.2602f, 1.8894f, 13.4702f, 2.4794f)
                curveTo(12.5202f, 3.1894f, 12.4102f, 4.4694f, 12.4102f, 5.3794f)
                verticalLineTo(7.8694f)
                curveTo(12.4102f, 10.3294f, 13.5302f, 11.5794f, 15.7302f, 11.5794f)
                horizontalLineTo(18.6002f)
                curveTo(19.5002f, 11.5794f, 20.7902f, 11.4694f, 21.5002f, 10.5194f)
                curveTo(22.1102f, 9.7394f, 22.1602f, 8.5994f, 21.6702f, 6.9494f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9094f, 13.3611f)
                curveTo(18.6494f, 13.0611f, 18.2694f, 12.8911f, 17.8794f, 12.8911f)
                horizontalLineTo(14.2994f)
                curveTo(12.5394f, 12.8911f, 11.1094f, 11.4611f, 11.1094f, 9.7011f)
                verticalLineTo(6.1211f)
                curveTo(11.1094f, 5.7311f, 10.9394f, 5.3511f, 10.6394f, 5.0911f)
                curveTo(10.3494f, 4.8311f, 9.9494f, 4.7111f, 9.5694f, 4.7611f)
                curveTo(7.2194f, 5.0611f, 5.0594f, 6.3511f, 3.6494f, 8.2911f)
                curveTo(2.2294f, 10.2411f, 1.7094f, 12.6211f, 2.1594f, 15.0011f)
                curveTo(2.8094f, 18.4411f, 5.5594f, 21.1911f, 9.0094f, 21.8411f)
                curveTo(9.5594f, 21.9511f, 10.1094f, 22.0011f, 10.6594f, 22.0011f)
                curveTo(12.4694f, 22.0011f, 14.2194f, 21.4411f, 15.7094f, 20.3511f)
                curveTo(17.6494f, 18.9411f, 18.9394f, 16.7811f, 19.2394f, 14.4311f)
                curveTo(19.2894f, 14.0411f, 19.1694f, 13.6511f, 18.9094f, 13.3611f)
                close()
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null

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

public val BoldGroup.Lamp1: ImageVector
    get() {
        if (_lamp1 != null) {
            return _lamp1!!
        }
        _lamp1 = Builder(name = "Lamp1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5007f, 5.4812f)
                curveTo(12.5807f, 5.4812f, 12.6607f, 5.4812f, 12.7507f, 5.4913f)
                verticalLineTo(2.5313f)
                curveTo(12.7507f, 2.1212f, 12.4107f, 1.7813f, 12.0007f, 1.7813f)
                curveTo(11.5907f, 1.7813f, 11.2507f, 2.1212f, 11.2507f, 2.5313f)
                verticalLineTo(5.4913f)
                curveTo(11.3307f, 5.4812f, 11.4107f, 5.4812f, 11.5007f, 5.4812f)
                curveTo(6.8907f, 5.7112f, 3.2207f, 9.5112f, 3.2207f, 14.1813f)
                verticalLineTo(16.1213f)
                curveTo(3.2207f, 17.2213f, 4.1207f, 18.1213f, 5.2207f, 18.1213f)
                horizontalLineTo(18.7807f)
                curveTo(19.8807f, 18.1213f, 20.7807f, 17.2213f, 20.7807f, 16.1213f)
                verticalLineTo(14.1813f)
                curveTo(20.7807f, 9.5112f, 17.1107f, 5.7112f, 12.5007f, 5.4812f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7292f, 19.1094f)
                curveTo(15.0592f, 19.1094f, 15.2992f, 19.4194f, 15.2192f, 19.7394f)
                curveTo(14.8392f, 21.1694f, 13.5392f, 22.2194f, 11.9992f, 22.2194f)
                curveTo(10.4592f, 22.2194f, 9.1592f, 21.1694f, 8.7792f, 19.7394f)
                curveTo(8.6992f, 19.4194f, 8.9392f, 19.1094f, 9.2692f, 19.1094f)
                horizontalLineTo(14.7292f)
                close()
            }
        }
        .build()
        return _lamp1!!
    }

private var _lamp1: ImageVector? = null

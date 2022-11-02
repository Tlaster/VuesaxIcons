package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val BulkGroup.Sendsquare: ImageVector
    get() {
        if (_sendsquare != null) {
            return _sendsquare!!
        }
        _sendsquare = Builder(name = "Sendsquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    pathFillType = EvenOdd) {
                moveTo(11.4697f, 5.9797f)
                curveTo(11.7626f, 5.6868f, 12.2374f, 5.6868f, 12.5303f, 5.9797f)
                lineTo(15.5303f, 8.9797f)
                curveTo(15.8232f, 9.2726f, 15.8232f, 9.7474f, 15.5303f, 10.0403f)
                curveTo(15.2374f, 10.3332f, 14.7626f, 10.3332f, 14.4697f, 10.0403f)
                lineTo(12.0f, 7.5707f)
                lineTo(9.5303f, 10.0403f)
                curveTo(9.2374f, 10.3332f, 8.7626f, 10.3332f, 8.4697f, 10.0403f)
                curveTo(8.1768f, 9.7474f, 8.1768f, 9.2726f, 8.4697f, 8.9797f)
                lineTo(11.4697f, 5.9797f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.76f)
                curveTo(12.4142f, 5.76f, 12.75f, 6.0958f, 12.75f, 6.51f)
                verticalLineTo(14.51f)
                curveTo(12.75f, 14.9242f, 12.4142f, 15.26f, 12.0f, 15.26f)
                curveTo(11.5858f, 15.26f, 11.25f, 14.9242f, 11.25f, 14.51f)
                verticalLineTo(6.51f)
                curveTo(11.25f, 6.0958f, 11.5858f, 5.76f, 12.0f, 5.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.2889f, 16.2722f)
                curveTo(5.4202f, 15.8794f, 5.8451f, 15.6674f, 6.2379f, 15.7986f)
                curveTo(9.9736f, 17.0471f, 14.0268f, 17.0471f, 17.7625f, 15.7986f)
                curveTo(18.1553f, 15.6674f, 18.5802f, 15.8794f, 18.7115f, 16.2722f)
                curveTo(18.8428f, 16.6651f, 18.6308f, 17.09f, 18.2379f, 17.2213f)
                curveTo(14.1936f, 18.5729f, 9.8068f, 18.5729f, 5.7625f, 17.2213f)
                curveTo(5.3696f, 17.09f, 5.1576f, 16.6651f, 5.2889f, 16.2722f)
                close()
            }
        }
        .build()
        return _sendsquare!!
    }

private var _sendsquare: ImageVector? = null

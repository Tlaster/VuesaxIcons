package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Diamonds: ImageVector
    get() {
        if (_diamonds != null) {
            return _diamonds!!
        }
        _diamonds = Builder(name = "Diamonds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0008f, 22.6002f)
                curveTo(10.8908f, 22.6002f, 9.8608f, 22.1302f, 9.0908f, 21.2902f)
                lineTo(2.2308f, 13.7502f)
                curveTo(1.2608f, 12.6902f, 0.9608f, 10.8202f, 1.5408f, 9.5101f)
                lineTo(4.1008f, 3.7502f)
                curveTo(4.8008f, 2.1802f, 5.9708f, 1.4102f, 7.6908f, 1.4102f)
                horizontalLineTo(16.2808f)
                verticalLineTo(2.1602f)
                verticalLineTo(1.4102f)
                curveTo(18.0008f, 1.4102f, 19.1708f, 2.1702f, 19.8708f, 3.7402f)
                lineTo(22.4308f, 9.5002f)
                curveTo(23.0108f, 10.8102f, 22.7208f, 12.6802f, 21.7508f, 13.7402f)
                lineTo(14.9008f, 21.2902f)
                curveTo(14.1508f, 22.1302f, 13.1108f, 22.6002f, 12.0008f, 22.6002f)
                close()
                moveTo(16.2908f, 2.9002f)
                horizontalLineTo(7.7008f)
                curveTo(6.3908f, 2.9002f, 5.8608f, 3.4801f, 5.4808f, 4.3502f)
                lineTo(2.9208f, 10.1102f)
                curveTo(2.5808f, 10.8802f, 2.7808f, 12.1102f, 3.3408f, 12.7302f)
                lineTo(10.2008f, 20.2702f)
                curveTo(10.6808f, 20.8002f, 11.3208f, 21.0902f, 12.0008f, 21.0902f)
                curveTo(12.6808f, 21.0902f, 13.3208f, 20.8002f, 13.8008f, 20.2702f)
                lineTo(20.6508f, 12.7202f)
                curveTo(21.2208f, 12.0902f, 21.4208f, 10.8702f, 21.0708f, 10.1002f)
                lineTo(18.5108f, 4.3402f)
                curveTo(18.1308f, 3.4802f, 17.6008f, 2.9002f, 16.2908f, 2.9002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 8.75f)
                curveTo(3.09f, 8.75f, 2.75f, 8.41f, 2.75f, 8.0f)
                curveTo(2.75f, 7.59f, 3.09f, 7.25f, 3.5f, 7.25f)
                lineTo(20.5f, 7.24f)
                curveTo(20.91f, 7.24f, 21.25f, 7.58f, 21.25f, 7.99f)
                curveTo(21.25f, 8.4f, 20.91f, 8.74f, 20.5f, 8.74f)
                lineTo(3.5f, 8.75f)
                close()
            }
        }
        .build()
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null

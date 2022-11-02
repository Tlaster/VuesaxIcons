package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Directright: ImageVector
    get() {
        if (_directright != null) {
            return _directright!!
        }
        _directright = Builder(name = "Directright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.1908f, 22.0598f)
                curveTo(5.1908f, 22.0598f, 4.2208f, 21.6698f, 3.4508f, 20.9198f)
                curveTo(2.2008f, 19.6998f, 1.9008f, 17.8998f, 2.6808f, 16.3398f)
                lineTo(4.3008f, 13.0998f)
                curveTo(4.6408f, 12.4198f, 4.6408f, 11.5998f, 4.3008f, 10.9098f)
                lineTo(2.6808f, 7.6599f)
                curveTo(1.9008f, 6.0999f, 2.2008f, 4.2998f, 3.4508f, 3.0798f)
                curveTo(4.7008f, 1.8599f, 6.5008f, 1.5898f, 8.0508f, 2.4098f)
                lineTo(19.6408f, 8.5098f)
                curveTo(20.9408f, 9.1898f, 21.7508f, 10.5298f, 21.7508f, 11.9998f)
                curveTo(21.7508f, 13.4698f, 20.9408f, 14.8098f, 19.6408f, 15.4898f)
                lineTo(8.0508f, 21.5898f)
                curveTo(7.4508f, 21.9098f, 6.8208f, 22.0598f, 6.1908f, 22.0598f)
                close()
                moveTo(6.2008f, 3.4399f)
                curveTo(5.5108f, 3.4399f, 4.9108f, 3.7599f, 4.5008f, 4.1599f)
                curveTo(3.8808f, 4.7599f, 3.4408f, 5.8299f, 4.0208f, 6.9998f)
                lineTo(5.6408f, 10.2398f)
                curveTo(6.1908f, 11.3498f, 6.1908f, 12.6598f, 5.6408f, 13.7698f)
                lineTo(4.0208f, 17.0098f)
                curveTo(3.4308f, 18.1798f, 3.8808f, 19.2498f, 4.5008f, 19.8498f)
                curveTo(5.1208f, 20.4498f, 6.1908f, 20.8798f, 7.3508f, 20.2698f)
                lineTo(18.9408f, 14.1698f)
                curveTo(19.7608f, 13.7398f, 20.2508f, 12.9298f, 20.2508f, 12.0098f)
                curveTo(20.2508f, 11.0898f, 19.7608f, 10.2798f, 18.9408f, 9.8498f)
                lineTo(7.3508f, 3.7299f)
                curveTo(6.9508f, 3.5199f, 6.5608f, 3.4399f, 6.2008f, 3.4399f)
                close()
            }
        }
        .build()
        return _directright!!
    }

private var _directright: ImageVector? = null

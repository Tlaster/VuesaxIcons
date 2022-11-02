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

public val BulkGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    pathFillType = NonZero) {
                moveTo(12.7109f, 19.0299f)
                curveTo(12.4809f, 19.0299f, 12.3009f, 18.9699f, 12.2009f, 18.9199f)
                curveTo(11.9709f, 18.8099f, 11.4309f, 18.4499f, 11.4309f, 17.4699f)
                verticalLineTo(14.0499f)
                lineTo(8.5109f, 16.7299f)
                curveTo(8.2109f, 17.0099f, 7.7309f, 16.9899f, 7.4509f, 16.6799f)
                curveTo(7.1709f, 16.3699f, 7.1909f, 15.8999f, 7.5009f, 15.6199f)
                lineTo(11.4309f, 12.0199f)
                verticalLineTo(11.9399f)
                lineTo(7.5009f, 8.3799f)
                curveTo(7.1909f, 8.0999f, 7.1709f, 7.6299f, 7.4509f, 7.3199f)
                curveTo(7.7309f, 7.0199f, 8.2109f, 6.9899f, 8.5109f, 7.2699f)
                lineTo(11.4309f, 9.9499f)
                verticalLineTo(6.5299f)
                curveTo(11.4309f, 5.5499f, 11.9709f, 5.1899f, 12.2009f, 5.0799f)
                curveTo(12.4309f, 4.9699f, 13.0509f, 4.7899f, 13.8009f, 5.4199f)
                lineTo(16.2209f, 7.4399f)
                curveTo(16.5509f, 7.7099f, 16.7409f, 8.1099f, 16.7509f, 8.5199f)
                curveTo(16.7609f, 8.9299f, 16.5909f, 9.3299f, 16.2709f, 9.6199f)
                lineTo(13.6609f, 12.0099f)
                lineTo(16.2709f, 14.3999f)
                curveTo(16.5809f, 14.6899f, 16.7609f, 15.0899f, 16.7509f, 15.4999f)
                curveTo(16.7409f, 15.9099f, 16.5509f, 16.2999f, 16.2209f, 16.5799f)
                lineTo(13.8009f, 18.5999f)
                curveTo(13.3809f, 18.9399f, 13.0009f, 19.0299f, 12.7109f, 19.0299f)
                close()
                moveTo(12.9309f, 13.2999f)
                verticalLineTo(17.3599f)
                lineTo(15.2609f, 15.4099f)
                lineTo(12.9309f, 13.2999f)
                close()
                moveTo(12.9309f, 6.6399f)
                verticalLineTo(10.6399f)
                lineTo(15.2609f, 8.4999f)
                lineTo(12.9309f, 6.6399f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null

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

public val BulkGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9606f, 14.0401f)
                verticalLineTo(12.9301f)
                curveTo(9.9606f, 12.5001f, 9.6405f, 12.2901f, 9.2506f, 12.4601f)
                lineTo(4.2406f, 14.6201f)
                curveTo(3.4506f, 14.9601f, 2.8105f, 14.5401f, 2.8105f, 13.6901f)
                verticalLineTo(12.3701f)
                curveTo(2.8105f, 11.6901f, 3.3205f, 10.9001f, 3.9506f, 10.6401f)
                lineTo(9.6505f, 8.1901f)
                curveTo(9.8105f, 8.1101f, 9.9506f, 7.9001f, 9.9506f, 7.7201f)
                verticalLineTo(4.6601f)
                curveTo(9.9506f, 3.7001f, 10.6605f, 2.5501f, 11.5105f, 2.1101f)
                curveTo(11.8105f, 1.9601f, 12.1705f, 1.9601f, 12.4705f, 2.1101f)
                curveTo(13.3305f, 2.5501f, 14.0405f, 3.6901f, 14.0405f, 4.6501f)
                verticalLineTo(7.7101f)
                curveTo(14.0405f, 7.8901f, 14.1805f, 8.1001f, 14.3405f, 8.1801f)
                lineTo(15.3805f, 8.6201f)
                lineTo(9.9606f, 14.0401f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.1892f, 12.3701f)
                verticalLineTo(13.6901f)
                curveTo(21.1892f, 14.5401f, 20.5492f, 14.9601f, 19.7592f, 14.6201f)
                lineTo(14.7492f, 12.4601f)
                curveTo(14.3492f, 12.3001f, 14.0392f, 12.5001f, 14.0392f, 12.9301f)
                verticalLineTo(15.8401f)
                curveTo(14.0392f, 16.0701f, 14.1692f, 16.4001f, 14.3392f, 16.5601f)
                lineTo(16.6592f, 18.8901f)
                curveTo(16.8992f, 19.1301f, 17.0092f, 19.6101f, 16.8992f, 19.9401f)
                lineTo(16.4492f, 21.3001f)
                curveTo(16.2492f, 21.8901f, 15.5792f, 22.1601f, 15.0292f, 21.8901f)
                lineTo(12.6492f, 19.8901f)
                curveTo(12.2892f, 19.5801f, 11.6992f, 19.5801f, 11.3392f, 19.8901f)
                lineTo(8.9592f, 21.8901f)
                curveTo(8.4092f, 22.1701f, 7.7392f, 21.8901f, 7.5592f, 21.3001f)
                lineTo(7.1092f, 19.9401f)
                curveTo(6.9992f, 19.6001f, 7.1092f, 19.1301f, 7.3492f, 18.8901f)
                lineTo(9.6692f, 16.5601f)
                curveTo(9.8292f, 16.4001f, 9.9592f, 16.0701f, 9.9592f, 15.8401f)
                verticalLineTo(14.0401f)
                lineTo(15.3792f, 8.6201f)
                lineTo(20.0492f, 10.6301f)
                curveTo(20.6792f, 10.9001f, 21.1892f, 11.6901f, 21.1892f, 12.3701f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null

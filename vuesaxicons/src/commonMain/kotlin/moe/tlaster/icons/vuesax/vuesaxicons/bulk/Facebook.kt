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

public val BulkGroup.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
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
                moveTo(13.9205f, 9.2802f)
                lineTo(13.9705f, 12.2302f)
                lineTo(16.6005f, 12.1902f)
                curveTo(16.7905f, 12.1902f, 16.9305f, 12.3602f, 16.9005f, 12.5402f)
                lineTo(16.5504f, 14.4502f)
                curveTo(16.5204f, 14.5902f, 16.4005f, 14.6902f, 16.2605f, 14.7002f)
                lineTo(14.0105f, 14.7402f)
                lineTo(14.1305f, 21.9902f)
                lineTo(11.1305f, 22.0402f)
                lineTo(11.0105f, 14.7902f)
                lineTo(9.3105f, 14.8202f)
                curveTo(9.1405f, 14.8202f, 9.0105f, 14.6902f, 9.0105f, 14.5202f)
                lineTo(8.9805f, 12.6202f)
                curveTo(8.9805f, 12.4502f, 9.1105f, 12.3202f, 9.2805f, 12.3202f)
                lineTo(10.9805f, 12.2902f)
                lineTo(10.9305f, 9.0402f)
                curveTo(10.9005f, 7.3802f, 12.2205f, 6.0202f, 13.8805f, 5.9902f)
                lineTo(16.5804f, 5.9502f)
                curveTo(16.7504f, 5.9502f, 16.8805f, 6.0802f, 16.8805f, 6.2502f)
                lineTo(16.9205f, 8.6502f)
                curveTo(16.9205f, 8.8202f, 16.7905f, 8.9502f, 16.6205f, 8.9502f)
                lineTo(14.2205f, 8.9902f)
                curveTo(14.0505f, 8.9802f, 13.9205f, 9.1202f, 13.9205f, 9.2802f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null

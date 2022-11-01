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

public val BulkGroup.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(5.6802f, 18.44f)
                verticalLineTo(20.29f)
                curveTo(5.6802f, 21.06f, 6.5002f, 21.54f, 7.1702f, 21.16f)
                lineTo(9.0303f, 20.11f)
                curveTo(9.9703f, 20.38f, 10.9602f, 20.52f, 11.9902f, 20.52f)
                curveTo(17.5102f, 20.52f, 21.9902f, 16.37f, 21.9902f, 11.26f)
                curveTo(21.9902f, 6.15f, 17.5102f, 2.0f, 11.9902f, 2.0f)
                curveTo(6.4702f, 2.0f, 1.9902f, 6.15f, 1.9902f, 11.26f)
                curveTo(2.0002f, 14.15f, 3.4402f, 16.74f, 5.6802f, 18.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0206f, 9.5602f)
                lineTo(8.4805f, 12.5802f)
                curveTo(8.1705f, 12.9502f, 8.5105f, 13.5002f, 8.9805f, 13.3902f)
                lineTo(10.9905f, 12.9002f)
                curveTo(11.1205f, 12.8702f, 11.2505f, 12.8902f, 11.3605f, 12.9502f)
                lineTo(12.3705f, 13.5402f)
                curveTo(12.5805f, 13.6602f, 12.8505f, 13.6202f, 13.0005f, 13.4302f)
                lineTo(15.5005f, 10.4402f)
                curveTo(15.8105f, 10.0702f, 15.4605f, 9.5102f, 14.9905f, 9.6402f)
                lineTo(13.1705f, 10.1102f)
                curveTo(13.0505f, 10.1402f, 12.9205f, 10.1302f, 12.8105f, 10.0702f)
                lineTo(11.6305f, 9.4502f)
                curveTo(11.4305f, 9.3302f, 11.1706f, 9.3802f, 11.0206f, 9.5602f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null

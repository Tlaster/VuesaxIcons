package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.`Google-1`: ImageVector
    get() {
        if (`_google-1` != null) {
            return `_google-1`!!
        }
        `_google-1` = Builder(name = "Google-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5902f, 10.1802f)
                horizontalLineTo(12.2002f)
                verticalLineTo(13.8903f)
                horizontalLineTo(17.7102f)
                curveTo(17.6002f, 14.8103f, 17.0002f, 16.2002f, 15.6702f, 17.1302f)
                curveTo(14.8302f, 17.7202f, 13.6902f, 18.1302f, 12.2002f, 18.1302f)
                curveTo(9.5602f, 18.1302f, 7.3102f, 16.3902f, 6.5102f, 13.9702f)
                curveTo(6.3002f, 13.3502f, 6.1802f, 12.6802f, 6.1802f, 11.9902f)
                curveTo(6.1802f, 11.3002f, 6.3002f, 10.6303f, 6.5002f, 10.0103f)
                curveTo(6.5602f, 9.8302f, 6.6302f, 9.6403f, 6.7102f, 9.4703f)
                curveTo(7.6602f, 7.3403f, 9.7602f, 5.8602f, 12.2002f, 5.8602f)
                curveTo(14.0802f, 5.8602f, 15.3402f, 6.6702f, 16.0702f, 7.3502f)
                lineTo(18.8902f, 4.5902f)
                curveTo(17.1602f, 2.9802f, 14.9002f, 1.9902f, 12.2002f, 1.9902f)
                curveTo(8.2902f, 1.9902f, 4.9102f, 4.2302f, 3.2702f, 7.5002f)
                curveTo(2.5902f, 8.8602f, 2.2002f, 10.3802f, 2.2002f, 11.9902f)
                curveTo(2.2002f, 13.6002f, 2.5902f, 15.1203f, 3.2702f, 16.4803f)
                lineTo(3.2802f, 16.4702f)
                verticalLineTo(16.4803f)
                curveTo(4.9202f, 19.7503f, 8.2902f, 21.9902f, 12.2002f, 21.9902f)
                curveTo(14.9002f, 21.9902f, 17.1702f, 21.1003f, 18.8202f, 19.5703f)
                curveTo(20.7102f, 17.8303f, 21.8002f, 15.2602f, 21.8002f, 12.2102f)
                curveTo(21.8002f, 11.4002f, 21.7302f, 10.8002f, 21.5902f, 10.1802f)
                close()
            }
        }
        .build()
        return `_google-1`!!
    }

private var `_google-1`: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.crypto.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.OutlineGroup

public val OutlineGroup.Chainlink: ImageVector
    get() {
        if (_chainlink != null) {
            return _chainlink!!
        }
        _chainlink = Builder(name = "Chainlink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.4302f)
                curveTo(11.52f, 22.4302f, 11.05f, 22.3202f, 10.66f, 22.1102f)
                lineTo(3.66f, 18.2202f)
                curveTo(2.85f, 17.7702f, 2.25f, 16.7402f, 2.25f, 15.8202f)
                verticalLineTo(8.1802f)
                curveTo(2.25f, 7.2602f, 2.86f, 6.2202f, 3.67f, 5.7802f)
                lineTo(10.67f, 1.8902f)
                curveTo(11.43f, 1.4702f, 12.58f, 1.4702f, 13.34f, 1.8902f)
                lineTo(20.34f, 5.7802f)
                curveTo(21.15f, 6.2302f, 21.75f, 7.2602f, 21.75f, 8.1802f)
                verticalLineTo(15.8302f)
                curveTo(21.75f, 16.7502f, 21.14f, 17.7902f, 20.33f, 18.2302f)
                lineTo(13.33f, 22.1202f)
                curveTo(12.96f, 22.3302f, 12.48f, 22.4302f, 12.0f, 22.4302f)
                close()
                moveTo(12.0f, 3.0702f)
                curveTo(11.77f, 3.0702f, 11.55f, 3.1102f, 11.39f, 3.2002f)
                lineTo(4.39f, 7.0902f)
                curveTo(4.06f, 7.2702f, 3.75f, 7.8002f, 3.75f, 8.1802f)
                verticalLineTo(15.8302f)
                curveTo(3.75f, 16.2102f, 4.06f, 16.7402f, 4.39f, 16.9202f)
                lineTo(11.39f, 20.8102f)
                curveTo(11.7f, 20.9802f, 12.3f, 20.9802f, 12.6f, 20.8102f)
                lineTo(19.6f, 16.9202f)
                curveTo(19.93f, 16.7402f, 20.24f, 16.2102f, 20.24f, 15.8302f)
                verticalLineTo(8.1802f)
                curveTo(20.24f, 7.8002f, 19.93f, 7.2702f, 19.6f, 7.0902f)
                lineTo(12.6f, 3.2002f)
                curveTo(12.45f, 3.1102f, 12.23f, 3.0702f, 12.0f, 3.0702f)
                close()
            }
        }
        .build()
        return _chainlink!!
    }

private var _chainlink: ImageVector? = null

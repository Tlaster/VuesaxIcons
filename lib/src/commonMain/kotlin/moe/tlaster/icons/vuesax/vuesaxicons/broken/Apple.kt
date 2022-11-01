package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1602f, 17.79f)
                curveTo(5.4202f, 18.37f, 5.7302f, 18.95f, 6.0902f, 19.51f)
                curveTo(6.8502f, 20.68f, 7.8702f, 21.99f, 9.2002f, 22.0f)
                curveTo(9.7502f, 22.01f, 10.1202f, 21.84f, 10.5202f, 21.66f)
                curveTo(10.9802f, 21.46f, 11.4702f, 21.23f, 12.3302f, 21.23f)
                curveTo(13.1902f, 21.22f, 13.6802f, 21.45f, 14.1302f, 21.66f)
                curveTo(14.5202f, 21.84f, 14.8802f, 22.0f, 15.4202f, 22.0f)
                curveTo(16.7502f, 21.99f, 17.8302f, 20.53f, 18.5902f, 19.37f)
                curveTo(19.1402f, 18.53f, 19.3402f, 18.11f, 19.7602f, 17.17f)
                curveTo(16.6802f, 16.0f, 16.1802f, 11.61f, 19.2302f, 9.93f)
                curveTo(18.3002f, 8.76f, 16.9902f, 8.09f, 15.7602f, 8.09f)
                curveTo(14.8702f, 8.09f, 14.2602f, 8.32f, 13.7102f, 8.53f)
                curveTo(13.2502f, 8.71f, 12.8202f, 8.87f, 12.3102f, 8.87f)
                curveTo(11.7502f, 8.87f, 11.2602f, 8.69f, 10.7402f, 8.51f)
                curveTo(10.1702f, 8.31f, 9.5802f, 8.09f, 8.8402f, 8.09f)
                curveTo(7.4502f, 8.09f, 5.9802f, 8.94f, 5.0402f, 10.38f)
                curveTo(4.5902f, 11.08f, 4.3202f, 12.0f, 4.2402f, 13.03f)
                moveTo(15.4102f, 2.0f)
                curveTo(15.5702f, 3.1f, 15.1202f, 4.19f, 14.5302f, 4.95f)
                curveTo(13.9002f, 5.77f, 12.8002f, 6.41f, 11.7402f, 6.37f)
                curveTo(11.5502f, 5.31f, 12.0402f, 4.22f, 12.6402f, 3.49f)
                curveTo(13.3102f, 2.69f, 14.4402f, 2.07f, 15.4102f, 2.0f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null

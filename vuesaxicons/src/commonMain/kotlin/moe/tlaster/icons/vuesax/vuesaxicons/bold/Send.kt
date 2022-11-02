package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0693f, 8.5087f)
                lineTo(9.5093f, 4.2287f)
                curveTo(3.7593f, 1.3487f, 1.3993f, 3.7087f, 4.2793f, 9.4587f)
                lineTo(5.1493f, 11.1987f)
                curveTo(5.3993f, 11.7087f, 5.3993f, 12.2987f, 5.1493f, 12.8087f)
                lineTo(4.2793f, 14.5387f)
                curveTo(1.3993f, 20.2887f, 3.7493f, 22.6487f, 9.5093f, 19.7687f)
                lineTo(18.0693f, 15.4887f)
                curveTo(21.9093f, 13.5687f, 21.9093f, 10.4287f, 18.0693f, 8.5087f)
                close()
                moveTo(14.8393f, 12.7487f)
                horizontalLineTo(9.4393f)
                curveTo(9.0293f, 12.7487f, 8.6893f, 12.4087f, 8.6893f, 11.9987f)
                curveTo(8.6893f, 11.5887f, 9.0293f, 11.2487f, 9.4393f, 11.2487f)
                horizontalLineTo(14.8393f)
                curveTo(15.2493f, 11.2487f, 15.5893f, 11.5887f, 15.5893f, 11.9987f)
                curveTo(15.5893f, 12.4087f, 15.2493f, 12.7487f, 14.8393f, 12.7487f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null

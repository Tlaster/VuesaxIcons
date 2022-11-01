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

public val BoldGroup.`Message-2`: ImageVector
    get() {
        if (`_message-2` != null) {
            return `_message-2`!!
        }
        `_message-2` = Builder(name = "Message-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.4297f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 2.4297f, 2.0f, 4.4297f, 2.0f, 7.4297f)
                verticalLineTo(13.4297f)
                curveTo(2.0f, 16.4297f, 4.0f, 18.4297f, 7.0f, 18.4297f)
                horizontalLineTo(11.0f)
                lineTo(15.45f, 21.3897f)
                curveTo(16.11f, 21.8297f, 17.0f, 21.3597f, 17.0f, 20.5597f)
                verticalLineTo(18.4297f)
                curveTo(20.0f, 18.4297f, 22.0f, 16.4297f, 22.0f, 13.4297f)
                verticalLineTo(7.4297f)
                curveTo(22.0f, 4.4297f, 20.0f, 2.4297f, 17.0f, 2.4297f)
                close()
                moveTo(15.5f, 11.2497f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.2497f, 7.75f, 10.9097f, 7.75f, 10.4997f)
                curveTo(7.75f, 10.0897f, 8.09f, 9.7497f, 8.5f, 9.7497f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 9.7497f, 16.25f, 10.0897f, 16.25f, 10.4997f)
                curveTo(16.25f, 10.9097f, 15.91f, 11.2497f, 15.5f, 11.2497f)
                close()
            }
        }
        .build()
        return `_message-2`!!
    }

private var `_message-2`: ImageVector? = null

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

public val BoldGroup.`Message-search`: ImageVector
    get() {
        if (`_message-search` != null) {
            return `_message-search`!!
        }
        `_message-search` = Builder(name = "Message-search", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                curveTo(4.24f, 2.0f, 2.0f, 4.23f, 2.0f, 6.98f)
                verticalLineTo(12.96f)
                verticalLineTo(13.96f)
                curveTo(2.0f, 16.71f, 4.24f, 18.94f, 7.0f, 18.94f)
                horizontalLineTo(8.5f)
                curveTo(8.77f, 18.94f, 9.13f, 19.12f, 9.3f, 19.34f)
                lineTo(10.8f, 21.33f)
                curveTo(11.46f, 22.21f, 12.54f, 22.21f, 13.2f, 21.33f)
                lineTo(14.7f, 19.34f)
                curveTo(14.89f, 19.09f, 15.19f, 18.94f, 15.5f, 18.94f)
                horizontalLineTo(17.0f)
                curveTo(19.76f, 18.94f, 22.0f, 16.71f, 22.0f, 13.96f)
                verticalLineTo(6.98f)
                curveTo(22.0f, 4.23f, 19.76f, 2.0f, 17.0f, 2.0f)
                close()
                moveTo(15.66f, 14.53f)
                curveTo(15.51f, 14.68f, 15.32f, 14.75f, 15.13f, 14.75f)
                curveTo(14.94f, 14.75f, 14.75f, 14.68f, 14.6f, 14.53f)
                lineTo(13.86f, 13.79f)
                curveTo(13.28f, 14.17f, 12.58f, 14.4f, 11.83f, 14.4f)
                curveTo(9.79f, 14.4f, 8.13f, 12.74f, 8.13f, 10.7f)
                curveTo(8.13f, 8.66f, 9.78f, 7.0f, 11.83f, 7.0f)
                curveTo(13.88f, 7.0f, 15.53f, 8.66f, 15.53f, 10.7f)
                curveTo(15.53f, 11.45f, 15.3f, 12.15f, 14.92f, 12.73f)
                lineTo(15.66f, 13.47f)
                curveTo(15.95f, 13.76f, 15.95f, 14.24f, 15.66f, 14.53f)
                close()
            }
        }
        .build()
        return `_message-search`!!
    }

private var `_message-search`: ImageVector? = null

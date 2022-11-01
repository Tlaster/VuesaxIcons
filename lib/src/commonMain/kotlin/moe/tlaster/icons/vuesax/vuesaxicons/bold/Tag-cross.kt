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

public val BoldGroup.`Tag-cross`: ImageVector
    get() {
        if (`_tag-cross` != null) {
            return `_tag-cross`!!
        }
        `_tag-cross` = Builder(name = "Tag-cross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9997f, 3.75f)
                horizontalLineTo(10.2797f)
                curveTo(8.8697f, 3.75f, 7.5297f, 4.34f, 6.5797f, 5.39f)
                lineTo(3.0497f, 9.27f)
                curveTo(1.6397f, 10.82f, 1.6397f, 13.18f, 3.0497f, 14.73f)
                lineTo(6.5797f, 18.61f)
                curveTo(7.5297f, 19.65f, 8.8697f, 20.25f, 10.2797f, 20.25f)
                horizontalLineTo(16.9997f)
                curveTo(19.7597f, 20.25f, 21.9997f, 18.01f, 21.9997f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(21.9997f, 5.99f, 19.7597f, 3.75f, 16.9997f, 3.75f)
                close()
                moveTo(16.5297f, 13.94f)
                curveTo(16.8197f, 14.23f, 16.8197f, 14.71f, 16.5297f, 15.0f)
                curveTo(16.3797f, 15.15f, 16.1897f, 15.22f, 15.9997f, 15.22f)
                curveTo(15.8097f, 15.22f, 15.6197f, 15.15f, 15.4697f, 15.0f)
                lineTo(13.5297f, 13.06f)
                lineTo(11.5897f, 15.0f)
                curveTo(11.4397f, 15.15f, 11.2497f, 15.22f, 11.0597f, 15.22f)
                curveTo(10.8697f, 15.22f, 10.6797f, 15.15f, 10.5297f, 15.0f)
                curveTo(10.2397f, 14.71f, 10.2397f, 14.23f, 10.5297f, 13.94f)
                lineTo(12.4697f, 12.0f)
                lineTo(10.5297f, 10.06f)
                curveTo(10.2397f, 9.77f, 10.2397f, 9.29f, 10.5297f, 9.0f)
                curveTo(10.8197f, 8.71f, 11.2997f, 8.71f, 11.5897f, 9.0f)
                lineTo(13.5297f, 10.94f)
                lineTo(15.4697f, 9.0f)
                curveTo(15.7597f, 8.71f, 16.2397f, 8.71f, 16.5297f, 9.0f)
                curveTo(16.8197f, 9.29f, 16.8197f, 9.77f, 16.5297f, 10.06f)
                lineTo(14.5897f, 12.0f)
                lineTo(16.5297f, 13.94f)
                close()
            }
        }
        .build()
        return `_tag-cross`!!
    }

private var `_tag-cross`: ImageVector? = null

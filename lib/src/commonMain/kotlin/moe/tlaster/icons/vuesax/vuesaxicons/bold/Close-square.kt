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

public val BoldGroup.`Close-square`: ImageVector
    get() {
        if (`_close-square` != null) {
            return `_close-square`!!
        }
        `_close-square` = Builder(name = "Close-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(15.36f, 14.3f)
                curveTo(15.65f, 14.59f, 15.65f, 15.07f, 15.36f, 15.36f)
                curveTo(15.21f, 15.51f, 15.02f, 15.58f, 14.83f, 15.58f)
                curveTo(14.64f, 15.58f, 14.45f, 15.51f, 14.3f, 15.36f)
                lineTo(12.0f, 13.06f)
                lineTo(9.7f, 15.36f)
                curveTo(9.55f, 15.51f, 9.36f, 15.58f, 9.17f, 15.58f)
                curveTo(8.98f, 15.58f, 8.79f, 15.51f, 8.64f, 15.36f)
                curveTo(8.35f, 15.07f, 8.35f, 14.59f, 8.64f, 14.3f)
                lineTo(10.94f, 12.0f)
                lineTo(8.64f, 9.7f)
                curveTo(8.35f, 9.41f, 8.35f, 8.93f, 8.64f, 8.64f)
                curveTo(8.93f, 8.35f, 9.41f, 8.35f, 9.7f, 8.64f)
                lineTo(12.0f, 10.94f)
                lineTo(14.3f, 8.64f)
                curveTo(14.59f, 8.35f, 15.07f, 8.35f, 15.36f, 8.64f)
                curveTo(15.65f, 8.93f, 15.65f, 9.41f, 15.36f, 9.7f)
                lineTo(13.06f, 12.0f)
                lineTo(15.36f, 14.3f)
                close()
            }
        }
        .build()
        return `_close-square`!!
    }

private var `_close-square`: ImageVector? = null

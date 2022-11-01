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

public val BoldGroup.`Eraser-1`: ImageVector
    get() {
        if (`_eraser-1` != null) {
            return `_eraser-1`!!
        }
        `_eraser-1` = Builder(name = "Eraser-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.52f, 15.75f)
                lineTo(11.26f, 17.01f)
                curveTo(10.62f, 17.66f, 9.57f, 17.66f, 8.92f, 17.01f)
                lineTo(6.99f, 15.08f)
                curveTo(6.34f, 14.43f, 6.35f, 13.39f, 6.99f, 12.74f)
                lineTo(8.26f, 11.48f)
                curveTo(8.46f, 11.29f, 8.77f, 11.29f, 8.97f, 11.48f)
                lineTo(12.53f, 15.04f)
                curveTo(12.72f, 15.24f, 12.72f, 15.56f, 12.52f, 15.75f)
                close()
                moveTo(17.01f, 11.26f)
                lineTo(13.93f, 14.34f)
                curveTo(13.73f, 14.54f, 13.42f, 14.54f, 13.22f, 14.34f)
                lineTo(9.66f, 10.78f)
                curveTo(9.46f, 10.58f, 9.46f, 10.27f, 9.66f, 10.07f)
                lineTo(12.74f, 6.99f)
                curveTo(13.38f, 6.34f, 14.43f, 6.34f, 15.08f, 6.99f)
                lineTo(17.01f, 8.92f)
                curveTo(17.66f, 9.57f, 17.66f, 10.62f, 17.01f, 11.26f)
                close()
            }
        }
        .build()
        return `_eraser-1`!!
    }

private var `_eraser-1`: ImageVector? = null

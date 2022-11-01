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

public val BoldGroup.`Text-block-1`: ImageVector
    get() {
        if (`_text-block-1` != null) {
            return `_text-block-1`!!
        }
        `_text-block-1` = Builder(name = "Text-block-1", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(17.67f, 9.22f)
                curveTo(17.48f, 9.59f, 17.04f, 9.74f, 16.66f, 9.56f)
                curveTo(15.43f, 8.94f, 14.1f, 8.6f, 12.75f, 8.5f)
                verticalLineTo(16.29f)
                curveTo(12.75f, 16.7f, 12.41f, 17.04f, 12.0f, 17.04f)
                curveTo(11.59f, 17.04f, 11.25f, 16.7f, 11.25f, 16.29f)
                verticalLineTo(8.5f)
                curveTo(9.9f, 8.6f, 8.57f, 8.94f, 7.34f, 9.56f)
                curveTo(7.23f, 9.61f, 7.11f, 9.63f, 7.0f, 9.63f)
                curveTo(6.73f, 9.63f, 6.46f, 9.48f, 6.33f, 9.22f)
                curveTo(6.14f, 8.85f, 6.29f, 8.4f, 6.66f, 8.21f)
                curveTo(10.0f, 6.54f, 13.99f, 6.54f, 17.33f, 8.21f)
                curveTo(17.71f, 8.4f, 17.86f, 8.85f, 17.67f, 9.22f)
                close()
            }
        }
        .build()
        return `_text-block-1`!!
    }

private var `_text-block-1`: ImageVector? = null

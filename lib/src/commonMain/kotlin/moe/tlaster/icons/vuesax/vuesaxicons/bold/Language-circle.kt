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

public val BoldGroup.`Language-circle`: ImageVector
    get() {
        if (`_language-circle` != null) {
            return `_language-circle`!!
        }
        `_language-circle` = Builder(name = "Language-circle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.0f, 17.47f)
                curveTo(15.29f, 17.47f, 13.69f, 16.73f, 12.41f, 15.36f)
                curveTo(10.96f, 16.67f, 9.07f, 17.47f, 7.0f, 17.47f)
                curveTo(6.59f, 17.47f, 6.25f, 17.13f, 6.25f, 16.72f)
                curveTo(6.25f, 16.31f, 6.59f, 15.97f, 7.0f, 15.97f)
                curveTo(10.47f, 15.97f, 13.34f, 13.22f, 13.71f, 9.7f)
                horizontalLineTo(12.0f)
                horizontalLineTo(7.01f)
                curveTo(6.6f, 9.7f, 6.26f, 9.36f, 6.26f, 8.95f)
                curveTo(6.26f, 8.54f, 6.6f, 8.21f, 7.01f, 8.21f)
                horizontalLineTo(11.25f)
                verticalLineTo(7.28f)
                curveTo(11.25f, 6.87f, 11.59f, 6.53f, 12.0f, 6.53f)
                curveTo(12.41f, 6.53f, 12.75f, 6.87f, 12.75f, 7.28f)
                verticalLineTo(8.21f)
                horizontalLineTo(14.44f)
                curveTo(14.46f, 8.21f, 14.48f, 8.2f, 14.5f, 8.2f)
                curveTo(14.52f, 8.2f, 14.54f, 8.21f, 14.56f, 8.21f)
                horizontalLineTo(16.99f)
                curveTo(17.4f, 8.21f, 17.74f, 8.55f, 17.74f, 8.96f)
                curveTo(17.74f, 9.37f, 17.4f, 9.71f, 16.99f, 9.71f)
                horizontalLineTo(15.21f)
                curveTo(15.06f, 11.42f, 14.42f, 12.99f, 13.44f, 14.27f)
                curveTo(14.44f, 15.38f, 15.69f, 15.98f, 17.0f, 15.98f)
                curveTo(17.41f, 15.98f, 17.75f, 16.32f, 17.75f, 16.73f)
                curveTo(17.75f, 17.14f, 17.41f, 17.47f, 17.0f, 17.47f)
                close()
            }
        }
        .build()
        return `_language-circle`!!
    }

private var `_language-circle`: ImageVector? = null

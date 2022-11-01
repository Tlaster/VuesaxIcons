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

public val BoldGroup.`Quote-down-circle`: ImageVector
    get() {
        if (`_quote-down-circle` != null) {
            return `_quote-down-circle`!!
        }
        `_quote-down-circle` = Builder(name = "Quote-down-circle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.61f, 14.84f)
                curveTo(11.61f, 15.93f, 10.76f, 16.78f, 9.67f, 16.78f)
                horizontalLineTo(8.19f)
                curveTo(7.12f, 16.78f, 6.25f, 15.91f, 6.25f, 14.84f)
                verticalLineTo(12.17f)
                curveTo(6.25f, 9.09f, 6.92f, 8.4f, 8.71f, 7.34f)
                curveTo(8.83f, 7.27f, 8.96f, 7.24f, 9.09f, 7.24f)
                curveTo(9.35f, 7.24f, 9.6f, 7.37f, 9.74f, 7.61f)
                curveTo(9.95f, 7.97f, 9.83f, 8.43f, 9.48f, 8.64f)
                curveTo(8.27f, 9.34f, 7.85f, 9.6f, 7.77f, 11.41f)
                horizontalLineTo(9.68f)
                curveTo(10.77f, 11.41f, 11.62f, 12.26f, 11.62f, 13.35f)
                verticalLineTo(14.84f)
                horizontalLineTo(11.61f)
                close()
                moveTo(17.75f, 14.84f)
                curveTo(17.75f, 15.93f, 16.9f, 16.78f, 15.81f, 16.78f)
                horizontalLineTo(14.32f)
                curveTo(13.25f, 16.78f, 12.38f, 15.91f, 12.38f, 14.84f)
                verticalLineTo(12.17f)
                curveTo(12.38f, 9.09f, 13.05f, 8.4f, 14.84f, 7.34f)
                curveTo(14.96f, 7.27f, 15.09f, 7.24f, 15.22f, 7.24f)
                curveTo(15.48f, 7.24f, 15.73f, 7.37f, 15.87f, 7.61f)
                curveTo(16.08f, 7.97f, 15.96f, 8.43f, 15.61f, 8.64f)
                curveTo(14.4f, 9.36f, 13.98f, 9.62f, 13.9f, 11.43f)
                horizontalLineTo(15.81f)
                curveTo(16.9f, 11.43f, 17.75f, 12.28f, 17.75f, 13.37f)
                verticalLineTo(14.84f)
                verticalLineTo(14.84f)
                close()
            }
        }
        .build()
        return `_quote-down-circle`!!
    }

private var `_quote-down-circle`: ImageVector? = null

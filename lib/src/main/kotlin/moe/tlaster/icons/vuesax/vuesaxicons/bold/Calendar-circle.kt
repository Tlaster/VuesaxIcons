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

public val BoldGroup.`Calendar-circle`: ImageVector
    get() {
        if (`_calendar-circle` != null) {
            return `_calendar-circle`!!
        }
        `_calendar-circle` = Builder(name = "Calendar-circle", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(6.85f, 9.44f)
                curveTo(7.27f, 8.47f, 8.06f, 7.72f, 9.15f, 7.38f)
                verticalLineTo(6.58f)
                curveTo(9.15f, 6.17f, 9.49f, 5.83f, 9.9f, 5.83f)
                curveTo(10.31f, 5.83f, 10.65f, 6.17f, 10.65f, 6.58f)
                verticalLineTo(7.17f)
                horizontalLineTo(13.36f)
                verticalLineTo(6.58f)
                curveTo(13.36f, 6.17f, 13.7f, 5.83f, 14.11f, 5.83f)
                curveTo(14.52f, 5.83f, 14.86f, 6.17f, 14.86f, 6.58f)
                verticalLineTo(7.37f)
                curveTo(15.95f, 7.71f, 16.74f, 8.46f, 17.16f, 9.43f)
                curveTo(17.3f, 9.76f, 17.06f, 10.14f, 16.7f, 10.14f)
                horizontalLineTo(7.31f)
                curveTo(6.95f, 10.14f, 6.71f, 9.77f, 6.85f, 9.44f)
                close()
                moveTo(17.5f, 14.17f)
                curveTo(17.5f, 16.37f, 16.0f, 18.17f, 13.5f, 18.17f)
                horizontalLineTo(10.5f)
                curveTo(8.0f, 18.17f, 6.5f, 16.37f, 6.5f, 14.17f)
                verticalLineTo(11.64f)
                curveTo(6.5f, 11.36f, 6.72f, 11.14f, 7.0f, 11.14f)
                horizontalLineTo(17.0f)
                curveTo(17.28f, 11.14f, 17.5f, 11.36f, 17.5f, 11.64f)
                verticalLineTo(14.17f)
                close()
            }
        }
        .build()
        return `_calendar-circle`!!
    }

private var `_calendar-circle`: ImageVector? = null

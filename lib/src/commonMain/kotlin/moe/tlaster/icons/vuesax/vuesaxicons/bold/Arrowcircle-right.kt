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

public val BoldGroup.`Arrowcircle-right`: ImageVector
    get() {
        if (`_arrowcircle-right` != null) {
            return `_arrowcircle-right`!!
        }
        `_arrowcircle-right` = Builder(name = "Arrowcircle-right", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f)
                curveTo(17.51f, 22.0f, 22.0f, 17.51f, 22.0f, 12.0f)
                curveTo(22.0f, 6.49f, 17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.79f, 12.53f)
                lineTo(11.26f, 16.06f)
                curveTo(11.11f, 16.21f, 10.92f, 16.28f, 10.73f, 16.28f)
                curveTo(10.54f, 16.28f, 10.35f, 16.21f, 10.2f, 16.06f)
                curveTo(9.91f, 15.77f, 9.91f, 15.29f, 10.2f, 15.0f)
                lineTo(13.2f, 12.0f)
                lineTo(10.2f, 9.0f)
                curveTo(9.91f, 8.71f, 9.91f, 8.23f, 10.2f, 7.94f)
                curveTo(10.49f, 7.65f, 10.97f, 7.65f, 11.26f, 7.94f)
                lineTo(14.79f, 11.47f)
                curveTo(15.09f, 11.76f, 15.09f, 12.24f, 14.79f, 12.53f)
                close()
            }
        }
        .build()
        return `_arrowcircle-right`!!
    }

private var `_arrowcircle-right`: ImageVector? = null

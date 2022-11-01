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

public val BoldGroup.`Arrowcircle-down`: ImageVector
    get() {
        if (`_arrowcircle-down` != null) {
            return `_arrowcircle-down`!!
        }
        `_arrowcircle-down` = Builder(name = "Arrowcircle-down", defaultWidth = 24.0.dp,
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
                moveTo(16.06f, 11.27f)
                lineTo(12.53f, 14.8f)
                curveTo(12.38f, 14.95f, 12.19f, 15.02f, 12.0f, 15.02f)
                curveTo(11.81f, 15.02f, 11.62f, 14.95f, 11.47f, 14.8f)
                lineTo(7.94f, 11.27f)
                curveTo(7.65f, 10.98f, 7.65f, 10.5f, 7.94f, 10.21f)
                curveTo(8.23f, 9.92f, 8.71f, 9.92f, 9.0f, 10.21f)
                lineTo(12.0f, 13.21f)
                lineTo(15.0f, 10.21f)
                curveTo(15.29f, 9.92f, 15.77f, 9.92f, 16.06f, 10.21f)
                curveTo(16.35f, 10.5f, 16.35f, 10.97f, 16.06f, 11.27f)
                close()
            }
        }
        .build()
        return `_arrowcircle-down`!!
    }

private var `_arrowcircle-down`: ImageVector? = null

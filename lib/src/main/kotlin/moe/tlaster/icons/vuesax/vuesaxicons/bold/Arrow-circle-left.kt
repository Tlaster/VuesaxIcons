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

public val BoldGroup.`Arrow-circle-left`: ImageVector
    get() {
        if (`_arrow-circle-left` != null) {
            return `_arrow-circle-left`!!
        }
        `_arrow-circle-left` = Builder(name = "Arrow-circle-left", defaultWidth = 24.0.dp,
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
                moveTo(13.79f, 15.0f)
                curveTo(14.08f, 15.29f, 14.08f, 15.77f, 13.79f, 16.06f)
                curveTo(13.64f, 16.21f, 13.45f, 16.28f, 13.26f, 16.28f)
                curveTo(13.07f, 16.28f, 12.88f, 16.21f, 12.73f, 16.06f)
                lineTo(9.2f, 12.53f)
                curveTo(8.91f, 12.24f, 8.91f, 11.76f, 9.2f, 11.47f)
                lineTo(12.73f, 7.94f)
                curveTo(13.02f, 7.65f, 13.5f, 7.65f, 13.79f, 7.94f)
                curveTo(14.08f, 8.23f, 14.08f, 8.71f, 13.79f, 9.0f)
                lineTo(10.79f, 12.0f)
                lineTo(13.79f, 15.0f)
                close()
            }
        }
        .build()
        return `_arrow-circle-left`!!
    }

private var `_arrow-circle-left`: ImageVector? = null

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

public val BoldGroup.`Arrow-circle-up`: ImageVector
    get() {
        if (`_arrow-circle-up` != null) {
            return `_arrow-circle-up`!!
        }
        `_arrow-circle-up` = Builder(name = "Arrow-circle-up", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f)
                curveTo(17.51f, 22.0f, 22.0f, 17.51f, 22.0f, 12.0f)
                curveTo(22.0f, 6.49f, 17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.06f, 13.79f)
                curveTo(15.91f, 13.94f, 15.72f, 14.01f, 15.53f, 14.01f)
                curveTo(15.34f, 14.01f, 15.15f, 13.94f, 15.0f, 13.79f)
                lineTo(12.0f, 10.79f)
                lineTo(9.0f, 13.79f)
                curveTo(8.71f, 14.08f, 8.23f, 14.08f, 7.94f, 13.79f)
                curveTo(7.65f, 13.5f, 7.65f, 13.02f, 7.94f, 12.73f)
                lineTo(11.47f, 9.2f)
                curveTo(11.76f, 8.91f, 12.24f, 8.91f, 12.53f, 9.2f)
                lineTo(16.06f, 12.73f)
                curveTo(16.35f, 13.03f, 16.35f, 13.5f, 16.06f, 13.79f)
                close()
            }
        }
        .build()
        return `_arrow-circle-up`!!
    }

private var `_arrow-circle-up`: ImageVector? = null

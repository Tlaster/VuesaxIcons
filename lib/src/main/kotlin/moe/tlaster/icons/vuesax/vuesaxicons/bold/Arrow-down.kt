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

public val BoldGroup.`Arrow-down`: ImageVector
    get() {
        if (`_arrow-down` != null) {
            return `_arrow-down`!!
        }
        `_arrow-down` = Builder(name = "Arrow-down", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.53f, 13.03f)
                lineTo(12.53f, 16.03f)
                curveTo(12.38f, 16.18f, 12.19f, 16.25f, 12.0f, 16.25f)
                curveTo(11.81f, 16.25f, 11.62f, 16.18f, 11.47f, 16.03f)
                lineTo(8.47f, 13.03f)
                curveTo(8.18f, 12.74f, 8.18f, 12.26f, 8.47f, 11.97f)
                curveTo(8.76f, 11.68f, 9.24f, 11.68f, 9.53f, 11.97f)
                lineTo(11.25f, 13.69f)
                verticalLineTo(8.5f)
                curveTo(11.25f, 8.09f, 11.59f, 7.75f, 12.0f, 7.75f)
                curveTo(12.41f, 7.75f, 12.75f, 8.09f, 12.75f, 8.5f)
                verticalLineTo(13.69f)
                lineTo(14.47f, 11.97f)
                curveTo(14.76f, 11.68f, 15.24f, 11.68f, 15.53f, 11.97f)
                curveTo(15.82f, 12.26f, 15.82f, 12.74f, 15.53f, 13.03f)
                close()
            }
        }
        .build()
        return `_arrow-down`!!
    }

private var `_arrow-down`: ImageVector? = null

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

public val BoldGroup.`Arrow-right-3`: ImageVector
    get() {
        if (`_arrow-right-3` != null) {
            return `_arrow-right-3`!!
        }
        `_arrow-right-3` = Builder(name = "Arrow-right-3", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(16.03f, 12.53f)
                lineTo(13.03f, 15.53f)
                curveTo(12.88f, 15.68f, 12.69f, 15.75f, 12.5f, 15.75f)
                curveTo(12.31f, 15.75f, 12.12f, 15.68f, 11.97f, 15.53f)
                curveTo(11.68f, 15.24f, 11.68f, 14.76f, 11.97f, 14.47f)
                lineTo(13.69f, 12.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 12.75f, 7.75f, 12.41f, 7.75f, 12.0f)
                curveTo(7.75f, 11.59f, 8.09f, 11.25f, 8.5f, 11.25f)
                horizontalLineTo(13.69f)
                lineTo(11.97f, 9.53f)
                curveTo(11.68f, 9.24f, 11.68f, 8.76f, 11.97f, 8.47f)
                curveTo(12.26f, 8.18f, 12.74f, 8.18f, 13.03f, 8.47f)
                lineTo(16.03f, 11.47f)
                curveTo(16.32f, 11.76f, 16.32f, 12.24f, 16.03f, 12.53f)
                close()
            }
        }
        .build()
        return `_arrow-right-3`!!
    }

private var `_arrow-right-3`: ImageVector? = null

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

public val BoldGroup.`Flash-circle-1`: ImageVector
    get() {
        if (`_flash-circle-1` != null) {
            return `_flash-circle-1`!!
        }
        `_flash-circle-1` = Builder(name = "Flash-circle-1", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(15.53f, 13.23f)
                lineTo(10.35f, 16.82f)
                curveTo(9.59f, 17.35f, 9.15f, 17.04f, 9.37f, 16.15f)
                lineTo(10.32f, 12.31f)
                lineTo(8.67f, 11.9f)
                curveTo(7.92f, 11.72f, 7.83f, 11.2f, 8.46f, 10.76f)
                lineTo(13.64f, 7.17f)
                curveTo(14.4f, 6.64f, 14.84f, 6.95f, 14.62f, 7.84f)
                lineTo(13.67f, 11.68f)
                lineTo(15.32f, 12.09f)
                curveTo(16.07f, 12.28f, 16.16f, 12.79f, 15.53f, 13.23f)
                close()
            }
        }
        .build()
        return `_flash-circle-1`!!
    }

private var `_flash-circle-1`: ImageVector? = null

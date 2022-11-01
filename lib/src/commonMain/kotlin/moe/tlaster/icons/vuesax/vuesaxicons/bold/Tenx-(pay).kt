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

public val BoldGroup.`Tenx-(pay)`: ImageVector
    get() {
        if (`_tenx-(pay)` != null) {
            return `_tenx-(pay)`!!
        }
        `_tenx-(pay)` = Builder(name = "Tenx-(pay)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.79f, 12.71f)
                lineTo(15.95f, 14.55f)
                curveTo(15.56f, 14.94f, 14.93f, 14.94f, 14.54f, 14.55f)
                lineTo(12.0f, 12.0f)
                lineTo(9.46f, 14.54f)
                curveTo(9.07f, 14.93f, 8.44f, 14.93f, 8.05f, 14.54f)
                lineTo(6.21f, 12.7f)
                curveTo(5.82f, 12.31f, 5.82f, 11.68f, 6.21f, 11.29f)
                lineTo(8.05f, 9.45f)
                curveTo(8.44f, 9.06f, 9.07f, 9.06f, 9.46f, 9.45f)
                lineTo(12.0f, 12.0f)
                lineTo(14.54f, 9.46f)
                curveTo(14.93f, 9.07f, 15.56f, 9.07f, 15.95f, 9.46f)
                lineTo(17.79f, 11.3f)
                curveTo(18.18f, 11.68f, 18.18f, 12.32f, 17.79f, 12.71f)
                close()
            }
        }
        .build()
        return `_tenx-(pay)`!!
    }

private var `_tenx-(pay)`: ImageVector? = null

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

public val BoldGroup.`Heart-circle`: ImageVector
    get() {
        if (`_heart-circle` != null) {
            return `_heart-circle`!!
        }
        `_heart-circle` = Builder(name = "Heart-circle", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.33f, 17.0f)
                curveTo(12.15f, 17.06f, 11.84f, 17.06f, 11.66f, 17.0f)
                curveTo(10.1f, 16.47f, 6.6f, 14.24f, 6.6f, 10.46f)
                curveTo(6.6f, 8.79f, 7.94f, 7.44f, 9.6f, 7.44f)
                curveTo(10.58f, 7.44f, 11.45f, 7.91f, 12.0f, 8.65f)
                curveTo(12.54f, 7.92f, 13.42f, 7.44f, 14.4f, 7.44f)
                curveTo(16.06f, 7.44f, 17.4f, 8.79f, 17.4f, 10.46f)
                curveTo(17.4f, 14.24f, 13.9f, 16.47f, 12.33f, 17.0f)
                close()
            }
        }
        .build()
        return `_heart-circle`!!
    }

private var `_heart-circle`: ImageVector? = null

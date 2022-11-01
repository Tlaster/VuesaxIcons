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

public val BoldGroup.`Heart-edit`: ImageVector
    get() {
        if (`_heart-edit` != null) {
            return `_heart-edit`!!
        }
        `_heart-edit` = Builder(name = "Heart-edit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.44f, 3.1016f)
                curveTo(14.63f, 3.1016f, 13.01f, 3.9816f, 12.0f, 5.3316f)
                curveTo(10.99f, 3.9816f, 9.37f, 3.1016f, 7.56f, 3.1016f)
                curveTo(4.49f, 3.1016f, 2.0f, 5.6016f, 2.0f, 8.6916f)
                curveTo(2.0f, 9.8816f, 2.19f, 10.9816f, 2.52f, 12.0016f)
                curveTo(4.1f, 17.0016f, 8.97f, 19.9916f, 11.38f, 20.8116f)
                curveTo(11.72f, 20.9316f, 12.28f, 20.9316f, 12.62f, 20.8116f)
                curveTo(15.03f, 19.9916f, 19.9f, 17.0016f, 21.48f, 12.0016f)
                curveTo(21.81f, 10.9816f, 22.0f, 9.8816f, 22.0f, 8.6916f)
                curveTo(22.0f, 5.6016f, 19.51f, 3.1016f, 16.44f, 3.1016f)
                close()
                moveTo(14.84f, 11.3816f)
                lineTo(11.3f, 14.9216f)
                curveTo(11.16f, 15.0616f, 10.9f, 15.1916f, 10.71f, 15.2216f)
                lineTo(9.36f, 15.4016f)
                curveTo(8.87f, 15.4716f, 8.53f, 15.1316f, 8.6f, 14.6416f)
                lineTo(8.79f, 13.2916f)
                curveTo(8.82f, 13.1016f, 8.95f, 12.8316f, 9.09f, 12.7016f)
                lineTo(12.63f, 9.1616f)
                curveTo(13.24f, 8.5516f, 13.95f, 8.2616f, 14.85f, 9.1616f)
                curveTo(15.74f, 10.0616f, 15.45f, 10.7716f, 14.84f, 11.3816f)
                close()
            }
        }
        .build()
        return `_heart-edit`!!
    }

private var `_heart-edit`: ImageVector? = null

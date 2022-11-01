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

public val BoldGroup.`Discount-circle`: ImageVector
    get() {
        if (`_discount-circle` != null) {
            return `_discount-circle`!!
        }
        `_discount-circle` = Builder(name = "Discount-circle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveTo(9.55f, 8.0f, 10.0f, 8.45f, 10.0f, 9.0f)
                curveTo(10.0f, 9.55f, 9.56f, 10.0f, 9.0f, 10.0f)
                curveTo(8.45f, 10.0f, 8.0f, 9.55f, 8.0f, 9.0f)
                curveTo(8.0f, 8.45f, 8.45f, 8.0f, 9.0f, 8.0f)
                close()
                moveTo(9.53f, 15.53f)
                curveTo(9.38f, 15.68f, 9.19f, 15.75f, 9.0f, 15.75f)
                curveTo(8.81f, 15.75f, 8.62f, 15.68f, 8.47f, 15.53f)
                curveTo(8.18f, 15.24f, 8.18f, 14.76f, 8.47f, 14.47f)
                lineTo(14.47f, 8.47f)
                curveTo(14.76f, 8.18f, 15.24f, 8.18f, 15.53f, 8.47f)
                curveTo(15.82f, 8.76f, 15.82f, 9.24f, 15.53f, 9.53f)
                lineTo(9.53f, 15.53f)
                close()
                moveTo(15.0f, 16.0f)
                curveTo(14.44f, 16.0f, 13.99f, 15.55f, 13.99f, 15.0f)
                curveTo(13.99f, 14.45f, 14.44f, 14.0f, 14.99f, 14.0f)
                curveTo(15.54f, 14.0f, 15.99f, 14.45f, 15.99f, 15.0f)
                curveTo(15.99f, 15.55f, 15.55f, 16.0f, 15.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_discount-circle`!!
    }

private var `_discount-circle`: ImageVector? = null

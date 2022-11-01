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

public val BoldGroup.`Minus-cirlce`: ImageVector
    get() {
        if (`_minus-cirlce` != null) {
            return `_minus-cirlce`!!
        }
        `_minus-cirlce` = Builder(name = "Minus-cirlce", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.49f, 2.0f, 2.0f, 6.49f, 2.0f, 12.0f)
                curveTo(2.0f, 17.51f, 6.49f, 22.0f, 12.0f, 22.0f)
                curveTo(17.51f, 22.0f, 22.0f, 17.51f, 22.0f, 12.0f)
                curveTo(22.0f, 6.49f, 17.51f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.92f, 12.75f)
                horizontalLineTo(7.92f)
                curveTo(7.51f, 12.75f, 7.17f, 12.41f, 7.17f, 12.0f)
                curveTo(7.17f, 11.59f, 7.51f, 11.25f, 7.92f, 11.25f)
                horizontalLineTo(15.92f)
                curveTo(16.33f, 11.25f, 16.67f, 11.59f, 16.67f, 12.0f)
                curveTo(16.67f, 12.41f, 16.34f, 12.75f, 15.92f, 12.75f)
                close()
            }
        }
        .build()
        return `_minus-cirlce`!!
    }

private var `_minus-cirlce`: ImageVector? = null

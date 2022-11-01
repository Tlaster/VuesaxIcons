package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Thorchain-(rune)`: ImageVector
    get() {
        if (`_thorchain-(rune)` != null) {
            return `_thorchain-(rune)`!!
        }
        `_thorchain-(rune)` = Builder(name = "Thorchain-(rune)", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.7f, 11.7f)
                lineTo(16.8f, 15.8f)
                curveTo(17.3f, 16.4f, 17.1f, 17.3f, 16.4f, 17.6f)
                lineTo(6.1f, 21.9f)
                curveTo(5.0f, 22.4f, 4.1f, 21.0f, 4.9f, 20.2f)
                lineTo(12.7f, 11.7f)
                close()
                moveTo(12.7f, 11.7f)
                lineTo(8.6f, 7.5999f)
                curveTo(8.1f, 7.0999f, 8.3f, 6.0999f, 9.0f, 5.8f)
                lineTo(17.9f, 2.1f)
                curveTo(19.0f, 1.6999f, 19.9f, 2.9f, 19.2f, 3.7999f)
                lineTo(12.7f, 11.7f)
                close()
            }
        }
        .build()
        return `_thorchain-(rune)`!!
    }

private var `_thorchain-(rune)`: ImageVector? = null

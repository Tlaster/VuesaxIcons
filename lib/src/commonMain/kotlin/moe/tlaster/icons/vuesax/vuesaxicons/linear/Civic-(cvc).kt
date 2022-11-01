package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Civic-(cvc)`: ImageVector
    get() {
        if (`_civic-(cvc)` != null) {
            return `_civic-(cvc)`!!
        }
        `_civic-(cvc)` = Builder(name = "Civic-(cvc)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3f, 10.1f)
                curveTo(14.6f, 11.2f, 14.1f, 12.2f, 13.3f, 12.7f)
                verticalLineTo(14.7f)
                curveTo(13.3f, 15.4f, 12.7f, 15.9f, 12.1f, 15.9f)
                curveTo(11.4f, 15.9f, 10.9f, 15.3f, 10.9f, 14.7f)
                verticalLineTo(12.7f)
                curveTo(10.2f, 12.3f, 9.8f, 11.5f, 9.8f, 10.7f)
                curveTo(9.8f, 9.2f, 11.2f, 8.0f, 12.8f, 8.4f)
                curveTo(13.4f, 8.7f, 14.1f, 9.3f, 14.3f, 10.1f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6f, 9.0f)
                curveTo(20.3f, 5.0f, 16.5f, 2.0f, 12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(16.5f, 22.0f, 20.3f, 19.1f, 21.5f, 15.0f)
            }
        }
        .build()
        return `_civic-(cvc)`!!
    }

private var `_civic-(cvc)`: ImageVector? = null

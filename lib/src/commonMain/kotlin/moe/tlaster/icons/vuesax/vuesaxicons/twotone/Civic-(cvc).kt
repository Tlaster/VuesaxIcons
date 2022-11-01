package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.`Civic-(cvc)`: ImageVector
    get() {
        if (`_civic-(cvc)` != null) {
            return `_civic-(cvc)`!!
        }
        `_civic-(cvc)` = Builder(name = "Civic-(cvc)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3001f, 10.1301f)
                curveTo(14.5801f, 11.2301f, 14.0901f, 12.2501f, 13.2501f, 12.7701f)
                verticalLineTo(14.7501f)
                curveTo(13.2501f, 15.4401f, 12.6901f, 16.0001f, 12.0001f, 16.0001f)
                curveTo(11.3101f, 16.0001f, 10.7501f, 15.4401f, 10.7501f, 14.7501f)
                verticalLineTo(12.7701f)
                curveTo(10.0701f, 12.3501f, 9.6201f, 11.6001f, 9.6201f, 10.7501f)
                curveTo(9.6201f, 9.2301f, 11.0601f, 8.0501f, 12.6401f, 8.4701f)
                curveTo(13.4401f, 8.6801f, 14.0901f, 9.3301f, 14.3001f, 10.1301f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.55f, 9.03f)
                curveTo(20.28f, 4.96f, 16.49f, 2.0f, 12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(16.47f, 22.0f, 20.26f, 19.06f, 21.54f, 15.01f)
            }
        }
        .build()
        return `_civic-(cvc)`!!
    }

private var `_civic-(cvc)`: ImageVector? = null

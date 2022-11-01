package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.`Stellar-(xlm)`: ImageVector
    get() {
        if (`_stellar-(xlm)` != null) {
            return `_stellar-(xlm)`!!
        }
        `_stellar-(xlm)` = Builder(name = "Stellar-(xlm)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.36f, 4.99f)
                curveTo(15.1f, 4.2f, 13.6f, 3.75f, 12.0f, 3.75f)
                curveTo(7.44f, 3.75f, 3.75f, 7.44f, 3.75f, 12.0f)
                curveTo(3.75f, 12.76f, 3.85f, 13.49f, 4.04f, 14.19f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                lineTo(22.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6201f, 18.9901f)
                curveTo(8.8901f, 19.7901f, 10.3901f, 20.2501f, 12.0001f, 20.2501f)
                curveTo(16.5601f, 20.2501f, 20.2501f, 16.5601f, 20.2501f, 12.0001f)
                curveTo(20.2501f, 11.1801f, 20.1301f, 10.3801f, 19.9101f, 9.6401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.5f)
                lineTo(2.0f, 19.5f)
            }
        }
        .build()
        return `_stellar-(xlm)`!!
    }

private var `_stellar-(xlm)`: ImageVector? = null

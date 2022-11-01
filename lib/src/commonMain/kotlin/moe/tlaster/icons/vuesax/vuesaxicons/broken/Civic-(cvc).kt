package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.`Civic-(cvc)`: ImageVector
    get() {
        if (`_civic-(cvc)` != null) {
            return `_civic-(cvc)`!!
        }
        `_civic-(cvc)` = Builder(name = "Civic-(cvc)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.6394f, 8.47f)
                curveTo(13.4394f, 8.68f, 14.0894f, 9.33f, 14.2894f, 10.13f)
                curveTo(14.5694f, 11.23f, 14.0794f, 12.25f, 13.2394f, 12.77f)
                verticalLineTo(14.75f)
                curveTo(13.2394f, 15.44f, 12.6794f, 16.0f, 11.9894f, 16.0f)
                curveTo(11.2994f, 16.0f, 10.7394f, 15.44f, 10.7394f, 14.75f)
                verticalLineTo(12.77f)
                curveTo(10.0594f, 12.35f, 9.6094f, 11.6f, 9.6094f, 10.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.55f, 9.03f)
                curveTo(20.28f, 4.96f, 16.49f, 2.0f, 12.0f, 2.0f)
                curveTo(7.89f, 2.0f, 4.36f, 4.48f, 2.82f, 8.02f)
                curveTo(2.29f, 9.24f, 2.0f, 10.58f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(16.47f, 22.0f, 20.26f, 19.06f, 21.54f, 15.01f)
            }
        }
        .build()
        return `_civic-(cvc)`!!
    }

private var `_civic-(cvc)`: ImageVector? = null

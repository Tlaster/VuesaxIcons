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

public val BrokenGroup.`Polygon-(matic)`: ImageVector
    get() {
        if (`_polygon-(matic)` != null) {
            return `_polygon-(matic)`!!
        }
        `_polygon-(matic)` = Builder(name = "Polygon-(matic)", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.1f)
                lineTo(7.5f, 14.7f)
                lineTo(3.0f, 12.1f)
                verticalLineTo(6.9001f)
                lineTo(7.5f, 4.3f)
                lineTo(12.0f, 6.9001f)
                verticalLineTo(8.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 15.9799f)
                verticalLineTo(17.2899f)
                lineTo(16.5f, 19.8899f)
                lineTo(12.0f, 17.2899f)
                verticalLineTo(15.6399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.1f)
                lineTo(16.5f, 9.5f)
                lineTo(21.0f, 12.1f)
            }
        }
        .build()
        return `_polygon-(matic)`!!
    }

private var `_polygon-(matic)`: ImageVector? = null

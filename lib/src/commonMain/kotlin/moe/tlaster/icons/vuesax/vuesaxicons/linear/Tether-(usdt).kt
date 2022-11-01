package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Tether-(usdt)`: ImageVector
    get() {
        if (`_tether-(usdt)` != null) {
            return `_tether-(usdt)`!!
        }
        `_tether-(usdt)` = Builder(name = "Tether-(usdt)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.47f, 3.3501f)
                horizontalLineTo(16.53f)
                curveTo(17.59f, 3.3501f, 18.84f, 4.1201f, 19.31f, 5.0701f)
                lineTo(21.71f, 9.8901f)
                curveTo(22.29f, 11.0501f, 21.97f, 12.7001f, 21.02f, 13.5701f)
                lineTo(14.09f, 19.8601f)
                curveTo(12.94f, 20.9001f, 11.07f, 20.9001f, 9.92f, 19.8601f)
                lineTo(2.99f, 13.5701f)
                curveTo(2.03f, 12.7001f, 1.72f, 11.0501f, 2.3f, 9.8901f)
                lineTo(4.7f, 5.0701f)
                curveTo(5.16f, 4.1201f, 6.41f, 3.3501f, 7.47f, 3.3501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                verticalLineTo(8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 8.5f)
                horizontalLineTo(16.0f)
            }
        }
        .build()
        return `_tether-(usdt)`!!
    }

private var `_tether-(usdt)`: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.`Hex-(hex)`: ImageVector
    get() {
        if (`_hex-(hex)` != null) {
            return `_hex-(hex)`!!
        }
        `_hex-(hex)` = Builder(name = "Hex-(hex)", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.51f, 7.6501f)
                lineTo(2.0f, 12.0001f)
                lineTo(7.0f, 20.6601f)
                horizontalLineTo(17.0f)
                lineTo(22.0f, 12.0001f)
                lineTo(17.0f, 3.3401f)
                horizontalLineTo(7.0f)
                lineTo(6.63f, 3.9801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.8696f, 14.0f)
                horizontalLineTo(7.0296f)
                lineTo(5.0996f, 17.33f)
                lineTo(7.0296f, 20.66f)
                horizontalLineTo(10.8696f)
                lineTo(12.7996f, 17.33f)
                lineTo(10.8696f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3409f, 8.0f)
                horizontalLineTo(7.0308f)
                lineTo(3.3809f, 14.33f)
                lineTo(7.0308f, 20.66f)
                horizontalLineTo(14.3409f)
                lineTo(18.0009f, 14.33f)
                lineTo(14.3409f, 8.0f)
                close()
            }
        }
        .build()
        return `_hex-(hex)`!!
    }

private var `_hex-(hex)`: ImageVector? = null

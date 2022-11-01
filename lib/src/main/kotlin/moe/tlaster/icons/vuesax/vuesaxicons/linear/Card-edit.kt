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

public val LinearGroup.`Card-edit`: ImageVector
    get() {
        if (`_card-edit` != null) {
            return `_card-edit`!!
        }
        `_card-edit` = Builder(name = "Card-edit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9961f, 8.5f)
                horizontalLineTo(11.4961f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.9961f, 16.5f)
                horizontalLineTo(7.9961f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4961f, 16.5f)
                horizontalLineTo(14.4961f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9961f, 12.03f)
                verticalLineTo(16.11f)
                curveTo(21.9961f, 19.62f, 21.1061f, 20.5f, 17.5561f, 20.5f)
                horizontalLineTo(6.4361f)
                curveTo(2.8861f, 20.5f, 1.9961f, 19.62f, 1.9961f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.9961f, 4.38f, 2.8861f, 3.5f, 6.4361f, 3.5f)
                horizontalLineTo(14.4961f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0761f, 4.1301f)
                lineTo(15.3661f, 7.8401f)
                curveTo(15.2261f, 7.9801f, 15.0861f, 8.2601f, 15.0561f, 8.4601f)
                lineTo(14.8561f, 9.8801f)
                curveTo(14.7861f, 10.3901f, 15.1461f, 10.7501f, 15.6561f, 10.6801f)
                lineTo(17.0761f, 10.4801f)
                curveTo(17.2761f, 10.4501f, 17.5561f, 10.3101f, 17.6961f, 10.1701f)
                lineTo(21.4061f, 6.4601f)
                curveTo(22.0461f, 5.8201f, 22.3461f, 5.0801f, 21.4061f, 4.1401f)
                curveTo(20.4561f, 3.1901f, 19.7161f, 3.4901f, 19.0761f, 4.1301f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5461f, 4.6599f)
                curveTo(18.8661f, 5.7899f, 19.7461f, 6.6699f, 20.8661f, 6.9799f)
            }
        }
        .build()
        return `_card-edit`!!
    }

private var `_card-edit`: ImageVector? = null

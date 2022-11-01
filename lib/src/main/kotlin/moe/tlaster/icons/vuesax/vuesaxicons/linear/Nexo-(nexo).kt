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

public val LinearGroup.`Nexo-(nexo)`: ImageVector
    get() {
        if (`_nexo-(nexo)` != null) {
            return `_nexo-(nexo)`!!
        }
        `_nexo-(nexo)` = Builder(name = "Nexo-(nexo)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineTo(17.0f, 3.0f)
                lineTo(22.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(17.0f, 21.0f)
                lineTo(7.0f, 15.0f)
                verticalLineTo(9.0f)
                lineTo(17.0f, 15.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                lineTo(7.0f, 3.0f)
                lineTo(2.0f, 6.0f)
                verticalLineTo(18.0f)
                lineTo(7.0f, 21.0f)
                lineTo(11.7f, 17.87f)
            }
        }
        .build()
        return `_nexo-(nexo)`!!
    }

private var `_nexo-(nexo)`: ImageVector? = null

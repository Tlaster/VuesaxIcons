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

public val LinearGroup.`Wanchain-(wan)-1`: ImageVector
    get() {
        if (`_wanchain-(wan)-1` != null) {
            return `_wanchain-(wan)-1`!!
        }
        `_wanchain-(wan)-1` = Builder(name = "Wanchain-(wan)-1", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.5f, 8.9f)
                lineTo(12.0f, 6.2f)
                lineTo(7.5f, 8.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 9.0f)
                verticalLineTo(15.1f)
                lineTo(12.0f, 12.4f)
                lineTo(16.5f, 15.1f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.2f, 16.2f)
                lineTo(12.0f, 17.7f)
                lineTo(9.8f, 16.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_wanchain-(wan)-1`!!
    }

private var `_wanchain-(wan)-1`: ImageVector? = null

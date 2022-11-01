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

public val LinearGroup.`Wing-(wing)`: ImageVector
    get() {
        if (`_wing-(wing)` != null) {
            return `_wing-(wing)`!!
        }
        `_wing-(wing)` = Builder(name = "Wing-(wing)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0001f, 5.0f)
                horizontalLineTo(19.5001f)
                lineTo(22.2001f, 9.7f)
                lineTo(17.0001f, 19.0f)
                lineTo(15.1001f, 15.9f)
                lineTo(18.7001f, 9.7f)
                lineTo(16.0001f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0001f, 5.0f)
                horizontalLineTo(12.5001f)
                lineTo(15.2001f, 9.7f)
                lineTo(10.0001f, 19.0f)
                lineTo(8.1001f, 15.9f)
                lineTo(11.7001f, 9.7f)
                lineTo(9.0001f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.8001f, 5.0f)
                horizontalLineTo(5.3f)
                lineTo(8.0f, 9.8f)
                lineTo(6.3f, 12.7f)
                lineTo(1.8001f, 5.0f)
                close()
            }
        }
        .build()
        return `_wing-(wing)`!!
    }

private var `_wing-(wing)`: ImageVector? = null

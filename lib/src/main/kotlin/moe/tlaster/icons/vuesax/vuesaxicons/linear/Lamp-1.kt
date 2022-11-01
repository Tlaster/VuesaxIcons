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

public val LinearGroup.`Lamp-1`: ImageVector
    get() {
        if (`_lamp-1` != null) {
            return `_lamp-1`!!
        }
        `_lamp-1` = Builder(name = "Lamp-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.7901f, 14.69f)
                horizontalLineTo(18.2101f)
                curveTo(19.8701f, 14.69f, 20.8701f, 13.38f, 20.4401f, 11.78f)
                lineTo(18.2401f, 3.71f)
                curveTo(17.9801f, 2.77f, 16.9701f, 2.0f, 16.0101f, 2.0f)
                horizontalLineTo(7.9901f)
                curveTo(7.0301f, 2.0f, 6.0201f, 2.77f, 5.7701f, 3.7f)
                lineTo(3.5701f, 11.77f)
                curveTo(3.1301f, 13.38f, 4.1301f, 14.69f, 5.7901f, 14.69f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                horizontalLineTo(16.0f)
            }
        }
        .build()
        return `_lamp-1`!!
    }

private var `_lamp-1`: ImageVector? = null

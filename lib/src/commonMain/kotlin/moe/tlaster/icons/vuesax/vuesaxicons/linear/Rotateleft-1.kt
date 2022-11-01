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

public val LinearGroup.`Rotateleft-1`: ImageVector
    get() {
        if (`_rotateleft-1` != null) {
            return `_rotateleft-1`!!
        }
        `_rotateleft-1` = Builder(name = "Rotateleft-1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1101f, 5.0799f)
                curveTo(9.9801f, 4.8199f, 10.9401f, 4.6499f, 12.0001f, 4.6499f)
                curveTo(16.7901f, 4.6499f, 20.6701f, 8.5299f, 20.6701f, 13.3199f)
                curveTo(20.6701f, 18.1099f, 16.7901f, 21.9899f, 12.0001f, 21.9899f)
                curveTo(7.2101f, 21.9899f, 3.3301f, 18.1099f, 3.3301f, 13.3199f)
                curveTo(3.3301f, 11.5399f, 3.8701f, 9.8799f, 4.7901f, 8.4999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8701f, 5.32f)
                lineTo(10.7601f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8701f, 5.3201f)
                lineTo(11.2401f, 7.7801f)
            }
        }
        .build()
        return `_rotateleft-1`!!
    }

private var `_rotateleft-1`: ImageVector? = null

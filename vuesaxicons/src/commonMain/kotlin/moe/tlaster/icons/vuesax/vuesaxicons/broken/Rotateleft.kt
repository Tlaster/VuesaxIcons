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

public val BrokenGroup.Rotateleft: ImageVector
    get() {
        if (_rotateleft != null) {
            return _rotateleft!!
        }
        _rotateleft = Builder(name = "Rotateleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.6701f, 13.3299f)
                curveTo(20.6701f, 18.1199f, 16.7901f, 21.9999f, 12.0001f, 21.9999f)
                curveTo(7.2101f, 21.9999f, 3.3301f, 18.1199f, 3.3301f, 13.3299f)
                curveTo(3.3301f, 11.5499f, 3.8701f, 9.8899f, 4.7901f, 8.5099f)
                moveTo(9.1101f, 5.0799f)
                curveTo(9.9801f, 4.8199f, 10.9401f, 4.6499f, 12.0001f, 4.6499f)
                curveTo(15.2101f, 4.6499f, 18.0201f, 6.3999f, 19.5101f, 8.9899f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8691f, 5.32f)
                lineTo(10.7591f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8691f, 5.3201f)
                lineTo(11.2391f, 7.7801f)
            }
        }
        .build()
        return _rotateleft!!
    }

private var _rotateleft: ImageVector? = null

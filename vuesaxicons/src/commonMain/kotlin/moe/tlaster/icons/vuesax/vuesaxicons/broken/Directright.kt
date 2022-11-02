package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Directright: ImageVector
    get() {
        if (_directright != null) {
            return _directright!!
        }
        _directright = Builder(name = "Directright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.7002f, 3.0701f)
                curveTo(4.9502f, 1.62f, 1.9602f, 4.55f, 3.3502f, 7.33f)
                lineTo(4.9701f, 10.57f)
                curveTo(5.4201f, 11.47f, 5.4201f, 12.53f, 4.9701f, 13.43f)
                lineTo(3.3502f, 16.67f)
                curveTo(1.9602f, 19.45f, 4.9502f, 22.37f, 7.7002f, 20.93f)
                lineTo(19.2901f, 14.83f)
                curveTo(21.5701f, 13.63f, 21.5701f, 10.37f, 19.2901f, 9.17f)
                lineTo(12.3201f, 5.5001f)
            }
        }
        .build()
        return _directright!!
    }

private var _directright: ImageVector? = null

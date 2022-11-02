package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Directright: ImageVector
    get() {
        if (_directright != null) {
            return _directright!!
        }
        _directright = Builder(name = "Directright", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2901f, 9.1698f)
                lineTo(7.7002f, 3.0698f)
                curveTo(4.9502f, 1.6198f, 1.9602f, 4.5498f, 3.3502f, 7.3298f)
                lineTo(4.9701f, 10.5698f)
                curveTo(5.4201f, 11.4698f, 5.4201f, 12.5298f, 4.9701f, 13.4298f)
                lineTo(3.3502f, 16.6698f)
                curveTo(1.9602f, 19.4498f, 4.9502f, 22.3698f, 7.7002f, 20.9298f)
                lineTo(19.2901f, 14.8298f)
                curveTo(21.5701f, 13.6298f, 21.5701f, 10.3698f, 19.2901f, 9.1698f)
                close()
            }
        }
        .build()
        return _directright!!
    }

private var _directright: ImageVector? = null

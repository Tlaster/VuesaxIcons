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

public val TwotoneGroup.Directdown: ImageVector
    get() {
        if (_directdown != null) {
            return _directdown!!
        }
        _directdown = Builder(name = "Directdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1693f, 19.2901f)
                lineTo(3.0693f, 7.7002f)
                curveTo(1.6193f, 4.9502f, 4.5493f, 1.9602f, 7.3293f, 3.3502f)
                lineTo(10.5693f, 4.9701f)
                curveTo(11.4693f, 5.4201f, 12.5293f, 5.4201f, 13.4293f, 4.9701f)
                lineTo(16.6693f, 3.3502f)
                curveTo(19.4493f, 1.9602f, 22.3693f, 4.9502f, 20.9293f, 7.7002f)
                lineTo(14.8293f, 19.2901f)
                curveTo(13.6293f, 21.5701f, 10.3693f, 21.5701f, 9.1693f, 19.2901f)
                close()
            }
        }
        .build()
        return _directdown!!
    }

private var _directdown: ImageVector? = null

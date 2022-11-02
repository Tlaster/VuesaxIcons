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

public val BrokenGroup.Directdown: ImageVector
    get() {
        if (_directdown != null) {
            return _directdown!!
        }
        _directdown = Builder(name = "Directdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0693f, 7.6999f)
                curveTo(1.6193f, 4.9499f, 4.5493f, 1.9599f, 7.3293f, 3.3499f)
                lineTo(10.5693f, 4.9699f)
                curveTo(11.4693f, 5.4199f, 12.5293f, 5.4199f, 13.4293f, 4.9699f)
                lineTo(16.6693f, 3.3499f)
                curveTo(19.4493f, 1.9599f, 22.3693f, 4.9499f, 20.9293f, 7.6999f)
                lineTo(14.8293f, 19.2899f)
                curveTo(13.6293f, 21.5699f, 10.3693f, 21.5699f, 9.1693f, 19.2899f)
                lineTo(5.4993f, 12.3199f)
            }
        }
        .build()
        return _directdown!!
    }

private var _directdown: ImageVector? = null

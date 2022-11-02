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

public val TwotoneGroup.Directup: ImageVector
    get() {
        if (_directup != null) {
            return _directup!!
        }
        _directup = Builder(name = "Directup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1693f, 4.71f)
                lineTo(3.0693f, 16.3f)
                curveTo(1.6193f, 19.05f, 4.5493f, 22.04f, 7.3293f, 20.65f)
                lineTo(10.5693f, 19.03f)
                curveTo(11.4693f, 18.58f, 12.5293f, 18.58f, 13.4293f, 19.03f)
                lineTo(16.6693f, 20.65f)
                curveTo(19.4493f, 22.04f, 22.3693f, 19.05f, 20.9293f, 16.3f)
                lineTo(14.8293f, 4.71f)
                curveTo(13.6293f, 2.43f, 10.3693f, 2.43f, 9.1693f, 4.71f)
                close()
            }
        }
        .build()
        return _directup!!
    }

private var _directup: ImageVector? = null

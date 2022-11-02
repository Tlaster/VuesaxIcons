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

public val TwotoneGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0291f, 12.42f)
                curveTo(2.3891f, 17.57f, 6.7591f, 21.76f, 11.9891f, 21.99f)
                curveTo(15.6791f, 22.15f, 18.9791f, 20.43f, 20.9591f, 17.72f)
                curveTo(21.7791f, 16.61f, 21.3391f, 15.87f, 19.9691f, 16.12f)
                curveTo(19.2991f, 16.24f, 18.6091f, 16.29f, 17.8891f, 16.26f)
                curveTo(12.9991f, 16.06f, 8.9991f, 11.97f, 8.9791f, 7.14f)
                curveTo(8.9691f, 5.84f, 9.2391f, 4.61f, 9.7291f, 3.49f)
                curveTo(10.2691f, 2.25f, 9.6191f, 1.66f, 8.3691f, 2.19f)
                curveTo(4.4091f, 3.86f, 1.6991f, 7.85f, 2.0291f, 12.42f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

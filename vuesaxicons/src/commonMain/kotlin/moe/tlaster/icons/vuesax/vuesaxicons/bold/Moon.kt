package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5287f, 15.9294f)
                curveTo(21.3687f, 15.6594f, 20.9187f, 15.2394f, 19.7987f, 15.4394f)
                curveTo(19.1787f, 15.5494f, 18.5487f, 15.5994f, 17.9187f, 15.5694f)
                curveTo(15.5887f, 15.4694f, 13.4787f, 14.3994f, 12.0087f, 12.7494f)
                curveTo(10.7087f, 11.2994f, 9.9087f, 9.4094f, 9.8987f, 7.3694f)
                curveTo(9.8987f, 6.2294f, 10.1187f, 5.1294f, 10.5687f, 4.0894f)
                curveTo(11.0087f, 3.0794f, 10.6987f, 2.5494f, 10.4787f, 2.3294f)
                curveTo(10.2487f, 2.0994f, 9.7087f, 1.7794f, 8.6487f, 2.2194f)
                curveTo(4.5587f, 3.9394f, 2.0287f, 8.0394f, 2.3287f, 12.4294f)
                curveTo(2.6287f, 16.5594f, 5.5287f, 20.0894f, 9.3687f, 21.4194f)
                curveTo(10.2887f, 21.7394f, 11.2587f, 21.9294f, 12.2587f, 21.9694f)
                curveTo(12.4187f, 21.9794f, 12.5787f, 21.9894f, 12.7387f, 21.9894f)
                curveTo(16.0887f, 21.9894f, 19.2287f, 20.4094f, 21.2087f, 17.7194f)
                curveTo(21.8787f, 16.7894f, 21.6987f, 16.1994f, 21.5287f, 15.9294f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

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

public val BoldGroup.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6211f, 8.45f)
                curveTo(19.5711f, 3.83f, 15.5411f, 1.75f, 12.0011f, 1.75f)
                curveTo(12.0011f, 1.75f, 12.0011f, 1.75f, 11.9911f, 1.75f)
                curveTo(8.4611f, 1.75f, 4.4211f, 3.82f, 3.3711f, 8.44f)
                curveTo(2.2011f, 13.6f, 5.3611f, 17.97f, 8.2211f, 20.72f)
                curveTo(9.2811f, 21.74f, 10.6411f, 22.25f, 12.0011f, 22.25f)
                curveTo(13.3611f, 22.25f, 14.7211f, 21.74f, 15.7711f, 20.72f)
                curveTo(18.6311f, 17.97f, 21.7911f, 13.61f, 20.6211f, 8.45f)
                close()
                moveTo(12.0011f, 13.46f)
                curveTo(10.2611f, 13.46f, 8.8511f, 12.05f, 8.8511f, 10.31f)
                curveTo(8.8511f, 8.57f, 10.2611f, 7.16f, 12.0011f, 7.16f)
                curveTo(13.7411f, 7.16f, 15.1511f, 8.57f, 15.1511f, 10.31f)
                curveTo(15.1511f, 12.05f, 13.7411f, 13.46f, 12.0011f, 13.46f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null

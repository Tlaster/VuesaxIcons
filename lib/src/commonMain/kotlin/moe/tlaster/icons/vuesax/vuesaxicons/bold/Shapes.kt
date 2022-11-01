package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 7.0f)
                horizontalLineTo(11.0f)
                horizontalLineTo(7.0f)
                curveTo(4.24f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 19.76f, 4.24f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(14.76f, 22.0f, 17.0f, 19.76f, 17.0f, 17.0f)
                verticalLineTo(13.0f)
                verticalLineTo(12.25f)
                curveTo(17.0f, 9.35f, 14.65f, 7.0f, 11.75f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8806f, 6.3303f)
                curveTo(22.4052f, 8.8899f, 21.1628f, 11.2123f, 19.1598f, 12.306f)
                curveTo(18.8522f, 12.4739f, 18.5006f, 12.2343f, 18.5006f, 11.8838f)
                verticalLineTo(11.7503f)
                curveTo(18.5006f, 8.3103f, 15.6906f, 5.5003f, 12.2506f, 5.5003f)
                horizontalLineTo(12.1171f)
                curveTo(11.7666f, 5.5003f, 11.527f, 5.1488f, 11.695f, 4.8412f)
                curveTo(12.7887f, 2.8381f, 15.111f, 1.5957f, 17.6706f, 2.1203f)
                curveTo(19.7606f, 2.5503f, 21.4506f, 4.2403f, 21.8806f, 6.3303f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null

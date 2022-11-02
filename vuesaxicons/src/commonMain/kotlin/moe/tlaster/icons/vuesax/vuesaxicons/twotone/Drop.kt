package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.6103f, 2.21f)
                curveTo(12.2503f, 1.93f, 11.7503f, 1.93f, 11.3903f, 2.21f)
                curveTo(9.4903f, 3.66f, 3.8803f, 8.39f, 3.9103f, 13.9f)
                curveTo(3.9103f, 18.36f, 7.5403f, 22.0f, 12.0103f, 22.0f)
                curveTo(16.4803f, 22.0f, 20.1103f, 18.37f, 20.1103f, 13.91f)
                curveTo(20.1203f, 8.48f, 14.5003f, 3.67f, 12.6103f, 2.21f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null

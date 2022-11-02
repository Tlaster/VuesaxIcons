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

public val BoldGroup.Mouse1: ImageVector
    get() {
        if (_mouse1 != null) {
            return _mouse1!!
        }
        _mouse1 = Builder(name = "Mouse1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2978f, 2.1147f)
                curveTo(13.0064f, 2.0634f, 12.75f, 2.2959f, 12.75f, 2.5919f)
                verticalLineTo(5.4526f)
                curveTo(12.75f, 5.651f, 12.8709f, 5.8256f, 13.0359f, 5.9358f)
                curveTo(13.5391f, 6.272f, 13.87f, 6.846f, 13.87f, 7.4991f)
                verticalLineTo(9.4991f)
                curveTo(13.87f, 10.5291f, 13.03f, 11.3791f, 12.0f, 11.3791f)
                curveTo(10.96f, 11.3791f, 10.12f, 10.5291f, 10.12f, 9.4991f)
                verticalLineTo(7.4991f)
                curveTo(10.12f, 6.8458f, 10.4583f, 6.2717f, 10.9639f, 5.9355f)
                curveTo(11.1291f, 5.8257f, 11.25f, 5.651f, 11.25f, 5.4526f)
                verticalLineTo(2.5925f)
                curveTo(11.25f, 2.2963f, 10.9935f, 2.0637f, 10.7019f, 2.1151f)
                curveTo(9.1524f, 2.3883f, 7.7658f, 3.1333f, 6.7f, 4.1991f)
                curveTo(5.34f, 5.5591f, 4.5f, 7.4391f, 4.5f, 9.4991f)
                verticalLineTo(14.4991f)
                curveTo(4.5f, 18.6291f, 7.87f, 21.9991f, 12.0f, 21.9991f)
                curveTo(16.13f, 21.9991f, 19.5f, 18.6291f, 19.5f, 14.4991f)
                verticalLineTo(9.4991f)
                curveTo(19.5f, 5.8086f, 16.813f, 2.7333f, 13.2978f, 2.1147f)
                close()
            }
        }
        .build()
        return _mouse1!!
    }

private var _mouse1: ImageVector? = null

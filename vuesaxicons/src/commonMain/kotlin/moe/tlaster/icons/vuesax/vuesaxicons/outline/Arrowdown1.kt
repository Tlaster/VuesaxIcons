package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Arrowdown1: ImageVector
    get() {
        if (_arrowdown1 != null) {
            return _arrowdown1!!
        }
        _arrowdown1 = Builder(name = "Arrowdown1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 16.8001f)
                curveTo(11.2995f, 16.8001f, 10.5995f, 16.5301f, 10.0695f, 16.0001f)
                lineTo(3.5495f, 9.4801f)
                curveTo(3.2595f, 9.1901f, 3.2595f, 8.7101f, 3.5495f, 8.4201f)
                curveTo(3.8395f, 8.1301f, 4.3195f, 8.1301f, 4.6095f, 8.4201f)
                lineTo(11.1295f, 14.9401f)
                curveTo(11.6095f, 15.4201f, 12.3895f, 15.4201f, 12.8695f, 14.9401f)
                lineTo(19.3895f, 8.4201f)
                curveTo(19.6795f, 8.1301f, 20.1595f, 8.1301f, 20.4495f, 8.4201f)
                curveTo(20.7395f, 8.7101f, 20.7395f, 9.1901f, 20.4495f, 9.4801f)
                lineTo(13.9295f, 16.0001f)
                curveTo(13.3995f, 16.5301f, 12.6995f, 16.8001f, 11.9995f, 16.8001f)
                close()
            }
        }
        .build()
        return _arrowdown1!!
    }

private var _arrowdown1: ImageVector? = null

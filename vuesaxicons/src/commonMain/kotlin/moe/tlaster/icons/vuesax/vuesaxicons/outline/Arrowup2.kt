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

public val OutlineGroup.Arrowup2: ImageVector
    get() {
        if (_arrowup2 != null) {
            return _arrowup2!!
        }
        _arrowup2 = Builder(name = "Arrowup2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.9195f, 15.8001f)
                curveTo(19.7295f, 15.8001f, 19.5395f, 15.7301f, 19.3895f, 15.5801f)
                lineTo(12.8695f, 9.0601f)
                curveTo(12.3895f, 8.5801f, 11.6095f, 8.5801f, 11.1295f, 9.0601f)
                lineTo(4.6095f, 15.5801f)
                curveTo(4.3195f, 15.8701f, 3.8395f, 15.8701f, 3.5495f, 15.5801f)
                curveTo(3.2595f, 15.2901f, 3.2595f, 14.8101f, 3.5495f, 14.5201f)
                lineTo(10.0695f, 8.0001f)
                curveTo(11.1295f, 6.9401f, 12.8595f, 6.9401f, 13.9295f, 8.0001f)
                lineTo(20.4495f, 14.5201f)
                curveTo(20.7395f, 14.8101f, 20.7395f, 15.2901f, 20.4495f, 15.5801f)
                curveTo(20.2995f, 15.7201f, 20.1095f, 15.8001f, 19.9195f, 15.8001f)
                close()
            }
        }
        .build()
        return _arrowup2!!
    }

private var _arrowup2: ImageVector? = null

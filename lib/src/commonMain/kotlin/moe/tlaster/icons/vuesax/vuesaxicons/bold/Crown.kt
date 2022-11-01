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

public val BoldGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0003f, 5.7095f)
                verticalLineTo(15.2895f)
                curveTo(22.0003f, 18.0495f, 19.7603f, 20.2895f, 17.0003f, 20.2895f)
                horizontalLineTo(7.0003f)
                curveTo(6.5403f, 20.2895f, 6.1003f, 20.2295f, 5.6703f, 20.1095f)
                curveTo(5.0503f, 19.9395f, 4.8503f, 19.1495f, 5.3103f, 18.6895f)
                lineTo(15.9403f, 8.0595f)
                curveTo(16.1603f, 7.8395f, 16.4903f, 7.7895f, 16.8003f, 7.8495f)
                curveTo(17.1203f, 7.9095f, 17.4703f, 7.8195f, 17.7203f, 7.5795f)
                lineTo(20.2903f, 4.9995f)
                curveTo(21.2303f, 4.0595f, 22.0003f, 4.3695f, 22.0003f, 5.7095f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.64f, 7.3595f)
                lineTo(4.17f, 17.8295f)
                curveTo(3.69f, 18.3095f, 2.89f, 18.1895f, 2.57f, 17.5895f)
                curveTo(2.2f, 16.9095f, 2.0f, 16.1195f, 2.0f, 15.2895f)
                verticalLineTo(5.7095f)
                curveTo(2.0f, 4.3695f, 2.77f, 4.0595f, 3.71f, 4.9995f)
                lineTo(6.29f, 7.5895f)
                curveTo(6.68f, 7.9695f, 7.32f, 7.9695f, 7.71f, 7.5895f)
                lineTo(11.29f, 3.9995f)
                curveTo(11.68f, 3.6095f, 12.32f, 3.6095f, 12.71f, 3.9995f)
                lineTo(14.65f, 5.9395f)
                curveTo(15.03f, 6.3295f, 15.03f, 6.9695f, 14.64f, 7.3595f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null

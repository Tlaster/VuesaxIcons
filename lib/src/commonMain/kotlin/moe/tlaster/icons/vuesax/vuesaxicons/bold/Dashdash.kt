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

public val BoldGroup.Dashdash: ImageVector
    get() {
        if (_dashdash != null) {
            return _dashdash!!
        }
        _dashdash = Builder(name = "Dashdash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1195f, 3.5f)
                horizontalLineTo(15.9995f)
                curveTo(19.9995f, 3.5f, 21.9995f, 6.0f, 21.9995f, 9.5f)
                verticalLineTo(12.0f)
                curveTo(21.9995f, 17.0f, 18.9995f, 20.5f, 13.4995f, 20.5f)
                horizontalLineTo(3.9395f)
                lineTo(4.9995f, 16.25f)
                horizontalLineTo(12.4395f)
                curveTo(15.9995f, 16.25f, 17.7495f, 14.0f, 17.7495f, 10.94f)
                verticalLineTo(10.75f)
                curveTo(17.7495f, 9.0f, 16.9995f, 7.75f, 14.7495f, 7.75f)
                horizontalLineTo(6.0595f)
                lineTo(7.1195f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4095f, 10.2305f)
                horizontalLineTo(4.6995f)
                curveTo(3.6195f, 10.2305f, 2.6795f, 10.9705f, 2.4095f, 12.0105f)
                lineTo(2.1595f, 13.0305f)
                curveTo(2.0695f, 13.4005f, 2.3495f, 13.7605f, 2.7295f, 13.7605f)
                horizontalLineTo(10.4395f)
                curveTo(11.5195f, 13.7605f, 12.4595f, 13.0205f, 12.7295f, 11.9805f)
                lineTo(12.9795f, 10.9605f)
                curveTo(13.0795f, 10.5905f, 12.7895f, 10.2305f, 12.4095f, 10.2305f)
                close()
            }
        }
        .build()
        return _dashdash!!
    }

private var _dashdash: ImageVector? = null

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

public val BoldGroup.Archive1: ImageVector
    get() {
        if (_archive1 != null) {
            return _archive1!!
        }
        _archive1 = Builder(name = "Archive1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8203f, 2.0f)
                horizontalLineTo(7.1803f)
                curveTo(5.0503f, 2.0f, 3.3203f, 3.74f, 3.3203f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.3203f, 21.75f, 4.6103f, 22.51f, 6.1903f, 21.64f)
                lineTo(11.0703f, 18.93f)
                curveTo(11.5903f, 18.64f, 12.4303f, 18.64f, 12.9403f, 18.93f)
                lineTo(17.8203f, 21.64f)
                curveTo(19.4003f, 22.52f, 20.6903f, 21.76f, 20.6903f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.6803f, 3.74f, 18.9503f, 2.0f, 16.8203f, 2.0f)
                close()
                moveTo(15.0103f, 9.75f)
                curveTo(14.0403f, 10.1f, 13.0203f, 10.28f, 12.0003f, 10.28f)
                curveTo(10.9803f, 10.28f, 9.9603f, 10.1f, 8.9903f, 9.75f)
                curveTo(8.6003f, 9.61f, 8.4003f, 9.18f, 8.5403f, 8.79f)
                curveTo(8.6903f, 8.4f, 9.1203f, 8.2f, 9.5103f, 8.34f)
                curveTo(11.1203f, 8.92f, 12.8903f, 8.92f, 14.5003f, 8.34f)
                curveTo(14.8903f, 8.2f, 15.3203f, 8.4f, 15.4603f, 8.79f)
                curveTo(15.6003f, 9.18f, 15.4003f, 9.61f, 15.0103f, 9.75f)
                close()
            }
        }
        .build()
        return _archive1!!
    }

private var _archive1: ImageVector? = null

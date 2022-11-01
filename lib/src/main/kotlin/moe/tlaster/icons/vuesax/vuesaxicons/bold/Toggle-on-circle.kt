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

public val BoldGroup.`Toggle-on-circle`: ImageVector
    get() {
        if (`_toggle-on-circle` != null) {
            return `_toggle-on-circle`!!
        }
        `_toggle-on-circle` = Builder(name = "Toggle-on-circle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.86f, 3.8594f)
                horizontalLineTo(10.14f)
                curveTo(5.65f, 3.8594f, 2.0f, 7.5094f, 2.0f, 11.9994f)
                curveTo(2.0f, 16.4894f, 5.65f, 20.1394f, 10.14f, 20.1394f)
                horizontalLineTo(13.86f)
                curveTo(18.35f, 20.1394f, 22.0f, 16.4894f, 22.0f, 11.9994f)
                curveTo(22.0f, 7.5094f, 18.35f, 3.8594f, 13.86f, 3.8594f)
                close()
                moveTo(13.86f, 16.4194f)
                curveTo(11.42f, 16.4194f, 9.44f, 14.4394f, 9.44f, 11.9994f)
                curveTo(9.44f, 9.5594f, 11.42f, 7.5794f, 13.86f, 7.5794f)
                curveTo(16.3f, 7.5794f, 18.28f, 9.5594f, 18.28f, 11.9994f)
                curveTo(18.28f, 14.4394f, 16.3f, 16.4194f, 13.86f, 16.4194f)
                close()
            }
        }
        .build()
        return `_toggle-on-circle`!!
    }

private var `_toggle-on-circle`: ImageVector? = null

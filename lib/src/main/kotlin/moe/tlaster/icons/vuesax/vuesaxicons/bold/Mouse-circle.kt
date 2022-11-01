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

public val BoldGroup.`Mouse-circle`: ImageVector
    get() {
        if (`_mouse-circle` != null) {
            return `_mouse-circle`!!
        }
        `_mouse-circle` = Builder(name = "Mouse-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9597f, 17.8385f)
                lineTo(19.3297f, 18.3885f)
                curveTo(18.8797f, 18.5385f, 18.5197f, 18.8885f, 18.3697f, 19.3485f)
                lineTo(17.8197f, 20.9785f)
                curveTo(17.3497f, 22.3885f, 15.3697f, 22.3585f, 14.9297f, 20.9485f)
                lineTo(13.0797f, 14.9985f)
                curveTo(12.7197f, 13.8185f, 13.8097f, 12.7185f, 14.9797f, 13.0885f)
                lineTo(20.9397f, 14.9385f)
                curveTo(22.3397f, 15.3785f, 22.3597f, 17.3685f, 20.9597f, 17.8385f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9994f, 11.4994f)
                curveTo(20.9994f, 11.9294f, 20.9694f, 12.3594f, 20.9194f, 12.7794f)
                curveTo(20.8794f, 13.0794f, 20.5694f, 13.2594f, 20.2794f, 13.1694f)
                lineTo(15.4294f, 11.6594f)
                curveTo(14.3494f, 11.3294f, 13.1994f, 11.6094f, 12.3994f, 12.3994f)
                curveTo(11.5994f, 13.1994f, 11.3094f, 14.3694f, 11.6494f, 15.4494f)
                lineTo(13.1494f, 20.2794f)
                curveTo(13.2394f, 20.5694f, 13.0494f, 20.8794f, 12.7494f, 20.9194f)
                curveTo(12.3294f, 20.9694f, 11.9194f, 20.9994f, 11.4994f, 20.9994f)
                curveTo(6.1594f, 20.9994f, 1.8594f, 16.6094f, 1.9994f, 11.2294f)
                curveTo(2.1394f, 6.2694f, 6.2694f, 2.1394f, 11.2294f, 1.9994f)
                curveTo(16.6094f, 1.8594f, 20.9994f, 6.1594f, 20.9994f, 11.4994f)
                close()
            }
        }
        .build()
        return `_mouse-circle`!!
    }

private var `_mouse-circle`: ImageVector? = null

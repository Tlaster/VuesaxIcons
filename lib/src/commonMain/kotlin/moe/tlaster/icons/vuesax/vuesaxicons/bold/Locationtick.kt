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

public val BoldGroup.Locationtick: ImageVector
    get() {
        if (_locationtick != null) {
            return _locationtick!!
        }
        _locationtick = Builder(name = "Locationtick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6188f, 8.7f)
                curveTo(19.5788f, 4.07f, 15.5388f, 2.0f, 11.9988f, 2.0f)
                curveTo(11.9988f, 2.0f, 11.9988f, 2.0f, 11.9888f, 2.0f)
                curveTo(8.4588f, 2.0f, 4.4288f, 4.07f, 3.3788f, 8.69f)
                curveTo(2.1988f, 13.85f, 5.3588f, 18.22f, 8.2188f, 20.98f)
                curveTo(9.2788f, 22.0f, 10.6388f, 22.51f, 11.9988f, 22.51f)
                curveTo(13.3588f, 22.51f, 14.7188f, 22.0f, 15.7688f, 20.98f)
                curveTo(18.6288f, 18.22f, 21.7888f, 13.86f, 20.6188f, 8.7f)
                close()
                moveTo(15.2788f, 9.53f)
                lineTo(11.2788f, 13.53f)
                curveTo(11.1288f, 13.68f, 10.9388f, 13.75f, 10.7488f, 13.75f)
                curveTo(10.5588f, 13.75f, 10.3688f, 13.68f, 10.2188f, 13.53f)
                lineTo(8.7188f, 12.03f)
                curveTo(8.4288f, 11.74f, 8.4288f, 11.26f, 8.7188f, 10.97f)
                curveTo(9.0088f, 10.68f, 9.4888f, 10.68f, 9.7788f, 10.97f)
                lineTo(10.7488f, 11.94f)
                lineTo(14.2188f, 8.47f)
                curveTo(14.5088f, 8.18f, 14.9888f, 8.18f, 15.2788f, 8.47f)
                curveTo(15.5688f, 8.76f, 15.5688f, 9.24f, 15.2788f, 9.53f)
                close()
            }
        }
        .build()
        return _locationtick!!
    }

private var _locationtick: ImageVector? = null

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

public val BoldGroup.Locationminus: ImageVector
    get() {
        if (_locationminus != null) {
            return _locationminus!!
        }
        _locationminus = Builder(name = "Locationminus", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.7488f, 11.75f)
                horizontalLineTo(9.2488f)
                curveTo(8.8388f, 11.75f, 8.4988f, 11.41f, 8.4988f, 11.0f)
                curveTo(8.4988f, 10.59f, 8.8388f, 10.25f, 9.2488f, 10.25f)
                horizontalLineTo(14.7488f)
                curveTo(15.1588f, 10.25f, 15.4988f, 10.59f, 15.4988f, 11.0f)
                curveTo(15.4988f, 11.41f, 15.1588f, 11.75f, 14.7488f, 11.75f)
                close()
            }
        }
        .build()
        return _locationminus!!
    }

private var _locationminus: ImageVector? = null

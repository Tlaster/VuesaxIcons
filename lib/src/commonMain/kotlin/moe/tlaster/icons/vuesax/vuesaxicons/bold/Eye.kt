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

public val BoldGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 9.1497f)
                curveTo(18.94f, 5.5197f, 15.56f, 3.4297f, 12.0f, 3.4297f)
                curveTo(10.22f, 3.4297f, 8.49f, 3.9497f, 6.91f, 4.9197f)
                curveTo(5.33f, 5.8997f, 3.91f, 7.3297f, 2.75f, 9.1497f)
                curveTo(1.75f, 10.7197f, 1.75f, 13.2697f, 2.75f, 14.8397f)
                curveTo(5.06f, 18.4797f, 8.44f, 20.5597f, 12.0f, 20.5597f)
                curveTo(13.78f, 20.5597f, 15.51f, 20.0397f, 17.09f, 19.0697f)
                curveTo(18.67f, 18.0897f, 20.09f, 16.6597f, 21.25f, 14.8397f)
                curveTo(22.25f, 13.2797f, 22.25f, 10.7197f, 21.25f, 9.1497f)
                close()
                moveTo(12.0f, 16.0397f)
                curveTo(9.76f, 16.0397f, 7.96f, 14.2297f, 7.96f, 11.9997f)
                curveTo(7.96f, 9.7697f, 9.76f, 7.9597f, 12.0f, 7.9597f)
                curveTo(14.24f, 7.9597f, 16.04f, 9.7697f, 16.04f, 11.9997f)
                curveTo(16.04f, 14.2297f, 14.24f, 16.0397f, 12.0f, 16.0397f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9984f, 9.1406f)
                curveTo(10.4284f, 9.1406f, 9.1484f, 10.4206f, 9.1484f, 12.0006f)
                curveTo(9.1484f, 13.5706f, 10.4284f, 14.8506f, 11.9984f, 14.8506f)
                curveTo(13.5684f, 14.8506f, 14.8584f, 13.5706f, 14.8584f, 12.0006f)
                curveTo(14.8584f, 10.4306f, 13.5684f, 9.1406f, 11.9984f, 9.1406f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null

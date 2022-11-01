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

public val BoldGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 4.6484f)
                curveTo(7.2201f, 4.6484f, 3.3301f, 8.5384f, 3.3301f, 13.3184f)
                curveTo(3.3301f, 18.0984f, 7.2201f, 21.9984f, 12.0001f, 21.9984f)
                curveTo(16.7801f, 21.9984f, 20.6701f, 18.1084f, 20.6701f, 13.3284f)
                curveTo(20.6701f, 8.5484f, 16.7801f, 4.6484f, 12.0001f, 4.6484f)
                close()
                moveTo(12.7501f, 12.9984f)
                curveTo(12.7501f, 13.4084f, 12.4101f, 13.7484f, 12.0001f, 13.7484f)
                curveTo(11.5901f, 13.7484f, 11.2501f, 13.4084f, 11.2501f, 12.9984f)
                verticalLineTo(7.9984f)
                curveTo(11.2501f, 7.5884f, 11.5901f, 7.2484f, 12.0001f, 7.2484f)
                curveTo(12.4101f, 7.2484f, 12.7501f, 7.5884f, 12.7501f, 7.9984f)
                verticalLineTo(12.9984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8906f, 3.45f)
                horizontalLineTo(9.1106f)
                curveTo(8.7106f, 3.45f, 8.3906f, 3.13f, 8.3906f, 2.73f)
                curveTo(8.3906f, 2.33f, 8.7106f, 2.0f, 9.1106f, 2.0f)
                horizontalLineTo(14.8906f)
                curveTo(15.2906f, 2.0f, 15.6106f, 2.32f, 15.6106f, 2.72f)
                curveTo(15.6106f, 3.12f, 15.2906f, 3.45f, 14.8906f, 3.45f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null

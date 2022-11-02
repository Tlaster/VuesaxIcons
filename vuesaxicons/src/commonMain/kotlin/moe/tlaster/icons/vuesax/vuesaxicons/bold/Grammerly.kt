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

public val BoldGroup.Grammerly: ImageVector
    get() {
        if (_grammerly != null) {
            return _grammerly!!
        }
        _grammerly = Builder(name = "Grammerly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1105f, 4.9598f)
                curveTo(15.2005f, 1.0498f, 8.8504f, 1.0498f, 4.9405f, 4.9598f)
                curveTo(0.9605f, 8.9398f, 1.0304f, 15.4298f, 5.1405f, 19.3298f)
                curveTo(8.9404f, 22.9198f, 15.1005f, 22.9198f, 18.9005f, 19.3298f)
                curveTo(23.0205f, 15.4298f, 23.0905f, 8.9398f, 19.1105f, 4.9598f)
                close()
                moveTo(16.3805f, 16.6498f)
                curveTo(15.1805f, 17.7898f, 13.6005f, 18.3598f, 12.0205f, 18.3598f)
                curveTo(10.4405f, 18.3598f, 8.8604f, 17.7898f, 7.6604f, 16.6498f)
                curveTo(7.3604f, 16.3598f, 7.3505f, 15.8898f, 7.6304f, 15.5898f)
                curveTo(7.9205f, 15.2898f, 8.3904f, 15.2798f, 8.6904f, 15.5598f)
                curveTo(10.5205f, 17.2898f, 13.5105f, 17.2998f, 15.3505f, 15.5598f)
                curveTo(15.6505f, 15.2798f, 16.1305f, 15.2898f, 16.4105f, 15.5898f)
                curveTo(16.7005f, 15.8898f, 16.6805f, 16.3598f, 16.3805f, 16.6498f)
                close()
            }
        }
        .build()
        return _grammerly!!
    }

private var _grammerly: ImageVector? = null

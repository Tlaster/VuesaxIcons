package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Grammerly: ImageVector
    get() {
        if (_grammerly != null) {
            return _grammerly!!
        }
        _grammerly = Builder(name = "Grammerly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0707f, 4.9501f)
                curveTo(23.0407f, 8.9201f, 22.9707f, 15.4f, 18.8707f, 19.29f)
                curveTo(15.0807f, 22.88f, 8.9307f, 22.88f, 5.1307f, 19.29f)
                curveTo(1.0207f, 15.4f, 0.9507f, 8.9201f, 4.9307f, 4.9501f)
                curveTo(8.8307f, 1.0401f, 15.1707f, 1.0401f, 19.0707f, 4.9501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0007f, 18.3199f)
                curveTo(10.4207f, 18.3199f, 8.8507f, 17.7499f, 7.6507f, 16.6199f)
                curveTo(7.3507f, 16.3299f, 7.3407f, 15.8599f, 7.6207f, 15.5599f)
                curveTo(7.9107f, 15.2599f, 8.3807f, 15.2499f, 8.6807f, 15.5299f)
                curveTo(10.5107f, 17.2599f, 13.4907f, 17.2599f, 15.3207f, 15.5299f)
                curveTo(15.6207f, 15.2499f, 16.1007f, 15.2599f, 16.3807f, 15.5599f)
                curveTo(16.6607f, 15.8599f, 16.6507f, 16.3399f, 16.3507f, 16.6199f)
                curveTo(15.1507f, 17.7499f, 13.5807f, 18.3199f, 12.0007f, 18.3199f)
                close()
            }
        }
        .build()
        return _grammerly!!
    }

private var _grammerly: ImageVector? = null

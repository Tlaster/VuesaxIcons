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

public val BulkGroup.Discover: ImageVector
    get() {
        if (_discover != null) {
            return _discover!!
        }
        _discover = Builder(name = "Discover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9808f, 3.0201f)
                curveTo(20.1108f, 2.1501f, 18.8808f, 1.8101f, 17.6908f, 2.1101f)
                lineTo(7.8908f, 4.5601f)
                curveTo(6.2408f, 4.9701f, 4.9708f, 6.2501f, 4.5608f, 7.8901f)
                lineTo(2.1108f, 17.7001f)
                curveTo(1.8108f, 18.8901f, 2.1508f, 20.1201f, 3.0208f, 20.9901f)
                curveTo(3.6808f, 21.6401f, 4.5508f, 22.0001f, 5.4508f, 22.0001f)
                curveTo(5.7308f, 22.0001f, 6.0208f, 21.9701f, 6.3008f, 21.8901f)
                lineTo(16.1108f, 19.4401f)
                curveTo(17.7508f, 19.0301f, 19.0308f, 17.7601f, 19.4408f, 16.1101f)
                lineTo(21.8908f, 6.3001f)
                curveTo(22.1908f, 5.1101f, 21.8508f, 3.8801f, 20.9808f, 3.0201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9991f, 15.8801f)
                curveTo(14.142f, 15.8801f, 15.8791f, 14.143f, 15.8791f, 12.0001f)
                curveTo(15.8791f, 9.8573f, 14.142f, 8.1201f, 11.9991f, 8.1201f)
                curveTo(9.8563f, 8.1201f, 8.1191f, 9.8573f, 8.1191f, 12.0001f)
                curveTo(8.1191f, 14.143f, 9.8563f, 15.8801f, 11.9991f, 15.8801f)
                close()
            }
        }
        .build()
        return _discover!!
    }

private var _discover: ImageVector? = null

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

public val BoldGroup.Discover1: ImageVector
    get() {
        if (_discover1 != null) {
            return _discover1!!
        }
        _discover1 = Builder(name = "Discover1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9808f, 3.0208f)
                curveTo(20.1108f, 2.1508f, 18.8808f, 1.8108f, 17.6908f, 2.1108f)
                lineTo(7.8908f, 4.5608f)
                curveTo(6.2408f, 4.9708f, 4.9708f, 6.2508f, 4.5608f, 7.8908f)
                lineTo(2.1108f, 17.7008f)
                curveTo(1.8108f, 18.8908f, 2.1508f, 20.1208f, 3.0208f, 20.9908f)
                curveTo(3.6808f, 21.6408f, 4.5508f, 22.0008f, 5.4508f, 22.0008f)
                curveTo(5.7308f, 22.0008f, 6.0208f, 21.9708f, 6.3008f, 21.8908f)
                lineTo(16.1108f, 19.4408f)
                curveTo(17.7508f, 19.0308f, 19.0308f, 17.7608f, 19.4408f, 16.1108f)
                lineTo(21.8908f, 6.3008f)
                curveTo(22.1908f, 5.1108f, 21.8508f, 3.8808f, 20.9808f, 3.0208f)
                close()
                moveTo(12.0008f, 15.8808f)
                curveTo(9.8608f, 15.8808f, 8.1208f, 14.1408f, 8.1208f, 12.0008f)
                curveTo(8.1208f, 9.8608f, 9.8608f, 8.1208f, 12.0008f, 8.1208f)
                curveTo(14.1408f, 8.1208f, 15.8808f, 9.8608f, 15.8808f, 12.0008f)
                curveTo(15.8808f, 14.1408f, 14.1408f, 15.8808f, 12.0008f, 15.8808f)
                close()
            }
        }
        .build()
        return _discover1!!
    }

private var _discover1: ImageVector? = null

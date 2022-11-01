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

public val BoldGroup.Recordcircle: ImageVector
    get() {
        if (_recordcircle != null) {
            return _recordcircle!!
        }
        _recordcircle = Builder(name = "Recordcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9688f, 2.0f)
                curveTo(6.4488f, 2.0f, 1.9688f, 6.48f, 1.9688f, 12.0f)
                curveTo(1.9688f, 17.52f, 6.4488f, 22.0f, 11.9688f, 22.0f)
                curveTo(17.4887f, 22.0f, 21.9688f, 17.52f, 21.9688f, 12.0f)
                curveTo(21.9688f, 6.48f, 17.4988f, 2.0f, 11.9688f, 2.0f)
                close()
                moveTo(11.9987f, 16.23f)
                curveTo(9.6587f, 16.23f, 7.7688f, 14.34f, 7.7688f, 12.0f)
                curveTo(7.7688f, 9.66f, 9.6587f, 7.77f, 11.9987f, 7.77f)
                curveTo(14.3387f, 7.77f, 16.2287f, 9.66f, 16.2287f, 12.0f)
                curveTo(16.2287f, 14.34f, 14.3387f, 16.23f, 11.9987f, 16.23f)
                close()
            }
        }
        .build()
        return _recordcircle!!
    }

private var _recordcircle: ImageVector? = null

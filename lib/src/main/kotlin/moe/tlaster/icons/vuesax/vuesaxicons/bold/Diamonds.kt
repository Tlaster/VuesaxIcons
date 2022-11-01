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

public val BoldGroup.Diamonds: ImageVector
    get() {
        if (_diamonds != null) {
            return _diamonds!!
        }
        _diamonds = Builder(name = "Diamonds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7704f, 9.7984f)
                lineTo(20.9704f, 7.9984f)
                lineTo(19.2104f, 4.0384f)
                curveTo(18.7404f, 2.9984f, 18.0004f, 2.1484f, 16.3004f, 2.1484f)
                horizontalLineTo(7.7004f)
                curveTo(6.0004f, 2.1484f, 5.2604f, 2.9984f, 4.7904f, 4.0384f)
                lineTo(3.0304f, 7.9984f)
                lineTo(2.2304f, 9.7984f)
                curveTo(1.7704f, 10.8484f, 2.0204f, 12.3884f, 2.7904f, 13.2384f)
                lineTo(9.6404f, 20.7784f)
                curveTo(10.9404f, 22.2084f, 13.0604f, 22.2084f, 14.3604f, 20.7784f)
                lineTo(21.2104f, 13.2384f)
                curveTo(21.9804f, 12.3884f, 22.2304f, 10.8484f, 21.7704f, 9.7984f)
                close()
            }
        }
        .build()
        return _diamonds!!
    }

private var _diamonds: ImageVector? = null

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

public val BoldGroup.Component: ImageVector
    get() {
        if (_component != null) {
            return _component!!
        }
        _component = Builder(name = "Component", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9498f, 14.55f)
                lineTo(14.5598f, 20.94f)
                curveTo(13.1598f, 22.34f, 10.8598f, 22.34f, 9.4498f, 20.94f)
                lineTo(3.0598f, 14.55f)
                curveTo(1.6598f, 13.15f, 1.6598f, 10.85f, 3.0598f, 9.44f)
                lineTo(9.4498f, 3.05f)
                curveTo(10.8498f, 1.65f, 13.1498f, 1.65f, 14.5598f, 3.05f)
                lineTo(20.9498f, 9.44f)
                curveTo(22.3498f, 10.85f, 22.3498f, 13.15f, 20.9498f, 14.55f)
                close()
            }
        }
        .build()
        return _component!!
    }

private var _component: ImageVector? = null

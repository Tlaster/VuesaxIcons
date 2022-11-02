package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Component: ImageVector
    get() {
        if (_component != null) {
            return _component!!
        }
        _component = Builder(name = "Component", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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

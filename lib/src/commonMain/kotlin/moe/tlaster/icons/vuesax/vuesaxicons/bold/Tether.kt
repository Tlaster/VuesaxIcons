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

public val BoldGroup.Tether: ImageVector
    get() {
        if (_tether != null) {
            return _tether!!
        }
        _tether = Builder(name = "Tether", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7101f, 9.8994f)
                lineTo(19.3101f, 5.0794f)
                curveTo(18.8401f, 4.1294f, 17.5901f, 3.3594f, 16.5301f, 3.3594f)
                horizontalLineTo(7.4701f)
                curveTo(6.4101f, 3.3594f, 5.1601f, 4.1294f, 4.6901f, 5.0794f)
                lineTo(2.2901f, 9.8994f)
                curveTo(1.7101f, 11.0594f, 2.0301f, 12.7094f, 2.9801f, 13.5794f)
                lineTo(9.9101f, 19.8694f)
                curveTo(11.0601f, 20.9094f, 12.9301f, 20.9094f, 14.0801f, 19.8694f)
                lineTo(21.0101f, 13.5794f)
                curveTo(21.9701f, 12.7094f, 22.2901f, 11.0494f, 21.7101f, 9.8994f)
                close()
                moveTo(16.0001f, 9.2494f)
                horizontalLineTo(12.7501f)
                verticalLineTo(14.4994f)
                curveTo(12.7501f, 14.9094f, 12.4101f, 15.2494f, 12.0001f, 15.2494f)
                curveTo(11.5901f, 15.2494f, 11.2501f, 14.9094f, 11.2501f, 14.4994f)
                verticalLineTo(9.2494f)
                horizontalLineTo(8.0001f)
                curveTo(7.5901f, 9.2494f, 7.2501f, 8.9094f, 7.2501f, 8.4994f)
                curveTo(7.2501f, 8.0894f, 7.5901f, 7.7494f, 8.0001f, 7.7494f)
                horizontalLineTo(16.0001f)
                curveTo(16.4101f, 7.7494f, 16.7501f, 8.0894f, 16.7501f, 8.4994f)
                curveTo(16.7501f, 8.9094f, 16.4101f, 9.2494f, 16.0001f, 9.2494f)
                close()
            }
        }
        .build()
        return _tether!!
    }

private var _tether: ImageVector? = null

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

public val BoldGroup.Setting: ImageVector
    get() {
        if (_setting != null) {
            return _setting!!
        }
        _setting = Builder(name = "Setting", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9401f, 5.4214f)
                lineTo(13.7701f, 2.4314f)
                curveTo(12.7801f, 1.8614f, 11.2301f, 1.8614f, 10.2401f, 2.4314f)
                lineTo(5.0201f, 5.4414f)
                curveTo(2.9501f, 6.8414f, 2.8301f, 7.0514f, 2.8301f, 9.2814f)
                verticalLineTo(14.7114f)
                curveTo(2.8301f, 16.9414f, 2.9501f, 17.1614f, 5.0601f, 18.5814f)
                lineTo(10.2301f, 21.5714f)
                curveTo(10.7301f, 21.8614f, 11.3701f, 22.0014f, 12.0001f, 22.0014f)
                curveTo(12.6301f, 22.0014f, 13.2701f, 21.8614f, 13.7601f, 21.5714f)
                lineTo(18.9801f, 18.5614f)
                curveTo(21.0501f, 17.1614f, 21.1701f, 16.9514f, 21.1701f, 14.7214f)
                verticalLineTo(9.2814f)
                curveTo(21.1701f, 7.0514f, 21.0501f, 6.8414f, 18.9401f, 5.4214f)
                close()
                moveTo(12.0001f, 15.2514f)
                curveTo(10.2101f, 15.2514f, 8.7501f, 13.7914f, 8.7501f, 12.0014f)
                curveTo(8.7501f, 10.2114f, 10.2101f, 8.7514f, 12.0001f, 8.7514f)
                curveTo(13.7901f, 8.7514f, 15.2501f, 10.2114f, 15.2501f, 12.0014f)
                curveTo(15.2501f, 13.7914f, 13.7901f, 15.2514f, 12.0001f, 15.2514f)
                close()
            }
        }
        .build()
        return _setting!!
    }

private var _setting: ImageVector? = null

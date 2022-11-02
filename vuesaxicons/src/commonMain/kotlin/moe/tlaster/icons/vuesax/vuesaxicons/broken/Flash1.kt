package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Flash1: ImageVector
    get() {
        if (_flash1 != null) {
            return _flash1!!
        }
        _flash1 = Builder(name = "Flash1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.82f, 7.0199f)
                verticalLineTo(3.5199f)
                curveTo(14.82f, 1.8399f, 13.91f, 1.4999f, 12.8f, 2.7599f)
                lineTo(5.23f, 11.3599f)
                curveTo(4.3f, 12.4099f, 4.69f, 13.2799f, 6.1f, 13.2799f)
                horizontalLineTo(9.19f)
                verticalLineTo(20.4799f)
                curveTo(9.19f, 22.1599f, 10.1f, 22.4999f, 11.21f, 21.2399f)
                lineTo(18.78f, 12.6399f)
                curveTo(19.71f, 11.5899f, 19.32f, 10.7199f, 17.91f, 10.7199f)
                horizontalLineTo(14.82f)
            }
        }
        .build()
        return _flash1!!
    }

private var _flash1: ImageVector? = null

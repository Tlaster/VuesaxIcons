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

public val BrokenGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6091f, 9.83f)
                lineTo(17.2591f, 16.78f)
                curveTo(19.2891f, 18.62f, 18.9991f, 22.0f, 15.2391f, 22.0f)
                horizontalLineTo(8.7591f)
                curveTo(4.9991f, 22.0f, 4.7091f, 18.62f, 6.7391f, 16.78f)
                lineTo(17.2591f, 7.22f)
                curveTo(19.2891f, 5.38f, 18.9991f, 2.0f, 15.2391f, 2.0f)
                horizontalLineTo(8.7591f)
                curveTo(4.9991f, 2.0f, 4.7091f, 5.38f, 6.7391f, 7.22f)
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null

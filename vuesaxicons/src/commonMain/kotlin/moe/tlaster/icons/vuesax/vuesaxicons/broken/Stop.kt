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

public val BrokenGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 9.3f)
                curveTo(3.0f, 4.8f, 4.8f, 3.0f, 9.3f, 3.0f)
                horizontalLineTo(14.7f)
                curveTo(19.2f, 3.0f, 21.0f, 4.8f, 21.0f, 9.3f)
                verticalLineTo(14.7f)
                curveTo(21.0f, 19.2f, 19.2f, 21.0f, 14.7f, 21.0f)
                horizontalLineTo(9.3f)
                curveTo(4.8f, 21.0f, 3.0f, 19.2f, 3.0f, 14.7f)
                verticalLineTo(13.99f)
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null

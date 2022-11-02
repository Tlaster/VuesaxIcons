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

public val BrokenGroup.Arrowup2: ImageVector
    get() {
        if (_arrowup2 != null) {
            return _arrowup2!!
        }
        _arrowup2 = Builder(name = "Arrowup2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.6897f, 12.7801f)
                curveTo(19.3497f, 15.6501f, 17.9897f, 18.0001f, 14.6797f, 18.0001f)
                horizontalLineTo(11.9997f)
                horizontalLineTo(9.3297f)
                curveTo(6.0197f, 18.0001f, 4.6597f, 15.6501f, 6.3197f, 12.7801f)
                lineTo(7.6597f, 10.4701f)
                lineTo(8.9997f, 8.1601f)
                curveTo(10.6597f, 5.2901f, 13.3697f, 5.2901f, 15.0297f, 8.1601f)
            }
        }
        .build()
        return _arrowup2!!
    }

private var _arrowup2: ImageVector? = null

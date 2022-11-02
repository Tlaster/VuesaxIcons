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

public val TwotoneGroup.Arrowup3: ImageVector
    get() {
        if (_arrowup3 != null) {
            return _arrowup3!!
        }
        _arrowup3 = Builder(name = "Arrowup3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9997f, 17.9998f)
                horizontalLineTo(9.3297f)
                curveTo(6.0197f, 17.9998f, 4.6597f, 15.6498f, 6.3197f, 12.7798f)
                lineTo(7.6597f, 10.4698f)
                lineTo(8.9997f, 8.1598f)
                curveTo(10.6597f, 5.2898f, 13.3697f, 5.2898f, 15.0297f, 8.1598f)
                lineTo(16.3697f, 10.4698f)
                lineTo(17.7097f, 12.7798f)
                curveTo(19.3697f, 15.6498f, 18.0097f, 17.9998f, 14.6997f, 17.9998f)
                horizontalLineTo(11.9997f)
                close()
            }
        }
        .build()
        return _arrowup3!!
    }

private var _arrowup3: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Timer1: ImageVector
    get() {
        if (_timer1 != null) {
            return _timer1!!
        }
        _timer1 = Builder(name = "Timer1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.24f, 2.0f)
                horizontalLineTo(8.76f)
                curveTo(5.0f, 2.0f, 4.71f, 5.38f, 6.74f, 7.22f)
                lineTo(17.26f, 16.78f)
                curveTo(19.29f, 18.62f, 19.0f, 22.0f, 15.24f, 22.0f)
                horizontalLineTo(8.76f)
                curveTo(5.0f, 22.0f, 4.71f, 18.62f, 6.74f, 16.78f)
                lineTo(17.26f, 7.22f)
                curveTo(19.29f, 5.38f, 19.0f, 2.0f, 15.24f, 2.0f)
                close()
            }
        }
        .build()
        return _timer1!!
    }

private var _timer1: ImageVector? = null

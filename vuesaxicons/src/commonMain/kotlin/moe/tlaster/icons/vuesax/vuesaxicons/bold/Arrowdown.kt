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

public val BoldGroup.Arrowdown: ImageVector
    get() {
        if (_arrowdown != null) {
            return _arrowdown!!
        }
        _arrowdown = Builder(name = "Arrowdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9188f, 8.1797f)
                horizontalLineTo(11.6888f)
                horizontalLineTo(6.0788f)
                curveTo(5.1188f, 8.1797f, 4.6388f, 9.3397f, 5.3188f, 10.0197f)
                lineTo(10.4988f, 15.1997f)
                curveTo(11.3288f, 16.0297f, 12.6788f, 16.0297f, 13.5088f, 15.1997f)
                lineTo(15.4788f, 13.2297f)
                lineTo(18.6888f, 10.0197f)
                curveTo(19.3588f, 9.3397f, 18.8788f, 8.1797f, 17.9188f, 8.1797f)
                close()
            }
        }
        .build()
        return _arrowdown!!
    }

private var _arrowdown: ImageVector? = null

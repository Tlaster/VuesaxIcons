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

public val LinearGroup.Arrowup: ImageVector
    get() {
        if (_arrowup != null) {
            return _arrowup!!
        }
        _arrowup = Builder(name = "Arrowup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0001f)
                horizontalLineTo(9.33f)
                curveTo(6.0201f, 18.0001f, 4.66f, 15.6501f, 6.32f, 12.7801f)
                lineTo(7.66f, 10.4701f)
                lineTo(9.0f, 8.1601f)
                curveTo(10.66f, 5.2901f, 13.37f, 5.2901f, 15.03f, 8.1601f)
                lineTo(16.37f, 10.4701f)
                lineTo(17.71f, 12.7801f)
                curveTo(19.37f, 15.6501f, 18.01f, 18.0001f, 14.7f, 18.0001f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _arrowup!!
    }

private var _arrowup: ImageVector? = null

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

public val BrokenGroup.Arrowbottom: ImageVector
    get() {
        if (_arrowbottom != null) {
            return _arrowbottom!!
        }
        _arrowbottom = Builder(name = "Arrowbottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.3092f, 11.22f)
                curveTo(4.6592f, 8.35f, 6.0092f, 6.0f, 9.3292f, 6.0f)
                horizontalLineTo(11.9992f)
                horizontalLineTo(14.6692f)
                curveTo(17.9792f, 6.0f, 19.3392f, 8.35f, 17.6792f, 11.22f)
                lineTo(16.3392f, 13.53f)
                lineTo(14.9992f, 15.84f)
                curveTo(13.3392f, 18.71f, 10.6292f, 18.71f, 8.9692f, 15.84f)
            }
        }
        .build()
        return _arrowbottom!!
    }

private var _arrowbottom: ImageVector? = null

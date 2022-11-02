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

public val TwotoneGroup.Arrowbottom: ImageVector
    get() {
        if (_arrowbottom != null) {
            return _arrowbottom!!
        }
        _arrowbottom = Builder(name = "Arrowbottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0005f, 6.0f)
                horizontalLineTo(14.6705f)
                curveTo(17.9805f, 6.0f, 19.3405f, 8.35f, 17.6805f, 11.22f)
                lineTo(16.3405f, 13.53f)
                lineTo(15.0005f, 15.84f)
                curveTo(13.3405f, 18.71f, 10.6305f, 18.71f, 8.9705f, 15.84f)
                lineTo(7.6305f, 13.53f)
                lineTo(6.2905f, 11.22f)
                curveTo(4.6605f, 8.35f, 6.0105f, 6.0f, 9.3305f, 6.0f)
                horizontalLineTo(12.0005f)
                close()
            }
        }
        .build()
        return _arrowbottom!!
    }

private var _arrowbottom: ImageVector? = null

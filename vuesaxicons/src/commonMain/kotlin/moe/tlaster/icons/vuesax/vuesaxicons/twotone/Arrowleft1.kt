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

public val TwotoneGroup.Arrowleft1: ImageVector
    get() {
        if (_arrowleft1 != null) {
            return _arrowleft1!!
        }
        _arrowleft1 = Builder(name = "Arrowleft1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9998f, 19.9201f)
                lineTo(8.4798f, 13.4001f)
                curveTo(7.7098f, 12.6301f, 7.7098f, 11.3701f, 8.4798f, 10.6001f)
                lineTo(14.9998f, 4.0801f)
            }
        }
        .build()
        return _arrowleft1!!
    }

private var _arrowleft1: ImageVector? = null

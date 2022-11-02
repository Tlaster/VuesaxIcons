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

public val LinearGroup.Arrowleft3: ImageVector
    get() {
        if (_arrowleft3 != null) {
            return _arrowleft3!!
        }
        _arrowleft3 = Builder(name = "Arrowleft3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9999f, 12.0001f)
                verticalLineTo(14.6701f)
                curveTo(17.9999f, 17.9801f, 15.6499f, 19.3401f, 12.7799f, 17.6801f)
                lineTo(10.4699f, 16.3401f)
                lineTo(8.16f, 15.0001f)
                curveTo(5.2899f, 13.3401f, 5.2899f, 10.6301f, 8.16f, 8.97f)
                lineTo(10.4699f, 7.6301f)
                lineTo(12.7799f, 6.2901f)
                curveTo(15.6499f, 4.66f, 17.9999f, 6.01f, 17.9999f, 9.3301f)
                verticalLineTo(12.0001f)
                close()
            }
        }
        .build()
        return _arrowleft3!!
    }

private var _arrowleft3: ImageVector? = null

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

public val LinearGroup.Directdown: ImageVector
    get() {
        if (_directdown != null) {
            return _directdown!!
        }
        _directdown = Builder(name = "Directdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.17f, 19.2899f)
                lineTo(3.0701f, 7.6999f)
                curveTo(1.62f, 4.9499f, 4.55f, 1.9599f, 7.33f, 3.3499f)
                lineTo(10.57f, 4.9699f)
                curveTo(11.47f, 5.4199f, 12.53f, 5.4199f, 13.43f, 4.9699f)
                lineTo(16.67f, 3.3499f)
                curveTo(19.45f, 1.9599f, 22.37f, 4.9499f, 20.93f, 7.6999f)
                lineTo(14.83f, 19.2899f)
                curveTo(13.63f, 21.5699f, 10.37f, 21.5699f, 9.17f, 19.2899f)
                close()
            }
        }
        .build()
        return _directdown!!
    }

private var _directdown: ImageVector? = null

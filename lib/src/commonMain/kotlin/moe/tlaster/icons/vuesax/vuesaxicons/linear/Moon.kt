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

public val LinearGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0301f, 12.42f)
                curveTo(2.3901f, 17.57f, 6.7601f, 21.76f, 11.9901f, 21.99f)
                curveTo(15.6801f, 22.15f, 18.9801f, 20.43f, 20.9601f, 17.72f)
                curveTo(21.7801f, 16.61f, 21.3401f, 15.87f, 19.9701f, 16.12f)
                curveTo(19.3001f, 16.24f, 18.6101f, 16.29f, 17.8901f, 16.26f)
                curveTo(13.0001f, 16.06f, 9.0001f, 11.97f, 8.9801f, 7.14f)
                curveTo(8.9701f, 5.84f, 9.2401f, 4.61f, 9.7301f, 3.49f)
                curveTo(10.2701f, 2.25f, 9.6201f, 1.66f, 8.3701f, 2.19f)
                curveTo(4.4101f, 3.86f, 1.7001f, 7.85f, 2.0301f, 12.42f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

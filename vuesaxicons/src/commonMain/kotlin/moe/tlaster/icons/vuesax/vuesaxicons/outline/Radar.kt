package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(name = "Radar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.7502f)
                curveTo(6.07f, 22.7502f, 1.25f, 17.9302f, 1.25f, 12.0002f)
                curveTo(1.25f, 10.1202f, 1.74f, 8.2703f, 2.68f, 6.6403f)
                curveTo(2.89f, 6.2803f, 3.34f, 6.1602f, 3.7f, 6.3602f)
                lineTo(12.37f, 11.3402f)
                curveTo(12.73f, 11.5502f, 12.85f, 12.0002f, 12.65f, 12.3602f)
                curveTo(12.44f, 12.7202f, 11.99f, 12.8403f, 11.63f, 12.6403f)
                lineTo(3.63f, 8.0502f)
                curveTo(3.05f, 9.2802f, 2.75f, 10.6202f, 2.75f, 11.9902f)
                curveTo(2.75f, 17.0902f, 6.9f, 21.2402f, 12.0f, 21.2402f)
                curveTo(17.1f, 21.2402f, 21.25f, 17.0902f, 21.25f, 11.9902f)
                curveTo(21.25f, 6.8902f, 17.1f, 2.7402f, 12.0f, 2.7402f)
                curveTo(9.98f, 2.7402f, 8.06f, 3.3802f, 6.45f, 4.5902f)
                curveTo(6.12f, 4.8402f, 5.65f, 4.7702f, 5.4f, 4.4402f)
                curveTo(5.15f, 4.1102f, 5.22f, 3.6403f, 5.55f, 3.3903f)
                curveTo(7.42f, 1.9903f, 9.65f, 1.2402f, 12.0f, 1.2402f)
                curveTo(17.93f, 1.2402f, 22.75f, 6.0602f, 22.75f, 11.9902f)
                curveTo(22.75f, 17.9202f, 17.93f, 22.7502f, 12.0f, 22.7502f)
                close()
            }
        }
        .build()
        return _radar!!
    }

private var _radar: ImageVector? = null

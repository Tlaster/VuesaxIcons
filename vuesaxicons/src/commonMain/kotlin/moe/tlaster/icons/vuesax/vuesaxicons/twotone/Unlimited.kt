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

public val TwotoneGroup.Unlimited: ImageVector
    get() {
        if (_unlimited != null) {
            return _unlimited!!
        }
        _unlimited = Builder(name = "Unlimited", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.1802f, 9.3202f)
                curveTo(9.3602f, 8.1902f, 8.0503f, 7.4502f, 6.5402f, 7.4502f)
                curveTo(4.0303f, 7.4502f, 1.9902f, 9.4902f, 1.9902f, 12.0002f)
                curveTo(1.9902f, 14.5102f, 4.0303f, 16.5502f, 6.5402f, 16.5502f)
                curveTo(8.2303f, 16.5502f, 9.8003f, 15.6602f, 10.6703f, 14.2102f)
                lineTo(12.0002f, 12.0002f)
                lineTo(13.3203f, 9.7902f)
                curveTo(14.1903f, 8.3402f, 15.7603f, 7.4502f, 17.4503f, 7.4502f)
                curveTo(19.9603f, 7.4502f, 22.0002f, 9.4902f, 22.0002f, 12.0002f)
                curveTo(22.0002f, 14.5102f, 19.9603f, 16.5502f, 17.4503f, 16.5502f)
                curveTo(15.9503f, 16.5502f, 14.6402f, 15.8102f, 13.8102f, 14.6802f)
            }
        }
        .build()
        return _unlimited!!
    }

private var _unlimited: ImageVector? = null

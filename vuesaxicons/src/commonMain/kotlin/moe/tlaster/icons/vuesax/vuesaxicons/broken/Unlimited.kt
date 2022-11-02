package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Unlimited: ImageVector
    get() {
        if (_unlimited != null) {
            return _unlimited!!
        }
        _unlimited = Builder(name = "Unlimited", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0003f, 15.77f)
                curveTo(19.2703f, 16.26f, 18.4003f, 16.5499f, 17.4603f, 16.5499f)
                curveTo(15.9603f, 16.5499f, 14.6503f, 15.8099f, 13.8203f, 14.6799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.1802f, 9.32f)
                curveTo(9.3602f, 8.1899f, 8.0503f, 7.45f, 6.5402f, 7.45f)
                curveTo(4.0303f, 7.45f, 1.9902f, 9.4899f, 1.9902f, 11.9999f)
                curveTo(1.9902f, 14.5099f, 4.0303f, 16.5499f, 6.5402f, 16.5499f)
                curveTo(8.2303f, 16.5499f, 9.8003f, 15.66f, 10.6703f, 14.21f)
                lineTo(12.0002f, 11.9999f)
                lineTo(13.3203f, 9.7899f)
                curveTo(14.1903f, 8.3399f, 15.7603f, 7.45f, 17.4503f, 7.45f)
                curveTo(19.9603f, 7.45f, 22.0002f, 9.4899f, 22.0002f, 11.9999f)
            }
        }
        .build()
        return _unlimited!!
    }

private var _unlimited: ImageVector? = null

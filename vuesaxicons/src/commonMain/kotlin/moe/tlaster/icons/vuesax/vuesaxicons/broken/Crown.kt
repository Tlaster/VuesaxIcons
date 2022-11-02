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

public val BrokenGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0992f, 5.6901f)
                curveTo(21.6592f, 4.5701f, 22.4092f, 5.1401f, 21.7692f, 6.9501f)
                lineTo(17.7292f, 18.2601f)
                curveTo(17.5892f, 18.6601f, 17.1192f, 18.9901f, 16.6992f, 18.9901f)
                horizontalLineTo(7.2992f)
                curveTo(6.8792f, 18.9901f, 6.4092f, 18.6601f, 6.2692f, 18.2601f)
                lineTo(2.1292f, 6.6701f)
                curveTo(1.5392f, 5.0101f, 2.2292f, 4.5001f, 3.6492f, 5.5201f)
                lineTo(7.5492f, 8.3101f)
                curveTo(8.1992f, 8.7601f, 8.9392f, 8.5301f, 9.2192f, 7.8001f)
                lineTo(10.9792f, 3.1101f)
                curveTo(11.5392f, 1.6101f, 12.4692f, 1.6101f, 13.0292f, 3.1101f)
                lineTo(14.7892f, 7.8001f)
                curveTo(15.0692f, 8.5301f, 15.8092f, 8.7601f, 16.4492f, 8.3101f)
                lineTo(17.0792f, 7.8601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 22.0f)
                horizontalLineTo(17.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 14.0f)
                horizontalLineTo(14.5f)
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null

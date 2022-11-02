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

public val BrokenGroup.Lampcharge: ImageVector
    get() {
        if (_lampcharge != null) {
            return _lampcharge!!
        }
        _lampcharge = Builder(name = "Lampcharge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0694f, 6.2702f)
                curveTo(21.1594f, 10.4702f, 18.9594f, 14.9302f, 15.7294f, 16.8802f)
                verticalLineTo(18.0402f)
                curveTo(15.7294f, 18.3302f, 15.8394f, 19.0002f, 14.7694f, 19.0002f)
                horizontalLineTo(9.2594f)
                curveTo(8.1594f, 19.0002f, 8.2994f, 18.5702f, 8.2994f, 18.0402f)
                verticalLineTo(16.8802f)
                curveTo(5.9994f, 15.4902f, 4.1094f, 12.7802f, 4.1094f, 9.9002f)
                curveTo(4.1094f, 4.9502f, 8.6594f, 1.0702f, 13.7994f, 2.1902f)
                curveTo(14.5494f, 2.3602f, 15.2794f, 2.6302f, 15.9394f, 3.0002f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 7.8901f)
                lineTo(10.9301f, 9.7501f)
                curveTo(10.6901f, 10.1601f, 10.8901f, 10.5001f, 11.3601f, 10.5001f)
                horizontalLineTo(12.6301f)
                curveTo(13.1101f, 10.5001f, 13.3001f, 10.8401f, 13.0601f, 11.2501f)
                lineTo(12.0001f, 13.1101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 22.0f)
                curveTo(10.79f, 21.35f, 13.21f, 21.35f, 15.5f, 22.0f)
            }
        }
        .build()
        return _lampcharge!!
    }

private var _lampcharge: ImageVector? = null

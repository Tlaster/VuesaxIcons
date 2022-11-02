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

public val BrokenGroup.Edit2: ImageVector
    get() {
        if (_edit2 != null) {
            return _edit2!!
        }
        _edit2 = Builder(name = "Edit2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.3694f, 10.1699f)
                lineTo(18.7094f, 8.7499f)
                curveTo(20.1294f, 7.2499f, 20.7694f, 5.5399f, 18.5594f, 3.4499f)
                curveTo(16.3494f, 1.3699f, 14.6794f, 2.0999f, 13.2594f, 3.5999f)
                lineTo(5.0494f, 12.2899f)
                curveTo(4.7394f, 12.6199f, 4.4394f, 13.2699f, 4.3794f, 13.7199f)
                lineTo(4.0094f, 16.9599f)
                curveTo(3.8794f, 18.1299f, 4.7194f, 18.9299f, 5.8794f, 18.7299f)
                lineTo(9.0994f, 18.1799f)
                curveTo(9.5494f, 18.0999f, 10.1794f, 17.7699f, 10.4894f, 17.4299f)
                lineTo(14.4394f, 13.2499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.8906f, 5.05f)
                curveTo(12.3206f, 7.8101f, 14.5606f, 9.92f, 17.3406f, 10.2f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 22.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                horizontalLineTo(21.0f)
            }
        }
        .build()
        return _edit2!!
    }

private var _edit2: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Routing2: ImageVector
    get() {
        if (_routing2 != null) {
            return _routing2!!
        }
        _routing2 = Builder(name = "Routing2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4707f, 9.0f)
                curveTo(7.4037f, 9.0f, 8.9707f, 7.433f, 8.9707f, 5.5f)
                curveTo(8.9707f, 3.567f, 7.4037f, 2.0f, 5.4707f, 2.0f)
                curveTo(3.5377f, 2.0f, 1.9707f, 3.567f, 1.9707f, 5.5f)
                curveTo(1.9707f, 7.433f, 3.5377f, 9.0f, 5.4707f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9707f, 22.0f)
                horizontalLineTo(16.9707f)
                curveTo(15.8707f, 22.0f, 14.9707f, 21.1f, 14.9707f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(14.9707f, 15.9f, 15.8707f, 15.0f, 16.9707f, 15.0f)
                horizontalLineTo(19.9707f)
                curveTo(21.0707f, 15.0f, 21.9707f, 15.9f, 21.9707f, 17.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0017f, 5.0f)
                horizontalLineTo(14.6817f)
                curveTo(16.5317f, 5.0f, 17.3917f, 7.29f, 16.0017f, 8.51f)
                lineTo(8.0117f, 15.5f)
                curveTo(6.6217f, 16.71f, 7.4816f, 19.0f, 9.3216f, 19.0f)
                horizontalLineTo(12.0017f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4877f, 5.5f)
                horizontalLineTo(5.4992f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4877f, 18.5f)
                horizontalLineTo(18.4992f)
            }
        }
        .build()
        return _routing2!!
    }

private var _routing2: ImageVector? = null

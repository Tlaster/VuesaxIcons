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

public val BrokenGroup.Quotedown: ImageVector
    get() {
        if (_quotedown != null) {
            return _quotedown!!
        }
        _quotedown = Builder(name = "Quotedown", defaultWidth = 47.0.dp, defaultHeight = 46.0.dp,
                viewportWidth = 47.0f, viewportHeight = 46.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.63f, 3.8599f)
                curveTo(12.63f, 2.4399f, 13.68f, 1.28f, 15.21f, 1.28f)
                lineTo(18.42f, 1.28f)
                curveTo(19.84f, 1.28f, 21.0f, 2.4399f, 21.0f, 3.8599f)
                lineTo(21.0f, 9.6599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.6499f)
                lineTo(15.2f, 9.6499f)
                curveTo(14.24f, 9.6499f, 13.48f, 9.1999f, 13.04f, 8.5099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.65f)
                curveTo(21.0f, 15.7f, 19.87f, 16.7f, 16.47f, 18.72f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.3709f, 9.6499f)
                lineTo(3.5709f, 9.6499f)
                curveTo(2.0409f, 9.6499f, 0.9909f, 8.4899f, 0.9909f, 7.0699f)
                lineTo(0.9909f, 3.8498f)
                curveTo(0.9909f, 2.4299f, 2.0409f, 1.2699f, 3.5709f, 1.2699f)
                lineTo(6.8009f, 1.2699f)
                curveTo(8.2209f, 1.2699f, 9.3809f, 2.4299f, 9.3809f, 3.8498f)
                lineTo(9.3809f, 9.6499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.3711f, 9.65f)
                curveTo(9.3711f, 15.7f, 8.2411f, 16.7f, 4.8411f, 18.72f)
            }
        }
        .build()
        return _quotedown!!
    }

private var _quotedown: ImageVector? = null

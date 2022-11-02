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

public val BrokenGroup.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0401f, 4.52f)
                lineTo(11.8301f, 6.0f)
                lineTo(15.0301f, 10.78f)
                lineTo(20.6901f, 6.99f)
                curveTo(21.2601f, 6.61f, 21.4101f, 5.83f, 21.0301f, 5.27f)
                lineTo(19.2101f, 2.56f)
                curveTo(18.8301f, 1.99f, 18.0501f, 1.84f, 17.4901f, 2.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1742f, 6.4793f)
                lineTo(7.3965f, 9.6792f)
                lineTo(9.9564f, 13.5013f)
                lineTo(14.7341f, 10.3015f)
                lineTo(12.1742f, 6.4793f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8305f, 15.8999f)
                lineTo(9.7805f, 13.2599f)
                lineTo(7.5405f, 9.9199f)
                lineTo(3.5905f, 12.5599f)
                curveTo(3.1305f, 12.8699f, 3.0105f, 13.4899f, 3.3205f, 13.9499f)
                lineTo(4.4505f, 15.6299f)
                curveTo(4.7505f, 16.0799f, 5.3705f, 16.1999f, 5.8305f, 15.8999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0506f, 12.2f)
                lineTo(7.5606f, 21.9999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.2f)
                lineTo(16.44f, 21.9999f)
            }
        }
        .build()
        return _microscope!!
    }

private var _microscope: ImageVector? = null

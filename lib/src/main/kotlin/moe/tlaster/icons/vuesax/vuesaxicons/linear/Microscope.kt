package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0301f, 10.77f)
                lineTo(20.6901f, 6.98f)
                curveTo(21.2601f, 6.6f, 21.4101f, 5.82f, 21.0301f, 5.26f)
                lineTo(19.2101f, 2.55f)
                curveTo(18.8301f, 1.98f, 18.0501f, 1.83f, 17.4901f, 2.21f)
                lineTo(11.8301f, 6.0f)
                lineTo(15.0301f, 10.77f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.1739f, 6.4792f)
                lineTo(7.3962f, 9.6791f)
                lineTo(9.9561f, 13.5012f)
                lineTo(14.7338f, 10.3013f)
                lineTo(12.1739f, 6.4792f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.83f, 15.8999f)
                lineTo(9.78f, 13.2599f)
                lineTo(7.54f, 9.9199f)
                lineTo(3.59f, 12.5599f)
                curveTo(3.13f, 12.8699f, 3.01f, 13.4899f, 3.32f, 13.9499f)
                lineTo(4.45f, 15.6299f)
                curveTo(4.75f, 16.0799f, 5.37f, 16.1999f, 5.83f, 15.8999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0501f, 12.2f)
                lineTo(7.5601f, 21.9999f)
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

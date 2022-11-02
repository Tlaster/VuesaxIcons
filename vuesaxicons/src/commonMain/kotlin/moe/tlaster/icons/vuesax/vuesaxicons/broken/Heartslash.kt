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

public val BrokenGroup.Heartslash: ImageVector
    get() {
        if (_heartslash != null) {
            return _heartslash!!
        }
        _heartslash = Builder(name = "Heartslash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5606f, 3.1f)
                curveTo(9.3806f, 3.1f, 10.9905f, 3.98f, 12.0005f, 5.34f)
                curveTo(13.0105f, 3.98f, 14.6306f, 3.1f, 16.4406f, 3.1f)
                curveTo(17.5906f, 3.1f, 18.6605f, 3.45f, 19.5505f, 4.06f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.11f, 17.5f)
                curveTo(3.9f, 15.43f, 2.0f, 12.48f, 2.0f, 8.68f)
                curveTo(2.0f, 7.14f, 2.62f, 5.74f, 3.63f, 4.73f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.7395f, 7.0f)
                curveTo(21.9095f, 7.53f, 21.9995f, 8.1f, 21.9995f, 8.69f)
                curveTo(21.9995f, 15.69f, 15.5195f, 19.82f, 12.6195f, 20.82f)
                curveTo(12.2795f, 20.94f, 11.7195f, 20.94f, 11.3795f, 20.82f)
                curveTo(10.7295f, 20.6f, 9.9095f, 20.22f, 9.0195f, 19.69f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return _heartslash!!
    }

private var _heartslash: ImageVector? = null

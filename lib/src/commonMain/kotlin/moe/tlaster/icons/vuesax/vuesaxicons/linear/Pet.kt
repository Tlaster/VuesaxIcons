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

public val LinearGroup.Pet: ImageVector
    get() {
        if (_pet != null) {
            return _pet!!
        }
        _pet = Builder(name = "Pet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.41f, 16.75f)
                curveTo(4.17f, 19.64f, 6.35f, 22.0f, 9.25f, 22.0f)
                horizontalLineTo(14.04f)
                curveTo(17.3f, 22.0f, 19.54f, 19.37f, 19.0f, 16.15f)
                curveTo(18.43f, 12.77f, 15.17f, 10.0f, 11.74f, 10.0f)
                curveTo(8.02f, 10.0f, 4.72f, 13.04f, 4.41f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.47f, 7.5f)
                curveTo(11.8507f, 7.5f, 12.97f, 6.3807f, 12.97f, 5.0f)
                curveTo(12.97f, 3.6193f, 11.8507f, 2.5f, 10.47f, 2.5f)
                curveTo(9.0893f, 2.5f, 7.97f, 3.6193f, 7.97f, 5.0f)
                curveTo(7.97f, 6.3807f, 9.0893f, 7.5f, 10.47f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.3f, 8.7f)
                curveTo(18.4046f, 8.7f, 19.3f, 7.8045f, 19.3f, 6.7f)
                curveTo(19.3f, 5.5954f, 18.4046f, 4.7f, 17.3f, 4.7f)
                curveTo(16.1955f, 4.7f, 15.3f, 5.5954f, 15.3f, 6.7f)
                curveTo(15.3f, 7.8045f, 16.1955f, 8.7f, 17.3f, 8.7f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 12.7f)
                curveTo(21.8284f, 12.7f, 22.5f, 12.0284f, 22.5f, 11.2f)
                curveTo(22.5f, 10.3715f, 21.8284f, 9.7f, 21.0f, 9.7f)
                curveTo(20.1716f, 9.7f, 19.5f, 10.3715f, 19.5f, 11.2f)
                curveTo(19.5f, 12.0284f, 20.1716f, 12.7f, 21.0f, 12.7f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.97f, 10.7f)
                curveTo(5.0745f, 10.7f, 5.97f, 9.8045f, 5.97f, 8.7f)
                curveTo(5.97f, 7.5954f, 5.0745f, 6.7f, 3.97f, 6.7f)
                curveTo(2.8654f, 6.7f, 1.97f, 7.5954f, 1.97f, 8.7f)
                curveTo(1.97f, 9.8045f, 2.8654f, 10.7f, 3.97f, 10.7f)
                close()
            }
        }
        .build()
        return _pet!!
    }

private var _pet: ImageVector? = null

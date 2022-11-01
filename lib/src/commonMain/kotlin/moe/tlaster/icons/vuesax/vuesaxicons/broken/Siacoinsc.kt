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

public val BrokenGroup.Siacoinsc: ImageVector
    get() {
        if (_siacoinsc != null) {
            return _siacoinsc!!
        }
        _siacoinsc = Builder(name = "Siacoinsc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3f, 21.03f)
                curveTo(15.0f, 21.65f, 13.54f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 10.59f, 2.29f, 9.24f, 2.82f, 8.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9707f, 2.84f)
                curveTo(9.2007f, 2.3f, 10.5607f, 2.0f, 12.0007f, 2.0f)
                curveTo(17.5207f, 2.0f, 22.0007f, 6.48f, 22.0007f, 12.0f)
                curveTo(22.0007f, 14.29f, 21.2307f, 16.4f, 19.9407f, 18.08f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.25f)
                verticalLineTo(12.0f)
                curveTo(16.0f, 9.65f, 14.1f, 7.75f, 11.75f, 7.75f)
                curveTo(9.4f, 7.75f, 7.5f, 9.65f, 7.5f, 12.0f)
                curveTo(7.5f, 14.35f, 9.4f, 16.25f, 11.75f, 16.25f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 6.5f)
                curveTo(5.8284f, 6.5f, 6.5f, 5.8284f, 6.5f, 5.0f)
                curveTo(6.5f, 4.1716f, 5.8284f, 3.5f, 5.0f, 3.5f)
                curveTo(4.1716f, 3.5f, 3.5f, 4.1716f, 3.5f, 5.0f)
                curveTo(3.5f, 5.8284f, 4.1716f, 6.5f, 5.0f, 6.5f)
                close()
            }
        }
        .build()
        return _siacoinsc!!
    }

private var _siacoinsc: ImageVector? = null

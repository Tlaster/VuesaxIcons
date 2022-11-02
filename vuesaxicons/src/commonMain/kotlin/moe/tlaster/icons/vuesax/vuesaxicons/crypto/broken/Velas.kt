package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Velas: ImageVector
    get() {
        if (_velas != null) {
            return _velas!!
        }
        _velas = Builder(name = "Velas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.03f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.6994f, 9.0001f)
                lineTo(3.1094f, 8.0701f)
                curveTo(2.6294f, 7.3301f, 3.1694f, 6.3601f, 4.0394f, 6.3601f)
                horizontalLineTo(19.9694f)
                curveTo(20.8494f, 6.3601f, 21.3794f, 7.3301f, 20.8994f, 8.0701f)
                lineTo(12.9394f, 20.4601f)
                curveTo(12.4994f, 21.1401f, 11.5094f, 21.1401f, 11.0694f, 20.4601f)
                lineTo(5.8094f, 12.2801f)
            }
        }
        .build()
        return _velas!!
    }

private var _velas: ImageVector? = null

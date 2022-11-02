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

public val BrokenGroup.Okb: ImageVector
    get() {
        if (_okb != null) {
            return _okb!!
        }
        _okb = Builder(name = "Okb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                curveTo(19.7614f, 17.0f, 22.0f, 14.7614f, 22.0f, 12.0f)
                curveTo(22.0f, 9.2386f, 19.7614f, 7.0f, 17.0f, 7.0f)
                curveTo(14.2386f, 7.0f, 12.0f, 9.2386f, 12.0f, 12.0f)
                curveTo(12.0f, 14.7614f, 14.2386f, 17.0f, 17.0f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(14.7614f, 22.0f, 17.0f, 19.7614f, 17.0f, 17.0f)
                curveTo(17.0f, 14.2386f, 14.7614f, 12.0f, 12.0f, 12.0f)
                curveTo(9.2386f, 12.0f, 7.0f, 14.2386f, 7.0f, 17.0f)
                curveTo(7.0f, 19.7614f, 9.2386f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.81f, 9.27f)
                curveTo(2.3f, 10.06f, 2.0f, 10.99f, 2.0f, 12.0f)
                curveTo(2.0f, 14.76f, 4.24f, 17.0f, 7.0f, 17.0f)
                curveTo(9.76f, 17.0f, 12.0f, 14.76f, 12.0f, 12.0f)
                curveTo(12.0f, 9.24f, 9.76f, 7.0f, 7.0f, 7.0f)
                curveTo(6.65f, 7.0f, 6.32f, 7.03f, 5.99f, 7.1f)
            }
        }
        .build()
        return _okb!!
    }

private var _okb: ImageVector? = null

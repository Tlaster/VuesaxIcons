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

public val BrokenGroup.Mousecircle: ImageVector
    get() {
        if (_mousecircle != null) {
            return _mousecircle!!
        }
        _mousecircle = Builder(name = "Mousecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9597f, 17.84f)
                lineTo(19.3297f, 18.39f)
                curveTo(18.8797f, 18.54f, 18.5197f, 18.89f, 18.3697f, 19.35f)
                lineTo(17.8197f, 20.98f)
                curveTo(17.3497f, 22.39f, 15.3697f, 22.36f, 14.9297f, 20.95f)
                lineTo(13.0797f, 15.0f)
                curveTo(12.7197f, 13.82f, 13.8097f, 12.72f, 14.9797f, 13.09f)
                lineTo(20.9397f, 14.94f)
                curveTo(22.3397f, 15.38f, 22.3597f, 17.37f, 20.9597f, 17.84f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.98f, 6.03f)
                curveTo(2.74f, 7.7f, 2.0f, 9.76f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9998f, 12.0f)
                curveTo(21.9998f, 6.48f, 17.5198f, 2.0f, 11.9998f, 2.0f)
                curveTo(10.4798f, 2.0f, 9.0498f, 2.34f, 7.7598f, 2.94f)
            }
        }
        .build()
        return _mousecircle!!
    }

private var _mousecircle: ImageVector? = null

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

public val BrokenGroup.Avalancheavax: ImageVector
    get() {
        if (_avalancheavax != null) {
            return _avalancheavax!!
        }
        _avalancheavax = Builder(name = "Avalancheavax", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0603f, 15.58f)
                lineTo(11.6703f, 5.97f)
                curveTo(11.8303f, 5.6899f, 12.2303f, 5.67f, 12.4203f, 5.93f)
                lineTo(13.9803f, 8.0199f)
                curveTo(14.4303f, 8.62f, 14.4603f, 9.4299f, 14.0703f, 10.0699f)
                lineTo(10.7303f, 15.4199f)
                curveTo(10.4003f, 15.9499f, 9.8203f, 16.2699f, 9.1903f, 16.2699f)
                horizontalLineTo(6.4503f)
                curveTo(6.1003f, 16.2599f, 5.8803f, 15.88f, 6.0603f, 15.58f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2401f, 12.3701f)
                lineTo(13.3201f, 15.5701f)
                curveTo(13.1401f, 15.8701f, 13.3601f, 16.2601f, 13.7101f, 16.2601f)
                horizontalLineTo(17.5501f)
                curveTo(17.9001f, 16.2601f, 18.1201f, 15.8801f, 17.9401f, 15.5701f)
                lineTo(16.0201f, 12.3701f)
                curveTo(15.8501f, 12.0801f, 15.4201f, 12.0801f, 15.2401f, 12.3701f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _avalancheavax!!
    }

private var _avalancheavax: ImageVector? = null

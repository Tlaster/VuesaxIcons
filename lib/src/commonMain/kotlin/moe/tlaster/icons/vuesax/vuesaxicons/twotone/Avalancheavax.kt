package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Avalancheavax: ImageVector
    get() {
        if (_avalancheavax != null) {
            return _avalancheavax!!
        }
        _avalancheavax = Builder(name = "Avalancheavax", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0603f, 15.5802f)
                lineTo(11.6703f, 5.9702f)
                curveTo(11.8303f, 5.6902f, 12.2303f, 5.6702f, 12.4203f, 5.9302f)
                lineTo(13.9803f, 8.0202f)
                curveTo(14.4303f, 8.6202f, 14.4603f, 9.4302f, 14.0703f, 10.0702f)
                lineTo(10.7303f, 15.4202f)
                curveTo(10.4003f, 15.9502f, 9.8203f, 16.2702f, 9.1903f, 16.2702f)
                horizontalLineTo(6.4503f)
                curveTo(6.1003f, 16.2602f, 5.8803f, 15.8802f, 6.0603f, 15.5802f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2401f, 12.3698f)
                lineTo(13.3201f, 15.5698f)
                curveTo(13.1401f, 15.8698f, 13.3601f, 16.2598f, 13.7101f, 16.2598f)
                horizontalLineTo(17.5501f)
                curveTo(17.9001f, 16.2598f, 18.1201f, 15.8798f, 17.9401f, 15.5698f)
                lineTo(16.0201f, 12.3698f)
                curveTo(15.8501f, 12.0798f, 15.4201f, 12.0798f, 15.2401f, 12.3698f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _avalancheavax!!
    }

private var _avalancheavax: ImageVector? = null

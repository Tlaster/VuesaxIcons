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

public val BrokenGroup.Cloudlightning: ImageVector
    get() {
        if (_cloudlightning != null) {
            return _cloudlightning!!
        }
        _cloudlightning = Builder(name = "Cloudlightning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.2291f, 19.1601f)
                horizontalLineTo(10.2291f)
                verticalLineTo(21.4901f)
                curveTo(10.2291f, 21.8301f, 10.6591f, 22.0001f, 10.8791f, 21.7401f)
                lineTo(13.3291f, 18.9501f)
                curveTo(13.6291f, 18.6101f, 13.4991f, 18.3301f, 13.0491f, 18.3301f)
                horizontalLineTo(12.0491f)
                verticalLineTo(16.0001f)
                curveTo(12.0491f, 15.6601f, 11.6191f, 15.4901f, 11.3991f, 15.7501f)
                lineTo(8.9491f, 18.5401f)
                curveTo(8.6491f, 18.8801f, 8.7791f, 19.1601f, 9.2291f, 19.1601f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 3.9801f)
                curveTo(8.0101f, 3.6401f, 3.6601f, 7.0901f, 5.6201f, 12.5601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.6109f, 20.0f)
                curveTo(17.9509f, 20.01f, 19.2409f, 19.51f, 20.2309f, 18.61f)
                curveTo(23.5009f, 15.75f, 21.7509f, 10.01f, 17.4409f, 9.47f)
                curveTo(17.2009f, 8.02f, 16.6709f, 6.88f, 15.9609f, 6.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2794f, 12.9701f)
                curveTo(6.7494f, 12.7001f, 6.1594f, 12.5601f, 5.5694f, 12.5701f)
                curveTo(0.9094f, 12.9001f, 0.9194f, 19.6801f, 5.5694f, 20.0101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8203f, 9.89f)
                curveTo(16.3403f, 9.63f, 16.9003f, 9.49f, 17.4803f, 9.48f)
            }
        }
        .build()
        return _cloudlightning!!
    }

private var _cloudlightning: ImageVector? = null

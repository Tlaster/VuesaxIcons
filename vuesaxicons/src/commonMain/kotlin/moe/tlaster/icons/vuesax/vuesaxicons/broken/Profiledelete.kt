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

public val BrokenGroup.Profiledelete: ImageVector
    get() {
        if (_profiledelete != null) {
            return _profiledelete!!
        }
        _profiledelete = Builder(name = "Profiledelete", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4098f, 18.0901f)
                lineTo(15.5898f, 20.9101f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4098f, 20.9101f)
                lineTo(15.5898f, 18.0901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0008f, 21.8099f)
                curveTo(10.1808f, 21.8099f, 8.3708f, 21.3499f, 6.9908f, 20.4299f)
                curveTo(4.5708f, 18.8099f, 4.5708f, 16.1699f, 6.9908f, 14.5599f)
                curveTo(9.7408f, 12.7199f, 14.2508f, 12.7199f, 17.0008f, 14.5599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.6805f, 3.96f)
                curveTo(16.1605f, 4.67f, 16.4405f, 5.52f, 16.4405f, 6.44f)
                curveTo(16.4305f, 8.84f, 14.5405f, 10.79f, 12.1605f, 10.87f)
                curveTo(12.0605f, 10.86f, 11.9405f, 10.86f, 11.8305f, 10.87f)
                curveTo(9.4506f, 10.79f, 7.5606f, 8.84f, 7.5606f, 6.44f)
                curveTo(7.5606f, 3.99f, 9.5406f, 2.0f, 12.0005f, 2.0f)
            }
        }
        .build()
        return _profiledelete!!
    }

private var _profiledelete: ImageVector? = null

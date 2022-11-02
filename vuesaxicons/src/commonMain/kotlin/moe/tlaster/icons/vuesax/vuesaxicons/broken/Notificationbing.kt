package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Notificationbing: ImageVector
    get() {
        if (_notificationbing != null) {
            return _notificationbing!!
        }
        _notificationbing = Builder(name = "Notificationbing", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.4399f)
                verticalLineTo(9.7699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5894f, 15.17f)
                curveTo(21.3194f, 16.39f, 20.7394f, 17.97f, 19.3894f, 18.42f)
                curveTo(14.6094f, 20.01f, 9.4394f, 20.01f, 4.6594f, 18.42f)
                curveTo(3.2194f, 17.94f, 2.6694f, 16.48f, 3.4594f, 15.17f)
                lineTo(4.7294f, 13.05f)
                curveTo(5.0794f, 12.47f, 5.3594f, 11.44f, 5.3594f, 10.77f)
                verticalLineTo(8.67f)
                curveTo(5.3594f, 4.98f, 8.3394f, 2.0f, 12.0194f, 2.0f)
                curveTo(15.6794f, 2.0f, 18.6794f, 5.0f, 18.6794f, 8.66f)
                verticalLineTo(10.76f)
                curveTo(18.6794f, 10.94f, 18.6994f, 11.14f, 18.7294f, 11.35f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.3299f, 18.8201f)
                curveTo(15.3299f, 20.6501f, 13.8299f, 22.1501f, 11.9999f, 22.1501f)
                curveTo(11.0899f, 22.1501f, 10.2499f, 21.7701f, 9.6499f, 21.1701f)
                curveTo(9.0499f, 20.5701f, 8.6699f, 19.7301f, 8.6699f, 18.8201f)
            }
        }
        .build()
        return _notificationbing!!
    }

private var _notificationbing: ImageVector? = null

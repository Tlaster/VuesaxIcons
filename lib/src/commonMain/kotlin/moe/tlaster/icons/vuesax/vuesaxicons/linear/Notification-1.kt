package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Notification-1`: ImageVector
    get() {
        if (`_notification-1` != null) {
            return `_notification-1`!!
        }
        `_notification-1` = Builder(name = "Notification-1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.02f, 2.9099f)
                curveTo(8.71f, 2.9099f, 6.02f, 5.5999f, 6.02f, 8.9099f)
                verticalLineTo(11.7999f)
                curveTo(6.02f, 12.4099f, 5.76f, 13.3399f, 5.45f, 13.8599f)
                lineTo(4.3f, 15.7699f)
                curveTo(3.59f, 16.9499f, 4.08f, 18.2599f, 5.38f, 18.6999f)
                curveTo(9.69f, 20.1399f, 14.34f, 20.1399f, 18.65f, 18.6999f)
                curveTo(19.86f, 18.2999f, 20.39f, 16.8699f, 19.73f, 15.7699f)
                lineTo(18.58f, 13.8599f)
                curveTo(18.28f, 13.3399f, 18.02f, 12.4099f, 18.02f, 11.7999f)
                verticalLineTo(8.9099f)
                curveTo(18.02f, 5.6099f, 15.32f, 2.9099f, 12.02f, 2.9099f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.87f, 3.1999f)
                curveTo(13.56f, 3.1099f, 13.24f, 3.0399f, 12.91f, 2.9999f)
                curveTo(11.95f, 2.8799f, 11.03f, 2.9499f, 10.17f, 3.1999f)
                curveTo(10.46f, 2.4599f, 11.18f, 1.9399f, 12.02f, 1.9399f)
                curveTo(12.86f, 1.9399f, 13.58f, 2.4599f, 13.87f, 3.1999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.02f, 19.0601f)
                curveTo(15.02f, 20.7101f, 13.67f, 22.0601f, 12.02f, 22.0601f)
                curveTo(11.2f, 22.0601f, 10.44f, 21.7201f, 9.9f, 21.1801f)
                curveTo(9.36f, 20.6401f, 9.02f, 19.8801f, 9.02f, 19.0601f)
            }
        }
        .build()
        return `_notification-1`!!
    }

private var `_notification-1`: ImageVector? = null

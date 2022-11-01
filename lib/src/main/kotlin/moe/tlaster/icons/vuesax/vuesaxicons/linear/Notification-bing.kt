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

public val LinearGroup.`Notification-bing`: ImageVector
    get() {
        if (`_notification-bing` != null) {
            return `_notification-bing`!!
        }
        `_notification-bing` = Builder(name = "Notification-bing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 6.4399f)
                verticalLineTo(9.7699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.02f, 2.0f)
                curveTo(8.34f, 2.0f, 5.36f, 4.98f, 5.36f, 8.66f)
                verticalLineTo(10.76f)
                curveTo(5.36f, 11.44f, 5.08f, 12.46f, 4.73f, 13.04f)
                lineTo(3.46f, 15.16f)
                curveTo(2.68f, 16.47f, 3.22f, 17.93f, 4.66f, 18.41f)
                curveTo(9.44f, 20.0f, 14.61f, 20.0f, 19.39f, 18.41f)
                curveTo(20.74f, 17.96f, 21.32f, 16.38f, 20.59f, 15.16f)
                lineTo(19.32f, 13.04f)
                curveTo(18.97f, 12.46f, 18.69f, 11.43f, 18.69f, 10.76f)
                verticalLineTo(8.66f)
                curveTo(18.68f, 5.0f, 15.68f, 2.0f, 12.02f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.33f, 18.8201f)
                curveTo(15.33f, 20.6501f, 13.83f, 22.1501f, 12.0f, 22.1501f)
                curveTo(11.09f, 22.1501f, 10.25f, 21.7701f, 9.65f, 21.1701f)
                curveTo(9.05f, 20.5701f, 8.67f, 19.7301f, 8.67f, 18.8201f)
            }
        }
        .build()
        return `_notification-bing`!!
    }

private var `_notification-bing`: ImageVector? = null

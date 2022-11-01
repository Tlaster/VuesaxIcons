package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Message-notif`: ImageVector
    get() {
        if (`_message-notif` != null) {
            return `_message-notif`!!
        }
        `_message-notif` = Builder(name = "Message-notif", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 17.0f, 20.0f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 19.0f, 14.89f, 19.15f, 14.7f, 19.4f)
                lineTo(13.2f, 21.4f)
                curveTo(12.54f, 22.28f, 11.46f, 22.28f, 10.8f, 21.4f)
                lineTo(9.3f, 19.4f)
                curveTo(9.14f, 19.18f, 8.77f, 19.0f, 8.5f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 19.0f, 2.0f, 18.0f, 2.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 7.0f)
                curveTo(20.8807f, 7.0f, 22.0f, 5.8807f, 22.0f, 4.5f)
                curveTo(22.0f, 3.1193f, 20.8807f, 2.0f, 19.5f, 2.0f)
                curveTo(18.1193f, 2.0f, 17.0f, 3.1193f, 17.0f, 4.5f)
                curveTo(17.0f, 5.8807f, 18.1193f, 7.0f, 19.5f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9965f, 11.0f)
                horizontalLineTo(16.0054f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9955f, 11.0f)
                horizontalLineTo(12.0045f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9945f, 11.0f)
                horizontalLineTo(8.0035f)
            }
        }
        .build()
        return `_message-notif`!!
    }

private var `_message-notif`: ImageVector? = null

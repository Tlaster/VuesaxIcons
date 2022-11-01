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

public val LinearGroup.`Message-question`: ImageVector
    get() {
        if (`_message-question` != null) {
            return `_message-question`!!
        }
        `_message-question` = Builder(name = "Message-question", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 18.4301f)
                horizontalLineTo(13.0f)
                lineTo(8.55f, 21.39f)
                curveTo(7.89f, 21.83f, 7.0f, 21.3601f, 7.0f, 20.5601f)
                verticalLineTo(18.4301f)
                curveTo(4.0f, 18.4301f, 2.0f, 16.4301f, 2.0f, 13.4301f)
                verticalLineTo(7.43f)
                curveTo(2.0f, 4.43f, 4.0f, 2.43f, 7.0f, 2.43f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 2.43f, 22.0f, 4.43f, 22.0f, 7.43f)
                verticalLineTo(13.4301f)
                curveTo(22.0f, 16.4301f, 20.0f, 18.4301f, 17.0f, 18.4301f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 11.36f)
                verticalLineTo(11.15f)
                curveTo(12.0001f, 10.47f, 12.4201f, 10.11f, 12.8401f, 9.82f)
                curveTo(13.2501f, 9.54f, 13.66f, 9.18f, 13.66f, 8.52f)
                curveTo(13.66f, 7.6f, 12.9201f, 6.86f, 12.0001f, 6.86f)
                curveTo(11.0801f, 6.86f, 10.3401f, 7.6f, 10.3401f, 8.52f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9955f, 13.75f)
                horizontalLineTo(12.0045f)
            }
        }
        .build()
        return `_message-question`!!
    }

private var `_message-question`: ImageVector? = null

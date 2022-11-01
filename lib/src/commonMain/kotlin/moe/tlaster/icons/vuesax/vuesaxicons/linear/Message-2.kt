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

public val LinearGroup.`Message-2`: ImageVector
    get() {
        if (`_message-2` != null) {
            return `_message-2`!!
        }
        `_message-2` = Builder(name = "Message-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 10.5f)
                horizontalLineTo(15.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 18.4299f)
                horizontalLineTo(11.0f)
                lineTo(15.45f, 21.39f)
                curveTo(16.11f, 21.83f, 17.0f, 21.3599f, 17.0f, 20.5599f)
                verticalLineTo(18.4299f)
                curveTo(20.0f, 18.4299f, 22.0f, 16.4299f, 22.0f, 13.4299f)
                verticalLineTo(7.4299f)
                curveTo(22.0f, 4.4299f, 20.0f, 2.4299f, 17.0f, 2.4299f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 2.4299f, 2.0f, 4.4299f, 2.0f, 7.4299f)
                verticalLineTo(13.4299f)
                curveTo(2.0f, 16.4299f, 4.0f, 18.4299f, 7.0f, 18.4299f)
                close()
            }
        }
        .build()
        return `_message-2`!!
    }

private var `_message-2`: ImageVector? = null

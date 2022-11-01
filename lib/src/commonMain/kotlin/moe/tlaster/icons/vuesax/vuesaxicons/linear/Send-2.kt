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

public val LinearGroup.`Send-2`: ImageVector
    get() {
        if (`_send-2` != null) {
            return `_send-2`!!
        }
        `_send-2` = Builder(name = "Send-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4f, 6.32f)
                lineTo(15.89f, 3.49f)
                curveTo(19.7f, 2.22f, 21.77f, 4.3f, 20.51f, 8.11f)
                lineTo(17.68f, 16.6f)
                curveTo(15.78f, 22.31f, 12.66f, 22.31f, 10.76f, 16.6f)
                lineTo(9.92f, 14.08f)
                lineTo(7.4f, 13.24f)
                curveTo(1.69f, 11.34f, 1.69f, 8.23f, 7.4f, 6.32f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.11f, 13.6501f)
                lineTo(13.69f, 10.0601f)
            }
        }
        .build()
        return `_send-2`!!
    }

private var `_send-2`: ImageVector? = null

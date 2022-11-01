package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Arrow-down-2`: ImageVector
    get() {
        if (`_arrow-down-2` != null) {
            return `_arrow-down-2`!!
        }
        `_arrow-down-2` = Builder(name = "Arrow-down-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9201f, 8.95f)
                lineTo(13.4001f, 15.47f)
                curveTo(12.6301f, 16.24f, 11.3701f, 16.24f, 10.6001f, 15.47f)
                lineTo(4.0801f, 8.95f)
            }
        }
        .build()
        return `_arrow-down-2`!!
    }

private var `_arrow-down-2`: ImageVector? = null

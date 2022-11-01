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

public val LinearGroup.`Direct-right`: ImageVector
    get() {
        if (`_direct-right` != null) {
            return `_direct-right`!!
        }
        `_direct-right` = Builder(name = "Direct-right", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.29f, 9.17f)
                lineTo(7.7f, 3.0701f)
                curveTo(4.95f, 1.62f, 1.96f, 4.55f, 3.35f, 7.33f)
                lineTo(4.97f, 10.57f)
                curveTo(5.42f, 11.47f, 5.42f, 12.53f, 4.97f, 13.43f)
                lineTo(3.35f, 16.67f)
                curveTo(1.96f, 19.45f, 4.95f, 22.37f, 7.7f, 20.93f)
                lineTo(19.29f, 14.83f)
                curveTo(21.57f, 13.63f, 21.57f, 10.37f, 19.29f, 9.17f)
                close()
            }
        }
        .build()
        return `_direct-right`!!
    }

private var `_direct-right`: ImageVector? = null

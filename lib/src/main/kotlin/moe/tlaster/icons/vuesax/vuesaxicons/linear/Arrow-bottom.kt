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

public val LinearGroup.`Arrow-bottom`: ImageVector
    get() {
        if (`_arrow-bottom` != null) {
            return `_arrow-bottom`!!
        }
        `_arrow-bottom` = Builder(name = "Arrow-bottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 6.0f)
                horizontalLineTo(14.6701f)
                curveTo(17.9801f, 6.0f, 19.3401f, 8.35f, 17.6801f, 11.22f)
                lineTo(16.3401f, 13.53f)
                lineTo(15.0001f, 15.84f)
                curveTo(13.3401f, 18.71f, 10.6301f, 18.71f, 8.97f, 15.84f)
                lineTo(7.6301f, 13.53f)
                lineTo(6.2901f, 11.22f)
                curveTo(4.66f, 8.35f, 6.01f, 6.0f, 9.3301f, 6.0f)
                horizontalLineTo(12.0001f)
                close()
            }
        }
        .build()
        return `_arrow-bottom`!!
    }

private var `_arrow-bottom`: ImageVector? = null

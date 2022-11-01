package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Arrowup-2`: ImageVector
    get() {
        if (`_arrowup-2` != null) {
            return `_arrowup-2`!!
        }
        `_arrowup-2` = Builder(name = "Arrowup-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6806f, 13.9783f)
                lineTo(15.4706f, 10.7683f)
                lineTo(13.5106f, 8.7983f)
                curveTo(12.6806f, 7.9683f, 11.3306f, 7.9683f, 10.5006f, 8.7983f)
                lineTo(5.3206f, 13.9783f)
                curveTo(4.6406f, 14.6583f, 5.1306f, 15.8183f, 6.0806f, 15.8183f)
                horizontalLineTo(11.6906f)
                horizontalLineTo(17.9206f)
                curveTo(18.8806f, 15.8183f, 19.3606f, 14.6583f, 18.6806f, 13.9783f)
                close()
            }
        }
        .build()
        return `_arrowup-2`!!
    }

private var `_arrowup-2`: ImageVector? = null

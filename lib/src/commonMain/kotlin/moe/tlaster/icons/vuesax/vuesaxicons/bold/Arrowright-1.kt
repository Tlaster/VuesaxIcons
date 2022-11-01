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

public val BoldGroup.`Arrowright-1`: ImageVector
    get() {
        if (`_arrowright-1` != null) {
            return `_arrowright-1`!!
        }
        `_arrowright-1` = Builder(name = "Arrowright-1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1997f, 10.4919f)
                lineTo(13.2297f, 8.5219f)
                lineTo(10.0197f, 5.3119f)
                curveTo(9.3397f, 4.6419f, 8.1797f, 5.1219f, 8.1797f, 6.0819f)
                verticalLineTo(12.3119f)
                verticalLineTo(17.9219f)
                curveTo(8.1797f, 18.8819f, 9.3397f, 19.3619f, 10.0197f, 18.6819f)
                lineTo(15.1997f, 13.5019f)
                curveTo(16.0297f, 12.6819f, 16.0297f, 11.3219f, 15.1997f, 10.4919f)
                close()
            }
        }
        .build()
        return `_arrowright-1`!!
    }

private var `_arrowright-1`: ImageVector? = null

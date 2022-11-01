package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`Arrow-left-3`: ImageVector
    get() {
        if (`_arrow-left-3` != null) {
            return `_arrow-left-3`!!
        }
        `_arrow-left-3` = Builder(name = "Arrow-left-3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.3292f)
                verticalLineTo(14.6692f)
                curveTo(18.0f, 17.9892f, 15.65f, 19.3392f, 12.78f, 17.6892f)
                lineTo(11.5f, 16.9492f)
                curveTo(11.19f, 16.7692f, 11.0f, 16.4392f, 11.0f, 16.0792f)
                verticalLineTo(7.9192f)
                curveTo(11.0f, 7.5592f, 11.19f, 7.2292f, 11.5f, 7.0492f)
                lineTo(12.78f, 6.3092f)
                curveTo(15.65f, 4.6592f, 18.0f, 6.0092f, 18.0f, 9.3292f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9986f, 8.7915f)
                verticalLineTo(15.2215f)
                curveTo(9.9986f, 15.6115f, 9.5786f, 15.8515f, 9.2486f, 15.6515f)
                lineTo(8.1486f, 15.0115f)
                curveTo(5.2786f, 13.3615f, 5.2786f, 10.6415f, 8.1486f, 8.9915f)
                lineTo(9.2486f, 8.3515f)
                curveTo(9.5786f, 8.1615f, 9.9986f, 8.4015f, 9.9986f, 8.7915f)
                close()
            }
        }
        .build()
        return `_arrow-left-3`!!
    }

private var `_arrow-left-3`: ImageVector? = null

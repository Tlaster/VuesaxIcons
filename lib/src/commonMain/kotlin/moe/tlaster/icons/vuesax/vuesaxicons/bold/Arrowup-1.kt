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

public val BoldGroup.`Arrowup-1`: ImageVector
    get() {
        if (`_arrowup-1` != null) {
            return `_arrowup-1`!!
        }
        `_arrowup-1` = Builder(name = "Arrowup-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.3292f, 18.0f)
                horizontalLineTo(14.6692f)
                curveTo(17.9892f, 18.0f, 19.3392f, 15.65f, 17.6892f, 12.78f)
                lineTo(16.9492f, 11.5f)
                curveTo(16.7692f, 11.19f, 16.4392f, 11.0f, 16.0792f, 11.0f)
                horizontalLineTo(7.9192f)
                curveTo(7.5592f, 11.0f, 7.2292f, 11.19f, 7.0492f, 11.5f)
                lineTo(6.3092f, 12.78f)
                curveTo(4.6592f, 15.65f, 6.0092f, 18.0f, 9.3292f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7915f, 9.9986f)
                horizontalLineTo(15.2215f)
                curveTo(15.6115f, 9.9986f, 15.8515f, 9.5786f, 15.6515f, 9.2486f)
                lineTo(15.0115f, 8.1486f)
                curveTo(13.3615f, 5.2786f, 10.6415f, 5.2786f, 8.9915f, 8.1486f)
                lineTo(8.3515f, 9.2486f)
                curveTo(8.1615f, 9.5786f, 8.4015f, 9.9986f, 8.7915f, 9.9986f)
                close()
            }
        }
        .build()
        return `_arrowup-1`!!
    }

private var `_arrowup-1`: ImageVector? = null

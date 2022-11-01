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

public val BoldGroup.`Arrowright-2`: ImageVector
    get() {
        if (`_arrowright-2` != null) {
            return `_arrowright-2`!!
        }
        `_arrowright-2` = Builder(name = "Arrowright-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 9.3292f)
                verticalLineTo(14.6692f)
                curveTo(6.0f, 17.9892f, 8.35f, 19.3392f, 11.22f, 17.6892f)
                lineTo(12.5f, 16.9492f)
                curveTo(12.81f, 16.7692f, 13.0f, 16.4392f, 13.0f, 16.0792f)
                verticalLineTo(7.9192f)
                curveTo(13.0f, 7.5592f, 12.81f, 7.2292f, 12.5f, 7.0492f)
                lineTo(11.22f, 6.3092f)
                curveTo(8.35f, 4.6592f, 6.0f, 6.0092f, 6.0f, 9.3292f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.7915f)
                verticalLineTo(15.2215f)
                curveTo(14.0f, 15.6115f, 14.42f, 15.8515f, 14.75f, 15.6515f)
                lineTo(15.85f, 15.0115f)
                curveTo(18.72f, 13.3615f, 18.72f, 10.6415f, 15.85f, 8.9915f)
                lineTo(14.75f, 8.3515f)
                curveTo(14.42f, 8.1615f, 14.0f, 8.4015f, 14.0f, 8.7915f)
                close()
            }
        }
        .build()
        return `_arrowright-2`!!
    }

private var `_arrowright-2`: ImageVector? = null

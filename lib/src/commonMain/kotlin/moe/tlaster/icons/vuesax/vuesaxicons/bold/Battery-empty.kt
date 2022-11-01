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

public val BoldGroup.`Battery-empty`: ImageVector
    get() {
        if (`_battery-empty` != null) {
            return `_battery-empty`!!
        }
        `_battery-empty` = Builder(name = "Battery-empty", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.93f, 4.7891f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 4.7891f, 2.0f, 6.0391f, 2.0f, 10.1391f)
                verticalLineTo(13.8591f)
                curveTo(2.0f, 17.9591f, 3.25f, 19.2091f, 7.35f, 19.2091f)
                horizontalLineTo(12.93f)
                curveTo(17.03f, 19.2091f, 18.28f, 17.9591f, 18.28f, 13.8591f)
                verticalLineTo(10.1391f)
                curveTo(18.28f, 6.0391f, 17.03f, 4.7891f, 12.93f, 4.7891f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4192f, 9.0005f)
                curveTo(20.2792f, 8.9905f, 20.0992f, 8.9805f, 19.8992f, 8.9805f)
                curveTo(19.5092f, 8.9805f, 19.1992f, 9.2905f, 19.1992f, 9.6805f)
                verticalLineTo(14.3305f)
                curveTo(19.1992f, 14.7205f, 19.5092f, 15.0305f, 19.8992f, 15.0305f)
                curveTo(20.0992f, 15.0305f, 20.2692f, 15.0205f, 20.4392f, 15.0105f)
                curveTo(21.9992f, 14.8305f, 21.9992f, 13.7305f, 21.9992f, 12.9305f)
                verticalLineTo(11.0705f)
                curveTo(21.9992f, 10.2705f, 21.9992f, 9.1705f, 20.4192f, 9.0005f)
                close()
            }
        }
        .build()
        return `_battery-empty`!!
    }

private var `_battery-empty`: ImageVector? = null

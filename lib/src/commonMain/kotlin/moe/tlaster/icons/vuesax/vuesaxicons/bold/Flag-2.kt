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

public val BoldGroup.`Flag-2`: ImageVector
    get() {
        if (`_flag-2` != null) {
            return `_flag-2`!!
        }
        `_flag-2` = Builder(name = "Flag-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1992f, 7.16f)
                lineTo(7.1992f, 3.7f)
                verticalLineTo(2.75f)
                curveTo(7.1992f, 2.34f, 6.8592f, 2.0f, 6.4492f, 2.0f)
                curveTo(6.0392f, 2.0f, 5.6992f, 2.34f, 5.6992f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(5.6992f, 21.66f, 6.0392f, 22.0f, 6.4492f, 22.0f)
                curveTo(6.8592f, 22.0f, 7.1992f, 21.66f, 7.1992f, 21.25f)
                verticalLineTo(17.29f)
                lineTo(15.4192f, 13.23f)
                curveTo(15.4192f, 13.23f, 15.4192f, 13.23f, 15.4292f, 13.23f)
                curveTo(17.0892f, 12.37f, 17.9792f, 11.26f, 17.9292f, 10.09f)
                curveTo(17.8792f, 8.92f, 16.9092f, 7.88f, 15.1992f, 7.16f)
                close()
            }
        }
        .build()
        return `_flag-2`!!
    }

private var `_flag-2`: ImageVector? = null

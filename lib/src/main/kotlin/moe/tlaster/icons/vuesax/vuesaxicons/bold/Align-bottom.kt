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

public val BoldGroup.`Align-bottom`: ImageVector
    get() {
        if (`_align-bottom` != null) {
            return `_align-bottom`!!
        }
        `_align-bottom` = Builder(name = "Align-bottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.98f, 19.3789f)
                horizontalLineTo(17.02f)
                curveTo(18.61f, 19.3789f, 19.25f, 18.7789f, 19.25f, 17.2589f)
                verticalLineTo(5.3789f)
                horizontalLineTo(13.75f)
                verticalLineTo(17.2589f)
                curveTo(13.76f, 18.7789f, 14.4f, 19.3789f, 15.98f, 19.3789f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.48f, 14.3789f)
                horizontalLineTo(8.52f)
                curveTo(10.11f, 14.3789f, 10.75f, 13.7689f, 10.75f, 12.2589f)
                verticalLineTo(5.3789f)
                horizontalLineTo(5.25f)
                verticalLineTo(12.2589f)
                curveTo(5.26f, 13.7689f, 5.9f, 14.3789f, 7.48f, 14.3789f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 6.1189f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 6.1189f, 2.0f, 5.7889f, 2.0f, 5.3789f)
                curveTo(2.0f, 4.9689f, 2.34f, 4.6289f, 2.75f, 4.6289f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 4.6289f, 22.0f, 4.9689f, 22.0f, 5.3789f)
                curveTo(22.0f, 5.7889f, 21.66f, 6.1189f, 21.25f, 6.1189f)
                close()
            }
        }
        .build()
        return `_align-bottom`!!
    }

private var `_align-bottom`: ImageVector? = null

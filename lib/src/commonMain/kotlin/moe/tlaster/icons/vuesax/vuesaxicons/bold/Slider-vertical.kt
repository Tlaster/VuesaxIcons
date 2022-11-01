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

public val BoldGroup.`Slider-vertical`: ImageVector
    get() {
        if (`_slider-vertical` != null) {
            return `_slider-vertical`!!
        }
        `_slider-vertical` = Builder(name = "Slider-vertical", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9405f, 3.5f)
                horizontalLineTo(5.0606f)
                curveTo(4.6505f, 3.5f, 4.3106f, 3.16f, 4.3106f, 2.75f)
                curveTo(4.3106f, 2.34f, 4.6505f, 2.0f, 5.0606f, 2.0f)
                horizontalLineTo(18.9405f)
                curveTo(19.3505f, 2.0f, 19.6905f, 2.34f, 19.6905f, 2.75f)
                curveTo(19.6905f, 3.16f, 19.3505f, 3.5f, 18.9405f, 3.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9405f, 22.0f)
                horizontalLineTo(5.0606f)
                curveTo(4.6505f, 22.0f, 4.3106f, 21.66f, 4.3106f, 21.25f)
                curveTo(4.3106f, 20.84f, 4.6505f, 20.5f, 5.0606f, 20.5f)
                horizontalLineTo(18.9405f)
                curveTo(19.3505f, 20.5f, 19.6905f, 20.84f, 19.6905f, 21.25f)
                curveTo(19.6905f, 21.66f, 19.3505f, 22.0f, 18.9405f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(2.75f, 17.66f, 4.09f, 19.0f, 5.75f, 19.0f)
                horizontalLineTo(18.25f)
                curveTo(19.91f, 19.0f, 21.25f, 17.66f, 21.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(21.25f, 6.34f, 19.91f, 5.0f, 18.25f, 5.0f)
                horizontalLineTo(5.75f)
                curveTo(4.09f, 5.0f, 2.75f, 6.34f, 2.75f, 8.0f)
                close()
            }
        }
        .build()
        return `_slider-vertical`!!
    }

private var `_slider-vertical`: ImageVector? = null

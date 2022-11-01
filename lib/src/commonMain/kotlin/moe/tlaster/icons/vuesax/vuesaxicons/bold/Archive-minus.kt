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

public val BoldGroup.`Archive-minus`: ImageVector
    get() {
        if (`_archive-minus` != null) {
            return `_archive-minus`!!
        }
        `_archive-minus` = Builder(name = "Archive-minus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8203f, 2.0f)
                horizontalLineTo(7.1803f)
                curveTo(5.0503f, 2.0f, 3.3203f, 3.74f, 3.3203f, 5.86f)
                verticalLineTo(19.95f)
                curveTo(3.3203f, 21.75f, 4.6103f, 22.51f, 6.1903f, 21.64f)
                lineTo(11.0703f, 18.93f)
                curveTo(11.5903f, 18.64f, 12.4303f, 18.64f, 12.9403f, 18.93f)
                lineTo(17.8203f, 21.64f)
                curveTo(19.4003f, 22.52f, 20.6903f, 21.76f, 20.6903f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(20.6803f, 3.74f, 18.9503f, 2.0f, 16.8203f, 2.0f)
                close()
                moveTo(14.5003f, 11.4f)
                horizontalLineTo(9.5003f)
                curveTo(9.0903f, 11.4f, 8.7503f, 11.06f, 8.7503f, 10.65f)
                curveTo(8.7503f, 10.24f, 9.0903f, 9.9f, 9.5003f, 9.9f)
                horizontalLineTo(14.5003f)
                curveTo(14.9103f, 9.9f, 15.2503f, 10.24f, 15.2503f, 10.65f)
                curveTo(15.2503f, 11.06f, 14.9103f, 11.4f, 14.5003f, 11.4f)
                close()
            }
        }
        .build()
        return `_archive-minus`!!
    }

private var `_archive-minus`: ImageVector? = null

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

public val BoldGroup.`Archive-tick`: ImageVector
    get() {
        if (`_archive-tick` != null) {
            return `_archive-tick`!!
        }
        `_archive-tick` = Builder(name = "Archive-tick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8203f, 1.9102f)
                horizontalLineTo(7.1803f)
                curveTo(5.0603f, 1.9102f, 3.3203f, 3.6502f, 3.3203f, 5.7702f)
                verticalLineTo(19.8602f)
                curveTo(3.3203f, 21.6602f, 4.6103f, 22.4202f, 6.1903f, 21.5502f)
                lineTo(11.0703f, 18.8402f)
                curveTo(11.5903f, 18.5502f, 12.4303f, 18.5502f, 12.9403f, 18.8402f)
                lineTo(17.8203f, 21.5502f)
                curveTo(19.4003f, 22.4302f, 20.6903f, 21.6702f, 20.6903f, 19.8602f)
                verticalLineTo(5.7702f)
                curveTo(20.6803f, 3.6502f, 18.9503f, 1.9102f, 16.8203f, 1.9102f)
                close()
                moveTo(15.6203f, 9.0302f)
                lineTo(11.6203f, 13.0302f)
                curveTo(11.4703f, 13.1802f, 11.2803f, 13.2502f, 11.0903f, 13.2502f)
                curveTo(10.9003f, 13.2502f, 10.7103f, 13.1802f, 10.5603f, 13.0302f)
                lineTo(9.0603f, 11.5302f)
                curveTo(8.7703f, 11.2402f, 8.7703f, 10.7602f, 9.0603f, 10.4702f)
                curveTo(9.3503f, 10.1802f, 9.8303f, 10.1802f, 10.1203f, 10.4702f)
                lineTo(11.0903f, 11.4402f)
                lineTo(14.5603f, 7.9702f)
                curveTo(14.8503f, 7.6802f, 15.3303f, 7.6802f, 15.6203f, 7.9702f)
                curveTo(15.9103f, 8.2602f, 15.9103f, 8.7402f, 15.6203f, 9.0302f)
                close()
            }
        }
        .build()
        return `_archive-tick`!!
    }

private var `_archive-tick`: ImageVector? = null

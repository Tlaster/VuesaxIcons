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

public val BoldGroup.`Location-add`: ImageVector
    get() {
        if (`_location-add` != null) {
            return `_location-add`!!
        }
        `_location-add` = Builder(name = "Location-add", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.6188f, 8.7f)
                curveTo(19.5788f, 4.07f, 15.5388f, 2.0f, 11.9988f, 2.0f)
                curveTo(11.9988f, 2.0f, 11.9988f, 2.0f, 11.9888f, 2.0f)
                curveTo(8.4588f, 2.0f, 4.4288f, 4.07f, 3.3788f, 8.69f)
                curveTo(2.1988f, 13.85f, 5.3588f, 18.22f, 8.2188f, 20.98f)
                curveTo(9.2788f, 22.0f, 10.6388f, 22.51f, 11.9988f, 22.51f)
                curveTo(13.3588f, 22.51f, 14.7188f, 22.0f, 15.7688f, 20.98f)
                curveTo(18.6288f, 18.22f, 21.7888f, 13.86f, 20.6188f, 8.7f)
                close()
                moveTo(14.7488f, 11.75f)
                horizontalLineTo(12.7488f)
                verticalLineTo(13.75f)
                curveTo(12.7488f, 14.16f, 12.4088f, 14.5f, 11.9988f, 14.5f)
                curveTo(11.5888f, 14.5f, 11.2488f, 14.16f, 11.2488f, 13.75f)
                verticalLineTo(11.75f)
                horizontalLineTo(9.2488f)
                curveTo(8.8388f, 11.75f, 8.4988f, 11.41f, 8.4988f, 11.0f)
                curveTo(8.4988f, 10.59f, 8.8388f, 10.25f, 9.2488f, 10.25f)
                horizontalLineTo(11.2488f)
                verticalLineTo(8.25f)
                curveTo(11.2488f, 7.84f, 11.5888f, 7.5f, 11.9988f, 7.5f)
                curveTo(12.4088f, 7.5f, 12.7488f, 7.84f, 12.7488f, 8.25f)
                verticalLineTo(10.25f)
                horizontalLineTo(14.7488f)
                curveTo(15.1588f, 10.25f, 15.4988f, 10.59f, 15.4988f, 11.0f)
                curveTo(15.4988f, 11.41f, 15.1588f, 11.75f, 14.7488f, 11.75f)
                close()
            }
        }
        .build()
        return `_location-add`!!
    }

private var `_location-add`: ImageVector? = null

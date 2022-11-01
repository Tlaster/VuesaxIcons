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

public val BoldGroup.`Enjincoin-enj`: ImageVector
    get() {
        if (`_enjincoin-enj` != null) {
            return `_enjincoin-enj`!!
        }
        `_enjincoin-enj` = Builder(name = "Enjincoin-enj", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.75f, 11.25f)
                curveTo(16.16f, 11.25f, 16.5f, 11.59f, 16.5f, 12.0f)
                curveTo(16.5f, 12.41f, 16.16f, 12.75f, 15.75f, 12.75f)
                horizontalLineTo(8.5f)
                verticalLineTo(13.0f)
                curveTo(8.5f, 14.24f, 9.51f, 15.25f, 10.75f, 15.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 15.25f, 16.5f, 15.59f, 16.5f, 16.0f)
                curveTo(16.5f, 16.41f, 16.16f, 16.75f, 15.75f, 16.75f)
                horizontalLineTo(10.75f)
                curveTo(8.68f, 16.75f, 7.0f, 15.07f, 7.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(7.0f, 8.93f, 8.68f, 7.25f, 10.75f, 7.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 7.25f, 16.5f, 7.59f, 16.5f, 8.0f)
                curveTo(16.5f, 8.41f, 16.16f, 8.75f, 15.75f, 8.75f)
                horizontalLineTo(10.75f)
                curveTo(9.51f, 8.75f, 8.5f, 9.76f, 8.5f, 11.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(15.75f)
                close()
            }
        }
        .build()
        return `_enjincoin-enj`!!
    }

private var `_enjincoin-enj`: ImageVector? = null

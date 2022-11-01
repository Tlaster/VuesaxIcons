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

public val BoldGroup.`Arrowleft-2`: ImageVector
    get() {
        if (`_arrowleft-2` != null) {
            return `_arrowleft-2`!!
        }
        `_arrowleft-2` = Builder(name = "Arrowleft-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(18.0f, 12.75f)
                horizontalLineTo(7.81f)
                lineTo(10.82f, 15.76f)
                curveTo(11.11f, 16.05f, 11.11f, 16.53f, 10.82f, 16.82f)
                curveTo(10.67f, 16.97f, 10.48f, 17.04f, 10.29f, 17.04f)
                curveTo(10.1f, 17.04f, 9.91f, 16.97f, 9.76f, 16.82f)
                lineTo(5.47f, 12.53f)
                curveTo(5.33f, 12.39f, 5.25f, 12.2f, 5.25f, 12.0f)
                curveTo(5.25f, 11.8f, 5.33f, 11.61f, 5.47f, 11.47f)
                lineTo(9.76f, 7.18f)
                curveTo(10.05f, 6.89f, 10.53f, 6.89f, 10.82f, 7.18f)
                curveTo(11.11f, 7.47f, 11.11f, 7.95f, 10.82f, 8.24f)
                lineTo(7.81f, 11.25f)
                horizontalLineTo(18.0f)
                curveTo(18.41f, 11.25f, 18.75f, 11.59f, 18.75f, 12.0f)
                curveTo(18.75f, 12.41f, 18.41f, 12.75f, 18.0f, 12.75f)
                close()
            }
        }
        .build()
        return `_arrowleft-2`!!
    }

private var `_arrowleft-2`: ImageVector? = null

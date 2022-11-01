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

public val BoldGroup.`Arrow-up`: ImageVector
    get() {
        if (`_arrow-up` != null) {
            return `_arrow-up`!!
        }
        `_arrow-up` = Builder(name = "Arrow-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.82f, 10.82f)
                curveTo(16.53f, 11.11f, 16.05f, 11.11f, 15.76f, 10.82f)
                lineTo(12.75f, 7.81f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12.0f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18.0f)
                verticalLineTo(7.81f)
                lineTo(8.24f, 10.82f)
                curveTo(7.95f, 11.11f, 7.47f, 11.11f, 7.18f, 10.82f)
                curveTo(7.03f, 10.67f, 6.96f, 10.48f, 6.96f, 10.29f)
                curveTo(6.96f, 10.1f, 7.04f, 9.9f, 7.18f, 9.76f)
                lineTo(11.47f, 5.47f)
                curveTo(11.61f, 5.33f, 11.8f, 5.25f, 12.0f, 5.25f)
                curveTo(12.2f, 5.25f, 12.39f, 5.33f, 12.53f, 5.47f)
                lineTo(16.82f, 9.76f)
                curveTo(17.11f, 10.05f, 17.11f, 10.52f, 16.82f, 10.82f)
                close()
            }
        }
        .build()
        return `_arrow-up`!!
    }

private var `_arrow-up`: ImageVector? = null

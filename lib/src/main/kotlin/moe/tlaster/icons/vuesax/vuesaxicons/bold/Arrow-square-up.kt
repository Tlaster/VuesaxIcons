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

public val BoldGroup.`Arrow-square-up`: ImageVector
    get() {
        if (`_arrow-square-up` != null) {
            return `_arrow-square-up`!!
        }
        `_arrow-square-up` = Builder(name = "Arrow-square-up", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.06f, 14.0f)
                curveTo(15.91f, 14.15f, 15.72f, 14.22f, 15.53f, 14.22f)
                curveTo(15.34f, 14.22f, 15.15f, 14.14f, 15.0f, 14.0f)
                lineTo(12.0f, 11.0f)
                lineTo(9.0f, 14.0f)
                curveTo(8.71f, 14.29f, 8.23f, 14.29f, 7.94f, 14.0f)
                curveTo(7.65f, 13.71f, 7.65f, 13.23f, 7.94f, 12.94f)
                lineTo(11.47f, 9.41f)
                curveTo(11.76f, 9.12f, 12.24f, 9.12f, 12.53f, 9.41f)
                lineTo(16.06f, 12.94f)
                curveTo(16.35f, 13.23f, 16.35f, 13.7f, 16.06f, 14.0f)
                close()
            }
        }
        .build()
        return `_arrow-square-up`!!
    }

private var `_arrow-square-up`: ImageVector? = null

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

public val BoldGroup.`Arrow-square-down`: ImageVector
    get() {
        if (`_arrow-square-down` != null) {
            return `_arrow-square-down`!!
        }
        `_arrow-square-down` = Builder(name = "Arrow-square-down", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.06f, 11.17f)
                lineTo(12.53f, 14.7f)
                curveTo(12.38f, 14.85f, 12.19f, 14.92f, 12.0f, 14.92f)
                curveTo(11.81f, 14.92f, 11.62f, 14.85f, 11.47f, 14.7f)
                lineTo(7.94f, 11.17f)
                curveTo(7.65f, 10.88f, 7.65f, 10.4f, 7.94f, 10.11f)
                curveTo(8.23f, 9.82f, 8.71f, 9.82f, 9.0f, 10.11f)
                lineTo(12.0f, 13.11f)
                lineTo(15.0f, 10.11f)
                curveTo(15.29f, 9.82f, 15.77f, 9.82f, 16.06f, 10.11f)
                curveTo(16.35f, 10.4f, 16.35f, 10.87f, 16.06f, 11.17f)
                close()
            }
        }
        .build()
        return `_arrow-square-down`!!
    }

private var `_arrow-square-down`: ImageVector? = null

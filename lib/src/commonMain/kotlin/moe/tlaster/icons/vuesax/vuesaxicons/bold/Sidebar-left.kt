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

public val BoldGroup.`Sidebar-left`: ImageVector
    get() {
        if (`_sidebar-left` != null) {
            return `_sidebar-left`!!
        }
        `_sidebar-left` = Builder(name = "Sidebar-left", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.8113f)
                verticalLineTo(16.1913f)
                curveTo(2.0f, 17.6813f, 2.36f, 18.9213f, 3.05f, 19.8713f)
                curveTo(3.34f, 20.2913f, 3.71f, 20.6613f, 4.13f, 20.9513f)
                curveTo(4.95f, 21.5513f, 5.99f, 21.9012f, 7.22f, 21.9812f)
                verticalLineTo(2.0313f)
                curveTo(3.94f, 2.2413f, 2.0f, 4.3713f, 2.0f, 7.8113f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9507f, 4.13f)
                curveTo(20.6607f, 3.71f, 20.2907f, 3.34f, 19.8707f, 3.05f)
                curveTo(18.9207f, 2.36f, 17.6807f, 2.0f, 16.1907f, 2.0f)
                horizontalLineTo(8.7207f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.1907f)
                curveTo(19.8307f, 22.0f, 22.0007f, 19.83f, 22.0007f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0007f, 6.32f, 21.6407f, 5.08f, 20.9507f, 4.13f)
                close()
                moveTo(15.5007f, 14.03f)
                curveTo(15.7907f, 14.32f, 15.7907f, 14.8f, 15.5007f, 15.09f)
                curveTo(15.3507f, 15.24f, 15.1607f, 15.31f, 14.9707f, 15.31f)
                curveTo(14.7807f, 15.31f, 14.5907f, 15.24f, 14.4407f, 15.09f)
                lineTo(11.8807f, 12.53f)
                curveTo(11.5907f, 12.24f, 11.5907f, 11.76f, 11.8807f, 11.47f)
                lineTo(14.4407f, 8.91f)
                curveTo(14.7307f, 8.62f, 15.2107f, 8.62f, 15.5007f, 8.91f)
                curveTo(15.7907f, 9.2f, 15.7907f, 9.68f, 15.5007f, 9.97f)
                lineTo(13.4807f, 12.0f)
                lineTo(15.5007f, 14.03f)
                close()
            }
        }
        .build()
        return `_sidebar-left`!!
    }

private var `_sidebar-left`: ImageVector? = null

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

public val BoldGroup.`Sidebar-right`: ImageVector
    get() {
        if (`_sidebar-right` != null) {
            return `_sidebar-right`!!
        }
        `_sidebar-right` = Builder(name = "Sidebar-right", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.81f, 2.0f)
                curveTo(6.32f, 2.0f, 5.08f, 2.36f, 4.13f, 3.05f)
                curveTo(3.71f, 3.34f, 3.34f, 3.71f, 3.05f, 4.13f)
                curveTo(2.36f, 5.08f, 2.0f, 6.32f, 2.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(15.28f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.81f)
                close()
                moveTo(12.12f, 12.53f)
                lineTo(9.56f, 15.09f)
                curveTo(9.41f, 15.24f, 9.22f, 15.31f, 9.03f, 15.31f)
                curveTo(8.84f, 15.31f, 8.65f, 15.24f, 8.5f, 15.09f)
                curveTo(8.21f, 14.8f, 8.21f, 14.32f, 8.5f, 14.03f)
                lineTo(10.52f, 12.0f)
                lineTo(8.5f, 9.97f)
                curveTo(8.2f, 9.68f, 8.2f, 9.2f, 8.5f, 8.91f)
                curveTo(8.8f, 8.62f, 9.27f, 8.62f, 9.56f, 8.91f)
                lineTo(12.12f, 11.47f)
                curveTo(12.41f, 11.76f, 12.41f, 12.24f, 12.12f, 12.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.7793f, 2.0313f)
                verticalLineTo(21.9812f)
                curveTo(18.0093f, 21.9012f, 19.0493f, 21.5513f, 19.8693f, 20.9513f)
                curveTo(20.2893f, 20.6613f, 20.6593f, 20.2913f, 20.9493f, 19.8713f)
                curveTo(21.6393f, 18.9213f, 21.9993f, 17.6813f, 21.9993f, 16.1913f)
                verticalLineTo(7.8113f)
                curveTo(21.9993f, 4.3713f, 20.0593f, 2.2413f, 16.7793f, 2.0313f)
                close()
            }
        }
        .build()
        return `_sidebar-right`!!
    }

private var `_sidebar-right`: ImageVector? = null

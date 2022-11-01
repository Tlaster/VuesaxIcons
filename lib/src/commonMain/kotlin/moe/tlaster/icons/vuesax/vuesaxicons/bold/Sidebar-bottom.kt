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

public val BoldGroup.`Sidebar-bottom`: ImageVector
    get() {
        if (`_sidebar-bottom` != null) {
            return `_sidebar-bottom`!!
        }
        `_sidebar-bottom` = Builder(name = "Sidebar-bottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0495f, 19.8713f)
                curveTo(3.3395f, 20.2913f, 3.7095f, 20.6613f, 4.1295f, 20.9513f)
                curveTo(5.0795f, 21.6413f, 6.3195f, 22.0012f, 7.8095f, 22.0012f)
                horizontalLineTo(16.1895f)
                curveTo(19.6295f, 22.0012f, 21.7595f, 20.0612f, 21.9695f, 16.7812f)
                horizontalLineTo(2.0195f)
                curveTo(2.0995f, 18.0113f, 2.4495f, 19.0513f, 3.0495f, 19.8713f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.95f, 4.13f)
                curveTo(20.66f, 3.71f, 20.29f, 3.34f, 19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2.0f, 16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(15.28f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 6.32f, 21.64f, 5.08f, 20.95f, 4.13f)
                close()
                moveTo(15.09f, 9.56f)
                lineTo(12.53f, 12.12f)
                curveTo(12.24f, 12.41f, 11.76f, 12.41f, 11.47f, 12.12f)
                lineTo(8.91f, 9.56f)
                curveTo(8.76f, 9.41f, 8.69f, 9.22f, 8.69f, 9.03f)
                curveTo(8.69f, 8.84f, 8.76f, 8.64f, 8.91f, 8.5f)
                curveTo(9.2f, 8.2f, 9.68f, 8.2f, 9.97f, 8.5f)
                lineTo(12.0f, 10.52f)
                lineTo(14.03f, 8.49f)
                curveTo(14.32f, 8.2f, 14.8f, 8.2f, 15.09f, 8.49f)
                curveTo(15.38f, 8.78f, 15.38f, 9.26f, 15.09f, 9.56f)
                close()
            }
        }
        .build()
        return `_sidebar-bottom`!!
    }

private var `_sidebar-bottom`: ImageVector? = null

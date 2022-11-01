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

public val BoldGroup.`User-search`: ImageVector
    get() {
        if (`_user-search` != null) {
            return `_user-search`!!
        }
        `_user-search` = Builder(name = "User-search", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 14.0f)
                curveTo(6.9902f, 14.0f, 2.9102f, 17.36f, 2.9102f, 21.5f)
                curveTo(2.9102f, 21.78f, 3.1302f, 22.0f, 3.4102f, 22.0f)
                horizontalLineTo(20.5902f)
                curveTo(20.8702f, 22.0f, 21.0902f, 21.78f, 21.0902f, 21.5f)
                curveTo(21.0902f, 17.36f, 17.0102f, 14.0f, 12.0002f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.72f, 10.35f)
                lineTo(15.76f, 9.39f)
                curveTo(16.26f, 8.64f, 16.55f, 7.74f, 16.55f, 6.77f)
                curveTo(16.55f, 4.13f, 14.41f, 2.0f, 11.78f, 2.0f)
                curveTo(9.15f, 2.0f, 7.0f, 4.14f, 7.0f, 6.77f)
                curveTo(7.0f, 9.4f, 9.14f, 11.54f, 11.77f, 11.54f)
                curveTo(12.74f, 11.54f, 13.64f, 11.25f, 14.39f, 10.75f)
                lineTo(15.35f, 11.71f)
                curveTo(15.54f, 11.9f, 15.79f, 11.99f, 16.03f, 11.99f)
                curveTo(16.28f, 11.99f, 16.53f, 11.9f, 16.71f, 11.71f)
                curveTo(17.09f, 11.34f, 17.09f, 10.73f, 16.72f, 10.35f)
                close()
            }
        }
        .build()
        return `_user-search`!!
    }

private var `_user-search`: ImageVector? = null

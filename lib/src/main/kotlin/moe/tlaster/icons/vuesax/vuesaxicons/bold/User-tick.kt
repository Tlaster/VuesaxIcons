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

public val BoldGroup.`User-tick`: ImageVector
    get() {
        if (`_user-tick` != null) {
            return `_user-tick`!!
        }
        `_user-tick` = Builder(name = "User-tick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 2.0f)
                curveTo(10.82f, 2.0f, 9.74f, 2.41f, 8.88f, 3.1f)
                curveTo(7.73f, 4.01f, 7.0f, 5.42f, 7.0f, 7.0f)
                curveTo(7.0f, 7.94f, 7.26f, 8.82f, 7.73f, 9.57f)
                curveTo(8.59f, 11.02f, 10.17f, 12.0f, 12.0f, 12.0f)
                curveTo(13.26f, 12.0f, 14.41f, 11.54f, 15.29f, 10.75f)
                curveTo(15.68f, 10.42f, 16.02f, 10.02f, 16.28f, 9.57f)
                curveTo(16.74f, 8.82f, 17.0f, 7.94f, 17.0f, 7.0f)
                curveTo(17.0f, 4.24f, 14.76f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.59f, 6.46f)
                lineTo(11.92f, 8.92f)
                curveTo(11.74f, 9.09f, 11.51f, 9.17f, 11.28f, 9.17f)
                curveTo(11.04f, 9.17f, 10.8f, 9.08f, 10.62f, 8.9f)
                lineTo(9.39f, 7.66f)
                curveTo(9.02f, 7.29f, 9.02f, 6.7f, 9.39f, 6.33f)
                curveTo(9.76f, 5.96f, 10.35f, 5.96f, 10.72f, 6.33f)
                lineTo(11.31f, 6.92f)
                lineTo(13.32f, 5.07f)
                curveTo(13.7f, 4.72f, 14.29f, 4.74f, 14.64f, 5.12f)
                curveTo(14.99f, 5.51f, 14.97f, 6.11f, 14.59f, 6.46f)
                close()
            }
        }
        .build()
        return `_user-tick`!!
    }

private var `_user-tick`: ImageVector? = null

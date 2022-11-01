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

public val BoldGroup.`Like-1`: ImageVector
    get() {
        if (`_like-1` != null) {
            return `_like-1`!!
        }
        `_like-1` = Builder(name = "Like-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 2.0f, 3.0f, 3.33f, 3.0f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3.0f, 17.52f, 4.34f, 18.85f, 6.0f, 18.85f)
                horizontalLineTo(6.76f)
                curveTo(7.56f, 18.85f, 8.32f, 19.16f, 8.88f, 19.72f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.18f, 12.64f, 22.18f, 13.42f, 21.41f)
                lineTo(15.13f, 19.72f)
                curveTo(15.69f, 19.16f, 16.46f, 18.85f, 17.25f, 18.85f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 18.85f, 21.0f, 17.52f, 21.0f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(21.0f, 3.33f, 19.66f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(12.28f, 14.96f)
                curveTo(12.13f, 15.01f, 11.88f, 15.01f, 11.72f, 14.96f)
                curveTo(10.42f, 14.51f, 7.5f, 12.66f, 7.5f, 9.51f)
                curveTo(7.51f, 8.12f, 8.62f, 7.0f, 10.0f, 7.0f)
                curveTo(10.82f, 7.0f, 11.54f, 7.39f, 12.0f, 8.0f)
                curveTo(12.46f, 7.39f, 13.18f, 7.0f, 14.0f, 7.0f)
                curveTo(15.38f, 7.0f, 16.5f, 8.12f, 16.5f, 9.51f)
                curveTo(16.49f, 12.66f, 13.58f, 14.51f, 12.28f, 14.96f)
                close()
            }
        }
        .build()
        return `_like-1`!!
    }

private var `_like-1`: ImageVector? = null

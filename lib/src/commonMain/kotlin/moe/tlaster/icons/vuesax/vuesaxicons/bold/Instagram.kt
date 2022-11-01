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

public val BoldGroup.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 15.88f)
                curveTo(9.86f, 15.88f, 8.12f, 14.14f, 8.12f, 12.0f)
                curveTo(8.12f, 9.86f, 9.86f, 8.12f, 12.0f, 8.12f)
                curveTo(14.14f, 8.12f, 15.88f, 9.86f, 15.88f, 12.0f)
                curveTo(15.88f, 14.14f, 14.14f, 15.88f, 12.0f, 15.88f)
                close()
                moveTo(17.92f, 6.88f)
                curveTo(17.87f, 7.0f, 17.8f, 7.11f, 17.71f, 7.21f)
                curveTo(17.61f, 7.3f, 17.5f, 7.37f, 17.38f, 7.42f)
                curveTo(17.26f, 7.47f, 17.13f, 7.5f, 17.0f, 7.5f)
                curveTo(16.73f, 7.5f, 16.48f, 7.4f, 16.29f, 7.21f)
                curveTo(16.2f, 7.11f, 16.13f, 7.0f, 16.08f, 6.88f)
                curveTo(16.03f, 6.76f, 16.0f, 6.63f, 16.0f, 6.5f)
                curveTo(16.0f, 6.37f, 16.03f, 6.24f, 16.08f, 6.12f)
                curveTo(16.13f, 5.99f, 16.2f, 5.89f, 16.29f, 5.79f)
                curveTo(16.52f, 5.56f, 16.87f, 5.45f, 17.19f, 5.52f)
                curveTo(17.26f, 5.53f, 17.32f, 5.55f, 17.38f, 5.58f)
                curveTo(17.44f, 5.6f, 17.5f, 5.63f, 17.56f, 5.67f)
                curveTo(17.61f, 5.7f, 17.66f, 5.75f, 17.71f, 5.79f)
                curveTo(17.8f, 5.89f, 17.87f, 5.99f, 17.92f, 6.12f)
                curveTo(17.97f, 6.24f, 18.0f, 6.37f, 18.0f, 6.5f)
                curveTo(18.0f, 6.63f, 17.97f, 6.76f, 17.92f, 6.88f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null

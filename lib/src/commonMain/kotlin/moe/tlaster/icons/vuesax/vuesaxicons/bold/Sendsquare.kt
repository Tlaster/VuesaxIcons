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

public val BoldGroup.Sendsquare: ImageVector
    get() {
        if (_sendsquare != null) {
            return _sendsquare!!
        }
        _sendsquare = Builder(name = "Sendsquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(8.47f, 8.98f)
                lineTo(11.47f, 5.98f)
                curveTo(11.54f, 5.91f, 11.62f, 5.86f, 11.71f, 5.82f)
                curveTo(11.89f, 5.74f, 12.1f, 5.74f, 12.28f, 5.82f)
                curveTo(12.37f, 5.86f, 12.45f, 5.91f, 12.52f, 5.98f)
                lineTo(15.52f, 8.98f)
                curveTo(15.81f, 9.27f, 15.81f, 9.75f, 15.52f, 10.04f)
                curveTo(15.37f, 10.19f, 15.18f, 10.26f, 14.99f, 10.26f)
                curveTo(14.8f, 10.26f, 14.61f, 10.19f, 14.46f, 10.04f)
                lineTo(12.74f, 8.32f)
                verticalLineTo(14.51f)
                curveTo(12.74f, 14.92f, 12.4f, 15.26f, 11.99f, 15.26f)
                curveTo(11.58f, 15.26f, 11.24f, 14.92f, 11.24f, 14.51f)
                verticalLineTo(8.32f)
                lineTo(9.52f, 10.04f)
                curveTo(9.23f, 10.33f, 8.75f, 10.33f, 8.46f, 10.04f)
                curveTo(8.17f, 9.75f, 8.18f, 9.28f, 8.47f, 8.98f)
                close()
                moveTo(18.24f, 17.22f)
                curveTo(16.23f, 17.89f, 14.12f, 18.23f, 12.0f, 18.23f)
                curveTo(9.88f, 18.23f, 7.77f, 17.89f, 5.76f, 17.22f)
                curveTo(5.37f, 17.09f, 5.16f, 16.66f, 5.29f, 16.27f)
                curveTo(5.42f, 15.88f, 5.85f, 15.66f, 6.24f, 15.8f)
                curveTo(9.96f, 17.04f, 14.05f, 17.04f, 17.77f, 15.8f)
                curveTo(18.16f, 15.67f, 18.59f, 15.88f, 18.72f, 16.27f)
                curveTo(18.84f, 16.67f, 18.63f, 17.09f, 18.24f, 17.22f)
                close()
            }
        }
        .build()
        return _sendsquare!!
    }

private var _sendsquare: ImageVector? = null

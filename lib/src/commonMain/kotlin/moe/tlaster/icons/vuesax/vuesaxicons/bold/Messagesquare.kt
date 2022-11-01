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

public val BoldGroup.Messagesquare: ImageVector
    get() {
        if (_messagesquare != null) {
            return _messagesquare!!
        }
        _messagesquare = Builder(name = "Messagesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(18.28f, 12.91f)
                curveTo(18.28f, 13.11f, 18.27f, 13.31f, 18.25f, 13.5f)
                curveTo(18.07f, 15.62f, 16.82f, 16.68f, 14.52f, 16.68f)
                horizontalLineTo(14.2f)
                curveTo(14.0f, 16.68f, 13.81f, 16.77f, 13.7f, 16.93f)
                lineTo(12.76f, 18.19f)
                curveTo(12.34f, 18.75f, 11.67f, 18.75f, 11.25f, 18.19f)
                lineTo(10.31f, 16.93f)
                curveTo(10.21f, 16.8f, 9.98f, 16.68f, 9.81f, 16.68f)
                horizontalLineTo(9.49f)
                curveTo(6.98f, 16.68f, 5.73f, 16.06f, 5.73f, 12.92f)
                verticalLineTo(9.76f)
                curveTo(5.73f, 7.46f, 6.79f, 6.21f, 8.91f, 6.03f)
                curveTo(9.08f, 6.01f, 9.28f, 6.0f, 9.49f, 6.0f)
                horizontalLineTo(14.52f)
                curveTo(17.03f, 6.0f, 18.28f, 7.26f, 18.28f, 9.76f)
                verticalLineTo(12.91f)
                close()
            }
        }
        .build()
        return _messagesquare!!
    }

private var _messagesquare: ImageVector? = null

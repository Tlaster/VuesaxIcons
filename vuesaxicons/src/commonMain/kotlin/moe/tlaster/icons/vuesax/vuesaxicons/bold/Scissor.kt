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

public val BoldGroup.Scissor: ImageVector
    get() {
        if (_scissor != null) {
            return _scissor!!
        }
        _scissor = Builder(name = "Scissor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.76f, 14.68f)
                curveTo(18.09f, 14.93f, 18.16f, 15.4f, 17.91f, 15.73f)
                curveTo(17.76f, 15.93f, 17.54f, 16.03f, 17.31f, 16.03f)
                curveTo(17.15f, 16.03f, 17.0f, 15.98f, 16.86f, 15.88f)
                lineTo(12.91f, 12.93f)
                lineTo(10.5f, 14.73f)
                curveTo(10.51f, 14.83f, 10.53f, 14.93f, 10.53f, 15.03f)
                curveTo(10.53f, 16.3f, 9.5f, 17.33f, 8.23f, 17.33f)
                curveTo(6.96f, 17.33f, 5.93f, 16.3f, 5.93f, 15.03f)
                curveTo(5.93f, 13.76f, 6.96f, 12.73f, 8.23f, 12.73f)
                curveTo(8.85f, 12.73f, 9.4f, 12.98f, 9.81f, 13.37f)
                lineTo(11.65f, 11.99f)
                lineTo(9.82f, 10.62f)
                curveTo(9.41f, 11.02f, 8.84f, 11.27f, 8.22f, 11.27f)
                curveTo(6.95f, 11.27f, 5.92f, 10.24f, 5.92f, 8.97f)
                curveTo(5.92f, 7.7f, 6.95f, 6.67f, 8.22f, 6.67f)
                curveTo(9.49f, 6.67f, 10.52f, 7.7f, 10.52f, 8.97f)
                curveTo(10.52f, 9.07f, 10.5f, 9.16f, 10.49f, 9.25f)
                lineTo(12.89f, 11.05f)
                lineTo(16.84f, 8.1f)
                curveTo(17.17f, 7.85f, 17.64f, 7.92f, 17.89f, 8.25f)
                curveTo(18.14f, 8.58f, 18.07f, 9.05f, 17.74f, 9.3f)
                lineTo(14.14f, 11.99f)
                lineTo(17.76f, 14.68f)
                close()
            }
        }
        .build()
        return _scissor!!
    }

private var _scissor: ImageVector? = null

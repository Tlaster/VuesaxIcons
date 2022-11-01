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

public val BoldGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.13f, 14.5f)
                curveTo(10.42f, 14.79f, 10.42f, 15.27f, 10.13f, 15.56f)
                curveTo(9.98f, 15.71f, 9.79f, 15.78f, 9.6f, 15.78f)
                curveTo(9.41f, 15.78f, 9.22f, 15.71f, 9.07f, 15.56f)
                lineTo(6.58f, 13.07f)
                curveTo(5.99f, 12.48f, 5.99f, 11.53f, 6.58f, 10.94f)
                lineTo(9.07f, 8.45f)
                curveTo(9.36f, 8.16f, 9.84f, 8.16f, 10.13f, 8.45f)
                curveTo(10.42f, 8.74f, 10.42f, 9.22f, 10.13f, 9.51f)
                lineTo(7.64f, 12.0f)
                lineTo(10.13f, 14.5f)
                close()
                moveTo(17.42f, 13.06f)
                lineTo(14.93f, 15.55f)
                curveTo(14.78f, 15.7f, 14.59f, 15.77f, 14.4f, 15.77f)
                curveTo(14.21f, 15.77f, 14.02f, 15.7f, 13.87f, 15.55f)
                curveTo(13.58f, 15.26f, 13.58f, 14.78f, 13.87f, 14.49f)
                lineTo(16.36f, 12.0f)
                lineTo(13.87f, 9.5f)
                curveTo(13.58f, 9.21f, 13.58f, 8.73f, 13.87f, 8.44f)
                curveTo(14.16f, 8.15f, 14.64f, 8.15f, 14.93f, 8.44f)
                lineTo(17.42f, 10.93f)
                curveTo(18.01f, 11.52f, 18.01f, 12.48f, 17.42f, 13.06f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null

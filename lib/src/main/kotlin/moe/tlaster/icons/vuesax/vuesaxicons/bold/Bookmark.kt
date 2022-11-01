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

public val BoldGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.8098f)
                verticalLineTo(16.1898f)
                curveTo(22.0f, 19.3998f, 19.4f, 21.9998f, 16.19f, 21.9998f)
                horizontalLineTo(7.81f)
                curveTo(4.6f, 21.9998f, 2.0f, 19.3998f, 2.0f, 16.1898f)
                verticalLineTo(7.8098f)
                curveTo(2.0f, 5.3198f, 3.02f, 3.5098f, 4.83f, 2.6298f)
                curveTo(5.49f, 2.3098f, 6.25f, 2.8098f, 6.25f, 3.5398f)
                verticalLineTo(12.4198f)
                curveTo(6.25f, 13.6098f, 6.71f, 14.5598f, 7.54f, 15.0398f)
                curveTo(8.38f, 15.5098f, 9.44f, 15.4098f, 10.52f, 14.7598f)
                lineTo(11.82f, 13.9798f)
                curveTo(11.9f, 13.9398f, 12.1f, 13.9398f, 12.16f, 13.9698f)
                lineTo(13.48f, 14.7598f)
                curveTo(14.2f, 15.1898f, 14.82f, 15.3298f, 15.32f, 15.3298f)
                curveTo(15.84f, 15.3298f, 16.24f, 15.1698f, 16.48f, 15.0298f)
                curveTo(17.29f, 14.5598f, 17.75f, 13.6098f, 17.75f, 12.4198f)
                verticalLineTo(3.5398f)
                curveTo(17.75f, 2.8098f, 18.52f, 2.3098f, 19.17f, 2.6298f)
                curveTo(20.98f, 3.5098f, 22.0f, 5.3198f, 22.0f, 7.8098f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 2.0f)
                curveTo(15.8f, 2.0f, 16.25f, 2.45f, 16.25f, 3.0f)
                verticalLineTo(12.42f)
                curveTo(16.25f, 13.06f, 16.06f, 13.54f, 15.73f, 13.73f)
                curveTo(15.39f, 13.93f, 14.85f, 13.83f, 14.25f, 13.47f)
                lineTo(12.93f, 12.68f)
                curveTo(12.42f, 12.37f, 11.58f, 12.37f, 11.07f, 12.68f)
                lineTo(9.75f, 13.47f)
                curveTo(9.15f, 13.83f, 8.61f, 13.92f, 8.27f, 13.73f)
                curveTo(7.94f, 13.54f, 7.75f, 13.06f, 7.75f, 12.42f)
                verticalLineTo(3.0f)
                curveTo(7.75f, 2.45f, 8.2f, 2.0f, 8.75f, 2.0f)
                horizontalLineTo(15.25f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null

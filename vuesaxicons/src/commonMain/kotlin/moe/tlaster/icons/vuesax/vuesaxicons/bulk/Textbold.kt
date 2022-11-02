package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Textbold: ImageVector
    get() {
        if (_textbold != null) {
            return _textbold!!
        }
        _textbold = Builder(name = "Textbold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(22.0f, 19.83f, 19.83f, 22.0f, 16.19f, 22.0f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 22.0f, 7.41f, 21.99f, 7.22f, 21.98f)
                curveTo(5.99f, 21.9f, 4.95f, 21.55f, 4.13f, 20.95f)
                curveTo(3.71f, 20.66f, 3.34f, 20.29f, 3.05f, 19.87f)
                curveTo(2.36f, 18.92f, 2.0f, 17.68f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.37f, 3.94f, 2.24f, 7.22f, 2.03f)
                curveTo(7.41f, 2.01f, 7.61f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(17.68f, 2.0f, 18.92f, 2.36f, 19.87f, 3.05f)
                curveTo(20.29f, 3.34f, 20.66f, 3.71f, 20.95f, 4.13f)
                curveTo(21.64f, 5.08f, 22.0f, 6.32f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.03f, 11.49f)
                curveTo(15.63f, 10.83f, 16.0f, 9.96f, 16.0f, 9.0f)
                curveTo(16.0f, 6.93f, 14.32f, 5.25f, 12.25f, 5.25f)
                horizontalLineTo(9.01f)
                curveTo(7.9f, 5.25f, 7.0f, 6.15f, 7.0f, 7.26f)
                verticalLineTo(16.74f)
                curveTo(7.0f, 17.85f, 7.9f, 18.75f, 9.01f, 18.75f)
                horizontalLineTo(13.75f)
                curveTo(15.82f, 18.75f, 17.5f, 17.07f, 17.5f, 15.0f)
                curveTo(17.5f, 13.38f, 16.47f, 12.02f, 15.03f, 11.49f)
                close()
                moveTo(8.5f, 7.26f)
                curveTo(8.5f, 6.98f, 8.73f, 6.75f, 9.01f, 6.75f)
                horizontalLineTo(12.25f)
                curveTo(13.49f, 6.75f, 14.5f, 7.76f, 14.5f, 9.0f)
                curveTo(14.5f, 10.24f, 13.49f, 11.25f, 12.25f, 11.25f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.26f)
                close()
                moveTo(13.75f, 17.25f)
                horizontalLineTo(9.01f)
                curveTo(8.73f, 17.25f, 8.5f, 17.02f, 8.5f, 16.74f)
                verticalLineTo(12.75f)
                horizontalLineTo(13.75f)
                curveTo(14.99f, 12.75f, 16.0f, 13.76f, 16.0f, 15.0f)
                curveTo(16.0f, 16.24f, 14.99f, 17.25f, 13.75f, 17.25f)
                close()
            }
        }
        .build()
        return _textbold!!
    }

private var _textbold: ImageVector? = null

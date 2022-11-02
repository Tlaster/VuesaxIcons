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

public val BulkGroup.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text = Builder(name = "Text", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.67f, 5.6401f)
                horizontalLineTo(7.33f)
                curveTo(6.18f, 5.6401f, 5.25f, 6.5701f, 5.25f, 7.7201f)
                verticalLineTo(8.9001f)
                curveTo(5.25f, 9.3101f, 5.59f, 9.6501f, 6.0f, 9.6501f)
                curveTo(6.41f, 9.6501f, 6.75f, 9.3101f, 6.75f, 8.9001f)
                verticalLineTo(7.7201f)
                curveTo(6.75f, 7.4001f, 7.01f, 7.1401f, 7.33f, 7.1401f)
                horizontalLineTo(11.25f)
                verticalLineTo(16.8601f)
                horizontalLineTo(9.47f)
                curveTo(9.06f, 16.8601f, 8.72f, 17.2001f, 8.72f, 17.6101f)
                curveTo(8.72f, 18.0201f, 9.06f, 18.3601f, 9.47f, 18.3601f)
                horizontalLineTo(14.54f)
                curveTo(14.95f, 18.3601f, 15.29f, 18.0201f, 15.29f, 17.6101f)
                curveTo(15.29f, 17.2001f, 14.95f, 16.8601f, 14.54f, 16.8601f)
                horizontalLineTo(12.76f)
                verticalLineTo(7.1401f)
                horizontalLineTo(16.68f)
                curveTo(17.0f, 7.1401f, 17.26f, 7.4001f, 17.26f, 7.7201f)
                verticalLineTo(8.9001f)
                curveTo(17.26f, 9.3101f, 17.6f, 9.6501f, 18.01f, 9.6501f)
                curveTo(18.42f, 9.6501f, 18.76f, 9.3101f, 18.76f, 8.9001f)
                verticalLineTo(7.7201f)
                curveTo(18.75f, 6.5801f, 17.82f, 5.6401f, 16.67f, 5.6401f)
                close()
            }
        }
        .build()
        return _text!!
    }

private var _text: ImageVector? = null

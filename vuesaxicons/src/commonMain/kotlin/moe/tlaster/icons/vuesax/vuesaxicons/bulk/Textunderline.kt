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

public val BulkGroup.Textunderline: ImageVector
    get() {
        if (_textunderline != null) {
            return _textunderline!!
        }
        _textunderline = Builder(name = "Textunderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.8299f, 18.96f)
                horizontalLineTo(7.1699f)
                curveTo(6.7599f, 18.96f, 6.4199f, 18.62f, 6.4199f, 18.21f)
                curveTo(6.4199f, 17.8f, 6.7599f, 17.46f, 7.1699f, 17.46f)
                horizontalLineTo(16.8399f)
                curveTo(17.2499f, 17.46f, 17.5899f, 17.8f, 17.5899f, 18.21f)
                curveTo(17.5899f, 18.62f, 17.2499f, 18.96f, 16.8299f, 18.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 16.2f)
                curveTo(8.9199f, 16.2f, 6.4199f, 13.7f, 6.4199f, 10.62f)
                verticalLineTo(5.79f)
                curveTo(6.4199f, 5.38f, 6.7599f, 5.04f, 7.1699f, 5.04f)
                curveTo(7.5799f, 5.04f, 7.9199f, 5.38f, 7.9199f, 5.79f)
                verticalLineTo(10.62f)
                curveTo(7.9199f, 12.87f, 9.7499f, 14.7f, 11.9999f, 14.7f)
                curveTo(14.2499f, 14.7f, 16.0799f, 12.87f, 16.0799f, 10.62f)
                verticalLineTo(5.79f)
                curveTo(16.0799f, 5.38f, 16.4199f, 5.04f, 16.8299f, 5.04f)
                curveTo(17.2399f, 5.04f, 17.5799f, 5.38f, 17.5799f, 5.79f)
                verticalLineTo(10.62f)
                curveTo(17.5799f, 13.7f, 15.0799f, 16.2f, 11.9999f, 16.2f)
                close()
            }
        }
        .build()
        return _textunderline!!
    }

private var _textunderline: ImageVector? = null

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

public val BulkGroup.Textitalic: ImageVector
    get() {
        if (_textitalic != null) {
            return _textitalic!!
        }
        _textitalic = Builder(name = "Textitalic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.8706f, 6.0098f)
                horizontalLineTo(10.4906f)
                curveTo(10.0806f, 6.0098f, 9.7406f, 6.3498f, 9.7406f, 6.7598f)
                curveTo(9.7406f, 7.1698f, 10.0806f, 7.5098f, 10.4906f, 7.5098f)
                horizontalLineTo(12.3806f)
                lineTo(10.1406f, 16.4798f)
                horizontalLineTo(8.1406f)
                curveTo(7.7306f, 16.4798f, 7.3906f, 16.8198f, 7.3906f, 17.2298f)
                curveTo(7.3906f, 17.6398f, 7.7306f, 17.9798f, 8.1406f, 17.9798f)
                horizontalLineTo(13.5206f)
                curveTo(13.9306f, 17.9798f, 14.2706f, 17.6398f, 14.2706f, 17.2298f)
                curveTo(14.2706f, 16.8198f, 13.9306f, 16.4798f, 13.5206f, 16.4798f)
                horizontalLineTo(11.6806f)
                lineTo(13.9206f, 7.5098f)
                horizontalLineTo(15.8706f)
                curveTo(16.2806f, 7.5098f, 16.6206f, 7.1698f, 16.6206f, 6.7598f)
                curveTo(16.6206f, 6.3498f, 16.2806f, 6.0098f, 15.8706f, 6.0098f)
                close()
            }
        }
        .build()
        return _textitalic!!
    }

private var _textitalic: ImageVector? = null

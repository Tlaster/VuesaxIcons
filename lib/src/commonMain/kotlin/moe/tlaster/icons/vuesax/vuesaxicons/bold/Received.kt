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

public val BoldGroup.Received: ImageVector
    get() {
        if (_received != null) {
            return _received!!
        }
        _received = Builder(name = "Received", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.71f, 18.1914f)
                curveTo(4.81f, 18.2314f, 4.9f, 18.2514f, 5.0f, 18.2514f)
                horizontalLineTo(15.27f)
                curveTo(15.68f, 18.2514f, 16.02f, 17.9114f, 16.02f, 17.5014f)
                curveTo(16.02f, 17.0914f, 15.68f, 16.7514f, 15.27f, 16.7514f)
                horizontalLineTo(6.81f)
                lineTo(19.53f, 4.0314f)
                curveTo(19.82f, 3.7414f, 19.82f, 3.2614f, 19.53f, 2.9714f)
                curveTo(19.24f, 2.6814f, 18.76f, 2.6814f, 18.47f, 2.9714f)
                lineTo(5.75f, 15.6914f)
                verticalLineTo(7.2314f)
                curveTo(5.75f, 6.8214f, 5.41f, 6.4814f, 5.0f, 6.4814f)
                curveTo(4.59f, 6.4814f, 4.25f, 6.8214f, 4.25f, 7.2314f)
                verticalLineTo(17.5014f)
                curveTo(4.25f, 17.6014f, 4.27f, 17.6914f, 4.31f, 17.7914f)
                curveTo(4.38f, 17.9714f, 4.53f, 18.1214f, 4.71f, 18.1914f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 21.25f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 21.25f, 2.75f, 21.59f, 2.75f, 22.0f)
                curveTo(2.75f, 22.41f, 3.09f, 22.75f, 3.5f, 22.75f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 22.75f, 21.25f, 22.41f, 21.25f, 22.0f)
                curveTo(21.25f, 21.59f, 20.91f, 21.25f, 20.5f, 21.25f)
                close()
            }
        }
        .build()
        return _received!!
    }

private var _received: ImageVector? = null

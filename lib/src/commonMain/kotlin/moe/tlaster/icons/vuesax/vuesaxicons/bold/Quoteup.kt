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

public val BoldGroup.Quoteup: ImageVector
    get() {
        if (_quoteup != null) {
            return _quoteup!!
        }
        _quoteup = Builder(name = "Quoteup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.09f, 11.6314f)
                horizontalLineTo(3.4f)
                curveTo(3.48f, 6.9614f, 4.4f, 6.1914f, 7.27f, 4.4914f)
                curveTo(7.6f, 4.2914f, 7.71f, 3.8714f, 7.51f, 3.5314f)
                curveTo(7.32f, 3.2014f, 6.89f, 3.0914f, 6.56f, 3.2914f)
                curveTo(3.18f, 5.2914f, 2.0f, 6.5114f, 2.0f, 12.3214f)
                verticalLineTo(17.7114f)
                curveTo(2.0f, 19.4214f, 3.39f, 20.8014f, 5.09f, 20.8014f)
                horizontalLineTo(8.09f)
                curveTo(9.85f, 20.8014f, 11.18f, 19.4714f, 11.18f, 17.7114f)
                verticalLineTo(14.7114f)
                curveTo(11.18f, 12.9614f, 9.85f, 11.6314f, 8.09f, 11.6314f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9086f, 11.6314f)
                horizontalLineTo(14.2186f)
                curveTo(14.2986f, 6.9614f, 15.2186f, 6.1914f, 18.0886f, 4.4914f)
                curveTo(18.4186f, 4.2914f, 18.5286f, 3.8714f, 18.3286f, 3.5314f)
                curveTo(18.1286f, 3.2014f, 17.7086f, 3.0914f, 17.3686f, 3.2914f)
                curveTo(13.9886f, 5.2914f, 12.8086f, 6.5114f, 12.8086f, 12.3314f)
                verticalLineTo(17.7214f)
                curveTo(12.8086f, 19.4314f, 14.1986f, 20.8114f, 15.8986f, 20.8114f)
                horizontalLineTo(18.8986f)
                curveTo(20.6586f, 20.8114f, 21.9886f, 19.4814f, 21.9886f, 17.7214f)
                verticalLineTo(14.7214f)
                curveTo(21.9986f, 12.9614f, 20.6686f, 11.6314f, 18.9086f, 11.6314f)
                close()
            }
        }
        .build()
        return _quoteup!!
    }

private var _quoteup: ImageVector? = null

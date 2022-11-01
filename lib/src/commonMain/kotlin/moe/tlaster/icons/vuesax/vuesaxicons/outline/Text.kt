package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text = Builder(name = "Text", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.3299f, 7.9198f)
                curveTo(20.9199f, 7.9198f, 20.5799f, 7.5798f, 20.5799f, 7.1698f)
                verticalLineTo(5.3498f)
                curveTo(20.5799f, 4.6198f, 19.9899f, 4.0298f, 19.2599f, 4.0298f)
                horizontalLineTo(4.7399f)
                curveTo(4.0099f, 4.0298f, 3.4199f, 4.6198f, 3.4199f, 5.3498f)
                verticalLineTo(7.1798f)
                curveTo(3.4199f, 7.5898f, 3.0799f, 7.9298f, 2.6699f, 7.9298f)
                curveTo(2.2599f, 7.9298f, 1.9199f, 7.5898f, 1.9199f, 7.1698f)
                verticalLineTo(5.3498f)
                curveTo(1.9199f, 3.7898f, 3.1899f, 2.5298f, 4.7399f, 2.5298f)
                horizontalLineTo(19.2599f)
                curveTo(20.8199f, 2.5298f, 22.0799f, 3.7998f, 22.0799f, 5.3498f)
                verticalLineTo(7.1798f)
                curveTo(22.0799f, 7.5898f, 21.7499f, 7.9198f, 21.3299f, 7.9198f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.4699f)
                curveTo(11.59f, 21.4699f, 11.25f, 21.1299f, 11.25f, 20.7199f)
                verticalLineTo(4.1099f)
                curveTo(11.25f, 3.6999f, 11.59f, 3.3599f, 12.0f, 3.3599f)
                curveTo(12.41f, 3.3599f, 12.75f, 3.6999f, 12.75f, 4.1099f)
                verticalLineTo(20.7199f)
                curveTo(12.75f, 21.1399f, 12.41f, 21.4699f, 12.0f, 21.4699f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9405f, 21.4702f)
                horizontalLineTo(8.0605f)
                curveTo(7.6505f, 21.4702f, 7.3106f, 21.1302f, 7.3106f, 20.7202f)
                curveTo(7.3106f, 20.3102f, 7.6505f, 19.9702f, 8.0605f, 19.9702f)
                horizontalLineTo(15.9405f)
                curveTo(16.3505f, 19.9702f, 16.6905f, 20.3102f, 16.6905f, 20.7202f)
                curveTo(16.6905f, 21.1302f, 16.3505f, 21.4702f, 15.9405f, 21.4702f)
                close()
            }
        }
        .build()
        return _text!!
    }

private var _text: ImageVector? = null

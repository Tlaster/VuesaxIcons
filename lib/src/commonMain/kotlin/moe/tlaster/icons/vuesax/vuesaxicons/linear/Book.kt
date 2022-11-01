package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 16.7399f)
                verticalLineTo(4.6699f)
                curveTo(22.0f, 3.4699f, 21.02f, 2.5799f, 19.83f, 2.6799f)
                horizontalLineTo(19.77f)
                curveTo(17.67f, 2.8599f, 14.48f, 3.9299f, 12.7f, 5.0499f)
                lineTo(12.53f, 5.1599f)
                curveTo(12.24f, 5.3399f, 11.76f, 5.3399f, 11.47f, 5.1599f)
                lineTo(11.22f, 5.0099f)
                curveTo(9.44f, 3.8999f, 6.26f, 2.8399f, 4.16f, 2.6699f)
                curveTo(2.97f, 2.5699f, 2.0f, 3.4699f, 2.0f, 4.6599f)
                verticalLineTo(16.7399f)
                curveTo(2.0f, 17.6999f, 2.78f, 18.5999f, 3.74f, 18.7199f)
                lineTo(4.03f, 18.7599f)
                curveTo(6.2f, 19.0499f, 9.55f, 20.1499f, 11.47f, 21.1999f)
                lineTo(11.51f, 21.2199f)
                curveTo(11.78f, 21.3699f, 12.21f, 21.3699f, 12.47f, 21.2199f)
                curveTo(14.39f, 20.1599f, 17.75f, 19.0499f, 19.93f, 18.7599f)
                lineTo(20.26f, 18.7199f)
                curveTo(21.22f, 18.5999f, 22.0f, 17.6999f, 22.0f, 16.7399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.49f)
                verticalLineTo(20.49f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.75f, 8.49f)
                horizontalLineTo(5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 11.49f)
                horizontalLineTo(5.5f)
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null

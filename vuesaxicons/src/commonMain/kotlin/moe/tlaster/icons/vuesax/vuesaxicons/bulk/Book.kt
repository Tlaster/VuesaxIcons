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

public val BulkGroup.Book: ImageVector
    get() {
        if (_book != null) {
            return _book!!
        }
        _book = Builder(name = "Book", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.2999f)
                verticalLineTo(21.3299f)
                curveTo(11.83f, 21.3299f, 11.65f, 21.2999f, 11.51f, 21.2199f)
                lineTo(11.47f, 21.1999f)
                curveTo(9.55f, 20.1499f, 6.2f, 19.0499f, 4.03f, 18.7599f)
                lineTo(3.74f, 18.7199f)
                curveTo(2.78f, 18.5999f, 2.0f, 17.6999f, 2.0f, 16.7399f)
                verticalLineTo(4.6599f)
                curveTo(2.0f, 3.4699f, 2.97f, 2.5699f, 4.16f, 2.6699f)
                curveTo(6.26f, 2.8399f, 9.44f, 3.8999f, 11.22f, 5.0099f)
                lineTo(11.47f, 5.1599f)
                curveTo(11.62f, 5.2499f, 11.81f, 5.2999f, 12.0f, 5.2999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.67f)
                verticalLineTo(16.74f)
                curveTo(22.0f, 17.7f, 21.22f, 18.6f, 20.26f, 18.72f)
                lineTo(19.93f, 18.76f)
                curveTo(17.75f, 19.05f, 14.39f, 20.16f, 12.47f, 21.22f)
                curveTo(12.34f, 21.3f, 12.18f, 21.33f, 12.0f, 21.33f)
                verticalLineTo(5.3f)
                curveTo(12.19f, 5.3f, 12.38f, 5.25f, 12.53f, 5.16f)
                lineTo(12.7f, 5.05f)
                curveTo(14.48f, 3.93f, 17.67f, 2.86f, 19.77f, 2.68f)
                horizontalLineTo(19.83f)
                curveTo(21.02f, 2.58f, 22.0f, 3.47f, 22.0f, 4.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 9.24f)
                horizontalLineTo(5.5f)
                curveTo(5.09f, 9.24f, 4.75f, 8.9f, 4.75f, 8.49f)
                curveTo(4.75f, 8.08f, 5.09f, 7.74f, 5.5f, 7.74f)
                horizontalLineTo(7.75f)
                curveTo(8.16f, 7.74f, 8.5f, 8.08f, 8.5f, 8.49f)
                curveTo(8.5f, 8.9f, 8.16f, 9.24f, 7.75f, 9.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 12.24f)
                horizontalLineTo(5.5f)
                curveTo(5.09f, 12.24f, 4.75f, 11.9f, 4.75f, 11.49f)
                curveTo(4.75f, 11.08f, 5.09f, 10.74f, 5.5f, 10.74f)
                horizontalLineTo(8.5f)
                curveTo(8.91f, 10.74f, 9.25f, 11.08f, 9.25f, 11.49f)
                curveTo(9.25f, 11.9f, 8.91f, 12.24f, 8.5f, 12.24f)
                close()
            }
        }
        .build()
        return _book!!
    }

private var _book: ImageVector? = null

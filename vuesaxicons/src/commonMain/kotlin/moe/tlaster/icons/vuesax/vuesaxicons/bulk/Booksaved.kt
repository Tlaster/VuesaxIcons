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

public val BulkGroup.Booksaved: ImageVector
    get() {
        if (_booksaved != null) {
            return _booksaved!!
        }
        _booksaved = Builder(name = "Booksaved", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.3002f)
                verticalLineTo(21.3302f)
                curveTo(12.17f, 21.3302f, 12.35f, 21.3002f, 12.49f, 21.2202f)
                lineTo(12.53f, 21.2002f)
                curveTo(14.45f, 20.1502f, 17.8f, 19.0502f, 19.97f, 18.7602f)
                lineTo(20.26f, 18.7202f)
                curveTo(21.22f, 18.6002f, 22.0f, 17.7002f, 22.0f, 16.7402f)
                verticalLineTo(4.6602f)
                curveTo(22.0f, 3.4702f, 21.03f, 2.5702f, 19.84f, 2.6702f)
                curveTo(17.74f, 2.8402f, 14.56f, 3.9002f, 12.78f, 5.0102f)
                lineTo(12.53f, 5.1602f)
                curveTo(12.38f, 5.2502f, 12.19f, 5.3002f, 12.0f, 5.3002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.67f)
                verticalLineTo(16.74f)
                curveTo(2.0f, 17.7f, 2.78f, 18.6f, 3.74f, 18.72f)
                lineTo(4.07f, 18.76f)
                curveTo(6.25f, 19.05f, 9.61f, 20.16f, 11.53f, 21.22f)
                curveTo(11.66f, 21.3f, 11.82f, 21.3301f, 12.0f, 21.3301f)
                verticalLineTo(5.3f)
                curveTo(11.81f, 5.3f, 11.62f, 5.25f, 11.47f, 5.16f)
                lineTo(11.3f, 5.05f)
                curveTo(9.52f, 3.93f, 6.33f, 2.86f, 4.23f, 2.68f)
                horizontalLineTo(4.17f)
                curveTo(2.98f, 2.58f, 2.0f, 3.47f, 2.0f, 4.67f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.7803f)
                verticalLineTo(7.0703f)
                curveTo(19.0f, 7.4703f, 18.56f, 7.7102f, 18.22f, 7.4902f)
                lineTo(17.0f, 6.6802f)
                lineTo(15.78f, 7.4902f)
                curveTo(15.45f, 7.7102f, 15.0f, 7.4703f, 15.0f, 7.0703f)
                verticalLineTo(3.9202f)
                curveTo(16.31f, 3.4002f, 17.77f, 2.9803f, 19.0f, 2.7803f)
                close()
            }
        }
        .build()
        return _booksaved!!
    }

private var _booksaved: ImageVector? = null

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

public val BulkGroup.Booksquare: ImageVector
    get() {
        if (_booksquare != null) {
            return _booksquare!!
        }
        _booksquare = Builder(name = "Booksquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4991f, 8.09f)
                verticalLineTo(17.25f)
                curveTo(11.4991f, 17.61f, 11.1391f, 17.85f, 10.8091f, 17.71f)
                curveTo(9.5991f, 17.19f, 8.0191f, 16.71f, 6.9191f, 16.57f)
                lineTo(6.7291f, 16.55f)
                curveTo(6.1191f, 16.47f, 5.6191f, 15.9f, 5.6191f, 15.28f)
                verticalLineTo(7.58f)
                curveTo(5.6191f, 6.82f, 6.2392f, 6.25f, 6.9991f, 6.31f)
                curveTo(8.2492f, 6.41f, 10.0992f, 7.01f, 11.2592f, 7.67f)
                curveTo(11.4092f, 7.74f, 11.4991f, 7.91f, 11.4991f, 8.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.38f, 7.6998f)
                verticalLineTo(15.2698f)
                curveTo(18.38f, 15.8898f, 17.88f, 16.4598f, 17.27f, 16.5398f)
                lineTo(17.06f, 16.5598f)
                curveTo(15.97f, 16.7098f, 14.4f, 17.1798f, 13.19f, 17.6898f)
                curveTo(12.86f, 17.8298f, 12.5f, 17.5898f, 12.5f, 17.2298f)
                verticalLineTo(8.0798f)
                curveTo(12.5f, 7.8998f, 12.59f, 7.7298f, 12.75f, 7.6398f)
                curveTo(13.91f, 6.9898f, 15.72f, 6.4098f, 16.95f, 6.2998f)
                horizontalLineTo(16.99f)
                curveTo(17.76f, 6.3098f, 18.38f, 6.9298f, 18.38f, 7.6998f)
                close()
            }
        }
        .build()
        return _booksquare!!
    }

private var _booksquare: ImageVector? = null

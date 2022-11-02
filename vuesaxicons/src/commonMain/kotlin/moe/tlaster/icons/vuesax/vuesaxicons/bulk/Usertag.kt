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

public val BulkGroup.Usertag: ImageVector
    get() {
        if (_usertag != null) {
            return _usertag!!
        }
        _usertag = Builder(name = "Usertag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.86f, 3.0f, 17.53f, 3.0f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(3.0f, 3.34f, 4.34f, 2.01f, 6.0f, 2.01f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.01f, 21.0f, 3.34f, 21.0f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21.0f, 17.52f, 19.66f, 18.86f, 18.0f, 18.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 10.41f)
                curveTo(13.2868f, 10.41f, 14.33f, 9.3668f, 14.33f, 8.08f)
                curveTo(14.33f, 6.7932f, 13.2868f, 5.75f, 11.9999f, 5.75f)
                curveTo(10.7131f, 5.75f, 9.6699f, 6.7932f, 9.6699f, 8.08f)
                curveTo(9.6699f, 9.3668f, 10.7131f, 10.41f, 11.9999f, 10.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6792f, 15.0601f)
                curveTo(15.4892f, 15.0601f, 15.9592f, 14.1601f, 15.5092f, 13.4901f)
                curveTo(14.8292f, 12.4801f, 13.5092f, 11.8f, 11.9992f, 11.8f)
                curveTo(10.4892f, 11.8f, 9.1692f, 12.4801f, 8.4892f, 13.4901f)
                curveTo(8.0392f, 14.1601f, 8.5092f, 15.0601f, 9.3192f, 15.0601f)
                horizontalLineTo(14.6792f)
                close()
            }
        }
        .build()
        return _usertag!!
    }

private var _usertag: ImageVector? = null

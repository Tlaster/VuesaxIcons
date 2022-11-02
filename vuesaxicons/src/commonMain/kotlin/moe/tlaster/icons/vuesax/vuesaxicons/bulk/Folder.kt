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

public val BulkGroup.Folder: ImageVector
    get() {
        if (_folder != null) {
            return _folder!!
        }
        _folder = Builder(name = "Folder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0699f)
                verticalLineTo(16.6499f)
                curveTo(22.0f, 19.5999f, 19.6f, 21.9999f, 16.65f, 21.9999f)
                horizontalLineTo(7.35f)
                curveTo(4.4f, 21.9999f, 2.0f, 19.5999f, 2.0f, 16.6499f)
                verticalLineTo(9.4399f)
                horizontalLineTo(21.74f)
                curveTo(21.89f, 9.8899f, 21.97f, 10.3499f, 21.99f, 10.8399f)
                curveTo(22.0f, 10.9099f, 22.0f, 10.9999f, 22.0f, 11.0699f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.74f, 9.44f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.42f)
                curveTo(2.0f, 3.98f, 3.98f, 2.0f, 6.42f, 2.0f)
                horizontalLineTo(8.75f)
                curveTo(10.38f, 2.0f, 10.89f, 2.53f, 11.54f, 3.4f)
                lineTo(12.94f, 5.26f)
                curveTo(13.25f, 5.67f, 13.29f, 5.73f, 13.87f, 5.73f)
                horizontalLineTo(16.66f)
                curveTo(19.03f, 5.72f, 21.05f, 7.28f, 21.74f, 9.44f)
                close()
            }
        }
        .build()
        return _folder!!
    }

private var _folder: ImageVector? = null

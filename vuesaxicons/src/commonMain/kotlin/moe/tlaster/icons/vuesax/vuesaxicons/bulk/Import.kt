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

public val BulkGroup.Import: ImageVector
    get() {
        if (_import != null) {
            return _import!!
        }
        _import = Builder(name = "Import", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.7599f)
                curveTo(22.0f, 10.2899f, 21.62f, 9.8999f, 21.14f, 9.8999f)
                horizontalLineTo(2.86f)
                curveTo(2.38f, 9.8999f, 2.0f, 10.2799f, 2.0f, 10.7599f)
                curveTo(2.0f, 16.6499f, 6.11f, 20.7599f, 12.0f, 20.7599f)
                curveTo(17.89f, 20.7599f, 22.0f, 16.6399f, 22.0f, 10.7599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4598f, 15.9f)
                lineTo(15.3098f, 13.06f)
                curveTo(15.5998f, 12.77f, 15.5998f, 12.29f, 15.3098f, 12.0f)
                curveTo(15.0198f, 11.71f, 14.5398f, 11.71f, 14.2498f, 12.0f)
                lineTo(12.6898f, 13.56f)
                verticalLineTo(3.99f)
                curveTo(12.6898f, 3.58f, 12.3498f, 3.24f, 11.9398f, 3.24f)
                curveTo(11.5298f, 3.24f, 11.1898f, 3.58f, 11.1898f, 3.99f)
                verticalLineTo(13.56f)
                lineTo(9.6198f, 12.0f)
                curveTo(9.3298f, 11.71f, 8.8498f, 11.71f, 8.5598f, 12.0f)
                curveTo(8.4098f, 12.15f, 8.3398f, 12.34f, 8.3398f, 12.53f)
                curveTo(8.3398f, 12.72f, 8.4098f, 12.91f, 8.5598f, 13.06f)
                lineTo(11.4098f, 15.9f)
                curveTo(11.6998f, 16.2f, 12.1698f, 16.2f, 12.4598f, 15.9f)
                close()
            }
        }
        .build()
        return _import!!
    }

private var _import: ImageVector? = null

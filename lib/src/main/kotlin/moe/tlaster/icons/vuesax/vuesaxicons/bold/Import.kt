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

public val BoldGroup.Import: ImageVector
    get() {
        if (_import != null) {
            return _import!!
        }
        _import = Builder(name = "Import", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.14f, 9.8984f)
                horizontalLineTo(12.68f)
                verticalLineTo(13.5684f)
                lineTo(14.25f, 11.9984f)
                curveTo(14.54f, 11.7084f, 15.02f, 11.7084f, 15.31f, 11.9984f)
                curveTo(15.6f, 12.2884f, 15.6f, 12.7684f, 15.31f, 13.0584f)
                lineTo(12.46f, 15.8984f)
                curveTo(12.17f, 16.1884f, 11.69f, 16.1884f, 11.4f, 15.8984f)
                lineTo(8.55f, 13.0584f)
                curveTo(8.4f, 12.9084f, 8.33f, 12.7184f, 8.33f, 12.5284f)
                curveTo(8.33f, 12.3384f, 8.41f, 12.1484f, 8.56f, 11.9984f)
                curveTo(8.85f, 11.7084f, 9.33f, 11.7084f, 9.62f, 11.9984f)
                lineTo(11.18f, 13.5584f)
                verticalLineTo(9.8984f)
                horizontalLineTo(2.86f)
                curveTo(2.38f, 9.8984f, 2.0f, 10.2784f, 2.0f, 10.7584f)
                curveTo(2.0f, 16.6484f, 6.11f, 20.7584f, 12.0f, 20.7584f)
                curveTo(17.89f, 20.7584f, 22.0f, 16.6484f, 22.0f, 10.7584f)
                curveTo(22.0f, 10.2784f, 21.62f, 9.8984f, 21.14f, 9.8984f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6797f, 3.9883f)
                curveTo(12.6797f, 3.5783f, 12.3397f, 3.2383f, 11.9297f, 3.2383f)
                curveTo(11.5197f, 3.2383f, 11.1797f, 3.5783f, 11.1797f, 3.9883f)
                verticalLineTo(9.8883f)
                horizontalLineTo(12.6797f)
                verticalLineTo(3.9883f)
                close()
            }
        }
        .build()
        return _import!!
    }

private var _import: ImageVector? = null

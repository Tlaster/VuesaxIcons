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

public val BoldGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 10.19f)
                horizontalLineTo(17.61f)
                curveTo(15.24f, 10.19f, 13.31f, 8.26f, 13.31f, 5.89f)
                verticalLineTo(3.0f)
                curveTo(13.31f, 2.45f, 12.86f, 2.0f, 12.31f, 2.0f)
                horizontalLineTo(8.07f)
                curveTo(4.99f, 2.0f, 2.5f, 4.0f, 2.5f, 7.57f)
                verticalLineTo(16.43f)
                curveTo(2.5f, 20.0f, 4.99f, 22.0f, 8.07f, 22.0f)
                horizontalLineTo(15.93f)
                curveTo(19.01f, 22.0f, 21.5f, 20.0f, 21.5f, 16.43f)
                verticalLineTo(11.19f)
                curveTo(21.5f, 10.64f, 21.05f, 10.19f, 20.5f, 10.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7997f, 2.2105f)
                curveTo(15.3897f, 1.8005f, 14.6797f, 2.0805f, 14.6797f, 2.6505f)
                verticalLineTo(6.1405f)
                curveTo(14.6797f, 7.6005f, 15.9197f, 8.8105f, 17.4297f, 8.8105f)
                curveTo(18.3797f, 8.8205f, 19.6997f, 8.8205f, 20.8297f, 8.8205f)
                curveTo(21.3997f, 8.8205f, 21.6997f, 8.1505f, 21.2997f, 7.7505f)
                curveTo(19.8597f, 6.3005f, 17.2797f, 3.6905f, 15.7997f, 2.2105f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null

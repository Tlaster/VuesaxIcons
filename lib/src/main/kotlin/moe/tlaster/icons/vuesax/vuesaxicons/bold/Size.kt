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

public val BoldGroup.Size: ImageVector
    get() {
        if (_size != null) {
            return _size!!
        }
        _size = Builder(name = "Size", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9707f, 5.5f)
                verticalLineTo(9.5f)
                curveTo(21.9707f, 11.2615f, 20.6712f, 12.7232f, 18.9692f, 12.9649f)
                curveTo(18.6958f, 13.0038f, 18.4707f, 12.7761f, 18.4707f, 12.5f)
                verticalLineTo(12.25f)
                curveTo(18.4707f, 8.53f, 15.4507f, 5.5f, 11.7207f, 5.5f)
                horizontalLineTo(11.4707f)
                curveTo(11.1946f, 5.5f, 10.9669f, 5.2749f, 11.0061f, 5.0015f)
                curveTo(11.2488f, 3.3068f, 12.7099f, 2.0f, 14.4707f, 2.0f)
                horizontalLineTo(18.4707f)
                curveTo(20.4107f, 2.0f, 21.9707f, 3.57f, 21.9707f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7207f, 7.0f)
                horizontalLineTo(10.9707f)
                horizontalLineTo(6.9707f)
                curveTo(4.2107f, 7.0f, 1.9707f, 9.24f, 1.9707f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(1.9707f, 19.76f, 4.2107f, 22.0f, 6.9707f, 22.0f)
                horizontalLineTo(11.9707f)
                curveTo(14.7307f, 22.0f, 16.9707f, 19.76f, 16.9707f, 17.0f)
                verticalLineTo(13.0f)
                verticalLineTo(12.25f)
                curveTo(16.9707f, 9.35f, 14.6207f, 7.0f, 11.7207f, 7.0f)
                close()
            }
        }
        .build()
        return _size!!
    }

private var _size: ImageVector? = null

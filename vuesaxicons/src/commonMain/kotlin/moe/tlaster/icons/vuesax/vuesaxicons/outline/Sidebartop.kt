package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Sidebartop: ImageVector
    get() {
        if (_sidebartop != null) {
            return _sidebartop!!
        }
        _sidebartop = Builder(name = "Sidebartop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9707f, 22.75f)
                horizontalLineTo(8.9707f)
                curveTo(3.5407f, 22.75f, 1.2207f, 20.43f, 1.2207f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.2207f, 3.57f, 3.5407f, 1.25f, 8.9707f, 1.25f)
                horizontalLineTo(14.9707f)
                curveTo(20.4007f, 1.25f, 22.7207f, 3.57f, 22.7207f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.7207f, 20.43f, 20.4107f, 22.75f, 14.9707f, 22.75f)
                close()
                moveTo(8.9707f, 2.75f)
                curveTo(4.3607f, 2.75f, 2.7207f, 4.39f, 2.7207f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.7207f, 19.61f, 4.3607f, 21.25f, 8.9707f, 21.25f)
                horizontalLineTo(14.9707f)
                curveTo(19.5807f, 21.25f, 21.2207f, 19.61f, 21.2207f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.2207f, 4.39f, 19.5807f, 2.75f, 14.9707f, 2.75f)
                horizontalLineTo(8.9707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2.0f, 7.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 7.75f, 22.75f, 8.09f, 22.75f, 8.5f)
                curveTo(22.75f, 8.91f, 22.41f, 9.25f, 22.0f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5609f, 16.2499f)
                curveTo(14.3709f, 16.2499f, 14.1809f, 16.1799f, 14.0309f, 16.0299f)
                lineTo(12.0009f, 13.9999f)
                lineTo(9.9709f, 16.0299f)
                curveTo(9.6809f, 16.3199f, 9.2009f, 16.3199f, 8.9109f, 16.0299f)
                curveTo(8.6209f, 15.7399f, 8.6209f, 15.2599f, 8.9109f, 14.9699f)
                lineTo(11.4709f, 12.4099f)
                curveTo(11.7609f, 12.1199f, 12.2409f, 12.1199f, 12.5309f, 12.4099f)
                lineTo(15.0909f, 14.9699f)
                curveTo(15.3809f, 15.2599f, 15.3809f, 15.7399f, 15.0909f, 16.0299f)
                curveTo(14.9409f, 16.1799f, 14.7509f, 16.2499f, 14.5609f, 16.2499f)
                close()
            }
        }
        .build()
        return _sidebartop!!
    }

private var _sidebartop: ImageVector? = null

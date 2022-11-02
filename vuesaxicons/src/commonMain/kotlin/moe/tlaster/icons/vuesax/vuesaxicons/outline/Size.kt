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

public val OutlineGroup.Size: ImageVector
    get() {
        if (_size != null) {
            return _size!!
        }
        _size = Builder(name = "Size", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.7207f, 22.75f)
                horizontalLineTo(7.2207f)
                curveTo(3.0707f, 22.75f, 1.2207f, 20.9f, 1.2207f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.2207f, 8.1f, 3.0707f, 6.25f, 7.2207f, 6.25f)
                horizontalLineTo(11.7207f)
                curveTo(15.8707f, 6.25f, 17.7207f, 8.1f, 17.7207f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(17.7207f, 20.9f, 15.8707f, 22.75f, 11.7207f, 22.75f)
                close()
                moveTo(7.2207f, 7.75f)
                curveTo(3.9007f, 7.75f, 2.7207f, 8.93f, 2.7207f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2.7207f, 20.07f, 3.9007f, 21.25f, 7.2207f, 21.25f)
                horizontalLineTo(11.7207f)
                curveTo(15.0407f, 21.25f, 16.2207f, 20.07f, 16.2207f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(16.2207f, 8.93f, 15.0407f, 7.75f, 11.7207f, 7.75f)
                horizontalLineTo(7.2207f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1207f, 13.75f)
                horizontalLineTo(16.9707f)
                curveTo(16.5607f, 13.75f, 16.2207f, 13.41f, 16.2207f, 13.0f)
                verticalLineTo(12.25f)
                curveTo(16.2207f, 8.93f, 15.0407f, 7.75f, 11.7207f, 7.75f)
                horizontalLineTo(10.9707f)
                curveTo(10.5607f, 7.75f, 10.2207f, 7.41f, 10.2207f, 7.0f)
                verticalLineTo(5.85f)
                curveTo(10.2207f, 2.67f, 11.6407f, 1.25f, 14.8207f, 1.25f)
                horizontalLineTo(18.1207f)
                curveTo(21.3007f, 1.25f, 22.7207f, 2.67f, 22.7207f, 5.85f)
                verticalLineTo(9.15f)
                curveTo(22.7207f, 12.33f, 21.3007f, 13.75f, 18.1207f, 13.75f)
                close()
                moveTo(17.7207f, 12.25f)
                horizontalLineTo(18.1207f)
                curveTo(20.4707f, 12.25f, 21.2207f, 11.5f, 21.2207f, 9.15f)
                verticalLineTo(5.85f)
                curveTo(21.2207f, 3.5f, 20.4707f, 2.75f, 18.1207f, 2.75f)
                horizontalLineTo(14.8207f)
                curveTo(12.4707f, 2.75f, 11.7207f, 3.5f, 11.7207f, 5.85f)
                verticalLineTo(6.25f)
                curveTo(15.8707f, 6.25f, 17.7207f, 8.1f, 17.7207f, 12.25f)
                close()
            }
        }
        .build()
        return _size!!
    }

private var _size: ImageVector? = null

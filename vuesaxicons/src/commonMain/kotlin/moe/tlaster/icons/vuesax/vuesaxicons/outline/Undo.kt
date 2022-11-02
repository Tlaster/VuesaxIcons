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

public val OutlineGroup.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1309f, 19.0601f)
                horizontalLineTo(7.1309f)
                curveTo(6.7209f, 19.0601f, 6.3809f, 18.7201f, 6.3809f, 18.3101f)
                curveTo(6.3809f, 17.9001f, 6.7209f, 17.5601f, 7.1309f, 17.5601f)
                horizontalLineTo(15.1309f)
                curveTo(17.4709f, 17.5601f, 19.3809f, 15.6501f, 19.3809f, 13.3101f)
                curveTo(19.3809f, 10.9701f, 17.4709f, 9.0601f, 15.1309f, 9.0601f)
                horizontalLineTo(4.1309f)
                curveTo(3.7209f, 9.0601f, 3.3809f, 8.7201f, 3.3809f, 8.3101f)
                curveTo(3.3809f, 7.9001f, 3.7209f, 7.5601f, 4.1309f, 7.5601f)
                horizontalLineTo(15.1309f)
                curveTo(18.3009f, 7.5601f, 20.8809f, 10.1401f, 20.8809f, 13.3101f)
                curveTo(20.8809f, 16.4801f, 18.3009f, 19.0601f, 15.1309f, 19.0601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.4306f, 11.5599f)
                curveTo(6.2406f, 11.5599f, 6.0505f, 11.4899f, 5.9005f, 11.3399f)
                lineTo(3.3405f, 8.7799f)
                curveTo(3.0505f, 8.4899f, 3.0505f, 8.0099f, 3.3405f, 7.7199f)
                lineTo(5.9005f, 5.1599f)
                curveTo(6.1905f, 4.8699f, 6.6705f, 4.8699f, 6.9605f, 5.1599f)
                curveTo(7.2505f, 5.4499f, 7.2505f, 5.9299f, 6.9605f, 6.2199f)
                lineTo(4.9306f, 8.2499f)
                lineTo(6.9605f, 10.2799f)
                curveTo(7.2505f, 10.5699f, 7.2505f, 11.0499f, 6.9605f, 11.3399f)
                curveTo(6.8205f, 11.4899f, 6.6206f, 11.5599f, 6.4306f, 11.5599f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null

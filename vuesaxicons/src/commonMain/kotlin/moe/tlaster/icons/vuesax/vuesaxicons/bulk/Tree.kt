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

public val BulkGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1694f, 10.0601f)
                horizontalLineTo(7.8293f)
                curveTo(6.6493f, 10.0601f, 6.2393f, 9.2701f, 6.9293f, 8.3101f)
                lineTo(11.0994f, 2.4701f)
                curveTo(11.5894f, 1.7701f, 12.4093f, 1.7701f, 12.8993f, 2.4701f)
                lineTo(17.0694f, 8.3101f)
                curveTo(17.7594f, 9.2701f, 17.3494f, 10.0601f, 16.1694f, 10.0601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5896f, 18.0001f)
                horizontalLineTo(6.4096f)
                curveTo(4.8296f, 18.0001f, 4.2896f, 16.9501f, 5.2196f, 15.6701f)
                lineTo(9.2096f, 10.0601f)
                horizontalLineTo(14.7896f)
                lineTo(18.7796f, 15.6701f)
                curveTo(19.7096f, 16.9501f, 19.1696f, 18.0001f, 17.5896f, 18.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 18.0f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12.0f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null

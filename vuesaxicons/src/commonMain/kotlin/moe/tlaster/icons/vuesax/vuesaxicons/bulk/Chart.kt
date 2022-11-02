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

public val BulkGroup.Chart: ImageVector
    get() {
        if (_chart != null) {
            return _chart!!
        }
        _chart = Builder(name = "Chart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.3499f)
                curveTo(6.59f, 14.3499f, 6.25f, 14.0099f, 6.25f, 13.5999f)
                verticalLineTo(10.3999f)
                curveTo(6.25f, 9.9899f, 6.59f, 9.6499f, 7.0f, 9.6499f)
                curveTo(7.41f, 9.6499f, 7.75f, 9.9899f, 7.75f, 10.3999f)
                verticalLineTo(13.6099f)
                curveTo(7.75f, 14.0199f, 7.41f, 14.3499f, 7.0f, 14.3499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0902f)
                curveTo(11.59f, 16.0902f, 11.25f, 15.7502f, 11.25f, 15.3402f)
                verticalLineTo(8.6602f)
                curveTo(11.25f, 8.2502f, 11.59f, 7.9102f, 12.0f, 7.9102f)
                curveTo(12.41f, 7.9102f, 12.75f, 8.2502f, 12.75f, 8.6602f)
                verticalLineTo(15.3402f)
                curveTo(12.75f, 15.7502f, 12.41f, 16.0902f, 12.0f, 16.0902f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.3499f)
                curveTo(16.59f, 14.3499f, 16.25f, 14.0099f, 16.25f, 13.5999f)
                verticalLineTo(10.3999f)
                curveTo(16.25f, 9.9899f, 16.59f, 9.6499f, 17.0f, 9.6499f)
                curveTo(17.41f, 9.6499f, 17.75f, 9.9899f, 17.75f, 10.3999f)
                verticalLineTo(13.6099f)
                curveTo(17.75f, 14.0199f, 17.41f, 14.3499f, 17.0f, 14.3499f)
                close()
            }
        }
        .build()
        return _chart!!
    }

private var _chart: ImageVector? = null

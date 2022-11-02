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

public val BulkGroup.Direct: ImageVector
    get() {
        if (_direct != null) {
            return _direct!!
        }
        _direct = Builder(name = "Direct", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(21.3f, 12.23f)
                horizontalLineTo(17.82f)
                curveTo(16.84f, 12.23f, 15.97f, 12.77f, 15.53f, 13.65f)
                lineTo(14.69f, 15.31f)
                curveTo(14.49f, 15.71f, 14.09f, 15.96f, 13.65f, 15.96f)
                horizontalLineTo(10.37f)
                curveTo(10.06f, 15.96f, 9.62f, 15.89f, 9.33f, 15.31f)
                lineTo(8.49f, 13.66f)
                curveTo(8.05f, 12.79f, 7.17f, 12.24f, 6.2f, 12.24f)
                horizontalLineTo(2.7f)
                curveTo(2.31f, 12.24f, 2.0f, 12.55f, 2.0f, 12.94f)
                verticalLineTo(16.2f)
                curveTo(2.0f, 19.83f, 4.18f, 22.0f, 7.82f, 22.0f)
                horizontalLineTo(16.2f)
                curveTo(19.63f, 22.0f, 21.74f, 20.12f, 22.0f, 16.78f)
                verticalLineTo(12.93f)
                curveTo(22.0f, 12.55f, 21.69f, 12.23f, 21.3f, 12.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.55f, 7.7999f)
                horizontalLineTo(10.45f)
                curveTo(10.06f, 7.7999f, 9.75f, 7.4899f, 9.75f, 7.0999f)
                curveTo(9.75f, 6.7099f, 10.06f, 6.3999f, 10.45f, 6.3999f)
                horizontalLineTo(13.55f)
                curveTo(13.94f, 6.3999f, 14.25f, 6.7099f, 14.25f, 7.0999f)
                curveTo(14.25f, 7.4899f, 13.93f, 7.7999f, 13.55f, 7.7999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3307f, 10.5899f)
                horizontalLineTo(9.6707f)
                curveTo(9.2807f, 10.5899f, 8.9707f, 10.2799f, 8.9707f, 9.8899f)
                curveTo(8.9707f, 9.4999f, 9.2807f, 9.1899f, 9.6707f, 9.1899f)
                horizontalLineTo(14.3207f)
                curveTo(14.7107f, 9.1899f, 15.0207f, 9.4999f, 15.0207f, 9.8899f)
                curveTo(15.0207f, 10.2799f, 14.7107f, 10.5899f, 14.3307f, 10.5899f)
                close()
            }
        }
        .build()
        return _direct!!
    }

private var _direct: ImageVector? = null

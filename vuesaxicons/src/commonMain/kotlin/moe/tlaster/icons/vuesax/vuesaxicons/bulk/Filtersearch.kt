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

public val BulkGroup.Filtersearch: ImageVector
    get() {
        if (_filtersearch != null) {
            return _filtersearch!!
        }
        _filtersearch = Builder(name = "Filtersearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7491f, 15.41f)
                lineTo(18.8992f, 14.56f)
                curveTo(19.3392f, 13.89f, 19.5991f, 13.1f, 19.5991f, 12.24f)
                curveTo(19.5991f, 9.9f, 17.6991f, 8.0f, 15.3591f, 8.0f)
                curveTo(13.0191f, 8.0f, 11.1191f, 9.9f, 11.1191f, 12.24f)
                curveTo(11.1191f, 14.58f, 13.0191f, 16.48f, 15.3591f, 16.48f)
                curveTo(16.2191f, 16.48f, 17.0191f, 16.22f, 17.6791f, 15.78f)
                lineTo(18.5292f, 16.63f)
                curveTo(18.6992f, 16.8f, 18.9192f, 16.88f, 19.1392f, 16.88f)
                curveTo(19.3592f, 16.88f, 19.5791f, 16.8f, 19.7491f, 16.63f)
                curveTo(20.0791f, 16.29f, 20.0791f, 15.74f, 19.7491f, 15.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4102f, 2.0f)
                horizontalLineTo(18.5802f)
                curveTo(19.6802f, 2.0f, 20.5802f, 2.91f, 20.5802f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(20.5802f, 7.05f, 20.0802f, 8.06f, 19.5802f, 8.56f)
                lineTo(15.2902f, 12.4f)
                curveTo(14.6902f, 12.91f, 14.2902f, 13.92f, 14.2902f, 14.72f)
                verticalLineTo(19.06f)
                curveTo(14.2902f, 19.67f, 13.8902f, 20.47f, 13.3902f, 20.78f)
                lineTo(11.9902f, 21.69f)
                curveTo(10.6902f, 22.5f, 8.9002f, 21.59f, 8.9002f, 19.97f)
                verticalLineTo(14.62f)
                curveTo(8.9002f, 13.91f, 8.5002f, 13.0f, 8.1002f, 12.5f)
                lineTo(4.3102f, 8.46f)
                curveTo(3.8102f, 7.95f, 3.4102f, 7.05f, 3.4102f, 6.44f)
                verticalLineTo(4.12f)
                curveTo(3.4202f, 2.91f, 4.3202f, 2.0f, 5.4102f, 2.0f)
                close()
            }
        }
        .build()
        return _filtersearch!!
    }

private var _filtersearch: ImageVector? = null

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

public val BulkGroup.Filtertick: ImageVector
    get() {
        if (_filtertick != null) {
            return _filtertick!!
        }
        _filtertick = Builder(name = "Filtertick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9208f, 10.12f)
                curveTo(17.5908f, 10.04f, 17.2409f, 10.0f, 16.8809f, 10.0f)
                curveTo(14.2609f, 10.0f, 12.1309f, 12.13f, 12.1309f, 14.75f)
                curveTo(12.1309f, 15.64f, 12.3809f, 16.48f, 12.8209f, 17.2f)
                curveTo(13.1909f, 17.82f, 13.7009f, 18.35f, 14.3209f, 18.73f)
                curveTo(15.0609f, 19.22f, 15.9409f, 19.5f, 16.8809f, 19.5f)
                curveTo(18.6209f, 19.5f, 20.1309f, 18.57f, 20.9509f, 17.2f)
                curveTo(21.3909f, 16.48f, 21.6309f, 15.64f, 21.6309f, 14.75f)
                curveTo(21.6309f, 12.49f, 20.0508f, 10.59f, 17.9208f, 10.12f)
                close()
                moveTo(19.2509f, 14.13f)
                lineTo(16.7109f, 16.47f)
                curveTo(16.5709f, 16.6f, 16.3809f, 16.67f, 16.2009f, 16.67f)
                curveTo(16.0109f, 16.67f, 15.8208f, 16.6f, 15.6708f, 16.45f)
                lineTo(14.5009f, 15.28f)
                curveTo(14.2109f, 14.99f, 14.2109f, 14.51f, 14.5009f, 14.22f)
                curveTo(14.7909f, 13.93f, 15.2709f, 13.93f, 15.5609f, 14.22f)
                lineTo(16.2208f, 14.88f)
                lineTo(18.2308f, 13.03f)
                curveTo(18.5408f, 12.75f, 19.0108f, 12.77f, 19.2908f, 13.07f)
                curveTo(19.5708f, 13.38f, 19.5509f, 13.85f, 19.2509f, 14.13f)
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
        return _filtertick!!
    }

private var _filtertick: ImageVector? = null

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

public val BulkGroup.Volumemute: ImageVector
    get() {
        if (_volumemute != null) {
            return _volumemute!!
        }
        _volumemute = Builder(name = "Volumemute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.25f, 7.4102f)
                verticalLineTo(16.5902f)
                curveTo(19.25f, 18.3102f, 18.63f, 19.6002f, 17.52f, 20.2202f)
                curveTo(17.07f, 20.4702f, 16.57f, 20.5902f, 16.05f, 20.5902f)
                curveTo(15.25f, 20.5902f, 14.39f, 20.3202f, 13.51f, 19.7702f)
                lineTo(10.59f, 17.9402f)
                curveTo(10.39f, 17.8202f, 10.16f, 17.7502f, 9.93f, 17.7502f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.2502f)
                horizontalLineTo(9.93f)
                curveTo(10.16f, 6.2502f, 10.39f, 6.1802f, 10.59f, 6.0602f)
                lineTo(13.51f, 4.2302f)
                curveTo(14.97f, 3.3202f, 16.4f, 3.1602f, 17.52f, 3.7802f)
                curveTo(18.63f, 4.4002f, 19.25f, 5.6902f, 19.25f, 7.4102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.25f)
                verticalLineTo(17.75f)
                horizontalLineTo(8.5f)
                curveTo(6.08f, 17.75f, 4.75f, 16.42f, 4.75f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(4.75f, 7.58f, 6.08f, 6.25f, 8.5f, 6.25f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _volumemute!!
    }

private var _volumemute: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BulkGroup

public val BulkGroup.Wanchain1: ImageVector
    get() {
        if (_wanchain1 != null) {
            return _wanchain1!!
        }
        _wanchain1 = Builder(name = "Wanchain1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.7502f, 9.43f)
                lineTo(8.5002f, 15.0f)
                lineTo(7.8702f, 16.09f)
                lineTo(5.4002f, 20.31f)
                curveTo(5.2202f, 20.63f, 4.7602f, 20.64f, 4.5602f, 20.33f)
                lineTo(1.1802f, 15.28f)
                curveTo(1.0702f, 15.11f, 1.0702f, 14.89f, 1.1802f, 14.72f)
                lineTo(4.8502f, 9.22f)
                curveTo(4.9402f, 9.08f, 5.1002f, 9.0f, 5.2702f, 9.0f)
                horizontalLineTo(11.5002f)
                lineTo(11.7502f, 9.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.8391f, 14.73f)
                lineTo(16.1392f, 3.25f)
                curveTo(16.0592f, 3.09f, 15.8891f, 3.0f, 15.7091f, 3.0f)
                horizontalLineTo(8.8691f)
                curveTo(8.4791f, 3.0f, 8.2392f, 3.42f, 8.4391f, 3.75f)
                lineTo(11.4991f, 9.0f)
                lineTo(11.7491f, 9.43f)
                lineTo(14.5591f, 14.25f)
                curveTo(14.7591f, 14.58f, 14.5192f, 15.0f, 14.1292f, 15.0f)
                horizontalLineTo(8.4992f)
                lineTo(7.8691f, 16.09f)
                curveTo(8.0491f, 15.77f, 8.5091f, 15.76f, 8.7091f, 16.07f)
                lineTo(11.8492f, 20.78f)
                curveTo(11.9392f, 20.92f, 12.0991f, 21.0f, 12.2691f, 21.0f)
                horizontalLineTo(18.7292f)
                curveTo(18.8992f, 21.0f, 19.0591f, 20.92f, 19.1491f, 20.78f)
                lineTo(22.8291f, 15.26f)
                curveTo(22.9291f, 15.1f, 22.9391f, 14.9f, 22.8391f, 14.73f)
                close()
            }
        }
        .build()
        return _wanchain1!!
    }

private var _wanchain1: ImageVector? = null

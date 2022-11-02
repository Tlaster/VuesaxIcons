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

public val BulkGroup.Chart2: ImageVector
    get() {
        if (_chart2 != null) {
            return _chart2!!
        }
        _chart2 = Builder(name = "Chart2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.4198f, 7.8099f)
                verticalLineTo(16.1899f)
                curveTo(16.4198f, 16.8299f, 15.8998f, 17.3499f, 15.2598f, 17.3499f)
                curveTo(14.6098f, 17.3499f, 14.0898f, 16.8299f, 14.0898f, 16.1899f)
                verticalLineTo(7.8099f)
                curveTo(14.0898f, 7.1699f, 14.6098f, 6.6499f, 15.2598f, 6.6499f)
                curveTo(15.8998f, 6.6499f, 16.4198f, 7.1699f, 16.4198f, 7.8099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9101f, 12.93f)
                verticalLineTo(16.19f)
                curveTo(9.9101f, 16.83f, 9.3901f, 17.35f, 8.7401f, 17.35f)
                curveTo(8.1001f, 17.35f, 7.5801f, 16.83f, 7.5801f, 16.19f)
                verticalLineTo(12.93f)
                curveTo(7.5801f, 12.29f, 8.1001f, 11.77f, 8.7401f, 11.77f)
                curveTo(9.3901f, 11.77f, 9.9101f, 12.29f, 9.9101f, 12.93f)
                close()
            }
        }
        .build()
        return _chart2!!
    }

private var _chart2: ImageVector? = null

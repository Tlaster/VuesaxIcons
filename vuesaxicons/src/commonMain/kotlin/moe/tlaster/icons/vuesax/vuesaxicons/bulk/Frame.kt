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

public val BulkGroup.Frame: ImageVector
    get() {
        if (_frame != null) {
            return _frame!!
        }
        _frame = Builder(name = "Frame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 5.5f)
                verticalLineTo(7.5f)
                curveTo(11.0f, 7.78f, 10.78f, 8.0f, 10.5f, 8.0f)
                horizontalLineTo(9.0f)
                curveTo(8.45f, 8.0f, 8.0f, 8.45f, 8.0f, 9.0f)
                verticalLineTo(10.5f)
                curveTo(8.0f, 10.78f, 7.78f, 11.0f, 7.5f, 11.0f)
                horizontalLineTo(5.5f)
                curveTo(5.22f, 11.0f, 5.0f, 10.78f, 5.0f, 10.5f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 6.79f, 6.79f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(10.5f)
                curveTo(10.78f, 5.0f, 11.0f, 5.22f, 11.0f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 16.22f, 13.22f, 16.0f, 13.5f, 16.0f)
                horizontalLineTo(15.0f)
                curveTo(15.55f, 16.0f, 16.0f, 15.55f, 16.0f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(16.0f, 13.22f, 16.22f, 13.0f, 16.5f, 13.0f)
                horizontalLineTo(18.5f)
                curveTo(18.78f, 13.0f, 19.0f, 13.22f, 19.0f, 13.5f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 17.21f, 17.21f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(13.5f)
                curveTo(13.22f, 19.0f, 13.0f, 18.78f, 13.0f, 18.5f)
                close()
            }
        }
        .build()
        return _frame!!
    }

private var _frame: ImageVector? = null

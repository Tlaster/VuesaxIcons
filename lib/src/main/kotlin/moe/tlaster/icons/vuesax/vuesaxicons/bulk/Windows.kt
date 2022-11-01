package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val BulkGroup.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(20.8f, 2.24f)
                lineTo(12.8f, 3.84f)
                curveTo(12.33f, 3.93f, 12.0f, 4.34f, 12.0f, 4.82f)
                verticalLineTo(10.0f)
                curveTo(12.0f, 10.55f, 12.45f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 11.0f, 22.0f, 10.55f, 22.0f, 10.0f)
                verticalLineTo(3.22f)
                curveTo(22.0f, 2.59f, 21.42f, 2.12f, 20.8f, 2.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.8f, 21.76f)
                lineTo(12.8f, 20.16f)
                curveTo(12.33f, 20.07f, 12.0f, 19.66f, 12.0f, 19.18f)
                verticalLineTo(14.0f)
                curveTo(12.0f, 13.45f, 12.45f, 13.0f, 13.0f, 13.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 13.0f, 22.0f, 13.45f, 22.0f, 14.0f)
                verticalLineTo(20.78f)
                curveTo(22.0f, 21.41f, 21.42f, 21.88f, 20.8f, 21.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.79f, 4.5601f)
                lineTo(2.79f, 5.8401f)
                curveTo(2.33f, 5.9401f, 2.0f, 6.3501f, 2.0f, 6.8201f)
                verticalLineTo(10.0001f)
                curveTo(2.0f, 10.5501f, 2.45f, 11.0001f, 3.0f, 11.0001f)
                horizontalLineTo(9.0f)
                curveTo(9.55f, 11.0001f, 10.0f, 10.5501f, 10.0f, 10.0001f)
                verticalLineTo(5.5301f)
                curveTo(10.0f, 4.9001f, 9.41f, 4.4201f, 8.79f, 4.5601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(8.79f, 19.44f)
                lineTo(2.79f, 18.16f)
                curveTo(2.33f, 18.06f, 2.0f, 17.65f, 2.0f, 17.18f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 13.45f, 2.45f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(9.0f)
                curveTo(9.55f, 13.0f, 10.0f, 13.45f, 10.0f, 14.0f)
                verticalLineTo(18.47f)
                curveTo(10.0f, 19.1f, 9.41f, 19.58f, 8.79f, 19.44f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null

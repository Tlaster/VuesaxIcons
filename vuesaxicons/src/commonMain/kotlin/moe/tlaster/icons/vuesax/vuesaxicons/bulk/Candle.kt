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

public val BulkGroup.Candle: ImageVector
    get() {
        if (_candle != null) {
            return _candle!!
        }
        _candle = Builder(name = "Candle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 4.5f)
                horizontalLineTo(7.25f)
                verticalLineTo(2.0f)
                curveTo(7.25f, 1.59f, 6.91f, 1.25f, 6.5f, 1.25f)
                curveTo(6.09f, 1.25f, 5.75f, 1.59f, 5.75f, 2.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.5f)
                curveTo(3.91f, 4.5f, 3.0f, 5.41f, 3.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 14.59f, 3.91f, 15.5f, 5.5f, 15.5f)
                horizontalLineTo(5.75f)
                verticalLineTo(22.0f)
                curveTo(5.75f, 22.41f, 6.09f, 22.75f, 6.5f, 22.75f)
                curveTo(6.91f, 22.75f, 7.25f, 22.41f, 7.25f, 22.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(7.5f)
                curveTo(9.09f, 15.5f, 10.0f, 14.59f, 10.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(10.0f, 5.41f, 9.09f, 4.5f, 7.5f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 8.5f)
                horizontalLineTo(18.25f)
                verticalLineTo(2.0f)
                curveTo(18.25f, 1.59f, 17.91f, 1.25f, 17.5f, 1.25f)
                curveTo(17.09f, 1.25f, 16.75f, 1.59f, 16.75f, 2.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(16.5f)
                curveTo(14.91f, 8.5f, 14.0f, 9.41f, 14.0f, 11.0f)
                verticalLineTo(17.0f)
                curveTo(14.0f, 18.59f, 14.91f, 19.5f, 16.5f, 19.5f)
                horizontalLineTo(16.75f)
                verticalLineTo(22.0f)
                curveTo(16.75f, 22.41f, 17.09f, 22.75f, 17.5f, 22.75f)
                curveTo(17.91f, 22.75f, 18.25f, 22.41f, 18.25f, 22.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(18.5f)
                curveTo(20.09f, 19.5f, 21.0f, 18.59f, 21.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 9.41f, 20.09f, 8.5f, 18.5f, 8.5f)
                close()
            }
        }
        .build()
        return _candle!!
    }

private var _candle: ImageVector? = null

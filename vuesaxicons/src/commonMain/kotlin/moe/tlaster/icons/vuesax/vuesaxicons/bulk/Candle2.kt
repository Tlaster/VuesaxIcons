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

public val BulkGroup.Candle2: ImageVector
    get() {
        if (_candle2 != null) {
            return _candle2!!
        }
        _candle2 = Builder(name = "Candle2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.75f, 17.5f)
                curveTo(22.75f, 17.91f, 22.41f, 18.25f, 22.0f, 18.25f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.5f)
                curveTo(15.0f, 20.0f, 14.1f, 20.5f, 13.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 20.5f, 5.0f, 20.0f, 5.0f, 18.5f)
                verticalLineTo(18.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 18.25f, 1.25f, 17.91f, 1.25f, 17.5f)
                curveTo(1.25f, 17.09f, 1.59f, 16.75f, 2.0f, 16.75f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 15.0f, 5.9f, 14.5f, 7.0f, 14.5f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 14.5f, 15.0f, 15.0f, 15.0f, 16.5f)
                verticalLineTo(16.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 16.75f, 22.75f, 17.09f, 22.75f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.75f, 6.5f)
                curveTo(22.75f, 6.91f, 22.41f, 7.25f, 22.0f, 7.25f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.5f)
                curveTo(19.0f, 9.0f, 18.1f, 9.5f, 17.0f, 9.5f)
                horizontalLineTo(11.0f)
                curveTo(9.9f, 9.5f, 9.0f, 9.0f, 9.0f, 7.5f)
                verticalLineTo(7.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 7.25f, 1.25f, 6.91f, 1.25f, 6.5f)
                curveTo(1.25f, 6.09f, 1.59f, 5.75f, 2.0f, 5.75f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 4.0f, 9.9f, 3.5f, 11.0f, 3.5f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 3.5f, 19.0f, 4.0f, 19.0f, 5.5f)
                verticalLineTo(5.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 5.75f, 22.75f, 6.09f, 22.75f, 6.5f)
                close()
            }
        }
        .build()
        return _candle2!!
    }

private var _candle2: ImageVector? = null

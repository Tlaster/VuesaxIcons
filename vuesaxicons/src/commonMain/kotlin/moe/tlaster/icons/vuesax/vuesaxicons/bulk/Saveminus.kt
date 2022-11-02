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

public val BulkGroup.Saveminus: ImageVector
    get() {
        if (_saveminus != null) {
            return _saveminus!!
        }
        _saveminus = Builder(name = "Saveminus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 8.9899f)
                verticalLineTo(20.3499f)
                curveTo(16.0f, 21.7999f, 14.96f, 22.4099f, 13.69f, 21.7099f)
                lineTo(9.76f, 19.5199f)
                curveTo(9.34f, 19.2899f, 8.66f, 19.2899f, 8.24f, 19.5199f)
                lineTo(4.31f, 21.7099f)
                curveTo(3.04f, 22.4099f, 2.0f, 21.7999f, 2.0f, 20.3499f)
                verticalLineTo(8.9899f)
                curveTo(2.0f, 7.2799f, 3.4f, 5.8799f, 5.11f, 5.8799f)
                horizontalLineTo(12.89f)
                curveTo(14.6f, 5.8799f, 16.0f, 7.2799f, 16.0f, 8.9899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.11f)
                verticalLineTo(16.47f)
                curveTo(22.0f, 17.92f, 20.96f, 18.53f, 19.69f, 17.83f)
                lineTo(16.0f, 15.77f)
                verticalLineTo(8.99f)
                curveTo(16.0f, 7.28f, 14.6f, 5.88f, 12.89f, 5.88f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.11f)
                curveTo(8.0f, 3.4f, 9.4f, 2.0f, 11.11f, 2.0f)
                horizontalLineTo(18.89f)
                curveTo(20.6f, 2.0f, 22.0f, 3.4f, 22.0f, 5.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12.0f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7.0f, 11.25f)
                horizontalLineTo(11.0f)
                curveTo(11.41f, 11.25f, 11.75f, 11.59f, 11.75f, 12.0f)
                curveTo(11.75f, 12.41f, 11.41f, 12.75f, 11.0f, 12.75f)
                close()
            }
        }
        .build()
        return _saveminus!!
    }

private var _saveminus: ImageVector? = null

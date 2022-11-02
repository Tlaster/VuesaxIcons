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

public val BulkGroup.Crop: ImageVector
    get() {
        if (_crop != null) {
            return _crop!!
        }
        _crop = Builder(name = "Crop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9401f, 4.8301f)
                horizontalLineTo(6.8301f)
                curveTo(5.7301f, 4.8301f, 4.8301f, 5.7301f, 4.8301f, 6.8301f)
                verticalLineTo(13.9401f)
                curveTo(4.8301f, 16.8301f, 7.1701f, 19.1701f, 10.0601f, 19.1701f)
                horizontalLineTo(17.1701f)
                curveTo(18.2701f, 19.1701f, 19.1701f, 18.2701f, 19.1701f, 17.1701f)
                verticalLineTo(10.0601f)
                curveTo(19.1701f, 7.1701f, 16.8301f, 4.8301f, 13.9401f, 4.8301f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.53f, 2.0f)
                curveTo(5.11f, 2.0f, 4.78f, 2.34f, 4.78f, 2.75f)
                verticalLineTo(4.78f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 4.78f, 2.0f, 5.11f, 2.0f, 5.53f)
                curveTo(2.0f, 5.95f, 2.34f, 6.28f, 2.75f, 6.28f)
                horizontalLineTo(5.53f)
                curveTo(5.94f, 6.28f, 6.28f, 5.94f, 6.28f, 5.53f)
                verticalLineTo(2.75f)
                curveTo(6.28f, 2.34f, 5.94f, 2.0f, 5.53f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2507f, 17.7202f)
                horizontalLineTo(18.4707f)
                curveTo(18.0607f, 17.7202f, 17.7207f, 18.0602f, 17.7207f, 18.4702f)
                verticalLineTo(21.2502f)
                curveTo(17.7207f, 21.6602f, 18.0607f, 22.0002f, 18.4707f, 22.0002f)
                curveTo(18.8807f, 22.0002f, 19.2207f, 21.6602f, 19.2207f, 21.2502f)
                verticalLineTo(19.2202f)
                horizontalLineTo(21.2507f)
                curveTo(21.6607f, 19.2202f, 22.0007f, 18.8802f, 22.0007f, 18.4702f)
                curveTo(22.0007f, 18.0602f, 21.6607f, 17.7202f, 21.2507f, 17.7202f)
                close()
            }
        }
        .build()
        return _crop!!
    }

private var _crop: ImageVector? = null

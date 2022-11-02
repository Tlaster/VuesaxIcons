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

public val BulkGroup.Archiveslash: ImageVector
    get() {
        if (_archiveslash != null) {
            return _archiveslash!!
        }
        _archiveslash = Builder(name = "Archiveslash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.68f, 6.3198f)
                verticalLineTo(19.9498f)
                curveTo(20.68f, 21.7498f, 19.39f, 22.5098f, 17.82f, 21.6398f)
                lineTo(12.94f, 18.9198f)
                curveTo(12.42f, 18.6398f, 11.58f, 18.6398f, 11.06f, 18.9198f)
                lineTo(6.18f, 21.6398f)
                curveTo(5.76f, 21.8698f, 5.36f, 21.9898f, 5.0f, 21.9998f)
                lineTo(20.68f, 6.3198f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1203f, 3.88f)
                lineTo(3.3903f, 20.61f)
                curveTo(3.3403f, 20.41f, 3.3203f, 20.19f, 3.3203f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(3.3203f, 3.74f, 5.0503f, 2.0f, 7.1803f, 2.0f)
                horizontalLineTo(16.8203f)
                curveTo(18.2203f, 2.0f, 19.4503f, 2.75f, 20.1203f, 3.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7709f, 2.2299f)
                curveTo(21.4709f, 1.9299f, 20.9809f, 1.9299f, 20.6809f, 2.2299f)
                lineTo(2.2309f, 20.6899f)
                curveTo(1.9309f, 20.9899f, 1.9309f, 21.4799f, 2.2309f, 21.7799f)
                curveTo(2.3809f, 21.9199f, 2.5709f, 21.9999f, 2.7709f, 21.9999f)
                curveTo(2.9709f, 21.9999f, 3.1609f, 21.9199f, 3.3109f, 21.7699f)
                lineTo(21.7709f, 3.3099f)
                curveTo(22.0809f, 3.0099f, 22.0809f, 2.5299f, 21.7709f, 2.2299f)
                close()
            }
        }
        .build()
        return _archiveslash!!
    }

private var _archiveslash: ImageVector? = null

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

public val BulkGroup.Lamp1: ImageVector
    get() {
        if (_lamp1 != null) {
            return _lamp1!!
        }
        _lamp1 = Builder(name = "Lamp1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.7807f, 14.18f)
                verticalLineTo(17.12f)
                curveTo(20.7807f, 18.22f, 19.8807f, 19.12f, 18.7807f, 19.12f)
                horizontalLineTo(5.2207f)
                curveTo(4.1207f, 19.12f, 3.2207f, 18.22f, 3.2207f, 17.12f)
                verticalLineTo(14.18f)
                curveTo(3.2207f, 9.36f, 7.1207f, 5.46f, 11.9407f, 5.46f)
                horizontalLineTo(12.0607f)
                curveTo(16.8807f, 5.45f, 20.7807f, 9.36f, 20.7807f, 14.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 2.53f)
                verticalLineTo(5.49f)
                curveTo(12.52f, 5.47f, 12.29f, 5.46f, 12.06f, 5.46f)
                horizontalLineTo(11.94f)
                curveTo(11.71f, 5.46f, 11.48f, 5.47f, 11.25f, 5.49f)
                verticalLineTo(2.53f)
                curveTo(11.25f, 2.12f, 11.59f, 1.78f, 12.0f, 1.78f)
                curveTo(12.41f, 1.78f, 12.75f, 2.12f, 12.75f, 2.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3197f, 19.1101f)
                curveTo(15.1997f, 20.8501f, 13.7597f, 22.2201f, 11.9997f, 22.2201f)
                curveTo(10.2397f, 22.2201f, 8.7897f, 20.8501f, 8.6797f, 19.1101f)
                horizontalLineTo(15.3197f)
                close()
            }
        }
        .build()
        return _lamp1!!
    }

private var _lamp1: ImageVector? = null

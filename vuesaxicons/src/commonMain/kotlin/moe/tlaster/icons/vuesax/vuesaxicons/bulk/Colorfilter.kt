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

public val BulkGroup.Colorfilter: ImageVector
    get() {
        if (_colorfilter != null) {
            return _colorfilter!!
        }
        _colorfilter = Builder(name = "Colorfilter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                curveTo(14.0f, 17.77f, 13.23f, 19.37f, 12.0f, 20.46f)
                curveTo(10.94f, 21.42f, 9.54f, 22.0f, 8.0f, 22.0f)
                curveTo(4.69f, 22.0f, 2.0f, 19.31f, 2.0f, 16.0f)
                curveTo(2.0f, 13.24f, 3.88f, 10.9f, 6.42f, 10.21f)
                curveTo(7.11f, 11.95f, 8.59f, 13.29f, 10.42f, 13.79f)
                curveTo(10.92f, 13.93f, 11.45f, 14.0f, 12.0f, 14.0f)
                curveTo(12.55f, 14.0f, 13.08f, 13.93f, 13.58f, 13.79f)
                curveTo(13.85f, 14.47f, 14.0f, 15.22f, 14.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                curveTo(18.0f, 8.78f, 17.85f, 9.53f, 17.58f, 10.21f)
                curveTo(16.89f, 11.95f, 15.41f, 13.29f, 13.58f, 13.79f)
                curveTo(13.08f, 13.93f, 12.55f, 14.0f, 12.0f, 14.0f)
                curveTo(11.45f, 14.0f, 10.92f, 13.93f, 10.42f, 13.79f)
                curveTo(8.59f, 13.29f, 7.11f, 11.95f, 6.42f, 10.21f)
                curveTo(6.15f, 9.53f, 6.0f, 8.78f, 6.0f, 8.0f)
                curveTo(6.0f, 4.69f, 8.69f, 2.0f, 12.0f, 2.0f)
                curveTo(15.31f, 2.0f, 18.0f, 4.69f, 18.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                curveTo(22.0f, 19.31f, 19.31f, 22.0f, 16.0f, 22.0f)
                curveTo(14.46f, 22.0f, 13.06f, 21.42f, 12.0f, 20.46f)
                curveTo(13.23f, 19.37f, 14.0f, 17.77f, 14.0f, 16.0f)
                curveTo(14.0f, 15.22f, 13.85f, 14.47f, 13.58f, 13.79f)
                curveTo(15.41f, 13.29f, 16.89f, 11.95f, 17.58f, 10.21f)
                curveTo(20.12f, 10.9f, 22.0f, 13.24f, 22.0f, 16.0f)
                close()
            }
        }
        .build()
        return _colorfilter!!
    }

private var _colorfilter: ImageVector? = null

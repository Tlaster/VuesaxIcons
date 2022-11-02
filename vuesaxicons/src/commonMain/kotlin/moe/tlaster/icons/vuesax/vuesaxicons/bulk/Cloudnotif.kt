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

public val BulkGroup.Cloudnotif: ImageVector
    get() {
        if (_cloudnotif != null) {
            return _cloudnotif!!
        }
        _cloudnotif = Builder(name = "Cloudnotif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5691f, 11.0099f)
                curveTo(19.8091f, 10.0999f, 18.8091f, 9.4899f, 17.6691f, 9.2399f)
                curveTo(17.4191f, 8.0899f, 16.9591f, 7.0899f, 16.3091f, 6.2699f)
                curveTo(16.2891f, 6.2399f, 16.2691f, 6.2099f, 16.2491f, 6.1899f)
                curveTo(14.0591f, 3.5399f, 10.4691f, 3.5499f, 8.0491f, 4.9199f)
                curveTo(5.9791f, 6.0999f, 4.2191f, 8.5899f, 5.1391f, 12.1599f)
                curveTo(3.0191f, 12.6799f, 2.0391f, 14.5299f, 2.0391f, 16.1999f)
                curveTo(2.0391f, 18.0699f, 3.2591f, 20.1799f, 5.9891f, 20.3699f)
                horizontalLineTo(16.2891f)
                curveTo(16.2991f, 20.3699f, 16.3191f, 20.3699f, 16.3291f, 20.3699f)
                curveTo(17.7491f, 20.3699f, 19.0991f, 19.8499f, 20.1391f, 18.8899f)
                curveTo(22.6591f, 16.6899f, 22.3291f, 13.0799f, 20.5691f, 11.0099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2698f, 8.76f)
                curveTo(21.2698f, 9.78f, 20.7998f, 10.7f, 20.0398f, 11.3f)
                curveTo(19.4898f, 11.75f, 18.7798f, 12.02f, 18.0098f, 12.02f)
                curveTo(16.2198f, 12.02f, 14.7598f, 10.56f, 14.7598f, 8.77f)
                curveTo(14.7598f, 7.88f, 15.1198f, 7.07f, 15.7198f, 6.48f)
                verticalLineTo(6.47f)
                curveTo(16.3098f, 5.88f, 17.1198f, 5.51f, 18.0098f, 5.51f)
                curveTo(19.8098f, 5.51f, 21.2698f, 6.97f, 21.2698f, 8.76f)
                close()
            }
        }
        .build()
        return _cloudnotif!!
    }

private var _cloudnotif: ImageVector? = null

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

public val BulkGroup.Video: ImageVector
    get() {
        if (_video != null) {
            return _video!!
        }
        _video = Builder(name = "Video", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 3.25f)
                horizontalLineTo(7.0f)
                curveTo(3.58f, 3.25f, 2.25f, 4.58f, 2.25f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(2.25f, 18.3f, 3.5f, 20.75f, 7.0f, 20.75f)
                horizontalLineTo(13.0f)
                curveTo(16.42f, 20.75f, 17.75f, 19.42f, 17.75f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(17.75f, 4.58f, 16.42f, 3.25f, 13.0f, 3.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4991f, 11.3801f)
                curveTo(12.5374f, 11.3801f, 13.3791f, 10.5384f, 13.3791f, 9.5001f)
                curveTo(13.3791f, 8.4618f, 12.5374f, 7.6201f, 11.4991f, 7.6201f)
                curveTo(10.4608f, 7.6201f, 9.6191f, 8.4618f, 9.6191f, 9.5001f)
                curveTo(9.6191f, 10.5384f, 10.4608f, 11.3801f, 11.4991f, 11.3801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6505f, 6.1701f)
                curveTo(21.2405f, 5.9601f, 20.3805f, 5.7201f, 19.2105f, 6.5401f)
                lineTo(17.7305f, 7.5801f)
                curveTo(17.7405f, 7.7201f, 17.7505f, 7.8501f, 17.7505f, 8.0001f)
                verticalLineTo(16.0001f)
                curveTo(17.7505f, 16.1501f, 17.7305f, 16.2801f, 17.7305f, 16.4201f)
                lineTo(19.2105f, 17.4601f)
                curveTo(19.8305f, 17.9001f, 20.3705f, 18.0401f, 20.8005f, 18.0401f)
                curveTo(21.1705f, 18.0401f, 21.4605f, 17.9401f, 21.6505f, 17.8401f)
                curveTo(22.0605f, 17.6301f, 22.7505f, 17.0601f, 22.7505f, 15.6301f)
                verticalLineTo(8.3801f)
                curveTo(22.7505f, 6.9501f, 22.0605f, 6.3801f, 21.6505f, 6.1701f)
                close()
            }
        }
        .build()
        return _video!!
    }

private var _video: ImageVector? = null

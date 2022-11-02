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

public val BulkGroup.Liketag: ImageVector
    get() {
        if (_liketag != null) {
            return _liketag!!
        }
        _liketag = Builder(name = "Liketag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.86f)
                horizontalLineTo(17.24f)
                curveTo(16.44f, 18.86f, 15.68f, 19.17f, 15.12f, 19.73f)
                lineTo(13.41f, 21.42f)
                curveTo(12.63f, 22.19f, 11.36f, 22.19f, 10.58f, 21.42f)
                lineTo(8.87f, 19.73f)
                curveTo(8.31f, 19.17f, 7.54f, 18.86f, 6.75f, 18.86f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 18.86f, 3.0f, 17.53f, 3.0f, 15.89f)
                verticalLineTo(4.98f)
                curveTo(3.0f, 3.34f, 4.34f, 2.01f, 6.0f, 2.01f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 2.01f, 21.0f, 3.34f, 21.0f, 4.98f)
                verticalLineTo(15.89f)
                curveTo(21.0f, 17.52f, 19.66f, 18.86f, 18.0f, 18.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5805f, 9.57f)
                curveTo(16.3905f, 9.3f, 16.0705f, 9.15f, 15.6905f, 9.15f)
                horizontalLineTo(13.7405f)
                curveTo(13.6105f, 9.15f, 13.4905f, 9.1f, 13.4105f, 9.0f)
                curveTo(13.3305f, 8.9f, 13.2905f, 8.77f, 13.3105f, 8.63f)
                lineTo(13.5505f, 7.07f)
                curveTo(13.6505f, 6.61f, 13.3405f, 6.08f, 12.8805f, 5.93f)
                curveTo(12.4505f, 5.77f, 11.9405f, 5.99f, 11.7405f, 6.2899f)
                lineTo(9.8005f, 9.17f)
                verticalLineTo(8.81f)
                curveTo(9.8005f, 8.11f, 9.5005f, 7.82f, 8.7605f, 7.82f)
                horizontalLineTo(8.2705f)
                curveTo(7.5305f, 7.82f, 7.2305f, 8.11f, 7.2305f, 8.81f)
                verticalLineTo(13.59f)
                curveTo(7.2305f, 14.29f, 7.5305f, 14.58f, 8.2705f, 14.58f)
                horizontalLineTo(8.7605f)
                curveTo(9.4605f, 14.58f, 9.7605f, 14.31f, 9.7905f, 13.67f)
                lineTo(11.2605f, 14.8f)
                curveTo(11.4605f, 15.0f, 11.9105f, 15.11f, 12.2305f, 15.11f)
                horizontalLineTo(14.0805f)
                curveTo(14.7205f, 15.11f, 15.3605f, 14.63f, 15.5005f, 14.04f)
                lineTo(16.6705f, 10.48f)
                curveTo(16.8005f, 10.16f, 16.7705f, 9.83f, 16.5805f, 9.57f)
                close()
            }
        }
        .build()
        return _liketag!!
    }

private var _liketag: ImageVector? = null

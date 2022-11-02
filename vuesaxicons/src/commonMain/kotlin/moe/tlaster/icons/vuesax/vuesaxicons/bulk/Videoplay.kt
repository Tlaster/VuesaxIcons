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

public val BulkGroup.Videoplay: ImageVector
    get() {
        if (_videoplay != null) {
            return _videoplay!!
        }
        _videoplay = Builder(name = "Videoplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(22.0f, 19.83f, 19.83f, 22.0f, 16.19f, 22.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22.0f, 2.0f, 19.83f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 7.3f, 2.04f, 6.81f, 2.13f, 6.36f)
                curveTo(2.64f, 3.61f, 4.67f, 2.01f, 7.77f, 2.0f)
                horizontalLineTo(16.23f)
                curveTo(19.33f, 2.01f, 21.36f, 3.61f, 21.87f, 6.36f)
                curveTo(21.96f, 6.81f, 22.0f, 7.3f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(7.86f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 7.3f, 2.04f, 6.81f, 2.13f, 6.36f)
                horizontalLineTo(7.77f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.27f)
                verticalLineTo(6.36f)
                horizontalLineTo(14.73f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.23f)
                verticalLineTo(6.36f)
                horizontalLineTo(21.87f)
                curveTo(21.96f, 6.81f, 22.0f, 7.3f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4391f, 12.7198f)
                lineTo(12.3591f, 11.5198f)
                curveTo(11.5891f, 11.0798f, 10.8491f, 11.0198f, 10.2691f, 11.3498f)
                curveTo(9.6891f, 11.6798f, 9.3691f, 12.3598f, 9.3691f, 13.2398f)
                verticalLineTo(15.6398f)
                curveTo(9.3691f, 16.5198f, 9.6891f, 17.1998f, 10.2691f, 17.5298f)
                curveTo(10.5191f, 17.6698f, 10.7991f, 17.7398f, 11.0891f, 17.7398f)
                curveTo(11.4891f, 17.7398f, 11.9191f, 17.6098f, 12.3591f, 17.3598f)
                lineTo(14.4391f, 16.1598f)
                curveTo(15.2091f, 15.7198f, 15.6291f, 15.0998f, 15.6291f, 14.4298f)
                curveTo(15.6291f, 13.7598f, 15.1991f, 13.1698f, 14.4391f, 12.7198f)
                close()
            }
        }
        .build()
        return _videoplay!!
    }

private var _videoplay: ImageVector? = null

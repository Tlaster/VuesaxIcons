package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BulkGroup

public val BulkGroup.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(5.0398f, 2.0f)
                horizontalLineTo(20.4998f)
                curveTo(21.0498f, 2.0f, 21.4998f, 2.45f, 21.4998f, 3.0f)
                verticalLineTo(13.59f)
                curveTo(21.4998f, 13.86f, 21.3898f, 14.11f, 21.2098f, 14.3f)
                lineTo(16.7998f, 18.71f)
                curveTo(16.6098f, 18.9f, 16.3598f, 19.0f, 16.0898f, 19.0f)
                horizontalLineTo(12.0398f)
                curveTo(11.7098f, 19.0f, 11.3898f, 19.17f, 11.2098f, 19.45f)
                lineTo(9.7998f, 21.56f)
                curveTo(9.6098f, 21.84f, 9.2998f, 22.01f, 8.9698f, 22.01f)
                horizontalLineTo(7.5098f)
                curveTo(6.9598f, 22.01f, 6.5098f, 21.56f, 6.5098f, 21.01f)
                verticalLineTo(20.01f)
                curveTo(6.5098f, 19.46f, 6.0598f, 19.01f, 5.5098f, 19.01f)
                horizontalLineTo(3.5098f)
                curveTo(2.9598f, 19.01f, 2.5098f, 18.56f, 2.5098f, 18.01f)
                verticalLineTo(5.31f)
                curveTo(2.5098f, 5.11f, 2.5698f, 4.92f, 2.6798f, 4.76f)
                lineTo(4.2198f, 2.46f)
                curveTo(4.3898f, 2.17f, 4.6998f, 2.0f, 5.0398f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5f, 7.1403f)
                verticalLineTo(12.8503f)
                curveTo(8.5f, 13.1703f, 8.76f, 13.4203f, 9.07f, 13.4203f)
                horizontalLineTo(10.21f)
                curveTo(10.53f, 13.4203f, 10.78f, 13.1603f, 10.78f, 12.8503f)
                verticalLineTo(7.1403f)
                curveTo(10.78f, 6.8203f, 10.52f, 6.5703f, 10.21f, 6.5703f)
                horizontalLineTo(9.07f)
                curveTo(8.76f, 6.5703f, 8.5f, 6.8303f, 8.5f, 7.1403f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.2109f, 7.1403f)
                verticalLineTo(12.8503f)
                curveTo(14.2109f, 13.1703f, 14.4709f, 13.4203f, 14.7809f, 13.4203f)
                horizontalLineTo(15.9209f)
                curveTo(16.2409f, 13.4203f, 16.4909f, 13.1603f, 16.4909f, 12.8503f)
                verticalLineTo(7.1403f)
                curveTo(16.4909f, 6.8203f, 16.2309f, 6.5703f, 15.9209f, 6.5703f)
                horizontalLineTo(14.7809f)
                curveTo(14.4709f, 6.5703f, 14.2109f, 6.8303f, 14.2109f, 7.1403f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null

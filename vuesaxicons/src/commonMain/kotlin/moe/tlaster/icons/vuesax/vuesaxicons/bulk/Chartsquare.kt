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

public val BulkGroup.Chartsquare: ImageVector
    get() {
        if (_chartsquare != null) {
            return _chartsquare!!
        }
        _chartsquare = Builder(name = "Chartsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1103f, 11.1504f)
                horizontalLineTo(7.4603f)
                curveTo(6.8303f, 11.1504f, 6.3203f, 11.6603f, 6.3203f, 12.2903f)
                verticalLineTo(17.4103f)
                horizontalLineTo(10.1103f)
                verticalLineTo(11.1504f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.7596f, 6.6001f)
                horizontalLineTo(11.2396f)
                curveTo(10.6096f, 6.6001f, 10.0996f, 7.1101f, 10.0996f, 7.7401f)
                verticalLineTo(17.4001f)
                horizontalLineTo(13.8896f)
                verticalLineTo(7.7401f)
                curveTo(13.8896f, 7.1101f, 13.3896f, 6.6001f, 12.7596f, 6.6001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5504f, 12.8501f)
                horizontalLineTo(13.9004f)
                verticalLineTo(17.4001f)
                horizontalLineTo(17.6904f)
                verticalLineTo(13.9901f)
                curveTo(17.6804f, 13.3601f, 17.1704f, 12.8501f, 16.5504f, 12.8501f)
                close()
            }
        }
        .build()
        return _chartsquare!!
    }

private var _chartsquare: ImageVector? = null

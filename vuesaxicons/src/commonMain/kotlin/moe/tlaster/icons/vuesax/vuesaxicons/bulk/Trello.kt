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

public val BulkGroup.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.5499f, 17.7203f)
                horizontalLineTo(7.0999f)
                curveTo(6.4299f, 17.7203f, 5.8799f, 17.1703f, 5.8799f, 16.5003f)
                verticalLineTo(7.5203f)
                curveTo(5.8799f, 6.8503f, 6.4299f, 6.3003f, 7.0999f, 6.3003f)
                horizontalLineTo(9.5499f)
                curveTo(10.2199f, 6.3003f, 10.7699f, 6.8503f, 10.7699f, 7.5203f)
                verticalLineTo(16.5003f)
                curveTo(10.7699f, 17.1703f, 10.2199f, 17.7203f, 9.5499f, 17.7203f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1398f, 13.6303f)
                horizontalLineTo(14.1998f)
                curveTo(13.6598f, 13.6303f, 13.2197f, 13.1903f, 13.2197f, 12.6503f)
                verticalLineTo(7.2603f)
                curveTo(13.2197f, 6.7203f, 13.6598f, 6.2803f, 14.1998f, 6.2803f)
                horizontalLineTo(17.1398f)
                curveTo(17.6798f, 6.2803f, 18.1198f, 6.7203f, 18.1198f, 7.2603f)
                verticalLineTo(12.6503f)
                curveTo(18.1198f, 13.1903f, 17.6798f, 13.6303f, 17.1398f, 13.6303f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null

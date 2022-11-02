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

public val BulkGroup.Bootstrap: ImageVector
    get() {
        if (_bootstrap != null) {
            return _bootstrap!!
        }
        _bootstrap = Builder(name = "Bootstrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(5.34f, 3.0f, 4.0f, 4.34f, 4.0f, 6.0f)
                verticalLineTo(6.84f)
                curveTo(4.0f, 7.61f, 3.88f, 8.37f, 3.63f, 9.1f)
                curveTo(3.25f, 10.23f, 2.19f, 11.0f, 1.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(2.19f, 13.0f, 3.25f, 13.76f, 3.63f, 14.9f)
                curveTo(3.87f, 15.63f, 4.0f, 16.4f, 4.0f, 17.16f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.66f, 5.34f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.66f, 21.0f, 20.0f, 19.66f, 20.0f, 18.0f)
                verticalLineTo(17.16f)
                curveTo(20.0f, 16.39f, 20.12f, 15.63f, 20.37f, 14.9f)
                curveTo(20.75f, 13.77f, 21.81f, 13.0f, 23.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(21.81f, 11.0f, 20.75f, 10.24f, 20.37f, 9.1f)
                curveTo(20.13f, 8.37f, 20.0f, 7.6f, 20.0f, 6.84f)
                verticalLineTo(6.0f)
                curveTo(20.0f, 4.34f, 18.66f, 3.0f, 17.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.67f, 16.9198f)
                horizontalLineTo(9.75f)
                curveTo(9.34f, 16.9198f, 9.0f, 16.5798f, 9.0f, 16.1698f)
                verticalLineTo(7.8398f)
                curveTo(9.0f, 7.4298f, 9.34f, 7.0898f, 9.75f, 7.0898f)
                horizontalLineTo(12.67f)
                curveTo(14.23f, 7.0898f, 15.5f, 8.3598f, 15.5f, 9.9199f)
                curveTo(15.5f, 10.7398f, 15.15f, 11.4898f, 14.58f, 11.9998f)
                curveTo(15.14f, 12.5198f, 15.5f, 13.2598f, 15.5f, 14.0798f)
                curveTo(15.5f, 15.6498f, 14.23f, 16.9198f, 12.67f, 16.9198f)
                close()
                moveTo(10.5f, 15.4198f)
                horizontalLineTo(12.67f)
                curveTo(13.41f, 15.4198f, 14.0f, 14.8198f, 14.0f, 14.0898f)
                curveTo(14.0f, 13.3598f, 13.4f, 12.7598f, 12.67f, 12.7598f)
                horizontalLineTo(10.5f)
                verticalLineTo(15.4198f)
                close()
                moveTo(10.5f, 11.2498f)
                horizontalLineTo(12.67f)
                curveTo(13.41f, 11.2498f, 14.0f, 10.6498f, 14.0f, 9.9199f)
                curveTo(14.0f, 9.1898f, 13.4f, 8.5898f, 12.67f, 8.5898f)
                horizontalLineTo(10.5f)
                verticalLineTo(11.2498f)
                close()
            }
        }
        .build()
        return _bootstrap!!
    }

private var _bootstrap: ImageVector? = null

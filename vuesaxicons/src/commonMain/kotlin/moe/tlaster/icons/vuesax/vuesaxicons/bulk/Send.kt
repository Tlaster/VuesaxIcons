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

public val BulkGroup.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5093f, 4.2299f)
                lineTo(18.0693f, 8.5099f)
                curveTo(21.9093f, 10.4299f, 21.9093f, 13.5699f, 18.0693f, 15.4899f)
                lineTo(9.5093f, 19.7699f)
                curveTo(3.7493f, 22.6499f, 1.3993f, 20.2899f, 4.2793f, 14.5399f)
                lineTo(5.1493f, 12.8099f)
                curveTo(5.3993f, 12.2999f, 5.3993f, 11.7099f, 5.1493f, 11.1999f)
                lineTo(4.2793f, 9.4599f)
                curveTo(1.3993f, 3.7099f, 3.7593f, 1.3499f, 9.5093f, 4.2299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8395f, 12.75f)
                horizontalLineTo(9.4395f)
                curveTo(9.0295f, 12.75f, 8.6895f, 12.41f, 8.6895f, 12.0f)
                curveTo(8.6895f, 11.59f, 9.0295f, 11.25f, 9.4395f, 11.25f)
                horizontalLineTo(14.8395f)
                curveTo(15.2495f, 11.25f, 15.5895f, 11.59f, 15.5895f, 12.0f)
                curveTo(15.5895f, 12.41f, 15.2495f, 12.75f, 14.8395f, 12.75f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null

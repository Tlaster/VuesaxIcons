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

public val BulkGroup.Simcard: ImageVector
    get() {
        if (_simcard != null) {
            return _simcard!!
        }
        _simcard = Builder(name = "Simcard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.54f, 6.54f)
                lineTo(16.47f, 3.47f)
                curveTo(15.53f, 2.53f, 14.26f, 2.01f, 12.93f, 2.01f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 2.01f, 3.0f, 4.01f, 3.0f, 7.01f)
                verticalLineTo(17.01f)
                curveTo(3.0f, 20.01f, 5.0f, 22.01f, 8.0f, 22.01f)
                horizontalLineTo(16.0f)
                curveTo(19.0f, 22.01f, 21.0f, 20.01f, 21.0f, 17.01f)
                verticalLineTo(10.08f)
                curveTo(21.0f, 8.74f, 20.47f, 7.47f, 19.54f, 6.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4994f, 18.7499f)
                curveTo(9.3095f, 18.7499f, 9.1194f, 18.6799f, 8.9694f, 18.5299f)
                lineTo(6.9694f, 16.5299f)
                curveTo(6.6795f, 16.2399f, 6.6795f, 15.7599f, 6.9694f, 15.4699f)
                lineTo(8.9694f, 13.4699f)
                curveTo(9.2594f, 13.1799f, 9.7395f, 13.1799f, 10.0295f, 13.4699f)
                curveTo(10.3195f, 13.7599f, 10.3195f, 14.2399f, 10.0295f, 14.5299f)
                lineTo(8.5595f, 15.9999f)
                lineTo(10.0295f, 17.4699f)
                curveTo(10.3195f, 17.7599f, 10.3195f, 18.2399f, 10.0295f, 18.5299f)
                curveTo(9.8794f, 18.6799f, 9.6895f, 18.7499f, 9.4994f, 18.7499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4995f, 18.7499f)
                curveTo(14.3095f, 18.7499f, 14.1195f, 18.6799f, 13.9695f, 18.5299f)
                curveTo(13.6795f, 18.2399f, 13.6795f, 17.7599f, 13.9695f, 17.4699f)
                lineTo(15.4395f, 15.9999f)
                lineTo(13.9695f, 14.5299f)
                curveTo(13.6795f, 14.2399f, 13.6795f, 13.7599f, 13.9695f, 13.4699f)
                curveTo(14.2595f, 13.1799f, 14.7395f, 13.1799f, 15.0295f, 13.4699f)
                lineTo(17.0295f, 15.4699f)
                curveTo(17.3195f, 15.7599f, 17.3195f, 16.2399f, 17.0295f, 16.5299f)
                lineTo(15.0295f, 18.5299f)
                curveTo(14.8795f, 18.6799f, 14.6895f, 18.7499f, 14.4995f, 18.7499f)
                close()
            }
        }
        .build()
        return _simcard!!
    }

private var _simcard: ImageVector? = null

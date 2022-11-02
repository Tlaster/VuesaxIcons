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

public val BulkGroup.Timer1: ImageVector
    get() {
        if (_timer1 != null) {
            return _timer1!!
        }
        _timer1 = Builder(name = "Timer1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 21.9999f)
                curveTo(16.7884f, 21.9999f, 20.6701f, 18.1182f, 20.6701f, 13.3299f)
                curveTo(20.6701f, 8.5416f, 16.7884f, 4.6599f, 12.0001f, 4.6599f)
                curveTo(7.2118f, 4.6599f, 3.3301f, 8.5416f, 3.3301f, 13.3299f)
                curveTo(3.3301f, 18.1182f, 7.2118f, 21.9999f, 12.0001f, 21.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12.0f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8906f, 3.45f)
                horizontalLineTo(9.1106f)
                curveTo(8.7106f, 3.45f, 8.3906f, 3.13f, 8.3906f, 2.73f)
                curveTo(8.3906f, 2.33f, 8.7106f, 2.0f, 9.1106f, 2.0f)
                horizontalLineTo(14.8906f)
                curveTo(15.2906f, 2.0f, 15.6106f, 2.32f, 15.6106f, 2.72f)
                curveTo(15.6106f, 3.12f, 15.2906f, 3.45f, 14.8906f, 3.45f)
                close()
            }
        }
        .build()
        return _timer1!!
    }

private var _timer1: ImageVector? = null

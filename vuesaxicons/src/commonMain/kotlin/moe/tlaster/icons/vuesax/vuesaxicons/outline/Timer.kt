package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Timer: ImageVector
    get() {
        if (_timer != null) {
            return _timer!!
        }
        _timer = Builder(name = "Timer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2398f, 22.75f)
                horizontalLineTo(8.7598f)
                curveTo(6.8698f, 22.75f, 5.4898f, 21.96f, 4.9598f, 20.6f)
                curveTo(4.4098f, 19.18f, 4.9198f, 17.42f, 6.2398f, 16.23f)
                lineTo(10.8798f, 12.0f)
                lineTo(6.2398f, 7.77f)
                curveTo(4.9198f, 6.58f, 4.4098f, 4.82f, 4.9598f, 3.4f)
                curveTo(5.4898f, 2.03f, 6.8698f, 1.25f, 8.7598f, 1.25f)
                horizontalLineTo(15.2398f)
                curveTo(17.1298f, 1.25f, 18.5098f, 2.04f, 19.0398f, 3.4f)
                curveTo(19.5898f, 4.82f, 19.0798f, 6.58f, 17.7598f, 7.77f)
                lineTo(13.1198f, 12.0f)
                lineTo(17.7698f, 16.23f)
                curveTo(19.0798f, 17.42f, 19.5998f, 19.18f, 19.0498f, 20.6f)
                curveTo(18.5098f, 21.96f, 17.1298f, 22.75f, 15.2398f, 22.75f)
                close()
                moveTo(11.9998f, 13.01f)
                lineTo(7.2498f, 17.33f)
                curveTo(6.4098f, 18.1f, 6.0398f, 19.22f, 6.3598f, 20.05f)
                curveTo(6.6598f, 20.82f, 7.5098f, 21.25f, 8.7598f, 21.25f)
                horizontalLineTo(15.2398f)
                curveTo(16.4898f, 21.25f, 17.3398f, 20.83f, 17.6398f, 20.05f)
                curveTo(17.9598f, 19.22f, 17.5998f, 18.1f, 16.7498f, 17.33f)
                lineTo(11.9998f, 13.01f)
                close()
                moveTo(8.7598f, 2.75f)
                curveTo(7.5098f, 2.75f, 6.6598f, 3.17f, 6.3598f, 3.95f)
                curveTo(6.0398f, 4.78f, 6.3998f, 5.9f, 7.2498f, 6.67f)
                lineTo(11.9998f, 10.99f)
                lineTo(16.7498f, 6.67f)
                curveTo(17.5898f, 5.9f, 17.9598f, 4.78f, 17.6398f, 3.95f)
                curveTo(17.3398f, 3.18f, 16.4898f, 2.75f, 15.2398f, 2.75f)
                horizontalLineTo(8.7598f)
                close()
            }
        }
        .build()
        return _timer!!
    }

private var _timer: ImageVector? = null

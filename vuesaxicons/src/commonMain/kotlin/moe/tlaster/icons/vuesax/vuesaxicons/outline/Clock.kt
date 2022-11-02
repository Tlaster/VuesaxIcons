package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7096f, 15.93f)
                curveTo(15.5796f, 15.93f, 15.4496f, 15.9f, 15.3296f, 15.82f)
                lineTo(12.2296f, 13.97f)
                curveTo(11.4596f, 13.51f, 10.8896f, 12.5f, 10.8896f, 11.61f)
                verticalLineTo(7.51f)
                curveTo(10.8896f, 7.1f, 11.2296f, 6.76f, 11.6396f, 6.76f)
                curveTo(12.0496f, 6.76f, 12.3896f, 7.1f, 12.3896f, 7.51f)
                verticalLineTo(11.61f)
                curveTo(12.3896f, 11.97f, 12.6896f, 12.5f, 12.9996f, 12.68f)
                lineTo(16.0996f, 14.53f)
                curveTo(16.4596f, 14.74f, 16.5696f, 15.2f, 16.3596f, 15.56f)
                curveTo(16.2096f, 15.8f, 15.9596f, 15.93f, 15.7096f, 15.93f)
                close()
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Ticksquare: ImageVector
    get() {
        if (_ticksquare != null) {
            return _ticksquare!!
        }
        _ticksquare = Builder(name = "Ticksquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(16.78f, 9.7f)
                lineTo(11.11f, 15.37f)
                curveTo(10.97f, 15.51f, 10.78f, 15.59f, 10.58f, 15.59f)
                curveTo(10.38f, 15.59f, 10.19f, 15.51f, 10.05f, 15.37f)
                lineTo(7.22f, 12.54f)
                curveTo(6.93f, 12.25f, 6.93f, 11.77f, 7.22f, 11.48f)
                curveTo(7.51f, 11.19f, 7.99f, 11.19f, 8.28f, 11.48f)
                lineTo(10.58f, 13.78f)
                lineTo(15.72f, 8.64f)
                curveTo(16.01f, 8.35f, 16.49f, 8.35f, 16.78f, 8.64f)
                curveTo(17.07f, 8.93f, 17.07f, 9.4f, 16.78f, 9.7f)
                close()
            }
        }
        .build()
        return _ticksquare!!
    }

private var _ticksquare: ImageVector? = null

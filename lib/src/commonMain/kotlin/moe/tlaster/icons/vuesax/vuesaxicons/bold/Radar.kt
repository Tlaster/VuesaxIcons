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

public val BoldGroup.Radar: ImageVector
    get() {
        if (_radar != null) {
            return _radar!!
        }
        _radar = Builder(name = "Radar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 19.75f)
                curveTo(7.73f, 19.75f, 4.25f, 16.27f, 4.25f, 12.0f)
                curveTo(4.25f, 10.64f, 4.61f, 9.31f, 5.28f, 8.14f)
                curveTo(5.48f, 7.78f, 5.94f, 7.66f, 6.3f, 7.86f)
                lineTo(12.37f, 11.35f)
                curveTo(12.73f, 11.56f, 12.85f, 12.01f, 12.65f, 12.37f)
                curveTo(12.44f, 12.73f, 11.99f, 12.85f, 11.63f, 12.65f)
                lineTo(6.24f, 9.56f)
                curveTo(5.92f, 10.33f, 5.75f, 11.16f, 5.75f, 12.0f)
                curveTo(5.75f, 15.45f, 8.55f, 18.25f, 12.0f, 18.25f)
                curveTo(15.45f, 18.25f, 18.25f, 15.45f, 18.25f, 12.0f)
                curveTo(18.25f, 8.55f, 15.45f, 5.75f, 12.0f, 5.75f)
                curveTo(10.64f, 5.75f, 9.34f, 6.18f, 8.25f, 7.0f)
                curveTo(7.92f, 7.25f, 7.45f, 7.18f, 7.2f, 6.85f)
                curveTo(6.95f, 6.52f, 7.02f, 6.05f, 7.35f, 5.8f)
                curveTo(8.7f, 4.79f, 10.31f, 4.25f, 12.0f, 4.25f)
                curveTo(16.27f, 4.25f, 19.75f, 7.73f, 19.75f, 12.0f)
                curveTo(19.75f, 16.27f, 16.27f, 19.75f, 12.0f, 19.75f)
                close()
            }
        }
        .build()
        return _radar!!
    }

private var _radar: ImageVector? = null

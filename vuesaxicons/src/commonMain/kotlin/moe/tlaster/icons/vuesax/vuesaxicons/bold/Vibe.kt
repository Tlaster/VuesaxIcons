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

public val BoldGroup.Vibe: ImageVector
    get() {
        if (_vibe != null) {
            return _vibe!!
        }
        _vibe = Builder(name = "Vibe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.05f, 8.29f)
                curveTo(9.13f, 8.12f, 9.31f, 8.01f, 9.5f, 8.01f)
                horizontalLineTo(14.5f)
                curveTo(14.69f, 8.01f, 14.86f, 8.12f, 14.95f, 8.29f)
                curveTo(15.04f, 8.46f, 15.02f, 8.66f, 14.9f, 8.81f)
                lineTo(12.4f, 12.14f)
                curveTo(12.31f, 12.27f, 12.16f, 12.34f, 12.0f, 12.34f)
                curveTo(11.84f, 12.34f, 11.69f, 12.27f, 11.6f, 12.14f)
                lineTo(9.1f, 8.81f)
                curveTo(8.99f, 8.67f, 8.97f, 8.46f, 9.05f, 8.29f)
                close()
                moveTo(17.61f, 10.44f)
                lineTo(12.61f, 17.44f)
                curveTo(12.47f, 17.64f, 12.24f, 17.75f, 12.0f, 17.75f)
                curveTo(11.76f, 17.75f, 11.53f, 17.63f, 11.39f, 17.44f)
                lineTo(6.39f, 10.44f)
                curveTo(6.15f, 10.1f, 6.23f, 9.63f, 6.56f, 9.39f)
                curveTo(6.9f, 9.15f, 7.37f, 9.23f, 7.61f, 9.56f)
                lineTo(12.0f, 15.71f)
                lineTo(16.39f, 9.56f)
                curveTo(16.63f, 9.22f, 17.1f, 9.14f, 17.44f, 9.39f)
                curveTo(17.77f, 9.63f, 17.85f, 10.1f, 17.61f, 10.44f)
                close()
            }
        }
        .build()
        return _vibe!!
    }

private var _vibe: ImageVector? = null

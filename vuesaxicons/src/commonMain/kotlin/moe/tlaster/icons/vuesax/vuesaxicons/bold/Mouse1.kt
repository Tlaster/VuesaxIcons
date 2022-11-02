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

public val BoldGroup.Mouse1: ImageVector
    get() {
        if (_mouse1 != null) {
            return _mouse1!!
        }
        _mouse1 = Builder(name = "Mouse1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.15f, 12.83f)
                lineTo(14.42f, 13.41f)
                curveTo(13.94f, 13.57f, 13.57f, 13.94f, 13.41f, 14.42f)
                lineTo(12.83f, 16.15f)
                curveTo(12.34f, 17.64f, 10.24f, 17.61f, 9.78f, 16.12f)
                lineTo(7.83f, 9.84f)
                curveTo(7.45f, 8.59f, 8.6f, 7.44f, 9.83f, 7.82f)
                lineTo(16.12f, 9.77f)
                curveTo(17.61f, 10.24f, 17.63f, 12.34f, 16.15f, 12.83f)
                close()
            }
        }
        .build()
        return _mouse1!!
    }

private var _mouse1: ImageVector? = null

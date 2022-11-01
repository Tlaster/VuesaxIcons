package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.61f, 2.21f)
                curveTo(12.25f, 1.93f, 11.75f, 1.93f, 11.39f, 2.21f)
                curveTo(9.49f, 3.66f, 3.88f, 8.39f, 3.91f, 13.9f)
                curveTo(3.91f, 18.36f, 7.54f, 22.0f, 12.01f, 22.0f)
                curveTo(16.48f, 22.0f, 20.11f, 18.37f, 20.11f, 13.91f)
                curveTo(20.12f, 8.48f, 14.5f, 3.67f, 12.61f, 2.21f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null

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

public val BoldGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4306f, 11.78f)
                lineTo(18.2306f, 3.7f)
                curveTo(17.9806f, 2.77f, 16.9706f, 2.0f, 16.0106f, 2.0f)
                horizontalLineTo(7.9906f)
                curveTo(7.0306f, 2.0f, 6.0206f, 2.77f, 5.7706f, 3.7f)
                lineTo(3.5706f, 11.78f)
                curveTo(3.1306f, 13.38f, 4.1306f, 14.69f, 5.7906f, 14.69f)
                horizontalLineTo(11.2506f)
                verticalLineTo(20.5f)
                horizontalLineTo(8.0006f)
                curveTo(7.5906f, 20.5f, 7.2506f, 20.84f, 7.2506f, 21.25f)
                curveTo(7.2506f, 21.66f, 7.5906f, 22.0f, 8.0006f, 22.0f)
                horizontalLineTo(16.0006f)
                curveTo(16.4106f, 22.0f, 16.7506f, 21.66f, 16.7506f, 21.25f)
                curveTo(16.7506f, 20.84f, 16.4106f, 20.5f, 16.0006f, 20.5f)
                horizontalLineTo(12.7506f)
                verticalLineTo(14.69f)
                horizontalLineTo(18.2106f)
                curveTo(19.8706f, 14.69f, 20.8706f, 13.38f, 20.4306f, 11.78f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null

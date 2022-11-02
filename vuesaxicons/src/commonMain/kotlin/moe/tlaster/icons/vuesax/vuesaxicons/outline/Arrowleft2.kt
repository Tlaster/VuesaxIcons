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

public val OutlineGroup.Arrowleft2: ImageVector
    get() {
        if (_arrowleft2 != null) {
            return _arrowleft2!!
        }
        _arrowleft2 = Builder(name = "Arrowleft2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9993f, 20.67f)
                curveTo(14.8093f, 20.67f, 14.6193f, 20.6f, 14.4693f, 20.45f)
                lineTo(7.9493f, 13.93f)
                curveTo(6.8893f, 12.87f, 6.8893f, 11.13f, 7.9493f, 10.07f)
                lineTo(14.4693f, 3.55f)
                curveTo(14.7593f, 3.26f, 15.2393f, 3.26f, 15.5293f, 3.55f)
                curveTo(15.8193f, 3.84f, 15.8193f, 4.32f, 15.5293f, 4.61f)
                lineTo(9.0093f, 11.13f)
                curveTo(8.5293f, 11.61f, 8.5293f, 12.39f, 9.0093f, 12.87f)
                lineTo(15.5293f, 19.39f)
                curveTo(15.8193f, 19.68f, 15.8193f, 20.16f, 15.5293f, 20.45f)
                curveTo(15.3793f, 20.59f, 15.1893f, 20.67f, 14.9993f, 20.67f)
                close()
            }
        }
        .build()
        return _arrowleft2!!
    }

private var _arrowleft2: ImageVector? = null

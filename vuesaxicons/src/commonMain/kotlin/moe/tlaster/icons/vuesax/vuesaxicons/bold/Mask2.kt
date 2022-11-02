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

public val BoldGroup.Mask2: ImageVector
    get() {
        if (_mask2 != null) {
            return _mask2!!
        }
        _mask2 = Builder(name = "Mask2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6493f, 4.5912f)
                curveTo(16.8893f, 2.9913f, 14.5593f, 2.0313f, 11.9993f, 2.0313f)
                curveTo(6.4993f, 2.0313f, 2.0293f, 6.5012f, 2.0293f, 12.0013f)
                curveTo(2.0293f, 17.5013f, 6.4993f, 21.9712f, 11.9993f, 21.9712f)
                curveTo(14.5593f, 21.9712f, 16.8893f, 21.0112f, 18.6493f, 19.4112f)
                curveTo(20.6893f, 17.6012f, 21.9693f, 14.9412f, 21.9693f, 12.0013f)
                curveTo(21.9693f, 9.0612f, 20.6893f, 6.4012f, 18.6493f, 4.5912f)
                close()
                moveTo(11.9693f, 16.3912f)
                curveTo(11.9493f, 18.0413f, 10.7193f, 18.4412f, 9.5693f, 17.9812f)
                curveTo(7.1993f, 17.0312f, 5.5293f, 14.7113f, 5.5293f, 12.0013f)
                curveTo(5.5293f, 9.2913f, 7.1993f, 6.9713f, 9.5693f, 6.0113f)
                curveTo(10.7193f, 5.5512f, 11.9493f, 5.9612f, 11.9693f, 7.6013f)
                verticalLineTo(16.3912f)
                close()
            }
        }
        .build()
        return _mask2!!
    }

private var _mask2: ImageVector? = null

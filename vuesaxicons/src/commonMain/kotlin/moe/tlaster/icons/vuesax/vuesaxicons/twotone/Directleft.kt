package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Directleft: ImageVector
    get() {
        if (_directleft != null) {
            return _directleft!!
        }
        _directleft = Builder(name = "Directleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.71f, 9.1698f)
                lineTo(16.3f, 3.0698f)
                curveTo(19.05f, 1.6198f, 22.04f, 4.5498f, 20.65f, 7.3298f)
                lineTo(19.03f, 10.5698f)
                curveTo(18.58f, 11.4698f, 18.58f, 12.5298f, 19.03f, 13.4298f)
                lineTo(20.65f, 16.6698f)
                curveTo(22.04f, 19.4498f, 19.05f, 22.3698f, 16.3f, 20.9298f)
                lineTo(4.71f, 14.8298f)
                curveTo(2.43f, 13.6298f, 2.43f, 10.3698f, 4.71f, 9.1698f)
                close()
            }
        }
        .build()
        return _directleft!!
    }

private var _directleft: ImageVector? = null

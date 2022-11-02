package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Minuscirlce: ImageVector
    get() {
        if (_minuscirlce != null) {
            return _minuscirlce!!
        }
        _minuscirlce = Builder(name = "Minuscirlce", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9199f, 22.0f)
                curveTo(17.4199f, 22.0f, 21.9199f, 17.5f, 21.9199f, 12.0f)
                curveTo(21.9199f, 6.5f, 17.4199f, 2.0f, 11.9199f, 2.0f)
                curveTo(6.4199f, 2.0f, 1.9199f, 6.5f, 1.9199f, 12.0f)
                curveTo(1.9199f, 17.5f, 6.4199f, 22.0f, 11.9199f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9199f, 12.0f)
                horizontalLineTo(15.9199f)
            }
        }
        .build()
        return _minuscirlce!!
    }

private var _minuscirlce: ImageVector? = null

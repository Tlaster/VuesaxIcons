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

public val TwotoneGroup.`Velas-(vlx)`: ImageVector
    get() {
        if (`_velas-(vlx)` != null) {
            return `_velas-(vlx)`!!
        }
        `_velas-(vlx)` = Builder(name = "Velas-(vlx)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 3.0298f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0399f, 6.3599f)
                horizontalLineTo(19.9699f)
                curveTo(20.8499f, 6.3599f, 21.3799f, 7.3299f, 20.8999f, 8.0699f)
                lineTo(12.9399f, 20.4599f)
                curveTo(12.4999f, 21.1399f, 11.5099f, 21.1399f, 11.0699f, 20.4599f)
                lineTo(3.1099f, 8.0699f)
                curveTo(2.6299f, 7.3299f, 3.1599f, 6.3599f, 4.0399f, 6.3599f)
                close()
            }
        }
        .build()
        return `_velas-(vlx)`!!
    }

private var `_velas-(vlx)`: ImageVector? = null

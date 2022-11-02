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

public val TwotoneGroup.Monero: ImageVector
    get() {
        if (_monero != null) {
            return _monero!!
        }
        _monero = Builder(name = "Monero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5397f, 15.0f)
                curveTo(20.2597f, 19.06f, 16.4697f, 22.0f, 11.9997f, 22.0f)
                curveTo(7.5397f, 22.0f, 3.7597f, 19.08f, 2.4697f, 15.04f)
                lineTo(6.9997f, 15.0f)
                verticalLineTo(9.0f)
                lineTo(11.9997f, 15.0f)
                lineTo(16.9997f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.5397f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 13.05f, 21.84f, 14.05f, 21.54f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 15.0f)
                lineTo(7.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(2.47f, 15.04f)
                curveTo(2.17f, 14.08f, 2.0f, 13.06f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _monero!!
    }

private var _monero: ImageVector? = null

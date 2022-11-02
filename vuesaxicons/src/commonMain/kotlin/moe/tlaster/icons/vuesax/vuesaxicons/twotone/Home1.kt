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

public val TwotoneGroup.Home1: ImageVector
    get() {
        if (_home1 != null) {
            return _home1!!
        }
        _home1 = Builder(name = "Home1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0693f, 2.8198f)
                lineTo(3.1393f, 8.3699f)
                curveTo(2.3593f, 8.9899f, 1.8593f, 10.2998f, 2.0293f, 11.2798f)
                lineTo(3.3593f, 19.2398f)
                curveTo(3.5993f, 20.6598f, 4.9593f, 21.8098f, 6.3993f, 21.8098f)
                horizontalLineTo(17.5993f)
                curveTo(19.0293f, 21.8098f, 20.3993f, 20.6498f, 20.6393f, 19.2398f)
                lineTo(21.9693f, 11.2798f)
                curveTo(22.1293f, 10.2998f, 21.6293f, 8.9899f, 20.8593f, 8.3699f)
                lineTo(13.9293f, 2.8298f)
                curveTo(12.8593f, 1.9698f, 11.1293f, 1.9698f, 10.0693f, 2.8198f)
                close()
            }
        }
        .build()
        return _home1!!
    }

private var _home1: ImageVector? = null

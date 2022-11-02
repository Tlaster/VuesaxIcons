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

public val TwotoneGroup.Sidebarleft: ImageVector
    get() {
        if (_sidebarleft != null) {
            return _sidebarleft!!
        }
        _sidebarleft = Builder(name = "Sidebarleft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9707f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.9707f, 4.0f, 19.9707f, 2.0f, 14.9707f, 2.0f)
                horizontalLineTo(8.9707f)
                curveTo(3.9707f, 2.0f, 1.9707f, 4.0f, 1.9707f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.9707f, 20.0f, 3.9707f, 22.0f, 8.9707f, 22.0f)
                horizontalLineTo(14.9707f)
                curveTo(19.9707f, 22.0f, 21.9707f, 20.0f, 21.9707f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9707f, 2.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9702f, 9.4399f)
                lineTo(12.4102f, 11.9999f)
                lineTo(14.9702f, 14.5599f)
            }
        }
        .build()
        return _sidebarleft!!
    }

private var _sidebarleft: ImageVector? = null

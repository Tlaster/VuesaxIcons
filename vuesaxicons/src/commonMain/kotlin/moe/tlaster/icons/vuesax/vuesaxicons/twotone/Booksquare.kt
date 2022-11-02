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

public val TwotoneGroup.Booksquare: ImageVector
    get() {
        if (_booksquare != null) {
            return _booksquare!!
        }
        _booksquare = Builder(name = "Booksquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3801f, 15.2702f)
                verticalLineTo(7.5802f)
                curveTo(18.3801f, 6.8102f, 17.7601f, 6.2502f, 17.0001f, 6.3102f)
                horizontalLineTo(16.9601f)
                curveTo(15.6201f, 6.4202f, 13.5901f, 7.1102f, 12.4501f, 7.8203f)
                lineTo(12.3401f, 7.8903f)
                curveTo(12.1601f, 8.0003f, 11.8501f, 8.0003f, 11.6601f, 7.8903f)
                lineTo(11.5001f, 7.7902f)
                curveTo(10.3701f, 7.0802f, 8.3401f, 6.4102f, 7.0001f, 6.3002f)
                curveTo(6.2401f, 6.2402f, 5.6201f, 6.8102f, 5.6201f, 7.5703f)
                verticalLineTo(15.2702f)
                curveTo(5.6201f, 15.8802f, 6.1201f, 16.4602f, 6.7301f, 16.5302f)
                lineTo(6.9101f, 16.5602f)
                curveTo(8.2901f, 16.7402f, 10.4301f, 17.4502f, 11.6501f, 18.1202f)
                lineTo(11.6801f, 18.1302f)
                curveTo(11.8501f, 18.2302f, 12.1301f, 18.2302f, 12.2901f, 18.1302f)
                curveTo(13.5101f, 17.4502f, 15.6601f, 16.7502f, 17.0501f, 16.5602f)
                lineTo(17.2601f, 16.5302f)
                curveTo(17.8801f, 16.4602f, 18.3801f, 15.8902f, 18.3801f, 15.2702f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.1001f)
                verticalLineTo(17.6601f)
            }
        }
        .build()
        return _booksquare!!
    }

private var _booksquare: ImageVector? = null

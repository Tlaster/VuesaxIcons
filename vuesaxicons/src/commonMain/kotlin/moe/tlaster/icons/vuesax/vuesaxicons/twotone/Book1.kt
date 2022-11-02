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

public val TwotoneGroup.Book1: ImageVector
    get() {
        if (_book1 != null) {
            return _book1!!
        }
        _book1 = Builder(name = "Book1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 16.7402f)
                verticalLineTo(4.6702f)
                curveTo(22.0f, 3.4702f, 21.02f, 2.5802f, 19.83f, 2.6802f)
                horizontalLineTo(19.77f)
                curveTo(17.67f, 2.8602f, 14.48f, 3.9302f, 12.7f, 5.0502f)
                lineTo(12.53f, 5.1602f)
                curveTo(12.24f, 5.3402f, 11.76f, 5.3402f, 11.47f, 5.1602f)
                lineTo(11.22f, 5.0102f)
                curveTo(9.44f, 3.9002f, 6.26f, 2.8402f, 4.16f, 2.6702f)
                curveTo(2.97f, 2.5702f, 2.0f, 3.4702f, 2.0f, 4.6602f)
                verticalLineTo(16.7402f)
                curveTo(2.0f, 17.7002f, 2.78f, 18.6002f, 3.74f, 18.7202f)
                lineTo(4.03f, 18.7602f)
                curveTo(6.2f, 19.0502f, 9.55f, 20.1502f, 11.47f, 21.2002f)
                lineTo(11.51f, 21.2202f)
                curveTo(11.78f, 21.3702f, 12.21f, 21.3702f, 12.47f, 21.2202f)
                curveTo(14.39f, 20.1602f, 17.75f, 19.0502f, 19.93f, 18.7602f)
                lineTo(20.26f, 18.7202f)
                curveTo(21.22f, 18.6002f, 22.0f, 17.7002f, 22.0f, 16.7402f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.4902f)
                verticalLineTo(20.4902f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 8.4902f)
                horizontalLineTo(5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 11.4902f)
                horizontalLineTo(5.5f)
            }
        }
        .build()
        return _book1!!
    }

private var _book1: ImageVector? = null

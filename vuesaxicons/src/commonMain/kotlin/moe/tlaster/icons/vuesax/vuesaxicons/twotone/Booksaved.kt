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

public val TwotoneGroup.Booksaved: ImageVector
    get() {
        if (_booksaved != null) {
            return _booksaved!!
        }
        _booksaved = Builder(name = "Booksaved", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 4.6702f)
                verticalLineTo(16.7402f)
                curveTo(22.0f, 17.7002f, 21.22f, 18.6002f, 20.26f, 18.7202f)
                lineTo(19.93f, 18.7602f)
                curveTo(17.75f, 19.0502f, 14.39f, 20.1602f, 12.47f, 21.2202f)
                curveTo(12.21f, 21.3702f, 11.78f, 21.3702f, 11.51f, 21.2202f)
                lineTo(11.47f, 21.2002f)
                curveTo(9.55f, 20.1502f, 6.2f, 19.0502f, 4.03f, 18.7602f)
                lineTo(3.74f, 18.7202f)
                curveTo(2.78f, 18.6002f, 2.0f, 17.7002f, 2.0f, 16.7402f)
                verticalLineTo(4.6602f)
                curveTo(2.0f, 3.4702f, 2.97f, 2.5702f, 4.16f, 2.6702f)
                curveTo(6.26f, 2.8402f, 9.44f, 3.9002f, 11.22f, 5.0102f)
                lineTo(11.47f, 5.1602f)
                curveTo(11.76f, 5.3402f, 12.24f, 5.3402f, 12.53f, 5.1602f)
                lineTo(12.7f, 5.0502f)
                curveTo(13.33f, 4.6602f, 14.13f, 4.2702f, 15.0f, 3.9202f)
                curveTo(16.31f, 3.4002f, 17.77f, 2.9802f, 19.0f, 2.7802f)
                curveTo(19.27f, 2.7302f, 19.53f, 2.7002f, 19.77f, 2.6802f)
                horizontalLineTo(19.83f)
                curveTo(21.02f, 2.5802f, 22.0f, 3.4702f, 22.0f, 4.6702f)
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
                moveTo(19.0f, 2.7803f)
                verticalLineTo(8.0002f)
                lineTo(17.0f, 6.6702f)
                lineTo(15.0f, 8.0002f)
                verticalLineTo(3.9202f)
                curveTo(16.31f, 3.4002f, 17.77f, 2.9803f, 19.0f, 2.7803f)
                close()
            }
        }
        .build()
        return _booksaved!!
    }

private var _booksaved: ImageVector? = null

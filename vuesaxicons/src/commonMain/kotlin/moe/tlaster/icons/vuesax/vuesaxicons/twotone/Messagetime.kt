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

public val TwotoneGroup.Messagetime: ImageVector
    get() {
        if (_messagetime != null) {
            return _messagetime!!
        }
        _messagetime = Builder(name = "Messagetime", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.4302f)
                verticalLineTo(13.4302f)
                curveTo(22.0f, 14.9302f, 21.5f, 16.1802f, 20.62f, 17.0602f)
                curveTo(19.75f, 17.9302f, 18.5f, 18.4302f, 17.0f, 18.4302f)
                verticalLineTo(20.5602f)
                curveTo(17.0f, 21.3602f, 16.11f, 21.8402f, 15.45f, 21.4002f)
                lineTo(11.0f, 18.4302f)
                horizontalLineTo(8.88f)
                curveTo(8.96f, 18.1302f, 9.0f, 17.8202f, 9.0f, 17.5002f)
                curveTo(9.0f, 16.4802f, 8.61f, 15.5402f, 7.97f, 14.8302f)
                curveTo(7.25f, 14.0102f, 6.18f, 13.5002f, 5.0f, 13.5002f)
                curveTo(3.88f, 13.5002f, 2.86f, 13.9602f, 2.13f, 14.7102f)
                curveTo(2.04f, 14.3102f, 2.0f, 13.8802f, 2.0f, 13.4302f)
                verticalLineTo(7.4302f)
                curveTo(2.0f, 4.4302f, 4.0f, 2.4302f, 7.0f, 2.4302f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 2.4302f, 22.0f, 4.4302f, 22.0f, 7.4302f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 17.5f)
                curveTo(9.0f, 18.7f, 8.47f, 19.77f, 7.64f, 20.5f)
                curveTo(6.93f, 21.12f, 6.01f, 21.5f, 5.0f, 21.5f)
                curveTo(2.79f, 21.5f, 1.0f, 19.71f, 1.0f, 17.5f)
                curveTo(1.0f, 16.24f, 1.58f, 15.11f, 2.5f, 14.38f)
                curveTo(3.19f, 13.83f, 4.06f, 13.5f, 5.0f, 13.5f)
                curveTo(7.21f, 13.5f, 9.0f, 15.29f, 9.0f, 17.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.25f, 16.25f)
                verticalLineTo(17.75f)
                lineTo(4.0f, 18.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 10.5f)
                horizontalLineTo(15.5f)
            }
        }
        .build()
        return _messagetime!!
    }

private var _messagetime: ImageVector? = null

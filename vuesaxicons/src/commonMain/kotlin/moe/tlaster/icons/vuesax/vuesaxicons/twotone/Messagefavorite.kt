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

public val TwotoneGroup.Messagefavorite: ImageVector
    get() {
        if (_messagefavorite != null) {
            return _messagefavorite!!
        }
        _messagefavorite = Builder(name = "Messagefavorite", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 17.0f, 20.0f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(15.5f)
                curveTo(15.19f, 19.0f, 14.89f, 19.15f, 14.7f, 19.4f)
                lineTo(13.2f, 21.4f)
                curveTo(12.54f, 22.28f, 11.46f, 22.28f, 10.8f, 21.4f)
                lineTo(9.3f, 19.4f)
                curveTo(9.14f, 19.18f, 8.77f, 19.0f, 8.5f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(4.0f, 19.0f, 2.0f, 18.0f, 2.0f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.1997f, 4.6201f)
                curveTo(14.8697f, 3.6301f, 15.2597f, 2.4101f, 16.3397f, 2.0701f)
                curveTo(16.8997f, 1.9001f, 17.5997f, 2.0401f, 17.9997f, 2.5701f)
                curveTo(18.3797f, 2.0201f, 19.0997f, 1.9001f, 19.6597f, 2.0701f)
                curveTo(20.7397f, 2.4001f, 21.1297f, 3.6301f, 20.7997f, 4.6201f)
                curveTo(20.2897f, 6.1901f, 18.4997f, 7.0001f, 17.9997f, 7.0001f)
                curveTo(17.4997f, 7.0001f, 15.7297f, 6.2001f, 15.1997f, 4.6201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9965f, 11.0f)
                horizontalLineTo(16.0054f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9945f, 11.0f)
                horizontalLineTo(12.0035f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9945f, 11.0f)
                horizontalLineTo(8.0035f)
            }
        }
        .build()
        return _messagefavorite!!
    }

private var _messagefavorite: ImageVector? = null

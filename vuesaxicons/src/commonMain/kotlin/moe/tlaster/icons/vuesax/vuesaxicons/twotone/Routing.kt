package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Routing: ImageVector
    get() {
        if (_routing != null) {
            return _routing!!
        }
        _routing = Builder(name = "Routing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0701f, 4.5999f)
                curveTo(2.8701f, 1.1399f, 8.0801f, 1.1399f, 8.8701f, 4.5999f)
                curveTo(9.3401f, 6.6299f, 8.0501f, 8.3499f, 6.9301f, 9.4199f)
                curveTo(6.1101f, 10.1999f, 4.8201f, 10.1899f, 4.0001f, 9.4199f)
                curveTo(2.8901f, 8.3499f, 1.6001f, 6.6299f, 2.0701f, 4.5999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.07f, 16.5999f)
                curveTo(15.87f, 13.1399f, 21.11f, 13.1399f, 21.91f, 16.5999f)
                curveTo(22.38f, 18.6299f, 21.09f, 20.3499f, 19.96f, 21.4199f)
                curveTo(19.14f, 22.1999f, 17.84f, 22.1899f, 17.02f, 21.4199f)
                curveTo(15.89f, 20.3499f, 14.6f, 18.6299f, 15.07f, 16.5999f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9997f, 5.0f)
                horizontalLineTo(14.6797f)
                curveTo(16.5297f, 5.0f, 17.3897f, 7.29f, 15.9997f, 8.51f)
                lineTo(8.0097f, 15.5f)
                curveTo(6.6197f, 16.71f, 7.4797f, 19.0f, 9.3197f, 19.0f)
                horizontalLineTo(11.9997f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4857f, 5.5f)
                horizontalLineTo(5.4973f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.4857f, 17.5f)
                horizontalLineTo(18.4973f)
            }
        }
        .build()
        return _routing!!
    }

private var _routing: ImageVector? = null

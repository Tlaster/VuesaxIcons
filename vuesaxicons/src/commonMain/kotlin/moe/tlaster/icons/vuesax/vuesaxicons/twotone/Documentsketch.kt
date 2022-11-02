package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val TwotoneGroup.Documentsketch: ImageVector
    get() {
        if (_documentsketch != null) {
            return _documentsketch!!
        }
        _documentsketch = Builder(name = "Documentsketch", defaultWidth = 22.0.dp, defaultHeight =
                22.0.dp, viewportWidth = 22.0f, viewportHeight = 22.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 19.0f, 19.0f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(3.0f, 21.0f, 1.0f, 19.0f, 1.0f, 14.0f)
                verticalLineTo(8.0f)
                curveTo(1.0f, 3.0f, 3.0f, 1.0f, 8.0f, 1.0f)
                horizontalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(14.0f, 9.0f, 13.0f, 8.0f, 13.0f, 5.0f)
                verticalLineTo(1.0f)
                lineTo(21.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.3197f, 11.0f)
                horizontalLineTo(9.9698f)
                curveTo(10.2398f, 11.0f, 10.5798f, 11.18f, 10.7198f, 11.4f)
                lineTo(11.8498f, 13.1f)
                curveTo(12.0798f, 13.44f, 12.0298f, 13.95f, 11.7398f, 14.24f)
                lineTo(9.2797f, 16.7f)
                curveTo(8.9298f, 17.05f, 8.3497f, 17.05f, 7.9998f, 16.7f)
                lineTo(5.5398f, 14.24f)
                curveTo(5.2498f, 13.95f, 5.1997f, 13.44f, 5.4297f, 13.1f)
                lineTo(6.5598f, 11.4f)
                curveTo(6.7197f, 11.18f, 7.0598f, 11.0f, 7.3197f, 11.0f)
                close()
            }
        }
        .build()
        return _documentsketch!!
    }

private var _documentsketch: ImageVector? = null

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

public val TwotoneGroup.Flashcircle1: ImageVector
    get() {
        if (_flashcircle1 != null) {
            return _flashcircle1!!
        }
        _flashcircle1 = Builder(name = "Flashcircle1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6805f, 12.7201f)
                horizontalLineTo(10.4205f)
                verticalLineTo(16.7701f)
                curveTo(10.4205f, 17.3701f, 11.1605f, 17.6501f, 11.5605f, 17.2001f)
                lineTo(15.8205f, 12.3601f)
                curveTo(16.1905f, 11.9401f, 15.8905f, 11.2801f, 15.3305f, 11.2801f)
                horizontalLineTo(13.5905f)
                verticalLineTo(7.2301f)
                curveTo(13.5905f, 6.6301f, 12.8505f, 6.3501f, 12.4505f, 6.8001f)
                lineTo(8.1905f, 11.6401f)
                curveTo(7.8205f, 12.0601f, 8.1206f, 12.7201f, 8.6805f, 12.7201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 22.0f)
                curveTo(17.4936f, 22.0f, 21.9707f, 17.5228f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.4771f, 17.4936f, 2.0f, 11.9707f, 2.0f)
                curveTo(6.4479f, 2.0f, 1.9707f, 6.4771f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.5228f, 6.4479f, 22.0f, 11.9707f, 22.0f)
                close()
            }
        }
        .build()
        return _flashcircle1!!
    }

private var _flashcircle1: ImageVector? = null

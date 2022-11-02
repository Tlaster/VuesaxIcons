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

public val TwotoneGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9295f, 12.8598f)
                curveTo(21.9095f, 13.0498f, 21.8795f, 13.2298f, 21.8295f, 13.4098f)
                curveTo(20.7895f, 12.5298f, 19.4395f, 11.9998f, 17.9695f, 11.9998f)
                curveTo(14.6595f, 11.9998f, 11.9695f, 14.6898f, 11.9695f, 17.9998f)
                curveTo(11.9695f, 19.4698f, 12.4995f, 20.8198f, 13.3795f, 21.8598f)
                curveTo(13.1995f, 21.9098f, 13.0195f, 21.9398f, 12.8295f, 21.9598f)
                curveTo(11.9795f, 22.0398f, 11.1095f, 21.9998f, 10.2095f, 21.8498f)
                curveTo(6.0995f, 21.1498f, 2.7895f, 17.8198f, 2.1095f, 13.6998f)
                curveTo(0.9795f, 6.8498f, 6.8195f, 1.0098f, 13.6695f, 2.1398f)
                curveTo(17.7895f, 2.8198f, 21.1195f, 6.1298f, 21.8195f, 10.2398f)
                curveTo(21.9695f, 11.1398f, 22.0095f, 12.0098f, 21.9295f, 12.8598f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8307f, 13.41f)
                curveTo(21.6907f, 13.9f, 21.4307f, 14.34f, 21.0607f, 14.71f)
                lineTo(14.6807f, 21.09f)
                curveTo(14.3107f, 21.46f, 13.8707f, 21.72f, 13.3807f, 21.86f)
                curveTo(12.5007f, 20.82f, 11.9707f, 19.47f, 11.9707f, 18.0f)
                curveTo(11.9707f, 14.69f, 14.6607f, 12.0f, 17.9707f, 12.0f)
                curveTo(19.4407f, 12.0f, 20.7907f, 12.53f, 21.8307f, 13.41f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null

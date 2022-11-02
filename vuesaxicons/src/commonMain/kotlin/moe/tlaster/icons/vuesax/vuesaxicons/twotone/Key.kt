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

public val TwotoneGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.7906f, 14.9298f)
                curveTo(17.7306f, 16.9798f, 14.7806f, 17.6098f, 12.1906f, 16.7998f)
                lineTo(7.4806f, 21.4998f)
                curveTo(7.1406f, 21.8498f, 6.4706f, 22.0598f, 5.9906f, 21.9898f)
                lineTo(3.8106f, 21.6898f)
                curveTo(3.0906f, 21.5898f, 2.4206f, 20.9098f, 2.3106f, 20.1898f)
                lineTo(2.0106f, 18.0098f)
                curveTo(1.9406f, 17.5298f, 2.1706f, 16.8598f, 2.5006f, 16.5198f)
                lineTo(7.2006f, 11.8198f)
                curveTo(6.4006f, 9.2198f, 7.0206f, 6.2698f, 9.0806f, 4.2198f)
                curveTo(12.0306f, 1.2698f, 16.8206f, 1.2698f, 19.7806f, 4.2198f)
                curveTo(22.7406f, 7.1698f, 22.7406f, 11.9798f, 19.7906f, 14.9298f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.8906f, 17.4902f)
                lineTo(9.1906f, 19.7902f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 11.0f)
                curveTo(15.3284f, 11.0f, 16.0f, 10.3284f, 16.0f, 9.5f)
                curveTo(16.0f, 8.6716f, 15.3284f, 8.0f, 14.5f, 8.0f)
                curveTo(13.6716f, 8.0f, 13.0f, 8.6716f, 13.0f, 9.5f)
                curveTo(13.0f, 10.3284f, 13.6716f, 11.0f, 14.5f, 11.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null

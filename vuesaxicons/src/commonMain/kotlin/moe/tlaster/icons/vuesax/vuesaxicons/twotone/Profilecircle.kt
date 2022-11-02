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

public val TwotoneGroup.Profilecircle: ImageVector
    get() {
        if (_profilecircle != null) {
            return _profilecircle!!
        }
        _profilecircle = Builder(name = "Profilecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1207f, 12.78f)
                curveTo(12.0507f, 12.77f, 11.9607f, 12.77f, 11.8807f, 12.78f)
                curveTo(10.1207f, 12.72f, 8.7207f, 11.28f, 8.7207f, 9.51f)
                curveTo(8.7207f, 7.7f, 10.1807f, 6.23f, 12.0007f, 6.23f)
                curveTo(13.8107f, 6.23f, 15.2807f, 7.7f, 15.2807f, 9.51f)
                curveTo(15.2707f, 11.28f, 13.8807f, 12.72f, 12.1207f, 12.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7398f, 19.3801f)
                curveTo(16.9598f, 21.0101f, 14.5998f, 22.0001f, 11.9998f, 22.0001f)
                curveTo(9.3998f, 22.0001f, 7.0398f, 21.0101f, 5.2598f, 19.3801f)
                curveTo(5.3598f, 18.4401f, 5.9598f, 17.5201f, 7.0298f, 16.8001f)
                curveTo(9.7698f, 14.9801f, 14.2498f, 14.9801f, 16.9698f, 16.8001f)
                curveTo(18.0398f, 17.5201f, 18.6398f, 18.4401f, 18.7398f, 19.3801f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _profilecircle!!
    }

private var _profilecircle: ImageVector? = null

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

public val TwotoneGroup.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = Builder(name = "Profile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1605f, 10.87f)
                curveTo(12.0605f, 10.86f, 11.9405f, 10.86f, 11.8305f, 10.87f)
                curveTo(9.4506f, 10.79f, 7.5606f, 8.84f, 7.5606f, 6.44f)
                curveTo(7.5606f, 3.99f, 9.5406f, 2.0f, 12.0005f, 2.0f)
                curveTo(14.4505f, 2.0f, 16.4405f, 3.99f, 16.4405f, 6.44f)
                curveTo(16.4305f, 8.84f, 14.5405f, 10.79f, 12.1605f, 10.87f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.1607f, 14.56f)
                curveTo(4.7407f, 16.18f, 4.7407f, 18.82f, 7.1607f, 20.43f)
                curveTo(9.9107f, 22.27f, 14.4207f, 22.27f, 17.1707f, 20.43f)
                curveTo(19.5907f, 18.81f, 19.5907f, 16.17f, 17.1707f, 14.56f)
                curveTo(14.4307f, 12.73f, 9.9207f, 12.73f, 7.1607f, 14.56f)
                close()
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null

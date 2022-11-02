package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Profile2user: ImageVector
    get() {
        if (_profile2user != null) {
            return _profile2user!!
        }
        _profile2user = Builder(name = "Profile2user", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.6805f, 3.96f)
                curveTo(13.1605f, 4.67f, 13.4405f, 5.52f, 13.4405f, 6.44f)
                curveTo(13.4305f, 8.84f, 11.5405f, 10.79f, 9.1606f, 10.87f)
                curveTo(9.0605f, 10.86f, 8.9405f, 10.86f, 8.8306f, 10.87f)
                curveTo(6.4506f, 10.79f, 4.5606f, 8.84f, 4.5606f, 6.44f)
                curveTo(4.5606f, 3.99f, 6.5406f, 2.0f, 9.0006f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.4093f, 4.0f)
                curveTo(18.3493f, 4.0f, 19.9093f, 5.57f, 19.9093f, 7.5f)
                curveTo(19.9093f, 9.39f, 18.4093f, 10.93f, 16.5393f, 11.0f)
                curveTo(16.4593f, 10.99f, 16.3693f, 10.99f, 16.2793f, 11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1607f, 14.56f)
                curveTo(1.7407f, 16.18f, 1.7407f, 18.82f, 4.1607f, 20.43f)
                curveTo(6.9107f, 22.27f, 11.4207f, 22.27f, 14.1707f, 20.43f)
                curveTo(16.5907f, 18.81f, 16.5907f, 16.17f, 14.1707f, 14.56f)
                curveTo(11.4307f, 12.73f, 6.9207f, 12.73f, 4.1607f, 14.56f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3398f, 20.0f)
                curveTo(19.0598f, 19.85f, 19.7398f, 19.56f, 20.2998f, 19.13f)
                curveTo(21.8598f, 17.96f, 21.8598f, 16.03f, 20.2998f, 14.86f)
                curveTo(19.7498f, 14.44f, 19.0798f, 14.16f, 18.3698f, 14.0f)
            }
        }
        .build()
        return _profile2user!!
    }

private var _profile2user: ImageVector? = null

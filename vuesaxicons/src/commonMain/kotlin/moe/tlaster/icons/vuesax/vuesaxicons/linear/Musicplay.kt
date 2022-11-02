package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Musicplay: ImageVector
    get() {
        if (_musicplay != null) {
            return _musicplay!!
        }
        _musicplay = Builder(name = "Musicplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4801f, 18.4901f)
                verticalLineTo(15.5701f)
                curveTo(5.4801f, 14.6001f, 6.2401f, 13.73f, 7.3201f, 13.73f)
                curveTo(8.2901f, 13.73f, 9.1601f, 14.4901f, 9.1601f, 15.5701f)
                verticalLineTo(18.3801f)
                curveTo(9.1601f, 20.3301f, 7.5401f, 21.9501f, 5.5901f, 21.9501f)
                curveTo(3.6401f, 21.9501f, 2.0201f, 20.3201f, 2.0201f, 18.3801f)
                verticalLineTo(12.22f)
                curveTo(1.9101f, 6.6f, 6.3501f, 2.0501f, 11.9701f, 2.0501f)
                curveTo(17.5901f, 2.0501f, 22.0201f, 6.6f, 22.0201f, 12.11f)
                verticalLineTo(18.2701f)
                curveTo(22.0201f, 20.2201f, 20.4001f, 21.8401f, 18.4501f, 21.8401f)
                curveTo(16.5001f, 21.8401f, 14.8801f, 20.2201f, 14.8801f, 18.2701f)
                verticalLineTo(15.4601f)
                curveTo(14.8801f, 14.4901f, 15.6401f, 13.6201f, 16.7201f, 13.6201f)
                curveTo(17.6901f, 13.6201f, 18.5601f, 14.3801f, 18.5601f, 15.4601f)
                verticalLineTo(18.4901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.53f, 9.12f)
                horizontalLineTo(14.72f)
                curveTo(14.5f, 9.12f, 14.29f, 9.25f, 14.19f, 9.44f)
                lineTo(13.44f, 10.94f)
                curveTo(13.33f, 11.16f, 13.02f, 11.16f, 12.91f, 10.94f)
                lineTo(11.07f, 7.27f)
                curveTo(10.96f, 7.06f, 10.66f, 7.05f, 10.55f, 7.26f)
                lineTo(9.71f, 8.81f)
                curveTo(9.61f, 9.0f, 9.41f, 9.12f, 9.19f, 9.12f)
                horizontalLineTo(8.46f)
            }
        }
        .build()
        return _musicplay!!
    }

private var _musicplay: ImageVector? = null

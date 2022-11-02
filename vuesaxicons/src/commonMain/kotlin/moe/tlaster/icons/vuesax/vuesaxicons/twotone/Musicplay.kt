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

public val TwotoneGroup.Musicplay: ImageVector
    get() {
        if (_musicplay != null) {
            return _musicplay!!
        }
        _musicplay = Builder(name = "Musicplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4796f, 18.4898f)
                verticalLineTo(15.5698f)
                curveTo(5.4796f, 14.5998f, 6.2396f, 13.7298f, 7.3196f, 13.7298f)
                curveTo(8.2896f, 13.7298f, 9.1596f, 14.4898f, 9.1596f, 15.5698f)
                verticalLineTo(18.3798f)
                curveTo(9.1596f, 20.3298f, 7.5396f, 21.9498f, 5.5896f, 21.9498f)
                curveTo(3.6396f, 21.9498f, 2.0196f, 20.3198f, 2.0196f, 18.3798f)
                verticalLineTo(12.2198f)
                curveTo(1.9096f, 6.5998f, 6.3496f, 2.0498f, 11.9696f, 2.0498f)
                curveTo(17.5896f, 2.0498f, 22.0196f, 6.5998f, 22.0196f, 12.1098f)
                verticalLineTo(18.2698f)
                curveTo(22.0196f, 20.2198f, 20.3996f, 21.8398f, 18.4496f, 21.8398f)
                curveTo(16.4996f, 21.8398f, 14.8796f, 20.2198f, 14.8796f, 18.2698f)
                verticalLineTo(15.4598f)
                curveTo(14.8796f, 14.4898f, 15.6396f, 13.6198f, 16.7196f, 13.6198f)
                curveTo(17.6896f, 13.6198f, 18.5596f, 14.3798f, 18.5596f, 15.4598f)
                verticalLineTo(18.4898f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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

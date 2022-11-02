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

public val BrokenGroup.Musicplay: ImageVector
    get() {
        if (_musicplay != null) {
            return _musicplay!!
        }
        _musicplay = Builder(name = "Musicplay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0196f, 12.22f)
                curveTo(1.9096f, 6.6f, 6.3496f, 2.0501f, 11.9696f, 2.0501f)
                curveTo(17.5896f, 2.0501f, 22.0196f, 6.6f, 22.0196f, 12.11f)
                verticalLineTo(18.2701f)
                curveTo(22.0196f, 20.2201f, 20.3996f, 21.8401f, 18.4496f, 21.8401f)
                curveTo(16.4996f, 21.8401f, 14.8796f, 20.2201f, 14.8796f, 18.2701f)
                verticalLineTo(15.4601f)
                curveTo(14.8796f, 14.4901f, 15.6396f, 13.6201f, 16.7196f, 13.6201f)
                curveTo(17.6896f, 13.6201f, 18.5596f, 14.3801f, 18.5596f, 15.4601f)
                verticalLineTo(18.4901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4795f, 18.49f)
                verticalLineTo(15.57f)
                curveTo(5.4795f, 14.6f, 6.2396f, 13.73f, 7.3196f, 13.73f)
                curveTo(8.2895f, 13.73f, 9.1595f, 14.49f, 9.1595f, 15.57f)
                verticalLineTo(18.38f)
                curveTo(9.1595f, 20.33f, 7.5395f, 21.95f, 5.5895f, 21.95f)
                curveTo(3.6395f, 21.95f, 2.0195f, 20.32f, 2.0195f, 18.38f)
                verticalLineTo(16.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5407f, 8.19f)
                lineTo(11.0807f, 7.27f)
                curveTo(10.9707f, 7.06f, 10.6707f, 7.05f, 10.5607f, 7.26f)
                lineTo(9.7207f, 8.81f)
                curveTo(9.6207f, 9.0f, 9.4207f, 9.12f, 9.2007f, 9.12f)
                horizontalLineTo(8.4707f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5302f, 9.1201f)
                horizontalLineTo(14.7202f)
                curveTo(14.5002f, 9.1201f, 14.2902f, 9.2501f, 14.1902f, 9.4401f)
                lineTo(13.4402f, 10.9401f)
                curveTo(13.3302f, 11.1601f, 13.0202f, 11.1601f, 12.9102f, 10.9401f)
            }
        }
        .build()
        return _musicplay!!
    }

private var _musicplay: ImageVector? = null

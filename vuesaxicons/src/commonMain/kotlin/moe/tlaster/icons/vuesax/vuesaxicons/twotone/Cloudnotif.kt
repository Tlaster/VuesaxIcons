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

public val TwotoneGroup.Cloudnotif: ImageVector
    get() {
        if (_cloudnotif != null) {
            return _cloudnotif!!
        }
        _cloudnotif = Builder(name = "Cloudnotif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8995f, 13.9602f)
                curveTo(22.1695f, 15.6302f, 21.6995f, 17.4202f, 20.2695f, 18.6802f)
                curveTo(19.2795f, 19.5902f, 17.9795f, 20.0902f, 16.6295f, 20.0802f)
                horizontalLineTo(5.5395f)
                curveTo(0.8695f, 19.7402f, 0.8595f, 12.9402f, 5.5395f, 12.6002f)
                horizontalLineTo(5.5894f)
                curveTo(3.3995f, 6.4702f, 9.0894f, 2.8702f, 13.3795f, 4.2502f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2598f, 13.0101f)
                curveTo(6.7398f, 12.7501f, 6.1698f, 12.6101f, 5.5898f, 12.6001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9707f, 8.5f)
                curveTo(21.9707f, 9.6f, 21.4607f, 10.59f, 20.6507f, 11.23f)
                curveTo(20.0607f, 11.71f, 19.2907f, 12.0f, 18.4707f, 12.0f)
                curveTo(16.5407f, 12.0f, 14.9707f, 10.43f, 14.9707f, 8.5f)
                curveTo(14.9707f, 7.54f, 15.3607f, 6.67f, 16.0007f, 6.04f)
                verticalLineTo(6.03f)
                curveTo(16.6307f, 5.39f, 17.5107f, 5.0f, 18.4707f, 5.0f)
                curveTo(20.4007f, 5.0f, 21.9707f, 6.57f, 21.9707f, 8.5f)
                close()
            }
        }
        .build()
        return _cloudnotif!!
    }

private var _cloudnotif: ImageVector? = null

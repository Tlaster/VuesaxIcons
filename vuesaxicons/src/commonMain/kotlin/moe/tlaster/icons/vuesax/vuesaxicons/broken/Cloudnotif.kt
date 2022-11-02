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

public val BrokenGroup.Cloudnotif: ImageVector
    get() {
        if (_cloudnotif != null) {
            return _cloudnotif!!
        }
        _cloudnotif = Builder(name = "Cloudnotif", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9199f, 5.7299f)
                curveTo(8.5999f, 4.1399f, 11.1699f, 3.5399f, 13.3799f, 4.2499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8995f, 13.9601f)
                curveTo(22.1695f, 15.6301f, 21.6995f, 17.4201f, 20.2695f, 18.6801f)
                curveTo(19.2795f, 19.5901f, 17.9795f, 20.0901f, 16.6295f, 20.0801f)
                horizontalLineTo(5.5395f)
                curveTo(0.8695f, 19.7401f, 0.8595f, 12.9401f, 5.5395f, 12.6001f)
                horizontalLineTo(5.5894f)
                curveTo(5.1995f, 11.5201f, 5.0595f, 10.5201f, 5.1094f, 9.6201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2598f, 13.0101f)
                curveTo(6.7398f, 12.7501f, 6.1698f, 12.6101f, 5.5898f, 12.6001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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

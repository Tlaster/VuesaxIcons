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

public val BrokenGroup.Cloudsunny: ImageVector
    get() {
        if (_cloudsunny != null) {
            return _cloudsunny!!
        }
        _cloudsunny = Builder(name = "Cloudsunny", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2594f, 5.4301f)
                curveTo(9.7395f, 3.4201f, 13.7595f, 3.3201f, 15.9995f, 6.0301f)
                verticalLineTo(6.0401f)
                curveTo(16.6995f, 6.9001f, 17.2295f, 8.0401f, 17.4695f, 9.4901f)
                curveTo(18.7995f, 9.6601f, 19.8795f, 10.3101f, 20.6495f, 11.2301f)
                curveTo(22.3995f, 13.3001f, 22.5495f, 16.6801f, 20.2695f, 18.6801f)
                curveTo(19.2795f, 19.5901f, 17.9795f, 20.0901f, 16.6295f, 20.0801f)
                horizontalLineTo(5.5395f)
                curveTo(0.8695f, 19.7401f, 0.8595f, 12.9401f, 5.5395f, 12.6001f)
                horizontalLineTo(5.5894f)
                curveTo(5.1094f, 11.2601f, 5.0094f, 10.0401f, 5.1795f, 8.9601f)
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
                moveTo(15.8496f, 9.92f)
                curveTo(16.3696f, 9.66f, 16.9396f, 9.52f, 17.5196f, 9.51f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 8.5f)
                curveTo(21.97f, 9.6f, 21.46f, 10.59f, 20.65f, 11.23f)
                curveTo(19.88f, 10.31f, 18.8f, 9.66f, 17.47f, 9.49f)
                curveTo(17.23f, 8.04f, 16.7f, 6.9f, 16.0f, 6.04f)
                verticalLineTo(6.03f)
                curveTo(16.63f, 5.39f, 17.51f, 5.0f, 18.47f, 5.0f)
                curveTo(20.4f, 5.0f, 21.97f, 6.57f, 21.97f, 8.5f)
                close()
            }
        }
        .build()
        return _cloudsunny!!
    }

private var _cloudsunny: ImageVector? = null

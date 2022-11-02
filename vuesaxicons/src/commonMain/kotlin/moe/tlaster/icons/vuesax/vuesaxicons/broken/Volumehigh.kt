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

public val BrokenGroup.Volumehigh: ImageVector
    get() {
        if (_volumehigh != null) {
            return _volumehigh!!
        }
        _volumehigh = Builder(name = "Volumehigh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.4098f)
                curveTo(15.0f, 4.4298f, 12.93f, 3.2898f, 10.41f, 4.8698f)
                lineTo(7.49f, 6.6998f)
                curveTo(7.17f, 6.8898f, 6.8f, 6.9998f, 6.43f, 6.9998f)
                horizontalLineTo(5.0f)
                curveTo(3.0f, 6.9998f, 2.0f, 7.9998f, 2.0f, 9.9998f)
                verticalLineTo(13.9998f)
                curveTo(2.0f, 15.9998f, 3.0f, 16.9998f, 5.0f, 16.9998f)
                horizontalLineTo(6.43f)
                curveTo(6.8f, 16.9998f, 7.17f, 17.1098f, 7.49f, 17.2998f)
                lineTo(10.41f, 19.1298f)
                curveTo(12.93f, 20.7098f, 15.0f, 19.5598f, 15.0f, 16.5898f)
                verticalLineTo(11.4698f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                curveTo(19.78f, 10.37f, 19.78f, 13.63f, 18.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8301f, 18.5f)
                curveTo(21.2801f, 16.57f, 22.0001f, 14.29f, 22.0001f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.8301f, 5.5f)
                curveTo(20.4201f, 6.28f, 20.8801f, 7.12f, 21.2301f, 8.0f)
            }
        }
        .build()
        return _volumehigh!!
    }

private var _volumehigh: ImageVector? = null

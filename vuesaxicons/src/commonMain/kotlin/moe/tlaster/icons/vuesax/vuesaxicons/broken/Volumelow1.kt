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

public val BrokenGroup.Volumelow1: ImageVector
    get() {
        if (_volumelow1 != null) {
            return _volumelow1!!
        }
        _volumelow1 = Builder(name = "Volumelow1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3301f, 7.4098f)
                curveTo(16.3301f, 4.4298f, 14.2601f, 3.2898f, 11.7401f, 4.8698f)
                lineTo(8.8201f, 6.6998f)
                curveTo(8.5001f, 6.8898f, 8.1301f, 6.9998f, 7.7601f, 6.9998f)
                horizontalLineTo(6.3301f)
                curveTo(4.3301f, 6.9998f, 3.3301f, 7.9998f, 3.3301f, 9.9998f)
                verticalLineTo(13.9998f)
                curveTo(3.3301f, 15.9998f, 4.3301f, 16.9998f, 6.3301f, 16.9998f)
                horizontalLineTo(7.7601f)
                curveTo(8.1301f, 16.9998f, 8.5001f, 17.1098f, 8.8201f, 17.2998f)
                lineTo(11.7401f, 19.1298f)
                curveTo(14.2601f, 20.7098f, 16.3301f, 19.5598f, 16.3301f, 16.5898f)
                verticalLineTo(11.6498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3301f, 8.0f)
                curveTo(21.1101f, 10.37f, 21.1101f, 13.63f, 19.3301f, 16.0f)
            }
        }
        .build()
        return _volumelow1!!
    }

private var _volumelow1: ImageVector? = null

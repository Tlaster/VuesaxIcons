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

public val BrokenGroup.Volumelow: ImageVector
    get() {
        if (_volumelow != null) {
            return _volumelow!!
        }
        _volumelow = Builder(name = "Volumelow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9994f, 12.0f)
                horizontalLineTo(21.8594f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                horizontalLineTo(19.8f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 14.0402f)
                curveTo(2.0f, 16.0802f, 3.02f, 17.1002f, 5.06f, 17.1002f)
                horizontalLineTo(6.52f)
                curveTo(6.9f, 17.1002f, 7.28f, 17.2102f, 7.6f, 17.4102f)
                lineTo(10.58f, 19.2702f)
                curveTo(13.16f, 20.8802f, 15.26f, 19.7102f, 15.26f, 16.6702f)
                verticalLineTo(7.3202f)
                curveTo(15.26f, 4.2802f, 13.15f, 3.1102f, 10.58f, 4.7202f)
                lineTo(7.6f, 6.5902f)
                curveTo(7.27f, 6.7902f, 6.9f, 6.9002f, 6.52f, 6.9002f)
                horizontalLineTo(5.06f)
                curveTo(3.02f, 6.9002f, 2.0f, 7.9202f, 2.0f, 9.9602f)
            }
        }
        .build()
        return _volumelow!!
    }

private var _volumelow: ImageVector? = null

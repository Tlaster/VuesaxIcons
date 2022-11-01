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

public val LinearGroup.Repeatemusic: ImageVector
    get() {
        if (_repeatemusic != null) {
            return _repeatemusic!!
        }
        _repeatemusic = Builder(name = "Repeatemusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                lineTo(16.44f, 5.34f)
                lineTo(8.49f, 5.32f)
                curveTo(4.92f, 5.32f, 1.99f, 8.25f, 1.99f, 11.84f)
                curveTo(1.99f, 13.63f, 2.72f, 15.26f, 3.9f, 16.44f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0001f, 21.0001f)
                lineTo(7.5601f, 18.66f)
                lineTo(15.5101f, 18.6801f)
                curveTo(19.0801f, 18.6801f, 22.0101f, 15.75f, 22.0101f, 12.16f)
                curveTo(22.0101f, 10.37f, 21.2801f, 8.7401f, 20.1001f, 7.5601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _repeatemusic!!
    }

private var _repeatemusic: ImageVector? = null

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

public val TwotoneGroup.Repeatemusic: ImageVector
    get() {
        if (_repeatemusic != null) {
            return _repeatemusic!!
        }
        _repeatemusic = Builder(name = "Repeatemusic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0002f, 3.0f)
                lineTo(16.4402f, 5.34f)
                lineTo(8.4902f, 5.32f)
                curveTo(4.9202f, 5.32f, 1.9902f, 8.25f, 1.9902f, 11.84f)
                curveTo(1.9902f, 13.63f, 2.7202f, 15.26f, 3.9002f, 16.44f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0005f, 21.0001f)
                lineTo(7.5606f, 18.66f)
                lineTo(15.5105f, 18.6801f)
                curveTo(19.0805f, 18.6801f, 22.0105f, 15.75f, 22.0105f, 12.16f)
                curveTo(22.0105f, 10.37f, 21.2806f, 8.7401f, 20.1006f, 7.5601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _repeatemusic!!
    }

private var _repeatemusic: ImageVector? = null

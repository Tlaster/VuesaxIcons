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

public val TwotoneGroup.Pet: ImageVector
    get() {
        if (_pet != null) {
            return _pet!!
        }
        _pet = Builder(name = "Pet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.4106f, 16.75f)
                curveTo(4.1706f, 19.64f, 6.3506f, 22.0f, 9.2506f, 22.0f)
                horizontalLineTo(14.0406f)
                curveTo(17.3006f, 22.0f, 19.5406f, 19.37f, 19.0006f, 16.15f)
                curveTo(18.4306f, 12.77f, 15.1706f, 10.0f, 11.7406f, 10.0f)
                curveTo(8.0206f, 10.0f, 4.7206f, 13.04f, 4.4106f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4707f, 7.5f)
                curveTo(11.8514f, 7.5f, 12.9707f, 6.3807f, 12.9707f, 5.0f)
                curveTo(12.9707f, 3.6193f, 11.8514f, 2.5f, 10.4707f, 2.5f)
                curveTo(9.09f, 2.5f, 7.9707f, 3.6193f, 7.9707f, 5.0f)
                curveTo(7.9707f, 6.3807f, 9.09f, 7.5f, 10.4707f, 7.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3008f, 8.7002f)
                curveTo(18.4053f, 8.7002f, 19.3008f, 7.8048f, 19.3008f, 6.7002f)
                curveTo(19.3008f, 5.5956f, 18.4053f, 4.7002f, 17.3008f, 4.7002f)
                curveTo(16.1962f, 4.7002f, 15.3008f, 5.5956f, 15.3008f, 6.7002f)
                curveTo(15.3008f, 7.8048f, 16.1962f, 8.7002f, 17.3008f, 8.7002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.7002f)
                curveTo(21.8284f, 12.7002f, 22.5f, 12.0286f, 22.5f, 11.2002f)
                curveTo(22.5f, 10.3718f, 21.8284f, 9.7002f, 21.0f, 9.7002f)
                curveTo(20.1716f, 9.7002f, 19.5f, 10.3718f, 19.5f, 11.2002f)
                curveTo(19.5f, 12.0286f, 20.1716f, 12.7002f, 21.0f, 12.7002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9707f, 10.7002f)
                curveTo(5.0753f, 10.7002f, 5.9707f, 9.8048f, 5.9707f, 8.7002f)
                curveTo(5.9707f, 7.5956f, 5.0753f, 6.7002f, 3.9707f, 6.7002f)
                curveTo(2.8661f, 6.7002f, 1.9707f, 7.5956f, 1.9707f, 8.7002f)
                curveTo(1.9707f, 9.8048f, 2.8661f, 10.7002f, 3.9707f, 10.7002f)
                close()
            }
        }
        .build()
        return _pet!!
    }

private var _pet: ImageVector? = null

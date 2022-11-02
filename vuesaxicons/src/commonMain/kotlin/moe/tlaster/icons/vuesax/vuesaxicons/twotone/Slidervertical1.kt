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

public val TwotoneGroup.Slidervertical1: ImageVector
    get() {
        if (_slidervertical1 != null) {
            return _slidervertical1!!
        }
        _slidervertical1 = Builder(name = "Slidervertical1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 5.0f)
                horizontalLineTo(16.5f)
                curveTo(17.12f, 5.0f, 17.67f, 5.02f, 18.16f, 5.09f)
                curveTo(20.79f, 5.38f, 21.5f, 6.62f, 21.5f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(21.5f, 17.38f, 20.79f, 18.62f, 18.16f, 18.91f)
                curveTo(17.67f, 18.98f, 17.12f, 19.0f, 16.5f, 19.0f)
                horizontalLineTo(7.5f)
                curveTo(6.88f, 19.0f, 6.33f, 18.98f, 5.84f, 18.91f)
                curveTo(3.21f, 18.62f, 2.5f, 17.38f, 2.5f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.5f, 6.62f, 3.21f, 5.38f, 5.84f, 5.09f)
                curveTo(6.33f, 5.02f, 6.88f, 5.0f, 7.5f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 2.0f)
                horizontalLineTo(19.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                horizontalLineTo(20.0f)
            }
        }
        .build()
        return _slidervertical1!!
    }

private var _slidervertical1: ImageVector? = null

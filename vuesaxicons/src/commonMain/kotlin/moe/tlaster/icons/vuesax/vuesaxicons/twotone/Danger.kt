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

public val TwotoneGroup.Danger: ImageVector
    get() {
        if (_danger != null) {
            return _danger!!
        }
        _danger = Builder(name = "Danger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                verticalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9994f, 21.4098f)
                horizontalLineTo(5.9394f)
                curveTo(2.4694f, 21.4098f, 1.0194f, 18.9298f, 2.6994f, 15.8998f)
                lineTo(5.8194f, 10.2798f)
                lineTo(8.7594f, 4.9998f)
                curveTo(10.5394f, 1.7898f, 13.4594f, 1.7898f, 15.2394f, 4.9998f)
                lineTo(18.1794f, 10.2898f)
                lineTo(21.2994f, 15.9098f)
                curveTo(22.9794f, 18.9398f, 21.5194f, 21.4198f, 18.0594f, 21.4198f)
                horizontalLineTo(11.9994f)
                verticalLineTo(21.4098f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9941f, 17.0f)
                horizontalLineTo(12.0031f)
            }
        }
        .build()
        return _danger!!
    }

private var _danger: ImageVector? = null

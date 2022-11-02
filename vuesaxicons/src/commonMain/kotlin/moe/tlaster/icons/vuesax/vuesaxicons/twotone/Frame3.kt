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

public val TwotoneGroup.Frame3: ImageVector
    get() {
        if (_frame3 != null) {
            return _frame3!!
        }
        _frame3 = Builder(name = "Frame3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2598f, 18.9f)
                verticalLineTo(7.1f)
                curveTo(19.2598f, 5.6f, 18.6198f, 5.0f, 17.0298f, 5.0f)
                horizontalLineTo(15.9898f)
                curveTo(14.3998f, 5.0f, 13.7598f, 5.6f, 13.7598f, 7.1f)
                verticalLineTo(18.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2598f, 18.9f)
                verticalLineTo(12.1f)
                curveTo(5.2598f, 10.6f, 5.8998f, 10.0f, 7.4898f, 10.0f)
                horizontalLineTo(8.5298f)
                curveTo(10.1198f, 10.0f, 10.7598f, 10.6f, 10.7598f, 12.1f)
                verticalLineTo(18.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return _frame3!!
    }

private var _frame3: ImageVector? = null

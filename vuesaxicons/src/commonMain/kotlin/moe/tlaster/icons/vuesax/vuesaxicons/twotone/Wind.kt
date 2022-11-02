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

public val TwotoneGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                horizontalLineTo(18.5f)
                curveTo(20.43f, 15.0f, 22.0f, 16.57f, 22.0f, 18.5f)
                curveTo(22.0f, 20.43f, 20.43f, 22.0f, 18.5f, 22.0f)
                curveTo(16.57f, 22.0f, 15.0f, 20.43f, 15.0f, 18.5f)
                verticalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(18.5f)
                curveTo(20.42f, 12.0f, 22.0f, 10.43f, 22.0f, 8.5f)
                curveTo(22.0f, 6.58f, 20.42f, 5.0f, 18.5f, 5.0f)
                curveTo(16.58f, 5.0f, 15.0f, 6.57f, 15.0f, 8.5f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0001f)
                horizontalLineTo(9.31f)
                curveTo(10.8f, 9.0001f, 12.0f, 7.7901f, 12.0f, 6.3101f)
                curveTo(12.0f, 4.8201f, 10.79f, 3.6201f, 9.31f, 3.6201f)
                curveTo(7.82f, 3.6201f, 6.62f, 4.8301f, 6.62f, 6.3101f)
                verticalLineTo(6.6901f)
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null

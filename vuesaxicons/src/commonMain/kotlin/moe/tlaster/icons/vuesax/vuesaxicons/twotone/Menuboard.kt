package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Menuboard: ImageVector
    get() {
        if (_menuboard != null) {
            return _menuboard!!
        }
        _menuboard = Builder(name = "Menuboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9292f, 6.76f)
                lineTo(18.5592f, 20.29f)
                curveTo(18.3192f, 21.3f, 17.4192f, 22.0f, 16.3792f, 22.0f)
                horizontalLineTo(3.2392f)
                curveTo(1.7292f, 22.0f, 0.6492f, 20.5199f, 1.0992f, 19.0699f)
                lineTo(5.3092f, 5.55f)
                curveTo(5.5992f, 4.6101f, 6.4692f, 3.96f, 7.4492f, 3.96f)
                horizontalLineTo(19.7492f)
                curveTo(20.6992f, 3.96f, 21.4892f, 4.54f, 21.8192f, 5.34f)
                curveTo(22.0092f, 5.77f, 22.0492f, 6.26f, 21.9292f, 6.76f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                horizontalLineTo(20.78f)
                curveTo(22.07f, 22.0f, 23.08f, 20.91f, 22.99f, 19.62f)
                lineTo(22.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6797f, 6.38f)
                lineTo(10.7197f, 2.0601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.3809f, 6.3898f)
                lineTo(17.3209f, 2.0498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.6992f, 12.0f)
                horizontalLineTo(15.6992f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6992f, 16.0f)
                horizontalLineTo(14.6992f)
            }
        }
        .build()
        return _menuboard!!
    }

private var _menuboard: ImageVector? = null

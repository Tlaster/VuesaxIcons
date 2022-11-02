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

public val TwotoneGroup.Passwordcheck: ImageVector
    get() {
        if (_passwordcheck != null) {
            return _passwordcheck!!
        }
        _passwordcheck = Builder(name = "Passwordcheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.02f, 19.5f)
                horizontalLineTo(7.5f)
                curveTo(6.88f, 19.5f, 6.33f, 19.48f, 5.84f, 19.41f)
                curveTo(3.21f, 19.12f, 2.5f, 17.88f, 2.5f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(2.5f, 6.12f, 3.21f, 4.88f, 5.84f, 4.59f)
                curveTo(6.33f, 4.52f, 6.88f, 4.5f, 7.5f, 4.5f)
                horizontalLineTo(10.96f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0195f, 4.5f)
                horizontalLineTo(16.4995f)
                curveTo(17.1195f, 4.5f, 17.6695f, 4.52f, 18.1595f, 4.59f)
                curveTo(20.7895f, 4.88f, 21.4995f, 6.12f, 21.4995f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(21.4995f, 17.88f, 20.7895f, 19.12f, 18.1595f, 19.41f)
                curveTo(17.6695f, 19.48f, 17.1195f, 19.5f, 16.4995f, 19.5f)
                horizontalLineTo(15.0195f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0941f, 12.0f)
                horizontalLineTo(11.1031f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0941f, 12.0f)
                horizontalLineTo(7.1031f)
            }
        }
        .build()
        return _passwordcheck!!
    }

private var _passwordcheck: ImageVector? = null

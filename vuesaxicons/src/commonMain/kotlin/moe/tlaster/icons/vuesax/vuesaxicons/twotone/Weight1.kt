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

public val TwotoneGroup.Weight1: ImageVector
    get() {
        if (_weight1 != null) {
            return _weight1!!
        }
        _weight1 = Builder(name = "Weight1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1797f, 18.0f)
                curveTo(19.5797f, 18.0f, 20.1797f, 16.65f, 20.1797f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(20.1797f, 7.35f, 19.5797f, 6.0f, 17.1797f, 6.0f)
                curveTo(14.7797f, 6.0f, 14.1797f, 7.35f, 14.1797f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(14.1797f, 16.65f, 14.7797f, 18.0f, 17.1797f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8203f, 18.0f)
                curveTo(4.4203f, 18.0f, 3.8203f, 16.65f, 3.8203f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(3.8203f, 7.35f, 4.4203f, 6.0f, 6.8203f, 6.0f)
                curveTo(9.2203f, 6.0f, 9.8203f, 7.35f, 9.8203f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(9.8203f, 16.65f, 9.2203f, 18.0f, 6.8203f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8203f, 12.0f)
                horizontalLineTo(14.1803f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.5f, 14.5f)
                verticalLineTo(9.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 14.5f)
                verticalLineTo(9.5f)
            }
        }
        .build()
        return _weight1!!
    }

private var _weight1: ImageVector? = null

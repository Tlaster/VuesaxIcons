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

public val TwotoneGroup.Batteryfull: ImageVector
    get() {
        if (_batteryfull != null) {
            return _batteryfull!!
        }
        _batteryfull = Builder(name = "Batteryfull", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 9.5f)
                curveTo(22.0f, 9.5f, 22.0f, 10.0f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 14.0f, 22.0f, 14.5f, 20.5f, 14.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.3809f, 10.0f)
                curveTo(6.7109f, 11.31f, 6.7109f, 12.69f, 6.3809f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8809f, 10.0f)
                curveTo(10.2109f, 11.31f, 10.2109f, 12.69f, 9.8809f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.34f, strokeAlpha = 0.34f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3809f, 10.0f)
                curveTo(13.7109f, 11.31f, 13.7109f, 12.69f, 13.3809f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 19.0f, 2.0f, 18.0f, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 6.0f, 3.0f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(13.0f)
                curveTo(17.0f, 5.0f, 18.0f, 6.0f, 18.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 18.0f, 17.0f, 19.0f, 13.0f, 19.0f)
                close()
            }
        }
        .build()
        return _batteryfull!!
    }

private var _batteryfull: ImageVector? = null

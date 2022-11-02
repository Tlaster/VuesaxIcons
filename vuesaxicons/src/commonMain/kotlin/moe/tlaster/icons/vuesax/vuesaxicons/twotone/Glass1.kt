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

public val TwotoneGroup.Glass1: ImageVector
    get() {
        if (_glass1 != null) {
            return _glass1!!
        }
        _glass1 = Builder(name = "Glass1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 17.5f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(2.0f, 3.5f, 3.0f, 2.5f, 7.0f, 2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 3.5f, 21.0f, 2.5f, 17.0f, 2.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.9099f)
                verticalLineTo(19.1999f)
                curveTo(10.0f, 21.1999f, 9.2f, 21.9999f, 7.2f, 21.9999f)
                horizontalLineTo(4.8f)
                curveTo(2.8f, 21.9999f, 2.0f, 21.1999f, 2.0f, 19.1999f)
                verticalLineTo(15.9099f)
                curveTo(2.0f, 13.9099f, 2.8f, 13.1099f, 4.8f, 13.1099f)
                horizontalLineTo(7.2f)
                curveTo(9.2f, 13.1099f, 10.0f, 13.9099f, 10.0f, 15.9099f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.9099f)
                verticalLineTo(19.1999f)
                curveTo(22.0f, 21.1999f, 21.2f, 21.9999f, 19.2f, 21.9999f)
                horizontalLineTo(16.8f)
                curveTo(14.8f, 21.9999f, 14.0f, 21.1999f, 14.0f, 19.1999f)
                verticalLineTo(15.9099f)
                curveTo(14.0f, 13.9099f, 14.8f, 13.1099f, 16.8f, 13.1099f)
                horizontalLineTo(19.2f)
                curveTo(21.2f, 13.1099f, 22.0f, 13.9099f, 22.0f, 15.9099f)
                close()
            }
        }
        .build()
        return _glass1!!
    }

private var _glass1: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Elementplus: ImageVector
    get() {
        if (_elementplus != null) {
            return _elementplus!!
        }
        _elementplus = Builder(name = "Elementplus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(22.0f, 2.64f, 21.36f, 2.0f, 19.77f, 2.0f)
                horizontalLineTo(15.73f)
                curveTo(14.14f, 2.0f, 13.5f, 2.64f, 13.5f, 4.23f)
                verticalLineTo(8.27f)
                curveTo(13.5f, 9.86f, 14.14f, 10.5f, 15.73f, 10.5f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 10.5f, 22.0f, 9.86f, 22.0f, 8.27f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 8.52f)
                verticalLineTo(3.98f)
                curveTo(10.5f, 2.57f, 9.86f, 2.0f, 8.27f, 2.0f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 2.0f, 2.0f, 2.57f, 2.0f, 3.98f)
                verticalLineTo(8.51f)
                curveTo(2.0f, 9.93f, 2.64f, 10.49f, 4.23f, 10.49f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 10.5f, 10.5f, 9.93f, 10.5f, 8.52f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(10.5f, 14.14f, 9.86f, 13.5f, 8.27f, 13.5f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 13.5f, 2.0f, 14.14f, 2.0f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(2.0f, 21.36f, 2.64f, 22.0f, 4.23f, 22.0f)
                horizontalLineTo(8.27f)
                curveTo(9.86f, 22.0f, 10.5f, 21.36f, 10.5f, 19.77f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 17.5f)
                horizontalLineTo(20.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 20.5f)
                verticalLineTo(14.5f)
            }
        }
        .build()
        return _elementplus!!
    }

private var _elementplus: ImageVector? = null

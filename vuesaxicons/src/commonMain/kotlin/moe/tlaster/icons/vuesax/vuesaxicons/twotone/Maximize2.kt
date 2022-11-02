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

public val TwotoneGroup.Maximize2: ImageVector
    get() {
        if (_maximize2 != null) {
            return _maximize2!!
        }
        _maximize2 = Builder(name = "Maximize2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                verticalLineTo(6.5f)
                curveTo(2.0f, 4.01f, 4.01f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                horizontalLineTo(17.5f)
                curveTo(19.99f, 2.0f, 22.0f, 4.01f, 22.0f, 6.5f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                verticalLineTo(17.5f)
                curveTo(22.0f, 19.99f, 19.99f, 22.0f, 17.5f, 22.0f)
                horizontalLineTo(16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(4.01f, 22.0f, 2.0f, 19.99f, 2.0f, 17.5f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.54f, strokeAlpha = 0.54f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                verticalLineTo(10.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(12.0f)
                horizontalLineTo(18.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineTo(10.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineTo(14.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(18.0f, 12.0f)
                verticalLineTo(14.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.54f, strokeAlpha = 0.54f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                horizontalLineTo(14.0f)
                moveTo(12.0f, 18.0f)
                verticalLineTo(6.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(12.0f, 18.0f)
                horizontalLineTo(14.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 18.0f)
                horizontalLineTo(10.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(12.0f, 6.0f)
                horizontalLineTo(10.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _maximize2!!
    }

private var _maximize2: ImageVector? = null

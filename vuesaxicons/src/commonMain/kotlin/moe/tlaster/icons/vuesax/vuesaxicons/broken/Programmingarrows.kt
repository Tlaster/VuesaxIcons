package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Programmingarrows: ImageVector
    get() {
        if (_programmingarrows != null) {
            return _programmingarrows!!
        }
        _programmingarrows = Builder(name = "Programmingarrows", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineTo(6.5f)
                curveTo(19.0f, 5.4f, 18.1f, 4.5f, 17.0f, 4.5f)
                horizontalLineTo(11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                lineTo(11.0f, 4.5f)
                lineTo(14.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 22.0f)
                curveTo(20.6569f, 22.0f, 22.0f, 20.6569f, 22.0f, 19.0f)
                curveTo(22.0f, 17.3431f, 20.6569f, 16.0f, 19.0f, 16.0f)
                curveTo(17.3431f, 16.0f, 16.0f, 17.3431f, 16.0f, 19.0f)
                curveTo(16.0f, 20.6569f, 17.3431f, 22.0f, 19.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                verticalLineTo(17.5f)
                curveTo(5.0f, 18.6f, 5.9f, 19.5f, 7.0f, 19.5f)
                horizontalLineTo(12.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 22.0f)
                lineTo(13.0f, 19.5f)
                lineTo(10.0f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(6.6568f, 8.0f, 8.0f, 6.6568f, 8.0f, 5.0f)
                curveTo(8.0f, 3.3431f, 6.6568f, 2.0f, 5.0f, 2.0f)
                curveTo(3.3431f, 2.0f, 2.0f, 3.3431f, 2.0f, 5.0f)
                curveTo(2.0f, 6.6568f, 3.3431f, 8.0f, 5.0f, 8.0f)
                close()
            }
        }
        .build()
        return _programmingarrows!!
    }

private var _programmingarrows: ImageVector? = null

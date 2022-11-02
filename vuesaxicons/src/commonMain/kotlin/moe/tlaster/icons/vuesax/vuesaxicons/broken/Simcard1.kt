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

public val BrokenGroup.Simcard1: ImageVector
    get() {
        if (_simcard1 != null) {
            return _simcard1!!
        }
        _simcard1 = Builder(name = "Simcard1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                curveTo(3.0f, 20.0f, 5.0f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(19.0f, 22.0f, 21.0f, 20.0f, 21.0f, 17.0f)
                verticalLineTo(10.07f)
                curveTo(21.0f, 8.74f, 20.47f, 7.47f, 19.54f, 6.53f)
                lineTo(16.47f, 3.46f)
                curveTo(15.53f, 2.53f, 14.26f, 2.0f, 12.93f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 2.0f, 3.0f, 4.0f, 3.0f, 7.0f)
                verticalLineTo(12.98f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 18.5f)
                horizontalLineTo(14.0f)
                curveTo(15.65f, 18.5f, 17.0f, 17.15f, 17.0f, 15.5f)
                verticalLineTo(12.5f)
                curveTo(17.0f, 10.85f, 15.65f, 9.5f, 14.0f, 9.5f)
                horizontalLineTo(10.0f)
                curveTo(8.35f, 9.5f, 7.0f, 10.85f, 7.0f, 12.5f)
                verticalLineTo(15.5f)
                curveTo(7.0f, 17.15f, 8.35f, 18.5f, 10.0f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.5f)
                verticalLineTo(18.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 14.0f)
                horizontalLineTo(16.5f)
            }
        }
        .build()
        return _simcard1!!
    }

private var _simcard1: ImageVector? = null

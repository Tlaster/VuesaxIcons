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

public val BrokenGroup.Sliderhorizontal1: ImageVector
    get() {
        if (_sliderhorizontal1 != null) {
            return _sliderhorizontal1!!
        }
        _sliderhorizontal1 = Builder(name = "Sliderhorizontal1", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.5f)
                verticalLineTo(4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.45f)
                verticalLineTo(7.5f)
                curveTo(5.0f, 6.88f, 5.02f, 6.33f, 5.09f, 5.84f)
                curveTo(5.38f, 3.21f, 6.62f, 2.5f, 10.0f, 2.5f)
                horizontalLineTo(14.0f)
                curveTo(17.38f, 2.5f, 18.62f, 3.21f, 18.91f, 5.84f)
                curveTo(18.98f, 6.33f, 19.0f, 6.88f, 19.0f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19.0f, 17.12f, 18.98f, 17.67f, 18.91f, 18.16f)
                curveTo(18.62f, 20.79f, 17.38f, 21.5f, 14.0f, 21.5f)
                horizontalLineTo(10.0f)
                curveTo(6.62f, 21.5f, 5.38f, 20.79f, 5.09f, 18.16f)
                curveTo(5.02f, 17.67f, 5.0f, 17.12f, 5.0f, 16.5f)
            }
        }
        .build()
        return _sliderhorizontal1!!
    }

private var _sliderhorizontal1: ImageVector? = null

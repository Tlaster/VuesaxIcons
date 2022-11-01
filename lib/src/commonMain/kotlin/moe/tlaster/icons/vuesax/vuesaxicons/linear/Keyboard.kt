package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Keyboard: ImageVector
    get() {
        if (_keyboard != null) {
            return _keyboard!!
        }
        _keyboard = Builder(name = "Keyboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                horizontalLineTo(16.5f)
                curveTo(17.12f, 4.0f, 17.67f, 4.02f, 18.16f, 4.09f)
                curveTo(20.79f, 4.38f, 21.5f, 5.62f, 21.5f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(21.5f, 18.38f, 20.79f, 19.62f, 18.16f, 19.91f)
                curveTo(17.67f, 19.98f, 17.12f, 20.0f, 16.5f, 20.0f)
                horizontalLineTo(7.5f)
                curveTo(6.88f, 20.0f, 6.33f, 19.98f, 5.84f, 19.91f)
                curveTo(3.21f, 19.62f, 2.5f, 18.38f, 2.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.5f, 5.62f, 3.21f, 4.38f, 5.84f, 4.09f)
                curveTo(6.33f, 4.02f, 6.88f, 4.0f, 7.5f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 10.0f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 15.5f)
                horizontalLineTo(7.02f)
                horizontalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0946f, 10.0f)
                horizontalLineTo(10.1036f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0946f, 10.0f)
                horizontalLineTo(7.1036f)
            }
        }
        .build()
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null

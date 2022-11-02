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

public val LinearGroup.Mobileprogramming: ImageVector
    get() {
        if (_mobileprogramming != null) {
            return _mobileprogramming!!
        }
        _mobileprogramming = Builder(name = "Mobileprogramming", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9299f, 2.0f)
                lineTo(8.9599f, 3.53f)
                curveTo(8.9799f, 4.34f, 9.6499f, 5.0f, 10.4599f, 5.0f)
                horizontalLineTo(13.4799f)
                curveTo(14.3099f, 5.0f, 14.9799f, 4.32f, 14.9799f, 3.5f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                lineTo(15.0f, 19.0f)
                lineTo(17.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 17.0f)
                lineTo(22.0f, 19.0f)
                lineTo(20.0f, 21.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(4.5f, 22.0f, 3.0f, 20.0f, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 4.0f, 4.5f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(19.5f, 2.0f, 21.0f, 4.0f, 21.0f, 7.0f)
                verticalLineTo(14.0f)
            }
        }
        .build()
        return _mobileprogramming!!
    }

private var _mobileprogramming: ImageVector? = null

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

public val BrokenGroup.Money2: ImageVector
    get() {
        if (_money2 != null) {
            return _money2!!
        }
        _money2 = Builder(name = "Money2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.53f)
                verticalLineTo(15.5f)
                curveTo(2.0f, 19.0f, 4.0f, 20.5f, 7.0f, 20.5f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 20.5f, 22.0f, 19.0f, 22.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 5.0f, 20.0f, 3.5f, 17.0f, 3.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 3.5f, 2.0f, 5.0f, 2.0f, 8.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                curveTo(6.0f, 9.0f, 7.0f, 8.0f, 7.0f, 5.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 10.34f, 13.66f, 9.0f, 12.0f, 9.0f)
                curveTo(10.34f, 9.0f, 9.0f, 10.34f, 9.0f, 12.0f)
                curveTo(9.0f, 13.66f, 10.34f, 15.0f, 12.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                horizontalLineTo(21.0f)
                curveTo(18.0f, 9.0f, 17.0f, 8.0f, 17.0f, 5.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                horizontalLineTo(3.0f)
                curveTo(6.0f, 15.0f, 7.0f, 16.0f, 7.0f, 19.0f)
                verticalLineTo(20.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                horizontalLineTo(21.0f)
                curveTo(18.0f, 15.0f, 17.0f, 16.0f, 17.0f, 19.0f)
                verticalLineTo(20.0f)
            }
        }
        .build()
        return _money2!!
    }

private var _money2: ImageVector? = null

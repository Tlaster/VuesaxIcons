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

public val BrokenGroup.Be: ImageVector
    get() {
        if (_be != null) {
            return _be!!
        }
        _be = Builder(name = "Be", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                curveTo(2.0f, 6.45f, 2.45f, 6.0f, 3.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(9.66f, 6.0f, 11.0f, 7.34f, 11.0f, 9.0f)
                curveTo(11.0f, 10.66f, 9.66f, 12.0f, 8.0f, 12.0f)
                horizontalLineTo(2.0f)
                horizontalLineTo(9.0f)
                curveTo(10.66f, 12.0f, 12.0f, 13.34f, 12.0f, 15.0f)
                curveTo(12.0f, 16.66f, 10.66f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.45f, 18.0f, 2.0f, 17.55f, 2.0f, 17.0f)
                verticalLineTo(10.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                horizontalLineTo(22.0f)
                curveTo(22.0f, 11.79f, 20.21f, 10.0f, 18.0f, 10.0f)
                curveTo(15.79f, 10.0f, 14.0f, 11.79f, 14.0f, 14.0f)
                close()
                moveTo(14.0f, 14.0f)
                curveTo(14.0f, 16.21f, 15.79f, 18.0f, 18.0f, 18.0f)
                horizontalLineTo(19.67f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 7.5f)
                horizontalLineTo(16.5f)
            }
        }
        .build()
        return _be!!
    }

private var _be: ImageVector? = null

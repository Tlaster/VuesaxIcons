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

public val BrokenGroup.Frame3: ImageVector
    get() {
        if (_frame3 != null) {
            return _frame3!!
        }
        _frame3 = Builder(name = "Frame3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.27f, 22.0f)
                curveTo(9.86f, 22.0f, 10.5f, 21.4f, 10.5f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(10.5f, 2.6f, 9.86f, 2.0f, 8.27f, 2.0f)
                horizontalLineTo(4.23f)
                curveTo(2.64f, 2.0f, 2.0f, 2.6f, 2.0f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.0f, 21.4f, 2.64f, 22.0f, 4.23f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.73f, 2.0f)
                curveTo(14.14f, 2.0f, 13.5f, 2.6f, 13.5f, 4.1f)
                verticalLineTo(12.9f)
                curveTo(13.5f, 14.4f, 14.14f, 15.0f, 15.73f, 15.0f)
                horizontalLineTo(19.77f)
                curveTo(21.36f, 15.0f, 22.0f, 14.4f, 22.0f, 12.9f)
                verticalLineTo(4.1f)
                curveTo(22.0f, 2.6f, 21.36f, 2.0f, 19.77f, 2.0f)
            }
        }
        .build()
        return _frame3!!
    }

private var _frame3: ImageVector? = null

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

public val BrokenGroup.Fatrows: ImageVector
    get() {
        if (_fatrows != null) {
            return _fatrows!!
        }
        _fatrows = Builder(name = "Fatrows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.73f)
                curveTo(22.0f, 14.14f, 21.4f, 13.5f, 19.9f, 13.5f)
                horizontalLineTo(4.1f)
                curveTo(2.6f, 13.5f, 2.0f, 14.14f, 2.0f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(2.0f, 21.36f, 2.6f, 22.0f, 4.1f, 22.0f)
                horizontalLineTo(19.9f)
                curveTo(21.4f, 22.0f, 22.0f, 21.36f, 22.0f, 19.77f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 8.27f)
                curveTo(2.0f, 9.86f, 2.6f, 10.5f, 4.1f, 10.5f)
                horizontalLineTo(12.9f)
                curveTo(14.4f, 10.5f, 15.0f, 9.86f, 15.0f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(15.0f, 2.64f, 14.4f, 2.0f, 12.9f, 2.0f)
                horizontalLineTo(4.1f)
                curveTo(2.6f, 2.0f, 2.0f, 2.64f, 2.0f, 4.23f)
            }
        }
        .build()
        return _fatrows!!
    }

private var _fatrows: ImageVector? = null

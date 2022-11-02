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

public val BrokenGroup.Textbold: ImageVector
    get() {
        if (_textbold != null) {
            return _textbold!!
        }
        _textbold = Builder(name = "Textbold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.8809f, 4.5f)
                curveTo(4.8809f, 3.4f, 5.7809f, 2.5f, 6.8809f, 2.5f)
                horizontalLineTo(12.0009f)
                curveTo(14.6209f, 2.5f, 16.7509f, 4.63f, 16.7509f, 7.25f)
                curveTo(16.7509f, 9.87f, 14.6209f, 12.0f, 12.0009f, 12.0f)
                horizontalLineTo(4.8809f)
                verticalLineTo(4.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.8809f, 13.98f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.3809f)
                curveTo(17.0009f, 12.0f, 19.1309f, 14.13f, 19.1309f, 16.75f)
                curveTo(19.1309f, 19.37f, 17.0009f, 21.5f, 14.3809f, 21.5f)
                horizontalLineTo(6.8809f)
                curveTo(5.7809f, 21.5f, 4.8809f, 20.6f, 4.8809f, 19.5f)
                verticalLineTo(17.96f)
            }
        }
        .build()
        return _textbold!!
    }

private var _textbold: ImageVector? = null

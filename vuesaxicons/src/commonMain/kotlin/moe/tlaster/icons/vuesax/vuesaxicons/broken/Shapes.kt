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

public val BrokenGroup.Shapes: ImageVector
    get() {
        if (_shapes != null) {
            return _shapes!!
        }
        _shapes = Builder(name = "Shapes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9707f, 12.25f)
                curveTo(1.9707f, 8.5f, 3.4707f, 7.0f, 7.2207f, 7.0f)
                horizontalLineTo(11.7207f)
                curveTo(15.4707f, 7.0f, 16.9707f, 8.5f, 16.9707f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(16.9707f, 20.5f, 15.4707f, 22.0f, 11.7207f, 22.0f)
                horizontalLineTo(7.2207f)
                curveTo(3.4707f, 22.0f, 1.9707f, 20.5f, 1.9707f, 16.75f)
                verticalLineTo(16.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.97f, 7.5f)
                curveTo(21.97f, 10.37f, 19.78f, 12.72f, 16.97f, 12.97f)
                verticalLineTo(12.25f)
                curveTo(16.97f, 8.5f, 15.47f, 7.0f, 11.72f, 7.0f)
                horizontalLineTo(11.0f)
                curveTo(11.25f, 4.19f, 13.6f, 2.0f, 16.47f, 2.0f)
                curveTo(19.26f, 2.0f, 21.56f, 4.07f, 21.91f, 6.77f)
                curveTo(21.95f, 7.0f, 21.97f, 7.25f, 21.97f, 7.5f)
                close()
            }
        }
        .build()
        return _shapes!!
    }

private var _shapes: ImageVector? = null

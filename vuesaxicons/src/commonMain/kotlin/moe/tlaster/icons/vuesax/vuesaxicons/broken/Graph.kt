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

public val BrokenGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.28f, 2.9599f)
                curveTo(13.0f, 1.9999f, 12.0f, 3.0799f, 12.0f, 5.6799f)
                verticalLineTo(8.5599f)
                curveTo(12.0f, 10.9999f, 13.0f, 11.9999f, 15.0f, 11.9999f)
                horizontalLineTo(18.32f)
                curveTo(20.92f, 11.9999f, 22.0f, 10.9999f, 21.04f, 7.7199f)
                curveTo(20.82f, 6.9799f, 20.46f, 6.2699f, 20.0f, 5.6299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.1194f, 14.43f)
                curveTo(1.3094f, 9.39f, 4.6494f, 4.95f, 9.2594f, 4.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 14.7f)
                curveTo(19.07f, 19.33f, 14.63f, 22.69f, 9.58f, 21.87f)
                curveTo(7.35f, 21.52f, 5.37f, 20.31f, 4.0f, 18.61f)
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null

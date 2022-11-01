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

public val LinearGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.32f, 11.9999f)
                curveTo(20.92f, 11.9999f, 22.0f, 10.9999f, 21.04f, 7.7199f)
                curveTo(20.39f, 5.5099f, 18.49f, 3.6099f, 16.28f, 2.9599f)
                curveTo(13.0f, 1.9999f, 12.0f, 3.0799f, 12.0f, 5.6799f)
                verticalLineTo(8.5599f)
                curveTo(12.0f, 10.9999f, 13.0f, 11.9999f, 15.0f, 11.9999f)
                horizontalLineTo(18.32f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9999f, 14.7f)
                curveTo(19.0699f, 19.33f, 14.6299f, 22.69f, 9.5799f, 21.87f)
                curveTo(5.7899f, 21.26f, 2.7399f, 18.21f, 2.1199f, 14.42f)
                curveTo(1.3099f, 9.39f, 4.6499f, 4.95f, 9.2599f, 4.01f)
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null

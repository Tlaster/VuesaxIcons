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

public val BrokenGroup.Map1: ImageVector
    get() {
        if (_map1 != null) {
            return _map1!!
        }
        _map1 = Builder(name = "Map1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.2691f, 5.49f)
                lineTo(3.2991f, 6.05f)
                curveTo(2.7491f, 6.37f, 2.2891f, 7.15f, 2.2891f, 7.79f)
                verticalLineTo(17.52f)
                curveTo(2.2891f, 19.42f, 3.6391f, 20.2f, 5.2791f, 19.26f)
                lineTo(7.6291f, 17.92f)
                curveTo(8.1391f, 17.63f, 8.9891f, 17.6f, 9.5191f, 17.87f)
                lineTo(14.7691f, 20.5f)
                curveTo(15.2991f, 20.76f, 16.1491f, 20.74f, 16.6591f, 20.45f)
                lineTo(20.9891f, 17.97f)
                curveTo(21.5391f, 17.65f, 21.9991f, 16.87f, 21.9991f, 16.23f)
                verticalLineTo(6.49f)
                curveTo(21.9991f, 4.59f, 20.6491f, 3.81f, 19.0091f, 4.75f)
                lineTo(16.6591f, 6.09f)
                curveTo(16.1491f, 6.38f, 15.2991f, 6.41f, 14.7691f, 6.14f)
                lineTo(9.5191f, 3.52f)
                curveTo(8.9891f, 3.26f, 8.1391f, 3.28f, 7.6291f, 3.57f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5605f, 4.0f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.7305f, 6.6201f)
                verticalLineTo(20.0001f)
            }
        }
        .build()
        return _map1!!
    }

private var _map1: ImageVector? = null

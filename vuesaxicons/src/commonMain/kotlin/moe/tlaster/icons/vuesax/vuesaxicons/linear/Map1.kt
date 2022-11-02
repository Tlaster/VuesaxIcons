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

public val LinearGroup.Map1: ImageVector
    get() {
        if (_map1 != null) {
            return _map1!!
        }
        _map1 = Builder(name = "Map1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.29f, 7.78f)
                verticalLineTo(17.51f)
                curveTo(2.29f, 19.41f, 3.64f, 20.19f, 5.28f, 19.25f)
                lineTo(7.63f, 17.91f)
                curveTo(8.14f, 17.62f, 8.99f, 17.59f, 9.52f, 17.86f)
                lineTo(14.77f, 20.49f)
                curveTo(15.3f, 20.75f, 16.15f, 20.73f, 16.66f, 20.44f)
                lineTo(20.99f, 17.96f)
                curveTo(21.54f, 17.64f, 22.0f, 16.86f, 22.0f, 16.22f)
                verticalLineTo(6.49f)
                curveTo(22.0f, 4.59f, 20.65f, 3.81f, 19.01f, 4.75f)
                lineTo(16.66f, 6.09f)
                curveTo(16.15f, 6.38f, 15.3f, 6.41f, 14.77f, 6.14f)
                lineTo(9.52f, 3.52f)
                curveTo(8.99f, 3.26f, 8.14f, 3.28f, 7.63f, 3.57f)
                lineTo(3.3f, 6.05f)
                curveTo(2.74f, 6.37f, 2.29f, 7.15f, 2.29f, 7.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.56f, 4.0f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.73f, 6.6201f)
                verticalLineTo(20.0001f)
            }
        }
        .build()
        return _map1!!
    }

private var _map1: ImageVector? = null

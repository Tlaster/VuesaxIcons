package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Map1: ImageVector
    get() {
        if (_map1 != null) {
            return _map1!!
        }
        _map1 = Builder(name = "Map1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.2891f, 7.78f)
                verticalLineTo(17.51f)
                curveTo(2.2891f, 19.41f, 3.6391f, 20.19f, 5.2791f, 19.25f)
                lineTo(7.6291f, 17.91f)
                curveTo(8.1391f, 17.62f, 8.9891f, 17.59f, 9.5191f, 17.86f)
                lineTo(14.7691f, 20.49f)
                curveTo(15.2991f, 20.75f, 16.1491f, 20.73f, 16.6591f, 20.44f)
                lineTo(20.9891f, 17.96f)
                curveTo(21.5391f, 17.64f, 21.9991f, 16.86f, 21.9991f, 16.22f)
                verticalLineTo(6.49f)
                curveTo(21.9991f, 4.59f, 20.6491f, 3.81f, 19.0091f, 4.75f)
                lineTo(16.6591f, 6.09f)
                curveTo(16.1491f, 6.38f, 15.2991f, 6.41f, 14.7691f, 6.14f)
                lineTo(9.5191f, 3.52f)
                curveTo(8.9891f, 3.26f, 8.1391f, 3.28f, 7.6291f, 3.57f)
                lineTo(3.2991f, 6.05f)
                curveTo(2.7391f, 6.37f, 2.2891f, 7.15f, 2.2891f, 7.78f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5605f, 4.0f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7305f, 6.6201f)
                verticalLineTo(20.0001f)
            }
        }
        .build()
        return _map1!!
    }

private var _map1: ImageVector? = null

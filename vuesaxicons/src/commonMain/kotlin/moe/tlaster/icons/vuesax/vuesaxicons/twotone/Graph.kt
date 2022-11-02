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

public val TwotoneGroup.Graph: ImageVector
    get() {
        if (_graph != null) {
            return _graph!!
        }
        _graph = Builder(name = "Graph", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.32f, 12.0002f)
                curveTo(20.92f, 12.0002f, 22.0f, 11.0002f, 21.04f, 7.7202f)
                curveTo(20.39f, 5.5102f, 18.49f, 3.6102f, 16.28f, 2.9602f)
                curveTo(13.0f, 2.0002f, 12.0f, 3.0802f, 12.0f, 5.6802f)
                verticalLineTo(8.5602f)
                curveTo(12.0f, 11.0002f, 13.0f, 12.0002f, 15.0f, 12.0002f)
                horizontalLineTo(18.32f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0004f, 14.6998f)
                curveTo(19.0704f, 19.3298f, 14.6304f, 22.6898f, 9.5804f, 21.8698f)
                curveTo(5.7904f, 21.2598f, 2.7404f, 18.2098f, 2.1204f, 14.4198f)
                curveTo(1.3104f, 9.3898f, 4.6504f, 4.9498f, 9.2604f, 4.0098f)
            }
        }
        .build()
        return _graph!!
    }

private var _graph: ImageVector? = null

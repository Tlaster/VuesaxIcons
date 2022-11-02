package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5508f, 17.7201f)
                horizontalLineTo(7.1008f)
                curveTo(6.4308f, 17.7201f, 5.8809f, 17.1701f, 5.8809f, 16.5001f)
                verticalLineTo(7.5201f)
                curveTo(5.8809f, 6.85f, 6.4308f, 6.3f, 7.1008f, 6.3f)
                horizontalLineTo(9.5508f)
                curveTo(10.2208f, 6.3f, 10.7709f, 6.85f, 10.7709f, 7.5201f)
                verticalLineTo(16.5001f)
                curveTo(10.7709f, 17.1701f, 10.2208f, 17.7201f, 9.5508f, 17.7201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1407f, 13.63f)
                horizontalLineTo(14.2007f)
                curveTo(13.6607f, 13.63f, 13.2207f, 13.19f, 13.2207f, 12.65f)
                verticalLineTo(7.26f)
                curveTo(13.2207f, 6.72f, 13.6607f, 6.28f, 14.2007f, 6.28f)
                horizontalLineTo(17.1407f)
                curveTo(17.6807f, 6.28f, 18.1207f, 6.72f, 18.1207f, 7.26f)
                verticalLineTo(12.65f)
                curveTo(18.1207f, 13.19f, 17.6807f, 13.63f, 17.1407f, 13.63f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.83f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null

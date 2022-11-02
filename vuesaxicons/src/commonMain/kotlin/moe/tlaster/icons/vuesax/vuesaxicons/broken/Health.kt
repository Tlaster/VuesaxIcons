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

public val BrokenGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9707f, 2.0f)
                curveTo(3.9707f, 2.0f, 1.9707f, 4.0f, 1.9707f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.9707f, 20.0f, 3.9707f, 22.0f, 8.9707f, 22.0f)
                horizontalLineTo(14.9707f)
                curveTo(19.9707f, 22.0f, 21.9707f, 20.0f, 21.9707f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.9707f, 4.0f, 19.9707f, 2.0f, 14.9707f, 2.0f)
                horizontalLineTo(12.9707f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.9707f, 12.7001f)
                lineTo(7.9707f, 12.6801f)
                curveTo(8.7207f, 12.6801f, 9.5607f, 13.2501f, 9.8407f, 13.9501f)
                lineTo(10.9807f, 16.8301f)
                curveTo(11.2407f, 17.4801f, 11.6507f, 17.4801f, 11.9107f, 16.8301f)
                lineTo(14.2007f, 11.0201f)
                curveTo(14.4207f, 10.4601f, 14.8307f, 10.4401f, 15.1107f, 10.9701f)
                lineTo(16.1507f, 12.9401f)
                curveTo(16.4607f, 13.5301f, 17.2607f, 14.0101f, 17.9207f, 14.0101f)
                horizontalLineTo(21.9807f)
            }
        }
        .build()
        return _health!!
    }

private var _health: ImageVector? = null

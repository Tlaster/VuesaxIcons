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

public val LinearGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.97f, 22.0f)
                horizontalLineTo(14.97f)
                curveTo(19.97f, 22.0f, 21.97f, 20.0f, 21.97f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.97f, 4.0f, 19.97f, 2.0f, 14.97f, 2.0f)
                horizontalLineTo(8.97f)
                curveTo(3.97f, 2.0f, 1.97f, 4.0f, 1.97f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(1.97f, 20.0f, 3.97f, 22.0f, 8.97f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.97f, 12.7001f)
                lineTo(7.97f, 12.6801f)
                curveTo(8.72f, 12.6801f, 9.56f, 13.2501f, 9.84f, 13.9501f)
                lineTo(10.98f, 16.8301f)
                curveTo(11.24f, 17.4801f, 11.65f, 17.4801f, 11.91f, 16.8301f)
                lineTo(14.2f, 11.0201f)
                curveTo(14.42f, 10.4601f, 14.83f, 10.4401f, 15.11f, 10.9701f)
                lineTo(16.15f, 12.9401f)
                curveTo(16.46f, 13.5301f, 17.26f, 14.0101f, 17.92f, 14.0101f)
                horizontalLineTo(21.98f)
            }
        }
        .build()
        return _health!!
    }

private var _health: ImageVector? = null

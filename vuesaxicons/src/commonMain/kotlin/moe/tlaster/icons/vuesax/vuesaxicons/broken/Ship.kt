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

public val BrokenGroup.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1097f, 20.4599f)
                curveTo(3.9397f, 19.4899f, 3.1397f, 18.1199f, 2.7797f, 16.5199f)
                lineTo(2.3697f, 14.6599f)
                curveTo(2.1697f, 13.7499f, 2.7097f, 12.7199f, 3.5797f, 12.3699f)
                lineTo(4.9997f, 11.7999f)
                lineTo(10.5098f, 9.5899f)
                curveTo(11.4698f, 9.2099f, 12.5297f, 9.2099f, 13.4897f, 9.5899f)
                lineTo(18.9997f, 11.7999f)
                lineTo(20.4198f, 12.3699f)
                curveTo(21.2898f, 12.7199f, 21.8297f, 13.7499f, 21.6297f, 14.6599f)
                lineTo(21.2197f, 16.5199f)
                curveTo(20.5097f, 19.7199f, 17.9997f, 21.9999f, 14.3797f, 21.9999f)
                horizontalLineTo(9.6197f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                verticalLineTo(11.8f)
                lineTo(13.49f, 9.59f)
                curveTo(12.53f, 9.21f, 11.47f, 9.21f, 10.51f, 9.59f)
                lineTo(5.0f, 11.8f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 6.35f, 6.35f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(17.65f, 5.0f, 19.0f, 6.35f, 19.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 5.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.0f)
                curveTo(9.5f, 2.45f, 9.95f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(14.05f, 2.0f, 14.5f, 2.45f, 14.5f, 3.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null

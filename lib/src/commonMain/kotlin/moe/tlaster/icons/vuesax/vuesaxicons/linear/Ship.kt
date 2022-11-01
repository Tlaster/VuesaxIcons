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

public val LinearGroup.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.42f, 12.3699f)
                curveTo(21.29f, 12.7199f, 21.83f, 13.7499f, 21.63f, 14.6599f)
                lineTo(21.22f, 16.5199f)
                curveTo(20.51f, 19.7199f, 18.0f, 21.9999f, 14.38f, 21.9999f)
                horizontalLineTo(9.62f)
                curveTo(6.0f, 21.9999f, 3.49f, 19.7199f, 2.78f, 16.5199f)
                lineTo(2.37f, 14.6599f)
                curveTo(2.17f, 13.7499f, 2.71f, 12.7199f, 3.58f, 12.3699f)
                lineTo(5.0f, 11.7999f)
                lineTo(10.51f, 9.5899f)
                curveTo(11.47f, 9.2099f, 12.53f, 9.2099f, 13.49f, 9.5899f)
                lineTo(19.0f, 11.7999f)
                lineTo(20.42f, 12.3699f)
                close()
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

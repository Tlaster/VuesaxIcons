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

public val LinearGroup.Smsstar: ImageVector
    get() {
        if (_smsstar != null) {
            return _smsstar!!
        }
        _smsstar = Builder(name = "Smsstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 19.0f, 20.0f, 20.5f, 17.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 19.0f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.0f, 4.0f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                lineTo(10.13f, 11.5f)
                curveTo(11.16f, 12.32f, 12.85f, 12.32f, 13.88f, 11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.48f, 2.8199f)
                lineTo(19.76f, 3.3899f)
                curveTo(19.9f, 3.6699f, 20.25f, 3.9299f, 20.56f, 3.9899f)
                lineTo(20.94f, 4.0499f)
                curveTo(22.08f, 4.2399f, 22.35f, 5.0799f, 21.53f, 5.9099f)
                lineTo(21.18f, 6.2599f)
                curveTo(20.95f, 6.4999f, 20.82f, 6.9599f, 20.89f, 7.2799f)
                lineTo(20.94f, 7.4899f)
                curveTo(21.25f, 8.8699f, 20.52f, 9.3999f, 19.32f, 8.6799f)
                lineTo(19.06f, 8.5299f)
                curveTo(18.75f, 8.3499f, 18.25f, 8.3499f, 17.94f, 8.5299f)
                lineTo(17.68f, 8.6799f)
                curveTo(16.47f, 9.4099f, 15.74f, 8.8699f, 16.06f, 7.4899f)
                lineTo(16.1099f, 7.2799f)
                curveTo(16.1799f, 6.9599f, 16.05f, 6.4999f, 15.82f, 6.2599f)
                lineTo(15.47f, 5.9099f)
                curveTo(14.65f, 5.0799f, 14.92f, 4.2399f, 16.06f, 4.0499f)
                lineTo(16.44f, 3.9899f)
                curveTo(16.74f, 3.9399f, 17.1f, 3.6699f, 17.24f, 3.3899f)
                lineTo(17.52f, 2.8199f)
                curveTo(18.06f, 1.7299f, 18.94f, 1.7299f, 19.48f, 2.8199f)
                close()
            }
        }
        .build()
        return _smsstar!!
    }

private var _smsstar: ImageVector? = null

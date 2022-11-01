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

public val LinearGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 11.4f)
                curveTo(8.0f, 12.17f, 8.6f, 12.8f, 9.33f, 12.8f)
                horizontalLineTo(10.83f)
                curveTo(11.47f, 12.8f, 11.99f, 12.25f, 11.99f, 11.58f)
                curveTo(11.99f, 10.85f, 11.67f, 10.59f, 11.2f, 10.42f)
                lineTo(8.8f, 9.58f)
                curveTo(8.32f, 9.41f, 8.0f, 9.15f, 8.0f, 8.4199f)
                curveTo(8.0f, 7.7499f, 8.52f, 7.2f, 9.16f, 7.2f)
                horizontalLineTo(10.66f)
                curveTo(11.4f, 7.2099f, 12.0f, 7.8299f, 12.0f, 8.5999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.8501f)
                verticalLineTo(13.5901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 6.4099f)
                verticalLineTo(7.1899f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.99f, 17.98f)
                curveTo(14.4028f, 17.98f, 17.98f, 14.4028f, 17.98f, 9.99f)
                curveTo(17.98f, 5.5772f, 14.4028f, 2.0f, 9.99f, 2.0f)
                curveTo(5.5772f, 2.0f, 2.0f, 5.5772f, 2.0f, 9.99f)
                curveTo(2.0f, 14.4028f, 5.5772f, 17.98f, 9.99f, 17.98f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.98f, 19.88f)
                curveTo(13.88f, 21.15f, 15.35f, 21.98f, 17.03f, 21.98f)
                curveTo(19.76f, 21.98f, 21.98f, 19.76f, 21.98f, 17.03f)
                curveTo(21.98f, 15.37f, 21.16f, 13.9f, 19.91f, 13.0f)
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null

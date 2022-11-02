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

public val BrokenGroup.Coin1: ImageVector
    get() {
        if (_coin1 != null) {
            return _coin1!!
        }
        _coin1 = Builder(name = "Coin1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(6.07f, 3.02f)
                curveTo(7.23f, 2.37f, 8.56f, 2.0f, 9.99f, 2.0f)
                curveTo(14.4f, 2.0f, 17.98f, 5.58f, 17.98f, 9.99f)
                curveTo(17.98f, 14.4f, 14.4f, 17.98f, 9.99f, 17.98f)
                curveTo(5.58f, 17.98f, 2.0f, 14.4f, 2.0f, 9.99f)
                curveTo(2.0f, 8.76f, 2.28f, 7.59f, 2.78f, 6.55f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.9805f, 19.88f)
                curveTo(13.8805f, 21.15f, 15.3505f, 21.98f, 17.0305f, 21.98f)
                curveTo(19.7605f, 21.98f, 21.9805f, 19.76f, 21.9805f, 17.03f)
                curveTo(21.9805f, 15.37f, 21.1605f, 13.9f, 19.9105f, 13.0f)
            }
        }
        .build()
        return _coin1!!
    }

private var _coin1: ImageVector? = null

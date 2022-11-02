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

public val BrokenGroup.Candle: ImageVector
    get() {
        if (_candle != null) {
            return _candle!!
        }
        _candle = Builder(name = "Candle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 22.0f)
                verticalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 5.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 22.0f)
                verticalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 9.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 11.02f)
                verticalLineTo(13.0f)
                curveTo(9.5f, 14.1f, 9.0f, 15.0f, 7.5f, 15.0f)
                horizontalLineTo(5.5f)
                curveTo(4.0f, 15.0f, 3.5f, 14.1f, 3.5f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(3.5f, 5.9f, 4.0f, 5.0f, 5.5f, 5.0f)
                horizontalLineTo(7.5f)
                curveTo(9.0f, 5.0f, 9.5f, 5.9f, 9.5f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5f, 11.0f)
                verticalLineTo(17.0f)
                curveTo(20.5f, 18.1f, 20.0f, 19.0f, 18.5f, 19.0f)
                horizontalLineTo(16.5f)
                curveTo(15.0f, 19.0f, 14.5f, 18.1f, 14.5f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(14.5f, 9.9f, 15.0f, 9.0f, 16.5f, 9.0f)
                horizontalLineTo(18.5f)
                curveTo(20.0f, 9.0f, 20.5f, 9.9f, 20.5f, 11.0f)
                close()
            }
        }
        .build()
        return _candle!!
    }

private var _candle: ImageVector? = null

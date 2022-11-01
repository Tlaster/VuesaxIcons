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

public val LinearGroup.`Candle-2`: ImageVector
    get() {
        if (`_candle-2` != null) {
            return `_candle-2`!!
        }
        `_candle-2` = Builder(name = "Candle-2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 17.5f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 17.5f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 6.5f)
                horizontalLineTo(19.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 6.5f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.5f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 14.5f, 15.0f, 15.0f, 15.0f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(15.0f, 20.0f, 14.1f, 20.5f, 13.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 20.5f, 5.0f, 20.0f, 5.0f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 15.0f, 5.9f, 14.5f, 7.0f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 3.5f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 3.5f, 19.0f, 4.0f, 19.0f, 5.5f)
                verticalLineTo(7.5f)
                curveTo(19.0f, 9.0f, 18.1f, 9.5f, 17.0f, 9.5f)
                horizontalLineTo(11.0f)
                curveTo(9.9f, 9.5f, 9.0f, 9.0f, 9.0f, 7.5f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 4.0f, 9.9f, 3.5f, 11.0f, 3.5f)
                close()
            }
        }
        .build()
        return `_candle-2`!!
    }

private var `_candle-2`: ImageVector? = null

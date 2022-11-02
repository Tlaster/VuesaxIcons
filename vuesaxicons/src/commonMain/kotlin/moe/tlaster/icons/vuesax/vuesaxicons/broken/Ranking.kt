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

public val BrokenGroup.Ranking: ImageVector
    get() {
        if (_ranking != null) {
            return _ranking!!
        }
        _ranking = Builder(name = "Ranking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0597f, 21.91f)
                curveTo(15.7497f, 21.87f, 15.3897f, 21.74f, 14.9897f, 21.5f)
                lineTo(12.7497f, 20.17f)
                curveTo(12.3397f, 19.93f, 11.6797f, 19.93f, 11.2697f, 20.17f)
                lineTo(9.0297f, 21.5f)
                curveTo(7.4197f, 22.45f, 6.4497f, 21.74f, 6.8697f, 19.92f)
                lineTo(7.3997f, 17.61f)
                curveTo(7.4997f, 17.18f, 7.3197f, 16.57f, 7.0097f, 16.25f)
                lineTo(5.1497f, 14.39f)
                curveTo(4.0497f, 13.29f, 4.4097f, 12.18f, 5.9397f, 11.93f)
                lineTo(8.3297f, 11.53f)
                curveTo(8.7297f, 11.46f, 9.2098f, 11.11f, 9.3898f, 10.75f)
                lineTo(10.7097f, 8.11f)
                curveTo(11.4297f, 6.68f, 12.5997f, 6.68f, 13.3097f, 8.11f)
                lineTo(14.6297f, 10.75f)
                curveTo(14.8097f, 11.11f, 15.2897f, 11.47f, 15.6897f, 11.53f)
                lineTo(18.0797f, 11.93f)
                curveTo(19.6097f, 12.19f, 19.9697f, 13.29f, 18.8697f, 14.39f)
                lineTo(17.0098f, 16.25f)
                curveTo(16.6998f, 16.56f, 16.5197f, 17.17f, 16.6197f, 17.61f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 9.0f)
                verticalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineTo(2.0f)
            }
        }
        .build()
        return _ranking!!
    }

private var _ranking: ImageVector? = null

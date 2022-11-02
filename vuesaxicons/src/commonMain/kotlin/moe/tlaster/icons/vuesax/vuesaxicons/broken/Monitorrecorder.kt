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

public val BrokenGroup.Monitorrecorder: ImageVector
    get() {
        if (_monitorrecorder != null) {
            return _monitorrecorder!!
        }
        _monitorrecorder = Builder(name = "Monitorrecorder", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 6.44f)
                curveTo(2.0f, 2.89f, 2.89f, 2.0f, 6.44f, 2.0f)
                horizontalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.89f)
                verticalLineTo(12.78f)
                curveTo(22.0f, 16.34f, 21.11f, 17.22f, 17.56f, 17.22f)
                horizontalLineTo(6.44f)
                curveTo(2.89f, 17.22f, 2.0f, 16.33f, 2.0f, 12.78f)
                verticalLineTo(10.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.22f)
                verticalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 13.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 22.0f)
                horizontalLineTo(16.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8598f, 9.37f)
                horizontalLineTo(13.0998f)
                curveTo(11.7198f, 9.37f, 11.2598f, 8.45f, 11.2598f, 7.53f)
                verticalLineTo(4.01f)
                curveTo(11.2598f, 2.91f, 12.1598f, 2.01f, 13.2598f, 2.01f)
                horizontalLineTo(17.8598f)
                curveTo(18.8798f, 2.01f, 19.6998f, 2.83f, 19.6998f, 3.85f)
                verticalLineTo(7.53f)
                curveTo(19.6998f, 8.55f, 18.8798f, 9.37f, 17.8598f, 9.37f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9092f, 7.92f)
                lineTo(19.6992f, 7.07f)
                verticalLineTo(4.31f)
                lineTo(20.9092f, 3.46f)
                curveTo(21.5092f, 3.05f, 21.9992f, 3.3f, 21.9992f, 4.03f)
                verticalLineTo(7.36f)
                curveTo(21.9992f, 8.09f, 21.5092f, 8.34f, 20.9092f, 7.92f)
                close()
            }
        }
        .build()
        return _monitorrecorder!!
    }

private var _monitorrecorder: ImageVector? = null

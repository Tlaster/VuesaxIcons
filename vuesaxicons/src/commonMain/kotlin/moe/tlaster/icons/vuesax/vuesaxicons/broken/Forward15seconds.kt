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

public val BrokenGroup.Forward15seconds: ImageVector
    get() {
        if (_forward15seconds != null) {
            return _forward15seconds!!
        }
        _forward15seconds = Builder(name = "Forward15seconds", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.98f, 4.47f)
                lineTo(12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0094f, 16.96f)
                curveTo(18.5794f, 19.94f, 15.5294f, 22.0f, 11.9994f, 22.0f)
                curveTo(7.0894f, 22.0f, 3.1094f, 18.02f, 3.1094f, 13.11f)
                curveTo(3.1094f, 8.2f, 7.0894f, 4.22f, 11.9994f, 4.22f)
                curveTo(12.6794f, 4.22f, 13.3394f, 4.31f, 13.9794f, 4.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0898f, 7.8f)
                curveTo(20.1998f, 9.2801f, 20.8898f, 11.11f, 20.8898f, 13.11f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.9587f, 10.8301f)
                horizontalLineTo(12.8987f)
                lineTo(12.1387f, 13.1201f)
                horizontalLineTo(14.4286f)
                curveTo(15.2686f, 13.1201f, 15.9587f, 13.8001f, 15.9587f, 14.6501f)
                curveTo(15.9587f, 15.4901f, 15.2786f, 16.1801f, 14.4286f, 16.1801f)
                horizontalLineTo(12.1387f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5391f, 16.17f)
                verticalLineTo(10.8301f)
                lineTo(8.0391f, 12.5001f)
            }
        }
        .build()
        return _forward15seconds!!
    }

private var _forward15seconds: ImageVector? = null

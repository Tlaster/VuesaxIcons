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

public val BrokenGroup.Backward5seconds: ImageVector
    get() {
        if (_backward5seconds != null) {
            return _backward5seconds!!
        }
        _backward5seconds = Builder(name = "Backward5seconds", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9099f, 10.8301f)
                horizontalLineTo(10.8499f)
                lineTo(10.0898f, 13.1201f)
                horizontalLineTo(12.3799f)
                curveTo(13.2199f, 13.1201f, 13.9099f, 13.8001f, 13.9099f, 14.6501f)
                curveTo(13.9099f, 15.4901f, 13.2299f, 16.1801f, 12.3799f, 16.1801f)
                horizontalLineTo(10.0898f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0195f, 4.47f)
                lineTo(11.9995f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.9902f, 16.96f)
                curveTo(5.4202f, 19.94f, 8.4702f, 22.0f, 12.0002f, 22.0f)
                curveTo(16.9102f, 22.0f, 20.8903f, 18.02f, 20.8903f, 13.11f)
                curveTo(20.8903f, 8.2f, 16.9102f, 4.22f, 12.0002f, 4.22f)
                curveTo(11.3202f, 4.22f, 10.6602f, 4.31f, 10.0202f, 4.46f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.9094f, 7.8f)
                curveTo(3.7994f, 9.2801f, 3.1094f, 11.11f, 3.1094f, 13.11f)
            }
        }
        .build()
        return _backward5seconds!!
    }

private var _backward5seconds: ImageVector? = null

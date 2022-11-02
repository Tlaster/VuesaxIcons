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

public val BrokenGroup.Airpod: ImageVector
    get() {
        if (_airpod != null) {
            return _airpod!!
        }
        _airpod = Builder(name = "Airpod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.6191f, 10.97f)
                verticalLineTo(8.25f)
                curveTo(2.6191f, 7.48f, 2.6491f, 6.79f, 2.7291f, 6.18f)
                curveTo(3.0991f, 2.89f, 4.6491f, 2.0f, 8.8791f, 2.0f)
                horizontalLineTo(15.1291f)
                curveTo(19.3491f, 2.0f, 20.9091f, 2.89f, 21.2691f, 6.18f)
                curveTo(21.3591f, 6.79f, 21.3791f, 7.48f, 21.3791f, 8.25f)
                verticalLineTo(15.75f)
                curveTo(21.3791f, 16.52f, 21.3491f, 17.21f, 21.2691f, 17.83f)
                curveTo(20.8991f, 21.11f, 19.3491f, 22.0f, 15.1191f, 22.0f)
                horizontalLineTo(8.8791f)
                curveTo(4.6591f, 22.0f, 3.0991f, 21.11f, 2.7391f, 17.83f)
                curveTo(2.6491f, 17.21f, 2.6191f, 16.52f, 2.6191f, 15.75f)
                verticalLineTo(15.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.2309f, 8.9199f)
                horizontalLineTo(17.1309f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.8695f, 8.9199f)
                horizontalLineTo(2.7695f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.1291f, 8.9201f)
                curveTo(17.1291f, 10.0501f, 16.2091f, 10.9701f, 15.0791f, 10.9701f)
                horizontalLineTo(8.9191f)
                curveTo(8.3591f, 10.9701f, 7.8391f, 10.7401f, 7.4691f, 10.3601f)
                curveTo(7.0991f, 10.0001f, 6.8691f, 9.4901f, 6.8691f, 8.9201f)
                curveTo(6.8691f, 7.7901f, 7.7891f, 6.8701f, 8.9191f, 6.8701f)
                horizontalLineTo(15.0691f)
                curveTo(15.6291f, 6.8701f, 16.1491f, 7.1001f, 16.5191f, 7.4801f)
                curveTo(16.8991f, 7.8501f, 17.1291f, 8.3601f, 17.1291f, 8.9201f)
                close()
            }
        }
        .build()
        return _airpod!!
    }

private var _airpod: ImageVector? = null

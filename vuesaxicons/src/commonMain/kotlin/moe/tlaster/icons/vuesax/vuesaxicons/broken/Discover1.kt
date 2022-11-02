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

public val BrokenGroup.Discover1: ImageVector
    get() {
        if (_discover1 != null) {
            return _discover1!!
        }
        _discover1 = Builder(name = "Discover1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.8691f, 4.59f)
                curveTo(6.4191f, 4.95f, 4.9491f, 6.42f, 4.5891f, 7.87f)
                lineTo(2.0991f, 17.8f)
                curveTo(1.3491f, 20.8f, 3.1891f, 22.65f, 6.1991f, 21.9f)
                lineTo(16.1291f, 19.42f)
                curveTo(17.5691f, 19.06f, 19.0491f, 17.58f, 19.4091f, 16.14f)
                lineTo(21.8991f, 6.2f)
                curveTo(22.6491f, 3.2f, 20.8091f, 1.35f, 17.7991f, 2.1f)
                lineTo(13.0091f, 3.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                curveTo(13.933f, 15.5f, 15.5f, 13.933f, 15.5f, 12.0f)
                curveTo(15.5f, 10.067f, 13.933f, 8.5f, 12.0f, 8.5f)
                curveTo(10.067f, 8.5f, 8.5f, 10.067f, 8.5f, 12.0f)
                curveTo(8.5f, 13.933f, 10.067f, 15.5f, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _discover1!!
    }

private var _discover1: ImageVector? = null

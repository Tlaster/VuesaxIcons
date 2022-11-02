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

public val BrokenGroup.Level: ImageVector
    get() {
        if (_level != null) {
            return _level!!
        }
        _level = Builder(name = "Level", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.1992f, 14.02f)
                curveTo(3.1292f, 18.58f, 7.1592f, 22.0f, 11.9992f, 22.0f)
                curveTo(16.8192f, 22.0f, 20.8392f, 18.59f, 21.7892f, 14.05f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.4909f, 3.0701f)
                curveTo(4.8109f, 4.4301f, 2.8209f, 6.9601f, 2.2109f, 9.9801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.81f, 10.06f)
                curveTo(20.91f, 5.46f, 16.86f, 2.0f, 12.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.5f)
                curveTo(12.8284f, 13.5f, 13.5f, 12.8284f, 13.5f, 12.0f)
                curveTo(13.5f, 11.1716f, 12.8284f, 10.5f, 12.0f, 10.5f)
                curveTo(11.1716f, 10.5f, 10.5f, 11.1716f, 10.5f, 12.0f)
                curveTo(10.5f, 12.8284f, 11.1716f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _level!!
    }

private var _level: ImageVector? = null

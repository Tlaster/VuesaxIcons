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

public val BrokenGroup.Toggleoncircle: ImageVector
    get() {
        if (_toggleoncircle != null) {
            return _toggleoncircle!!
        }
        _toggleoncircle = Builder(name = "Toggleoncircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                curveTo(18.42f, 20.0f, 22.0f, 16.42f, 22.0f, 12.0f)
                curveTo(22.0f, 7.58f, 18.42f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                curveTo(5.58f, 4.0f, 2.0f, 7.58f, 2.0f, 12.0f)
                curveTo(2.0f, 16.08f, 5.05f, 19.44f, 8.99f, 19.94f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                curveTo(11.79f, 8.0f, 10.0f, 9.79f, 10.0f, 12.0f)
                curveTo(10.0f, 14.21f, 11.79f, 16.0f, 14.0f, 16.0f)
                curveTo(16.21f, 16.0f, 18.0f, 14.21f, 18.0f, 12.0f)
                curveTo(18.0f, 11.52f, 17.91f, 11.05f, 17.76f, 10.62f)
            }
        }
        .build()
        return _toggleoncircle!!
    }

private var _toggleoncircle: ImageVector? = null

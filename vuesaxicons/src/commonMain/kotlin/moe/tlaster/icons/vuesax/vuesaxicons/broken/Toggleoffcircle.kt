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

public val BrokenGroup.Toggleoffcircle: ImageVector
    get() {
        if (_toggleoffcircle != null) {
            return _toggleoffcircle!!
        }
        _toggleoffcircle = Builder(name = "Toggleoffcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                curveTo(5.58f, 20.0f, 2.0f, 16.42f, 2.0f, 12.0f)
                curveTo(2.0f, 7.58f, 5.58f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(18.42f, 4.0f, 22.0f, 7.58f, 22.0f, 12.0f)
                curveTo(22.0f, 16.08f, 18.95f, 19.44f, 15.01f, 19.94f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                curveTo(12.21f, 8.0f, 14.0f, 9.79f, 14.0f, 12.0f)
                curveTo(14.0f, 14.21f, 12.21f, 16.0f, 10.0f, 16.0f)
                curveTo(7.79f, 16.0f, 6.0f, 14.21f, 6.0f, 12.0f)
                curveTo(6.0f, 11.52f, 6.09f, 11.05f, 6.24f, 10.62f)
            }
        }
        .build()
        return _toggleoffcircle!!
    }

private var _toggleoffcircle: ImageVector? = null

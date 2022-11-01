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

public val LinearGroup.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = Builder(name = "Previous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.24f, 7.22f)
                verticalLineTo(16.7901f)
                curveTo(20.24f, 18.7501f, 18.11f, 19.98f, 16.41f, 19.0f)
                lineTo(12.26f, 16.61f)
                lineTo(8.11f, 14.21f)
                curveTo(6.41f, 13.23f, 6.41f, 10.78f, 8.11f, 9.8f)
                lineTo(12.26f, 7.4f)
                lineTo(16.41f, 5.0101f)
                curveTo(18.11f, 4.0301f, 20.24f, 5.2501f, 20.24f, 7.22f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.76f, 18.1801f)
                verticalLineTo(5.8201f)
            }
        }
        .build()
        return _previous!!
    }

private var _previous: ImageVector? = null

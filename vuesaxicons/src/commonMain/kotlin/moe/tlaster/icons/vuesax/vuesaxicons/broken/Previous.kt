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

public val BrokenGroup.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = Builder(name = "Previous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.2707f, 7.3901f)
                lineTo(16.4207f, 5.0001f)
                curveTo(18.1207f, 4.0201f, 20.2507f, 5.24f, 20.2507f, 7.21f)
                verticalLineTo(16.78f)
                curveTo(20.2507f, 18.74f, 18.1207f, 19.97f, 16.4207f, 18.99f)
                lineTo(12.2707f, 16.6001f)
                lineTo(8.1207f, 14.2001f)
                curveTo(6.4207f, 13.2201f, 6.4207f, 10.7701f, 8.1207f, 9.7901f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7598f, 18.18f)
                verticalLineTo(17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.7598f, 14.0001f)
                verticalLineTo(5.8201f)
            }
        }
        .build()
        return _previous!!
    }

private var _previous: ImageVector? = null

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

public val BrokenGroup.Repeateone: ImageVector
    get() {
        if (_repeateone != null) {
            return _repeateone!!
        }
        _repeateone = Builder(name = "Repeateone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 5.3201f)
                curveTo(4.93f, 5.3201f, 2.0f, 8.2501f, 2.0f, 11.8401f)
                curveTo(2.0f, 13.6301f, 2.73f, 15.2601f, 3.91f, 16.4401f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9997f, 3.0f)
                lineTo(16.4397f, 5.34f)
                lineTo(12.9297f, 5.33f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0005f, 21.0001f)
                lineTo(7.5606f, 18.66f)
                lineTo(15.5106f, 18.6801f)
                curveTo(19.0806f, 18.6801f, 22.0106f, 15.75f, 22.0106f, 12.16f)
                curveTo(22.0106f, 10.37f, 21.2806f, 8.7401f, 20.1006f, 7.5601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.25f, 14.67f)
                verticalLineTo(9.3301f)
                lineTo(10.75f, 11.0001f)
            }
        }
        .build()
        return _repeateone!!
    }

private var _repeateone: ImageVector? = null

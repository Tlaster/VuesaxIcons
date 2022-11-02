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

public val BrokenGroup.Heartedit: ImageVector
    get() {
        if (_heartedit != null) {
            return _heartedit!!
        }
        _heartedit = Builder(name = "Heartedit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.9f)
                curveTo(11.78f, 20.9f, 11.55f, 20.87f, 11.38f, 20.81f)
                curveTo(8.48f, 19.82f, 2.0f, 15.69f, 2.0f, 8.69f)
                curveTo(2.0f, 7.29f, 2.51f, 6.01f, 3.36f, 5.03f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4905f, 12.0f)
                curveTo(21.8105f, 10.98f, 22.0005f, 9.88f, 22.0005f, 8.69f)
                curveTo(22.0005f, 5.6f, 19.5105f, 3.1f, 16.4405f, 3.1f)
                curveTo(14.6205f, 3.1f, 13.0105f, 3.98f, 12.0005f, 5.34f)
                curveTo(10.9905f, 3.98f, 9.3706f, 3.1f, 7.5606f, 3.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.2091f, 15.74f)
                lineTo(15.6691f, 19.2801f)
                curveTo(15.5291f, 19.4201f, 15.3991f, 19.68f, 15.3691f, 19.87f)
                lineTo(15.1791f, 21.22f)
                curveTo(15.1091f, 21.71f, 15.4491f, 22.05f, 15.9391f, 21.98f)
                lineTo(17.2891f, 21.79f)
                curveTo(17.4791f, 21.76f, 17.7491f, 21.63f, 17.8791f, 21.49f)
                lineTo(21.4191f, 17.95f)
                curveTo(22.0291f, 17.34f, 22.3191f, 16.63f, 21.4191f, 15.73f)
                curveTo(20.5291f, 14.84f, 19.8191f, 15.13f, 19.2091f, 15.74f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.6992f, 16.25f)
                curveTo(18.9992f, 17.33f, 19.8392f, 18.17f, 20.9192f, 18.47f)
            }
        }
        .build()
        return _heartedit!!
    }

private var _heartedit: ImageVector? = null

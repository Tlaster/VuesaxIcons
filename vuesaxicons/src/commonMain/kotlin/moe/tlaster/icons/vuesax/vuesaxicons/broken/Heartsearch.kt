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

public val BrokenGroup.Heartsearch: ImageVector
    get() {
        if (_heartsearch != null) {
            return _heartsearch!!
        }
        _heartsearch = Builder(name = "Heartsearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.9f)
                curveTo(11.78f, 20.9f, 11.55f, 20.87f, 11.38f, 20.81f)
                curveTo(8.48f, 19.82f, 2.0f, 15.69f, 2.0f, 8.68f)
                curveTo(2.0f, 7.28f, 2.51f, 6.0f, 3.36f, 5.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.4905f, 12.0f)
                curveTo(21.8105f, 10.98f, 22.0005f, 9.88f, 22.0005f, 8.69f)
                curveTo(22.0005f, 5.6f, 19.5106f, 3.1f, 16.4406f, 3.1f)
                curveTo(14.6206f, 3.1f, 13.0105f, 3.98f, 12.0005f, 5.34f)
                curveTo(10.9905f, 3.98f, 9.3706f, 3.1f, 7.5606f, 3.1f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7391f, 21.0f)
                curveTo(19.5064f, 21.0f, 20.9391f, 19.5673f, 20.9391f, 17.8f)
                curveTo(20.9391f, 16.0327f, 19.5064f, 14.6f, 17.7391f, 14.6f)
                curveTo(15.9717f, 14.6f, 14.5391f, 16.0327f, 14.5391f, 17.8f)
                curveTo(14.5391f, 19.5673f, 15.9717f, 21.0f, 17.7391f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5391f, 21.6f)
                lineTo(20.5391f, 20.6f)
            }
        }
        .build()
        return _heartsearch!!
    }

private var _heartsearch: ImageVector? = null

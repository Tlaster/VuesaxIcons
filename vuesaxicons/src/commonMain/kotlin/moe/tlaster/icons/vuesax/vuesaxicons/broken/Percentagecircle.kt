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

public val BrokenGroup.Percentagecircle: ImageVector
    get() {
        if (_percentagecircle != null) {
            return _percentagecircle!!
        }
        _percentagecircle = Builder(name = "Percentagecircle", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.3203f, 15.27f)
                lineTo(14.8603f, 8.73f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.73f, 10.3699f)
                curveTo(9.4093f, 10.3699f, 9.96f, 9.8192f, 9.96f, 9.1399f)
                curveTo(9.96f, 8.4606f, 9.4093f, 7.9099f, 8.73f, 7.9099f)
                curveTo(8.0507f, 7.9099f, 7.5f, 8.4606f, 7.5f, 9.1399f)
                curveTo(7.5f, 9.8192f, 8.0507f, 10.3699f, 8.73f, 10.3699f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.269f, 16.0899f)
                curveTo(15.9484f, 16.0899f, 16.4991f, 15.5392f, 16.4991f, 14.8599f)
                curveTo(16.4991f, 14.1806f, 15.9484f, 13.6299f, 15.269f, 13.6299f)
                curveTo(14.5897f, 13.6299f, 14.0391f, 14.1806f, 14.0391f, 14.8599f)
                curveTo(14.0391f, 15.5392f, 14.5897f, 16.0899f, 15.269f, 16.0899f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _percentagecircle!!
    }

private var _percentagecircle: ImageVector? = null

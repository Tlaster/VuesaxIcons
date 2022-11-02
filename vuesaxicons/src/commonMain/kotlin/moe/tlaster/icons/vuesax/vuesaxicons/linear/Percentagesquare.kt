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

public val LinearGroup.Percentagesquare: ImageVector
    get() {
        if (_percentagesquare != null) {
            return _percentagesquare!!
        }
        _percentagesquare = Builder(name = "Percentagesquare", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 2.0f, 22.0f, 4.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5701f, 15.27f)
                lineTo(15.11f, 8.73f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.98f, 10.3699f)
                curveTo(9.6593f, 10.3699f, 10.21f, 9.8192f, 10.21f, 9.1399f)
                curveTo(10.21f, 8.4606f, 9.6593f, 7.9099f, 8.98f, 7.9099f)
                curveTo(8.3007f, 7.9099f, 7.75f, 8.4606f, 7.75f, 9.1399f)
                curveTo(7.75f, 9.8192f, 8.3007f, 10.3699f, 8.98f, 10.3699f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.52f, 16.0899f)
                curveTo(16.1993f, 16.0899f, 16.75f, 15.5392f, 16.75f, 14.8599f)
                curveTo(16.75f, 14.1806f, 16.1993f, 13.6299f, 15.52f, 13.6299f)
                curveTo(14.8407f, 13.6299f, 14.29f, 14.1806f, 14.29f, 14.8599f)
                curveTo(14.29f, 15.5392f, 14.8407f, 16.0899f, 15.52f, 16.0899f)
                close()
            }
        }
        .build()
        return _percentagesquare!!
    }

private var _percentagesquare: ImageVector? = null

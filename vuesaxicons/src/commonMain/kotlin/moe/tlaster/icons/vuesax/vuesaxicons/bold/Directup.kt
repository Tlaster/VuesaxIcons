package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Directup: ImageVector
    get() {
        if (_directup != null) {
            return _directup!!
        }
        _directup = Builder(name = "Directup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0192f, 21.2916f)
                lineTo(13.5392f, 19.5516f)
                curveTo(12.5692f, 19.0716f, 11.4392f, 19.0716f, 10.4692f, 19.5516f)
                lineTo(6.9892f, 21.2916f)
                curveTo(3.9992f, 22.7816f, 0.8492f, 19.5716f, 2.4092f, 16.6216f)
                lineTo(3.2292f, 15.0816f)
                curveTo(3.3392f, 14.8716f, 3.5192f, 14.7016f, 3.7392f, 14.6016f)
                lineTo(16.3792f, 8.9016f)
                curveTo(16.8992f, 8.6716f, 17.5092f, 8.8816f, 17.7692f, 9.3816f)
                lineTo(21.5792f, 16.6216f)
                curveTo(23.1392f, 19.5716f, 19.9992f, 22.7816f, 17.0192f, 21.2916f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6004f, 7.6895f)
                lineTo(7.3204f, 11.4195f)
                curveTo(6.3905f, 11.8395f, 5.4504f, 10.8395f, 5.9304f, 9.9395f)
                lineTo(8.9705f, 4.1695f)
                curveTo(10.2604f, 1.7195f, 13.7604f, 1.7195f, 15.0504f, 4.1695f)
                lineTo(16.1204f, 6.2095f)
                curveTo(16.4004f, 6.7595f, 16.1604f, 7.4395f, 15.6004f, 7.6895f)
                close()
            }
        }
        .build()
        return _directup!!
    }

private var _directup: ImageVector? = null

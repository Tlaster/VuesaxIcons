package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Arrowleft1: ImageVector
    get() {
        if (_arrowleft1 != null) {
            return _arrowleft1!!
        }
        _arrowleft1 = Builder(name = "Arrowleft1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.5f, 12.75f)
                horizontalLineTo(10.31f)
                lineTo(12.03f, 14.47f)
                curveTo(12.32f, 14.76f, 12.32f, 15.24f, 12.03f, 15.53f)
                curveTo(11.88f, 15.68f, 11.69f, 15.75f, 11.5f, 15.75f)
                curveTo(11.31f, 15.75f, 11.12f, 15.68f, 10.97f, 15.53f)
                lineTo(7.97f, 12.53f)
                curveTo(7.68f, 12.24f, 7.68f, 11.76f, 7.97f, 11.47f)
                lineTo(10.97f, 8.47f)
                curveTo(11.26f, 8.18f, 11.74f, 8.18f, 12.03f, 8.47f)
                curveTo(12.32f, 8.76f, 12.32f, 9.24f, 12.03f, 9.53f)
                lineTo(10.31f, 11.25f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 11.25f, 16.25f, 11.59f, 16.25f, 12.0f)
                curveTo(16.25f, 12.41f, 15.91f, 12.75f, 15.5f, 12.75f)
                close()
            }
        }
        .build()
        return _arrowleft1!!
    }

private var _arrowleft1: ImageVector? = null

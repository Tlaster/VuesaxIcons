package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Arrowleft: ImageVector
    get() {
        if (_arrowleft != null) {
            return _arrowleft!!
        }
        _arrowleft = Builder(name = "Arrowleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5695f, 18.8201f)
                curveTo(9.3794f, 18.8201f, 9.1895f, 18.7501f, 9.0394f, 18.6001f)
                lineTo(2.9694f, 12.5301f)
                curveTo(2.6795f, 12.2401f, 2.6795f, 11.7601f, 2.9694f, 11.4701f)
                lineTo(9.0394f, 5.4001f)
                curveTo(9.3294f, 5.1101f, 9.8095f, 5.1101f, 10.0995f, 5.4001f)
                curveTo(10.3895f, 5.6901f, 10.3895f, 6.1701f, 10.0995f, 6.4601f)
                lineTo(4.5595f, 12.0001f)
                lineTo(10.0995f, 17.5401f)
                curveTo(10.3895f, 17.8301f, 10.3895f, 18.3101f, 10.0995f, 18.6001f)
                curveTo(9.9594f, 18.7501f, 9.7594f, 18.8201f, 9.5695f, 18.8201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4999f, 12.75f)
                horizontalLineTo(3.6699f)
                curveTo(3.2599f, 12.75f, 2.9199f, 12.41f, 2.9199f, 12.0f)
                curveTo(2.9199f, 11.59f, 3.2599f, 11.25f, 3.6699f, 11.25f)
                horizontalLineTo(20.4999f)
                curveTo(20.9099f, 11.25f, 21.2499f, 11.59f, 21.2499f, 12.0f)
                curveTo(21.2499f, 12.41f, 20.9099f, 12.75f, 20.4999f, 12.75f)
                close()
            }
        }
        .build()
        return _arrowleft!!
    }

private var _arrowleft: ImageVector? = null

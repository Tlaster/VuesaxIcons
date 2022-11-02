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

public val OutlineGroup.Closecircle: ImageVector
    get() {
        if (_closecircle != null) {
            return _closecircle!!
        }
        _closecircle = Builder(name = "Closecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1694f, 15.5801f)
                curveTo(8.9794f, 15.5801f, 8.7894f, 15.5101f, 8.6394f, 15.3601f)
                curveTo(8.3494f, 15.0701f, 8.3494f, 14.5901f, 8.6394f, 14.3001f)
                lineTo(14.2994f, 8.6401f)
                curveTo(14.5894f, 8.3501f, 15.0694f, 8.3501f, 15.3594f, 8.6401f)
                curveTo(15.6494f, 8.9301f, 15.6494f, 9.4101f, 15.3594f, 9.7001f)
                lineTo(9.6994f, 15.3601f)
                curveTo(9.5594f, 15.5101f, 9.3594f, 15.5801f, 9.1694f, 15.5801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8294f, 15.5801f)
                curveTo(14.6394f, 15.5801f, 14.4494f, 15.5101f, 14.2994f, 15.3601f)
                lineTo(8.6394f, 9.7001f)
                curveTo(8.3494f, 9.4101f, 8.3494f, 8.9301f, 8.6394f, 8.6401f)
                curveTo(8.9294f, 8.3501f, 9.4094f, 8.3501f, 9.6994f, 8.6401f)
                lineTo(15.3594f, 14.3001f)
                curveTo(15.6494f, 14.5901f, 15.6494f, 15.0701f, 15.3594f, 15.3601f)
                curveTo(15.2094f, 15.5101f, 15.0194f, 15.5801f, 14.8294f, 15.5801f)
                close()
            }
        }
        .build()
        return _closecircle!!
    }

private var _closecircle: ImageVector? = null

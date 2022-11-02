package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Closecircle: ImageVector
    get() {
        if (_closecircle != null) {
            return _closecircle!!
        }
        _closecircle = Builder(name = "Closecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0594f, 12.0001f)
                lineTo(15.3594f, 9.7001f)
                curveTo(15.6494f, 9.4101f, 15.6494f, 8.9301f, 15.3594f, 8.6401f)
                curveTo(15.0694f, 8.3501f, 14.5894f, 8.3501f, 14.2994f, 8.6401f)
                lineTo(11.9994f, 10.9401f)
                lineTo(9.6994f, 8.6401f)
                curveTo(9.4094f, 8.3501f, 8.9294f, 8.3501f, 8.6394f, 8.6401f)
                curveTo(8.3494f, 8.9301f, 8.3494f, 9.4101f, 8.6394f, 9.7001f)
                lineTo(10.9394f, 12.0001f)
                lineTo(8.6394f, 14.3001f)
                curveTo(8.3494f, 14.5901f, 8.3494f, 15.0701f, 8.6394f, 15.3601f)
                curveTo(8.7894f, 15.5101f, 8.9794f, 15.5801f, 9.1694f, 15.5801f)
                curveTo(9.3594f, 15.5801f, 9.5494f, 15.5101f, 9.6994f, 15.3601f)
                lineTo(11.9994f, 13.0601f)
                lineTo(14.2994f, 15.3601f)
                curveTo(14.4494f, 15.5101f, 14.6394f, 15.5801f, 14.8294f, 15.5801f)
                curveTo(15.0194f, 15.5801f, 15.2094f, 15.5101f, 15.3594f, 15.3601f)
                curveTo(15.6494f, 15.0701f, 15.6494f, 14.5901f, 15.3594f, 14.3001f)
                lineTo(13.0594f, 12.0001f)
                close()
            }
        }
        .build()
        return _closecircle!!
    }

private var _closecircle: ImageVector? = null

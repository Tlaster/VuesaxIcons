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

public val OutlineGroup.Tickcircle: ImageVector
    get() {
        if (_tickcircle != null) {
            return _tickcircle!!
        }
        _tickcircle = Builder(name = "Tickcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(10.5795f, 15.5801f)
                curveTo(10.3795f, 15.5801f, 10.1895f, 15.5001f, 10.0495f, 15.3601f)
                lineTo(7.2194f, 12.5301f)
                curveTo(6.9295f, 12.2401f, 6.9295f, 11.7601f, 7.2194f, 11.4701f)
                curveTo(7.5094f, 11.1801f, 7.9894f, 11.1801f, 8.2795f, 11.4701f)
                lineTo(10.5795f, 13.7701f)
                lineTo(15.7195f, 8.6301f)
                curveTo(16.0095f, 8.3401f, 16.4895f, 8.3401f, 16.7795f, 8.6301f)
                curveTo(17.0695f, 8.9201f, 17.0695f, 9.4001f, 16.7795f, 9.6901f)
                lineTo(11.1095f, 15.3601f)
                curveTo(10.9695f, 15.5001f, 10.7795f, 15.5801f, 10.5795f, 15.5801f)
                close()
            }
        }
        .build()
        return _tickcircle!!
    }

private var _tickcircle: ImageVector? = null

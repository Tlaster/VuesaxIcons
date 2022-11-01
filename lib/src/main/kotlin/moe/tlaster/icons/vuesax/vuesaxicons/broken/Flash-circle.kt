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

public val BrokenGroup.`Flash-circle`: ImageVector
    get() {
        if (`_flash-circle` != null) {
            return `_flash-circle`!!
        }
        `_flash-circle` = Builder(name = "Flash-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6794f, 11.9101f)
                lineTo(10.3294f, 12.32f)
                lineTo(9.3794f, 16.1601f)
                curveTo(9.1594f, 17.0601f, 9.5994f, 17.36f, 10.3594f, 16.83f)
                lineTo(15.5394f, 13.2401f)
                curveTo(16.1694f, 12.8001f, 16.0794f, 12.2901f, 15.3294f, 12.1001f)
                lineTo(13.6794f, 11.6901f)
                lineTo(14.6294f, 7.8501f)
                curveTo(14.8494f, 6.9501f, 14.4094f, 6.6501f, 13.6494f, 7.1801f)
                lineTo(8.4694f, 10.7701f)
                curveTo(7.8394f, 11.2101f, 7.9294f, 11.7201f, 8.6794f, 11.9101f)
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
        return `_flash-circle`!!
    }

private var `_flash-circle`: ImageVector? = null

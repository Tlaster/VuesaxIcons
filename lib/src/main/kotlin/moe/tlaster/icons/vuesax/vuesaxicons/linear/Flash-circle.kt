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

public val LinearGroup.`Flash-circle`: ImageVector
    get() {
        if (`_flash-circle` != null) {
            return `_flash-circle`!!
        }
        `_flash-circle` = Builder(name = "Flash-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.6801f, 12.72f)
                horizontalLineTo(10.4201f)
                verticalLineTo(16.77f)
                curveTo(10.4201f, 17.37f, 11.1601f, 17.65f, 11.5601f, 17.2f)
                lineTo(15.8201f, 12.36f)
                curveTo(16.1901f, 11.94f, 15.8901f, 11.28f, 15.3301f, 11.28f)
                horizontalLineTo(13.5901f)
                verticalLineTo(7.2299f)
                curveTo(13.5901f, 6.63f, 12.8501f, 6.3499f, 12.4501f, 6.8f)
                lineTo(8.1901f, 11.64f)
                curveTo(7.8201f, 12.06f, 8.1201f, 12.72f, 8.6801f, 12.72f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.97f, 22.0f)
                curveTo(17.4928f, 22.0f, 21.97f, 17.5228f, 21.97f, 12.0f)
                curveTo(21.97f, 6.4771f, 17.4928f, 2.0f, 11.97f, 2.0f)
                curveTo(6.4471f, 2.0f, 1.97f, 6.4771f, 1.97f, 12.0f)
                curveTo(1.97f, 17.5228f, 6.4471f, 22.0f, 11.97f, 22.0f)
                close()
            }
        }
        .build()
        return `_flash-circle`!!
    }

private var `_flash-circle`: ImageVector? = null

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

public val LinearGroup.`Flashcircle-2`: ImageVector
    get() {
        if (`_flashcircle-2` != null) {
            return `_flashcircle-2`!!
        }
        `_flashcircle-2` = Builder(name = "Flashcircle-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.68f, 11.9101f)
                lineTo(10.33f, 12.32f)
                lineTo(9.38f, 16.1601f)
                curveTo(9.16f, 17.0601f, 9.6f, 17.36f, 10.36f, 16.83f)
                lineTo(15.54f, 13.2401f)
                curveTo(16.17f, 12.8001f, 16.08f, 12.2901f, 15.33f, 12.1001f)
                lineTo(13.68f, 11.6901f)
                lineTo(14.63f, 7.8501f)
                curveTo(14.85f, 6.9501f, 14.41f, 6.6501f, 13.65f, 7.1801f)
                lineTo(8.47f, 10.7701f)
                curveTo(7.84f, 11.2101f, 7.93f, 11.7201f, 8.68f, 11.9101f)
                close()
            }
        }
        .build()
        return `_flashcircle-2`!!
    }

private var `_flashcircle-2`: ImageVector? = null

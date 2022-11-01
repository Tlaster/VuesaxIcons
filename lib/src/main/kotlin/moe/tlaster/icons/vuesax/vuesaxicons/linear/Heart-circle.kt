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

public val LinearGroup.`Heart-circle`: ImageVector
    get() {
        if (`_heart-circle` != null) {
            return `_heart-circle`!!
        }
        `_heart-circle` = Builder(name = "Heart-circle", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.33f, 17.45f)
                curveTo(12.15f, 17.51f, 11.84f, 17.51f, 11.66f, 17.45f)
                curveTo(10.1f, 16.92f, 6.6f, 14.69f, 6.6f, 10.91f)
                curveTo(6.6f, 9.24f, 7.94f, 7.89f, 9.6f, 7.89f)
                curveTo(10.58f, 7.89f, 11.45f, 8.36f, 12.0f, 9.1f)
                curveTo(12.54f, 8.37f, 13.42f, 7.89f, 14.4f, 7.89f)
                curveTo(16.06f, 7.89f, 17.4f, 9.24f, 17.4f, 10.91f)
                curveTo(17.4f, 14.69f, 13.9f, 16.92f, 12.33f, 17.45f)
                close()
            }
        }
        .build()
        return `_heart-circle`!!
    }

private var `_heart-circle`: ImageVector? = null

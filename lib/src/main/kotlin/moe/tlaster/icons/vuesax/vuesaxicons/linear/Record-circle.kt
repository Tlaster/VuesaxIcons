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

public val LinearGroup.`Record-circle`: ImageVector
    get() {
        if (`_record-circle` != null) {
            return `_record-circle`!!
        }
        `_record-circle` = Builder(name = "Record-circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.23f)
                curveTo(14.3362f, 16.23f, 16.23f, 14.3362f, 16.23f, 12.0f)
                curveTo(16.23f, 9.6639f, 14.3362f, 7.77f, 12.0f, 7.77f)
                curveTo(9.6639f, 7.77f, 7.77f, 9.6639f, 7.77f, 12.0f)
                curveTo(7.77f, 14.3362f, 9.6639f, 16.23f, 12.0f, 16.23f)
                close()
            }
        }
        .build()
        return `_record-circle`!!
    }

private var `_record-circle`: ImageVector? = null

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

public val BrokenGroup.`Decred-(dcr)`: ImageVector
    get() {
        if (`_decred-(dcr)` != null) {
            return `_decred-(dcr)`!!
        }
        `_decred-(dcr)` = Builder(name = "Decred-(dcr)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.82f, 8.99f)
                curveTo(4.3f, 8.49f, 4.85f, 8.07f, 5.47f, 7.75f)
                lineTo(5.66f, 7.65f)
                lineTo(2.0f, 4.0f)
                horizontalLineTo(7.0f)
                lineTo(13.0f, 10.0f)
                horizontalLineTo(8.5f)
                curveTo(6.57f, 10.0f, 5.0f, 11.57f, 5.0f, 13.5f)
                curveTo(5.0f, 15.43f, 6.57f, 17.0f, 8.5f, 17.0f)
                horizontalLineTo(10.0f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(8.5f)
                curveTo(4.91f, 20.0f, 2.0f, 17.09f, 2.0f, 13.5f)
                curveTo(2.0f, 13.17f, 2.02f, 12.85f, 2.07f, 12.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.35f, 16.35f)
                lineTo(22.0f, 20.0f)
                horizontalLineTo(17.0f)
                lineTo(11.0f, 14.0f)
                horizontalLineTo(15.5f)
                curveTo(17.43f, 14.0f, 19.0f, 12.43f, 19.0f, 10.5f)
                curveTo(19.0f, 8.57f, 17.43f, 7.0f, 15.5f, 7.0f)
                horizontalLineTo(14.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineTo(15.5f)
                curveTo(19.09f, 4.0f, 22.0f, 6.91f, 22.0f, 10.5f)
                curveTo(22.0f, 12.99f, 20.6f, 15.16f, 18.53f, 16.25f)
                lineTo(18.35f, 16.35f)
                close()
            }
        }
        .build()
        return `_decred-(dcr)`!!
    }

private var `_decred-(dcr)`: ImageVector? = null

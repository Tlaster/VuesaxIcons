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

public val LinearGroup.`Decred-(dcr)`: ImageVector
    get() {
        if (`_decred-(dcr)` != null) {
            return `_decred-(dcr)`!!
        }
        `_decred-(dcr)` = Builder(name = "Decred-(dcr)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.7f, 7.7f)
                lineTo(2.0f, 4.0f)
                horizontalLineTo(7.0f)
                lineTo(13.0f, 10.0f)
                horizontalLineTo(8.5f)
                curveTo(6.6f, 10.0f, 5.0f, 11.6f, 5.0f, 13.5f)
                curveTo(5.0f, 15.4f, 6.6f, 17.0f, 8.5f, 17.0f)
                horizontalLineTo(10.0f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(8.5f)
                curveTo(4.9f, 20.0f, 2.0f, 17.1f, 2.0f, 13.5f)
                curveTo(2.0f, 11.0f, 3.4f, 8.8f, 5.5f, 7.7f)
                horizontalLineTo(5.7f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3f, 16.3f)
                lineTo(22.0f, 20.0f)
                horizontalLineTo(17.0f)
                lineTo(11.0f, 14.0f)
                horizontalLineTo(15.5f)
                curveTo(17.4f, 14.0f, 19.0f, 12.4f, 19.0f, 10.5f)
                curveTo(19.0f, 8.6f, 17.4f, 7.0f, 15.5f, 7.0f)
                horizontalLineTo(14.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineTo(15.5f)
                curveTo(19.1f, 4.0f, 22.0f, 6.9f, 22.0f, 10.5f)
                curveTo(22.0f, 13.0f, 20.6f, 15.2f, 18.5f, 16.3f)
                horizontalLineTo(18.3f)
                close()
            }
        }
        .build()
        return `_decred-(dcr)`!!
    }

private var `_decred-(dcr)`: ImageVector? = null

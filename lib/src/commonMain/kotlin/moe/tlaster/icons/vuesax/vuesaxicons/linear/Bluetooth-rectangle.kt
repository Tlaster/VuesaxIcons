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

public val LinearGroup.`Bluetooth-rectangle`: ImageVector
    get() {
        if (`_bluetooth-rectangle` != null) {
            return `_bluetooth-rectangle`!!
        }
        `_bluetooth-rectangle` = Builder(name = "Bluetooth-rectangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.59f, 15.56f)
                lineTo(15.21f, 9.49f)
                curveTo(15.49f, 9.24f, 15.48f, 8.84f, 15.19f, 8.6f)
                lineTo(13.13f, 6.88f)
                curveTo(12.59f, 6.43f, 12.16f, 6.64f, 12.16f, 7.34f)
                verticalLineTo(16.67f)
                curveTo(12.16f, 17.37f, 12.6f, 17.57f, 13.13f, 17.13f)
                lineTo(15.19f, 15.41f)
                curveTo(15.48f, 15.17f, 15.49f, 14.77f, 15.21f, 14.52f)
                lineTo(8.59f, 8.4501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(6.0f, 22.0f, 4.0f, 20.0f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 4.0f, 6.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(18.0f, 2.0f, 20.0f, 4.0f, 20.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 20.0f, 18.0f, 22.0f, 15.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_bluetooth-rectangle`!!
    }

private var `_bluetooth-rectangle`: ImageVector? = null

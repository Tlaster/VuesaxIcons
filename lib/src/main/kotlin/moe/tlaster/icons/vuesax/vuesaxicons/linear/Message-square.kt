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

public val LinearGroup.`Message-square`: ImageVector
    get() {
        if (`_message-square` != null) {
            return `_message-square`!!
        }
        `_message-square` = Builder(name = "Message-square", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.28f, 9.7601f)
                verticalLineTo(12.9001f)
                curveTo(18.28f, 13.1001f, 18.27f, 13.3f, 18.25f, 13.49f)
                curveTo(18.07f, 15.61f, 16.82f, 16.6701f, 14.52f, 16.6701f)
                horizontalLineTo(14.21f)
                curveTo(14.01f, 16.6701f, 13.82f, 16.7601f, 13.71f, 16.9201f)
                lineTo(12.77f, 18.1801f)
                curveTo(12.35f, 18.7401f, 11.68f, 18.7401f, 11.26f, 18.1801f)
                lineTo(10.32f, 16.9201f)
                curveTo(10.22f, 16.7901f, 9.99f, 16.6701f, 9.82f, 16.6701f)
                horizontalLineTo(9.51f)
                curveTo(7.0f, 16.6701f, 5.75f, 16.0501f, 5.75f, 12.9101f)
                verticalLineTo(9.7701f)
                curveTo(5.75f, 7.47f, 6.81f, 6.2201f, 8.93f, 6.0401f)
                curveTo(9.12f, 6.0201f, 9.32f, 6.0101f, 9.52f, 6.0101f)
                horizontalLineTo(14.55f)
                curveTo(17.02f, 6.0001f, 18.28f, 7.2601f, 18.28f, 9.7601f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_message-square`!!
    }

private var `_message-square`: ImageVector? = null

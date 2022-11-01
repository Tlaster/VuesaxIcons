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

public val LinearGroup.`Safe-home`: ImageVector
    get() {
        if (`_safe-home` != null) {
            return `_safe-home`!!
        }
        `_safe-home` = Builder(name = "Safe-home", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 15.37f)
                verticalLineTo(17.5601f)
                curveTo(23.0f, 20.0001f, 21.22f, 22.3f, 18.8f, 22.97f)
                curveTo(18.63f, 23.01f, 18.45f, 23.01f, 18.29f, 22.97f)
                curveTo(17.11f, 22.65f, 16.07f, 21.93f, 15.34f, 21.0f)
                curveTo(14.55f, 20.02f, 14.09f, 18.8101f, 14.09f, 17.5601f)
                verticalLineTo(15.37f)
                curveTo(14.09f, 14.95f, 14.4f, 14.49f, 14.78f, 14.33f)
                lineTo(17.56f, 13.1899f)
                curveTo(18.19f, 12.9399f, 18.89f, 12.9399f, 19.52f, 13.1899f)
                lineTo(20.52f, 13.6f)
                lineTo(22.31f, 14.33f)
                curveTo(22.69f, 14.49f, 23.0f, 14.95f, 23.0f, 15.37f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9501f, 11.0101f)
                lineTo(20.52f, 13.6f)
                lineTo(19.52f, 13.19f)
                curveTo(18.89f, 12.94f, 18.19f, 12.94f, 17.56f, 13.19f)
                lineTo(14.78f, 14.33f)
                curveTo(14.4f, 14.49f, 14.09f, 14.95f, 14.09f, 15.37f)
                verticalLineTo(17.5601f)
                curveTo(14.09f, 18.8101f, 14.55f, 20.02f, 15.34f, 21.0f)
                horizontalLineTo(6.18f)
                curveTo(4.81f, 21.0f, 3.5201f, 19.9101f, 3.2901f, 18.5601f)
                lineTo(2.03f, 11.0101f)
                curveTo(1.87f, 10.0801f, 2.34f, 8.83f, 3.08f, 8.24f)
                lineTo(9.66f, 2.98f)
                curveTo(10.67f, 2.17f, 12.31f, 2.17f, 13.32f, 2.99f)
                lineTo(19.9f, 8.24f)
                curveTo(20.63f, 8.83f, 21.1101f, 10.0801f, 20.9501f, 11.0101f)
                close()
            }
        }
        .build()
        return `_safe-home`!!
    }

private var `_safe-home`: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Component-1`: ImageVector
    get() {
        if (`_component-1` != null) {
            return `_component-1`!!
        }
        `_component-1` = Builder(name = "Component-1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.95f, 14.55f)
                lineTo(14.56f, 20.94f)
                curveTo(13.16f, 22.34f, 10.86f, 22.34f, 9.45f, 20.94f)
                lineTo(3.06f, 14.55f)
                curveTo(1.66f, 13.15f, 1.66f, 10.85f, 3.06f, 9.44f)
                lineTo(9.45f, 3.05f)
                curveTo(10.85f, 1.65f, 13.15f, 1.65f, 14.56f, 3.05f)
                lineTo(20.95f, 9.44f)
                curveTo(22.35f, 10.85f, 22.35f, 13.15f, 20.95f, 14.55f)
                close()
            }
        }
        .build()
        return `_component-1`!!
    }

private var `_component-1`: ImageVector? = null

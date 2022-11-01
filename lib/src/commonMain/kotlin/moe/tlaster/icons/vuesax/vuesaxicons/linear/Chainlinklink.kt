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

public val LinearGroup.Chainlinklink: ImageVector
    get() {
        if (_chainlinklink != null) {
            return _chainlinklink!!
        }
        _chainlinklink = Builder(name = "Chainlinklink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.2f)
                verticalLineTo(15.8f)
                curveTo(3.0f, 16.5f, 3.4f, 17.2f, 4.0f, 17.5f)
                lineTo(11.0f, 21.4f)
                curveTo(11.6f, 21.7f, 12.3f, 21.7f, 12.9f, 21.4f)
                lineTo(19.9f, 17.5f)
                curveTo(20.5f, 17.1f, 20.9f, 16.5f, 20.9f, 15.8f)
                verticalLineTo(8.2f)
                curveTo(20.9f, 7.5f, 20.5f, 6.8f, 19.9f, 6.5f)
                lineTo(12.9f, 2.6f)
                curveTo(12.3f, 2.3f, 11.6f, 2.3f, 11.0f, 2.6f)
                lineTo(4.0f, 6.4f)
                curveTo(3.4f, 6.8f, 3.0f, 7.5f, 3.0f, 8.2f)
                close()
            }
        }
        .build()
        return _chainlinklink!!
    }

private var _chainlinklink: ImageVector? = null

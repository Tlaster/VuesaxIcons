package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Chainlinklink: ImageVector
    get() {
        if (_chainlinklink != null) {
            return _chainlinklink!!
        }
        _chainlinklink = Builder(name = "Chainlinklink", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.1814f)
                verticalLineTo(15.8314f)
                curveTo(3.0f, 16.4814f, 3.46f, 17.2614f, 4.03f, 17.5814f)
                lineTo(11.03f, 21.4714f)
                curveTo(11.56f, 21.7714f, 12.44f, 21.7714f, 12.97f, 21.4714f)
                lineTo(19.97f, 17.5814f)
                curveTo(20.54f, 17.2714f, 21.0f, 16.4814f, 21.0f, 15.8314f)
                verticalLineTo(8.1814f)
                curveTo(21.0f, 7.5314f, 20.54f, 6.7514f, 19.97f, 6.4314f)
                lineTo(12.97f, 2.5414f)
                curveTo(12.44f, 2.2414f, 11.56f, 2.2414f, 11.03f, 2.5414f)
                lineTo(4.03f, 6.4314f)
                curveTo(3.46f, 6.7414f, 3.0f, 7.5314f, 3.0f, 8.1814f)
                close()
            }
        }
        .build()
        return _chainlinklink!!
    }

private var _chainlinklink: ImageVector? = null

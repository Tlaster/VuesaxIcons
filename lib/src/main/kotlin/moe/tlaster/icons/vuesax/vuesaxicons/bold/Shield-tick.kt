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

public val BoldGroup.`Shield-tick`: ImageVector
    get() {
        if (`_shield-tick` != null) {
            return `_shield-tick`!!
        }
        `_shield-tick` = Builder(name = "Shield-tick", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5408f, 4.1198f)
                lineTo(13.0408f, 2.0598f)
                curveTo(12.4708f, 1.8498f, 11.5408f, 1.8498f, 10.9708f, 2.0598f)
                lineTo(5.4708f, 4.1198f)
                curveTo(4.4108f, 4.5198f, 3.5508f, 5.7598f, 3.5508f, 6.8898f)
                verticalLineTo(14.9898f)
                curveTo(3.5508f, 15.7998f, 4.0808f, 16.8698f, 4.7308f, 17.3498f)
                lineTo(10.2308f, 21.4598f)
                curveTo(11.2008f, 22.1898f, 12.7908f, 22.1898f, 13.7608f, 21.4598f)
                lineTo(19.2608f, 17.3498f)
                curveTo(19.9108f, 16.8598f, 20.4408f, 15.7998f, 20.4408f, 14.9898f)
                verticalLineTo(6.8898f)
                curveTo(20.4508f, 5.7598f, 19.5908f, 4.5198f, 18.5408f, 4.1198f)
                close()
                moveTo(15.4808f, 9.7198f)
                lineTo(11.1808f, 14.0198f)
                curveTo(11.0308f, 14.1698f, 10.8408f, 14.2398f, 10.6508f, 14.2398f)
                curveTo(10.4608f, 14.2398f, 10.2708f, 14.1698f, 10.1208f, 14.0198f)
                lineTo(8.5208f, 12.3998f)
                curveTo(8.2308f, 12.1098f, 8.2308f, 11.6298f, 8.5208f, 11.3398f)
                curveTo(8.8108f, 11.0498f, 9.2908f, 11.0498f, 9.5808f, 11.3398f)
                lineTo(10.6608f, 12.4198f)
                lineTo(14.4308f, 8.6498f)
                curveTo(14.7208f, 8.3598f, 15.2008f, 8.3598f, 15.4908f, 8.6498f)
                curveTo(15.7808f, 8.9398f, 15.7808f, 9.4298f, 15.4808f, 9.7198f)
                close()
            }
        }
        .build()
        return `_shield-tick`!!
    }

private var `_shield-tick`: ImageVector? = null

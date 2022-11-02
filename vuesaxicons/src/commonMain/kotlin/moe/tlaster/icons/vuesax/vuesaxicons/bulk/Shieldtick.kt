package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Shieldtick: ImageVector
    get() {
        if (_shieldtick != null) {
            return _shieldtick!!
        }
        _shieldtick = Builder(name = "Shieldtick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9608f, 2.0601f)
                lineTo(5.4608f, 4.1201f)
                curveTo(4.4108f, 4.5201f, 3.5508f, 5.7601f, 3.5508f, 6.8901f)
                verticalLineTo(14.9901f)
                curveTo(3.5508f, 15.8001f, 4.0808f, 16.8701f, 4.7308f, 17.3501f)
                lineTo(10.2308f, 21.4601f)
                curveTo(11.2008f, 22.1901f, 12.7908f, 22.1901f, 13.7608f, 21.4601f)
                lineTo(19.2608f, 17.3501f)
                curveTo(19.9108f, 16.8601f, 20.4408f, 15.8001f, 20.4408f, 14.9901f)
                verticalLineTo(6.8901f)
                curveTo(20.4408f, 5.7701f, 19.5808f, 4.5201f, 18.5308f, 4.1301f)
                lineTo(13.0308f, 2.0701f)
                curveTo(12.4708f, 1.8501f, 11.5308f, 1.8501f, 10.9608f, 2.0601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6602f, 14.2301f)
                curveTo(10.4702f, 14.2301f, 10.2802f, 14.1601f, 10.1302f, 14.0101f)
                lineTo(8.5202f, 12.4001f)
                curveTo(8.2302f, 12.1101f, 8.2302f, 11.6301f, 8.5202f, 11.3401f)
                curveTo(8.8102f, 11.0501f, 9.2902f, 11.0501f, 9.5802f, 11.3401f)
                lineTo(10.6602f, 12.4201f)
                lineTo(14.4302f, 8.6501f)
                curveTo(14.7202f, 8.3601f, 15.2002f, 8.3601f, 15.4902f, 8.6501f)
                curveTo(15.7802f, 8.9401f, 15.7802f, 9.4201f, 15.4902f, 9.7101f)
                lineTo(11.1902f, 14.0101f)
                curveTo(11.0402f, 14.1601f, 10.8502f, 14.2301f, 10.6602f, 14.2301f)
                close()
            }
        }
        .build()
        return _shieldtick!!
    }

private var _shieldtick: ImageVector? = null

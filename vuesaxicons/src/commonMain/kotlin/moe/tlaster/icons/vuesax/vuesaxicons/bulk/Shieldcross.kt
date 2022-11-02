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

public val BulkGroup.Shieldcross: ImageVector
    get() {
        if (_shieldcross != null) {
            return _shieldcross!!
        }
        _shieldcross = Builder(name = "Shieldcross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.6808f, 12.9099f)
                lineTo(13.0908f, 11.3199f)
                lineTo(14.6408f, 9.7699f)
                curveTo(14.9308f, 9.4799f, 14.9308f, 8.9999f, 14.6408f, 8.7099f)
                curveTo(14.3508f, 8.4199f, 13.8708f, 8.4199f, 13.5808f, 8.7099f)
                lineTo(12.0308f, 10.2599f)
                lineTo(10.4408f, 8.6699f)
                curveTo(10.1508f, 8.3799f, 9.6708f, 8.3799f, 9.3808f, 8.6699f)
                curveTo(9.0908f, 8.9599f, 9.0908f, 9.4399f, 9.3808f, 9.7299f)
                lineTo(10.9708f, 11.3199f)
                lineTo(9.3308f, 12.9599f)
                curveTo(9.0408f, 13.2499f, 9.0408f, 13.7299f, 9.3308f, 14.0199f)
                curveTo(9.4808f, 14.1699f, 9.6708f, 14.2399f, 9.8608f, 14.2399f)
                curveTo(10.0508f, 14.2399f, 10.2408f, 14.1699f, 10.3908f, 14.0199f)
                lineTo(12.0308f, 12.3799f)
                lineTo(13.6208f, 13.9699f)
                curveTo(13.7708f, 14.1199f, 13.9608f, 14.1899f, 14.1508f, 14.1899f)
                curveTo(14.3408f, 14.1899f, 14.5308f, 14.1199f, 14.6808f, 13.9699f)
                curveTo(14.9708f, 13.6699f, 14.9708f, 13.1999f, 14.6808f, 12.9099f)
                close()
            }
        }
        .build()
        return _shieldcross!!
    }

private var _shieldcross: ImageVector? = null

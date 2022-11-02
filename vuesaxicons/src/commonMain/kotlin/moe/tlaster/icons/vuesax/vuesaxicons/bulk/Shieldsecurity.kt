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

public val BulkGroup.Shieldsecurity: ImageVector
    get() {
        if (_shieldsecurity != null) {
            return _shieldsecurity!!
        }
        _shieldsecurity = Builder(name = "Shieldsecurity", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.9608f, 2.1099f)
                lineTo(5.4608f, 4.1699f)
                curveTo(4.4108f, 4.5699f, 3.5508f, 5.8099f, 3.5508f, 6.9399f)
                verticalLineTo(15.0399f)
                curveTo(3.5508f, 15.8499f, 4.0808f, 16.9199f, 4.7308f, 17.3999f)
                lineTo(10.2308f, 21.5099f)
                curveTo(11.2008f, 22.2399f, 12.7908f, 22.2399f, 13.7608f, 21.5099f)
                lineTo(19.2608f, 17.3999f)
                curveTo(19.9108f, 16.9099f, 20.4408f, 15.8499f, 20.4408f, 15.0399f)
                verticalLineTo(6.9399f)
                curveTo(20.4408f, 5.8199f, 19.5808f, 4.5699f, 18.5308f, 4.1799f)
                lineTo(13.0308f, 2.1199f)
                curveTo(12.4708f, 1.8999f, 11.5308f, 1.8999f, 10.9608f, 2.1099f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 10.5f)
                curveTo(14.5f, 9.12f, 13.38f, 8.0f, 12.0f, 8.0f)
                curveTo(10.62f, 8.0f, 9.5f, 9.12f, 9.5f, 10.5f)
                curveTo(9.5f, 11.62f, 10.24f, 12.55f, 11.25f, 12.87f)
                verticalLineTo(15.5f)
                curveTo(11.25f, 15.91f, 11.59f, 16.25f, 12.0f, 16.25f)
                curveTo(12.41f, 16.25f, 12.75f, 15.91f, 12.75f, 15.5f)
                verticalLineTo(12.87f)
                curveTo(13.76f, 12.55f, 14.5f, 11.62f, 14.5f, 10.5f)
                close()
            }
        }
        .build()
        return _shieldsecurity!!
    }

private var _shieldsecurity: ImageVector? = null

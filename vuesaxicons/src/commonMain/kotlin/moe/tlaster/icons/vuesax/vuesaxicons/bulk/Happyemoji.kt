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

public val BulkGroup.Happyemoji: ImageVector
    get() {
        if (_happyemoji != null) {
            return _happyemoji!!
        }
        _happyemoji = Builder(name = "Happyemoji", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 22.0f)
                curveTo(17.4936f, 22.0f, 21.9707f, 17.5228f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.4771f, 17.4936f, 2.0f, 11.9707f, 2.0f)
                curveTo(6.4479f, 2.0f, 1.9707f, 6.4771f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.5228f, 6.4479f, 22.0f, 11.9707f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9999f, 19.2499f)
                curveTo(9.8499f, 19.2499f, 7.8299f, 18.1999f, 6.5999f, 16.4299f)
                curveTo(6.3599f, 16.0899f, 6.4499f, 15.6199f, 6.7899f, 15.3899f)
                curveTo(7.1299f, 15.1499f, 7.5999f, 15.2399f, 7.8299f, 15.5799f)
                curveTo(8.7799f, 16.9399f, 10.3399f, 17.7599f, 11.9999f, 17.7599f)
                curveTo(13.6599f, 17.7599f, 15.2199f, 16.9499f, 16.1699f, 15.5799f)
                curveTo(16.4099f, 15.2399f, 16.8699f, 15.1599f, 17.2099f, 15.3899f)
                curveTo(17.5499f, 15.6299f, 17.6299f, 16.0899f, 17.3999f, 16.4299f)
                curveTo(16.1699f, 18.1999f, 14.1499f, 19.2499f, 11.9999f, 19.2499f)
                close()
            }
        }
        .build()
        return _happyemoji!!
    }

private var _happyemoji: ImageVector? = null

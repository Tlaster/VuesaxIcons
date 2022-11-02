package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4499f, 13.6406f)
                verticalLineTo(14.6406f)
                curveTo(21.4499f, 14.9106f, 21.2399f, 15.1306f, 20.9599f, 15.1406f)
                horizontalLineTo(19.4999f)
                curveTo(18.9699f, 15.1406f, 18.4899f, 14.7506f, 18.4499f, 14.2306f)
                curveTo(18.4199f, 13.9206f, 18.5399f, 13.6306f, 18.7399f, 13.4306f)
                curveTo(18.9199f, 13.2406f, 19.1699f, 13.1406f, 19.4399f, 13.1406f)
                horizontalLineTo(20.9499f)
                curveTo(21.2399f, 13.1506f, 21.4499f, 13.3706f, 21.4499f, 13.6406f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9892f, 12.6906f)
                curveTo(17.4892f, 13.1806f, 17.2492f, 13.9106f, 17.4492f, 14.6706f)
                curveTo(17.7092f, 15.6006f, 18.6192f, 16.1906f, 19.5792f, 16.1906f)
                horizontalLineTo(20.4492f)
                curveTo(20.9992f, 16.1906f, 21.4492f, 16.6406f, 21.4492f, 17.1906f)
                verticalLineTo(17.3806f)
                curveTo(21.4492f, 19.4506f, 19.7592f, 21.1406f, 17.6892f, 21.1406f)
                horizontalLineTo(6.2092f)
                curveTo(4.1392f, 21.1406f, 2.4492f, 19.4506f, 2.4492f, 17.3806f)
                verticalLineTo(10.6506f)
                curveTo(2.4492f, 9.4206f, 3.0392f, 8.3306f, 3.9492f, 7.6506f)
                curveTo(4.5792f, 7.1706f, 5.3592f, 6.8906f, 6.2092f, 6.8906f)
                horizontalLineTo(17.6892f)
                curveTo(19.7592f, 6.8906f, 21.4492f, 8.5806f, 21.4492f, 10.6506f)
                verticalLineTo(11.0906f)
                curveTo(21.4492f, 11.6406f, 20.9992f, 12.0906f, 20.4492f, 12.0906f)
                horizontalLineTo(19.4292f)
                curveTo(18.8692f, 12.0906f, 18.3592f, 12.3106f, 17.9892f, 12.6906f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1991f, 4.82f)
                curveTo(16.4691f, 5.09f, 16.2391f, 5.51f, 15.8591f, 5.51f)
                lineTo(8.1791f, 5.5f)
                curveTo(7.7391f, 5.5f, 7.5091f, 4.96f, 7.8291f, 4.65f)
                lineTo(9.4491f, 3.02f)
                curveTo(10.8191f, 1.66f, 13.0391f, 1.66f, 14.4091f, 3.02f)
                lineTo(16.1591f, 4.79f)
                curveTo(16.1691f, 4.8f, 16.1891f, 4.81f, 16.1991f, 4.82f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null

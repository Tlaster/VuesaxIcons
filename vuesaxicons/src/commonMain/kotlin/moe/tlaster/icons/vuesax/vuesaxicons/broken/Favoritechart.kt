package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Favoritechart: ImageVector
    get() {
        if (_favoritechart != null) {
            return _favoritechart!!
        }
        _favoritechart = Builder(name = "Favoritechart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.3301f, 14.49f)
                lineTo(9.7101f, 11.4f)
                curveTo(10.0501f, 10.96f, 10.6801f, 10.88f, 11.1201f, 11.22f)
                lineTo(12.9501f, 12.66f)
                curveTo(13.3901f, 13.0f, 14.0201f, 12.92f, 14.3601f, 12.49f)
                lineTo(16.6701f, 9.51f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5492f, 16.9799f)
                curveTo(20.2492f, 16.9299f, 19.8892f, 16.6599f, 19.7492f, 16.3799f)
                lineTo(19.4692f, 15.8099f)
                curveTo(18.9292f, 14.7199f, 18.0492f, 14.7199f, 17.5192f, 15.8099f)
                lineTo(17.2392f, 16.3799f)
                curveTo(17.0992f, 16.6599f, 16.7492f, 16.9199f, 16.4392f, 16.9799f)
                lineTo(16.0592f, 17.0399f)
                curveTo(14.9192f, 17.2299f, 14.6492f, 18.0699f, 15.4692f, 18.8999f)
                lineTo(15.8192f, 19.2499f)
                curveTo(16.0492f, 19.4899f, 16.1792f, 19.9499f, 16.1092f, 20.2699f)
                lineTo(16.0592f, 20.4799f)
                curveTo(15.7492f, 21.8599f, 16.4792f, 22.3899f, 17.6792f, 21.6699f)
                lineTo(17.9392f, 21.5199f)
                curveTo(18.2492f, 21.3399f, 18.7492f, 21.3399f, 19.0592f, 21.5199f)
                lineTo(19.3192f, 21.6699f)
                curveTo(20.5292f, 22.3999f, 21.2592f, 21.8599f, 20.9392f, 20.4799f)
                lineTo(20.8892f, 20.2699f)
            }
        }
        .build()
        return _favoritechart!!
    }

private var _favoritechart: ImageVector? = null

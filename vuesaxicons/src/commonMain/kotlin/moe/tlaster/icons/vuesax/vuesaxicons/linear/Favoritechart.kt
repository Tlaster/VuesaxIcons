package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Favoritechart: ImageVector
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
                moveTo(19.48f, 15.8199f)
                lineTo(19.76f, 16.3899f)
                curveTo(19.9f, 16.6699f, 20.25f, 16.9299f, 20.56f, 16.9899f)
                lineTo(20.94f, 17.0499f)
                curveTo(22.08f, 17.2399f, 22.35f, 18.0799f, 21.53f, 18.9099f)
                lineTo(21.18f, 19.2599f)
                curveTo(20.95f, 19.4999f, 20.82f, 19.9599f, 20.89f, 20.2799f)
                lineTo(20.94f, 20.4899f)
                curveTo(21.25f, 21.8699f, 20.52f, 22.3999f, 19.32f, 21.6799f)
                lineTo(19.06f, 21.5299f)
                curveTo(18.75f, 21.3499f, 18.25f, 21.3499f, 17.94f, 21.5299f)
                lineTo(17.68f, 21.6799f)
                curveTo(16.47f, 22.4099f, 15.74f, 21.8699f, 16.06f, 20.4899f)
                lineTo(16.1099f, 20.2799f)
                curveTo(16.1799f, 19.9599f, 16.05f, 19.4999f, 15.82f, 19.2599f)
                lineTo(15.47f, 18.9099f)
                curveTo(14.65f, 18.0799f, 14.92f, 17.2399f, 16.06f, 17.0499f)
                lineTo(16.44f, 16.9899f)
                curveTo(16.74f, 16.9399f, 17.1f, 16.6699f, 17.24f, 16.3899f)
                lineTo(17.52f, 15.8199f)
                curveTo(18.06f, 14.7299f, 18.94f, 14.7299f, 19.48f, 15.8199f)
                close()
            }
        }
        .build()
        return _favoritechart!!
    }

private var _favoritechart: ImageVector? = null

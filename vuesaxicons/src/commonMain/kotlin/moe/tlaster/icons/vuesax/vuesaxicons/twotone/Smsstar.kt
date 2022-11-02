package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Smsstar: ImageVector
    get() {
        if (_smsstar != null) {
            return _smsstar!!
        }
        _smsstar = Builder(name = "Smsstar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.5f)
                verticalLineTo(15.5f)
                curveTo(22.0f, 19.0f, 20.0f, 20.5f, 17.0f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 20.5f, 2.0f, 19.0f, 2.0f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(2.0f, 5.0f, 4.0f, 3.5f, 7.0f, 3.5f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 9.0f)
                lineTo(10.13f, 11.5f)
                curveTo(11.16f, 12.32f, 12.85f, 12.32f, 13.88f, 11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4792f, 2.8199f)
                lineTo(19.7592f, 3.3899f)
                curveTo(19.8992f, 3.6699f, 20.2492f, 3.9299f, 20.5592f, 3.9899f)
                lineTo(20.9392f, 4.0499f)
                curveTo(22.0792f, 4.2399f, 22.3492f, 5.0799f, 21.5292f, 5.9099f)
                lineTo(21.1792f, 6.2599f)
                curveTo(20.9492f, 6.4999f, 20.8192f, 6.9599f, 20.8892f, 7.2799f)
                lineTo(20.9392f, 7.4899f)
                curveTo(21.2492f, 8.8699f, 20.5192f, 9.3999f, 19.3192f, 8.6799f)
                lineTo(19.0592f, 8.5299f)
                curveTo(18.7492f, 8.3499f, 18.2492f, 8.3499f, 17.9392f, 8.5299f)
                lineTo(17.6792f, 8.6799f)
                curveTo(16.4692f, 9.4099f, 15.7392f, 8.8699f, 16.0592f, 7.4899f)
                lineTo(16.1092f, 7.2799f)
                curveTo(16.1792f, 6.9599f, 16.0492f, 6.4999f, 15.8192f, 6.2599f)
                lineTo(15.4692f, 5.9099f)
                curveTo(14.6492f, 5.0799f, 14.9192f, 4.2399f, 16.0592f, 4.0499f)
                lineTo(16.4392f, 3.9899f)
                curveTo(16.7392f, 3.9399f, 17.0992f, 3.6699f, 17.2392f, 3.3899f)
                lineTo(17.5192f, 2.8199f)
                curveTo(18.0592f, 1.7299f, 18.9392f, 1.7299f, 19.4792f, 2.8199f)
                close()
            }
        }
        .build()
        return _smsstar!!
    }

private var _smsstar: ImageVector? = null

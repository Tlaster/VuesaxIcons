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

public val TwotoneGroup.Story: ImageVector
    get() {
        if (_story != null) {
            return _story!!
        }
        _story = Builder(name = "Story", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.42f, 7.9501f)
                curveTo(18.86f, 10.3901f, 18.86f, 14.3501f, 16.42f, 16.7901f)
                curveTo(13.98f, 19.2301f, 10.02f, 19.2301f, 7.58f, 16.7901f)
                curveTo(5.14f, 14.3501f, 5.14f, 10.3901f, 7.58f, 7.9501f)
                curveTo(10.02f, 5.5101f, 13.98f, 5.5101f, 16.42f, 7.9501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.251f, 21.6399f)
                curveTo(6.251f, 20.8399f, 4.501f, 19.3899f, 3.341f, 17.3799f)
                curveTo(2.201f, 15.4099f, 1.821f, 13.2199f, 2.091f, 11.1299f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8496f, 4.4799f)
                curveTo(7.5496f, 3.1499f, 9.6796f, 2.3599f, 11.9996f, 2.3599f)
                curveTo(14.2696f, 2.3599f, 16.3596f, 3.1298f, 18.0396f, 4.4099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 21.6399f)
                curveTo(17.75f, 20.8399f, 19.5f, 19.3899f, 20.66f, 17.3799f)
                curveTo(21.8f, 15.4099f, 22.18f, 13.2199f, 21.91f, 11.1299f)
            }
        }
        .build()
        return _story!!
    }

private var _story: ImageVector? = null

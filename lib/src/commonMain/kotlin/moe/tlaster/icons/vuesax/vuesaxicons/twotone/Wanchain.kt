package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Wanchain: ImageVector
    get() {
        if (_wanchain != null) {
            return _wanchain!!
        }
        _wanchain = Builder(name = "Wanchain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.7502f, 9.43f)
                lineTo(8.5002f, 15.0f)
                lineTo(7.8702f, 16.09f)
                lineTo(5.4002f, 20.31f)
                curveTo(5.2202f, 20.63f, 4.7602f, 20.64f, 4.5602f, 20.33f)
                lineTo(1.1802f, 15.28f)
                curveTo(1.0702f, 15.11f, 1.0702f, 14.89f, 1.1802f, 14.72f)
                lineTo(4.8502f, 9.22f)
                curveTo(4.9402f, 9.08f, 5.1002f, 9.0f, 5.2702f, 9.0f)
                horizontalLineTo(11.5002f)
                lineTo(11.7502f, 9.43f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.4995f, 15.0f)
                horizontalLineTo(14.1295f)
                curveTo(14.5195f, 15.0f, 14.7595f, 14.58f, 14.5595f, 14.25f)
                lineTo(11.7495f, 9.43f)
                lineTo(11.4995f, 9.0f)
                lineTo(8.4395f, 3.75f)
                curveTo(8.2395f, 3.42f, 8.4795f, 3.0f, 8.8695f, 3.0f)
                horizontalLineTo(15.7095f)
                curveTo(15.8895f, 3.0f, 16.0596f, 3.09f, 16.1396f, 3.25f)
                lineTo(22.8395f, 14.73f)
                curveTo(22.9395f, 14.9f, 22.9295f, 15.1f, 22.8295f, 15.26f)
                lineTo(19.1495f, 20.78f)
                curveTo(19.0595f, 20.92f, 18.8996f, 21.0f, 18.7296f, 21.0f)
                horizontalLineTo(12.2695f)
                curveTo(12.0995f, 21.0f, 11.9395f, 20.92f, 11.8495f, 20.78f)
                lineTo(8.7095f, 16.07f)
                lineTo(8.2695f, 15.4f)
                lineTo(8.4995f, 15.0f)
                close()
            }
        }
        .build()
        return _wanchain!!
    }

private var _wanchain: ImageVector? = null

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

public val TwotoneGroup.Bluetoothrectangle: ImageVector
    get() {
        if (_bluetoothrectangle != null) {
            return _bluetoothrectangle!!
        }
        _bluetoothrectangle = Builder(name = "Bluetoothrectangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5898f, 15.5599f)
                lineTo(15.2098f, 9.4899f)
                curveTo(15.4898f, 9.2399f, 15.4798f, 8.8399f, 15.1898f, 8.5999f)
                lineTo(13.1299f, 6.8799f)
                curveTo(12.5899f, 6.4299f, 12.1599f, 6.6399f, 12.1599f, 7.3399f)
                verticalLineTo(16.6699f)
                curveTo(12.1599f, 17.3699f, 12.5999f, 17.5699f, 13.1299f, 17.1299f)
                lineTo(15.1898f, 15.4099f)
                curveTo(15.4798f, 15.1699f, 15.4898f, 14.7699f, 15.2098f, 14.5199f)
                lineTo(8.5898f, 8.4499f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(6.0f, 22.0f, 4.0f, 20.0f, 4.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 4.0f, 6.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(18.0f, 2.0f, 20.0f, 4.0f, 20.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 20.0f, 18.0f, 22.0f, 15.0f, 22.0f)
                close()
            }
        }
        .build()
        return _bluetoothrectangle!!
    }

private var _bluetoothrectangle: ImageVector? = null

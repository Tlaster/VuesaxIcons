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

public val TwotoneGroup.Receiptsquare: ImageVector
    get() {
        if (_receiptsquare != null) {
            return _receiptsquare!!
        }
        _receiptsquare = Builder(name = "Receiptsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9002f, 16.5299f)
                curveTo(9.3802f, 16.0099f, 10.1203f, 16.0499f, 10.5403f, 16.6199f)
                lineTo(11.1403f, 17.4199f)
                curveTo(11.6103f, 18.0499f, 12.3902f, 18.0499f, 12.8602f, 17.4199f)
                lineTo(13.4503f, 16.6299f)
                curveTo(13.8703f, 16.0699f, 14.6102f, 16.0299f, 15.0902f, 16.5399f)
                curveTo(16.1402f, 17.6599f, 16.9902f, 17.2899f, 16.9902f, 15.7199f)
                verticalLineTo(9.0899f)
                curveTo(16.9902f, 6.7199f, 16.4302f, 6.1299f, 14.2102f, 6.1299f)
                horizontalLineTo(9.7702f)
                curveTo(7.5502f, 6.1299f, 6.9902f, 6.7199f, 6.9902f, 9.0899f)
                verticalLineTo(15.7199f)
                curveTo(7.0002f, 17.2699f, 7.8602f, 17.6399f, 8.9002f, 16.5299f)
                close()
            }
        }
        .build()
        return _receiptsquare!!
    }

private var _receiptsquare: ImageVector? = null

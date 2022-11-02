package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Strongbox: ImageVector
    get() {
        if (_strongbox != null) {
            return _strongbox!!
        }
        _strongbox = Builder(name = "Strongbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3511f, 10.9101f)
                curveTo(14.2511f, 11.6201f, 13.8311f, 12.2201f, 13.2511f, 12.5801f)
                verticalLineTo(14.5601f)
                curveTo(13.2511f, 15.2501f, 12.6911f, 15.8101f, 12.0011f, 15.8101f)
                curveTo(11.3111f, 15.8101f, 10.7511f, 15.2501f, 10.7511f, 14.5601f)
                verticalLineTo(12.5801f)
                curveTo(10.1711f, 12.2201f, 9.7511f, 11.6201f, 9.6511f, 10.9101f)
                curveTo(9.6311f, 10.8001f, 9.6211f, 10.6801f, 9.6211f, 10.5601f)
                curveTo(9.6211f, 9.0401f, 11.0611f, 7.8601f, 12.6411f, 8.2801f)
                curveTo(13.4411f, 8.4901f, 14.0911f, 9.1401f, 14.3011f, 9.9401f)
                curveTo(14.3911f, 10.2701f, 14.4011f, 10.6001f, 14.3511f, 10.9101f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9996f, 10.9102f)
                horizontalLineTo(14.3496f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.65f, 10.9102f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _strongbox!!
    }

private var _strongbox: ImageVector? = null

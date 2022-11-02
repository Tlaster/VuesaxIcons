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

public val TwotoneGroup.Glass: ImageVector
    get() {
        if (_glass != null) {
            return _glass!!
        }
        _glass = Builder(name = "Glass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1608f, 22.0f)
                curveTo(3.9808f, 22.0f, 3.1408f, 19.47f, 4.5008f, 16.39f)
                lineTo(8.7508f, 6.74f)
                horizontalLineTo(8.4508f)
                curveTo(7.8008f, 6.74f, 7.2008f, 6.48f, 6.7708f, 6.05f)
                curveTo(6.3308f, 5.62f, 6.0708f, 5.02f, 6.0708f, 4.37f)
                curveTo(6.0708f, 3.07f, 7.1308f, 2.0f, 8.4408f, 2.0f)
                horizontalLineTo(15.5508f)
                curveTo(16.2108f, 2.0f, 16.8008f, 2.27f, 17.2308f, 2.7f)
                curveTo(17.7908f, 3.26f, 18.0708f, 4.08f, 17.8608f, 4.95f)
                curveTo(17.5908f, 6.03f, 16.5508f, 6.74f, 15.4408f, 6.74f)
                horizontalLineTo(15.2808f)
                lineTo(19.5008f, 16.4f)
                curveTo(20.8508f, 19.48f, 19.9708f, 22.0f, 15.8308f, 22.0f)
                horizontalLineTo(8.1608f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.9394f, 13.1199f)
                curveTo(5.9394f, 13.1199f, 8.9994f, 12.9999f, 11.9995f, 13.9999f)
                curveTo(14.9995f, 14.9999f, 17.8295f, 13.1099f, 17.8295f, 13.1099f)
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null

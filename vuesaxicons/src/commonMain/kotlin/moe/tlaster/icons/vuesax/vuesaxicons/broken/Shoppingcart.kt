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

public val BrokenGroup.Shoppingcart: ImageVector
    get() {
        if (_shoppingcart != null) {
            return _shoppingcart!!
        }
        _shoppingcart = Builder(name = "Shoppingcart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.7506f, 13.9699f)
                curveTo(4.6106f, 15.5999f, 5.9006f, 16.9999f, 7.5406f, 16.9999f)
                horizontalLineTo(18.1906f)
                curveTo(19.6306f, 16.9999f, 20.8906f, 15.8199f, 21.0006f, 14.3899f)
                lineTo(21.5406f, 6.8899f)
                curveTo(21.6606f, 5.2299f, 20.4006f, 3.8799f, 18.7306f, 3.8799f)
                horizontalLineTo(5.8207f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(3.74f)
                curveTo(4.82f, 2.0f, 5.67f, 2.93f, 5.58f, 4.0f)
                lineTo(5.08f, 10.05f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.25f, 22.0f)
                curveTo(16.9404f, 22.0f, 17.5f, 21.4404f, 17.5f, 20.75f)
                curveTo(17.5f, 20.0596f, 16.9404f, 19.5f, 16.25f, 19.5f)
                curveTo(15.5596f, 19.5f, 15.0f, 20.0596f, 15.0f, 20.75f)
                curveTo(15.0f, 21.4404f, 15.5596f, 22.0f, 16.25f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.25f, 22.0f)
                curveTo(8.9404f, 22.0f, 9.5f, 21.4404f, 9.5f, 20.75f)
                curveTo(9.5f, 20.0596f, 8.9404f, 19.5f, 8.25f, 19.5f)
                curveTo(7.5596f, 19.5f, 7.0f, 20.0596f, 7.0f, 20.75f)
                curveTo(7.0f, 21.4404f, 7.5596f, 22.0f, 8.25f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                horizontalLineTo(21.0f)
            }
        }
        .build()
        return _shoppingcart!!
    }

private var _shoppingcart: ImageVector? = null

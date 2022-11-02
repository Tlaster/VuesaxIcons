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

public val TwotoneGroup.Shoppingbag: ImageVector
    get() {
        if (_shoppingbag != null) {
            return _shoppingbag!!
        }
        _shoppingbag = Builder(name = "Shoppingbag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.4f, 6.5f)
                horizontalLineTo(15.6f)
                curveTo(19.0f, 6.5f, 19.34f, 8.09f, 19.57f, 10.03f)
                lineTo(20.47f, 17.53f)
                curveTo(20.76f, 19.99f, 20.0f, 22.0f, 16.5f, 22.0f)
                horizontalLineTo(7.51f)
                curveTo(4.0f, 22.0f, 3.24f, 19.99f, 3.54f, 17.53f)
                lineTo(4.44f, 10.03f)
                curveTo(4.66f, 8.09f, 5.0f, 6.5f, 8.4f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 3.0f, 9.0f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(15.0f, 2.0f, 16.0f, 3.0f, 16.0f, 4.5f)
                verticalLineTo(8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.41f, 17.0298f)
                horizontalLineTo(8.0f)
            }
        }
        .build()
        return _shoppingbag!!
    }

private var _shoppingbag: ImageVector? = null

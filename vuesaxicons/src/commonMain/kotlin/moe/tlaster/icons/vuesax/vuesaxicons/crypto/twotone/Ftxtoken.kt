package moe.tlaster.icons.vuesax.vuesaxicons.crypto.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.TwotoneGroup

public val TwotoneGroup.Ftxtoken: ImageVector
    get() {
        if (_ftxtoken != null) {
            return _ftxtoken!!
        }
        _ftxtoken = Builder(name = "Ftxtoken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(8.45f, 2.0f, 8.0f, 2.45f, 8.0f, 3.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 6.55f, 8.45f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(21.0f)
                curveTo(21.55f, 7.0f, 22.0f, 6.55f, 22.0f, 6.0f)
                verticalLineTo(3.0f)
                curveTo(22.0f, 2.45f, 21.55f, 2.0f, 21.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.6401f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.3601f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.6401f)
                close()
            }
        }
        .build()
        return _ftxtoken!!
    }

private var _ftxtoken: ImageVector? = null

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

public val TwotoneGroup.Toggleon: ImageVector
    get() {
        if (_toggleon != null) {
            return _toggleon!!
        }
        _toggleon = Builder(name = "Toggleon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3f, 16.0f)
                horizontalLineTo(15.7f)
                curveTo(17.7f, 16.0f, 18.5f, 15.2f, 18.5f, 13.2f)
                verticalLineTo(10.8f)
                curveTo(18.5f, 8.8f, 17.7f, 8.0f, 15.7f, 8.0f)
                horizontalLineTo(13.3f)
                curveTo(11.3f, 8.0f, 10.5f, 8.8f, 10.5f, 10.8f)
                verticalLineTo(13.2f)
                curveTo(10.5f, 15.2f, 11.3f, 16.0f, 13.3f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 20.0f)
                horizontalLineTo(7.0f)
                curveTo(3.0f, 20.0f, 2.0f, 19.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 5.0f, 3.0f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(17.0f)
                curveTo(21.0f, 4.0f, 22.0f, 5.0f, 22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 19.0f, 21.0f, 20.0f, 17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _toggleon!!
    }

private var _toggleon: ImageVector? = null

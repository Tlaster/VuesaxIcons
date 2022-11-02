package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.More: ImageVector
    get() {
        if (_more != null) {
            return _more!!
        }
        _more = Builder(name = "More", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(7.0f, 13.31f)
                curveTo(6.28f, 13.31f, 5.69f, 12.72f, 5.69f, 12.0f)
                curveTo(5.69f, 11.28f, 6.28f, 10.69f, 7.0f, 10.69f)
                curveTo(7.72f, 10.69f, 8.31f, 11.28f, 8.31f, 12.0f)
                curveTo(8.31f, 12.72f, 7.72f, 13.31f, 7.0f, 13.31f)
                close()
                moveTo(12.0f, 13.31f)
                curveTo(11.28f, 13.31f, 10.69f, 12.72f, 10.69f, 12.0f)
                curveTo(10.69f, 11.28f, 11.28f, 10.69f, 12.0f, 10.69f)
                curveTo(12.72f, 10.69f, 13.31f, 11.28f, 13.31f, 12.0f)
                curveTo(13.31f, 12.72f, 12.72f, 13.31f, 12.0f, 13.31f)
                close()
                moveTo(17.0f, 13.31f)
                curveTo(16.28f, 13.31f, 15.69f, 12.72f, 15.69f, 12.0f)
                curveTo(15.69f, 11.28f, 16.28f, 10.69f, 17.0f, 10.69f)
                curveTo(17.72f, 10.69f, 18.31f, 11.28f, 18.31f, 12.0f)
                curveTo(18.31f, 12.72f, 17.72f, 13.31f, 17.0f, 13.31f)
                close()
            }
        }
        .build()
        return _more!!
    }

private var _more: ImageVector? = null

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

public val BoldGroup.Moresquare: ImageVector
    get() {
        if (_moresquare != null) {
            return _moresquare!!
        }
        _moresquare = Builder(name = "Moresquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(8.0f, 13.0f)
                curveTo(7.44f, 13.0f, 7.0f, 12.55f, 7.0f, 12.0f)
                curveTo(7.0f, 11.45f, 7.45f, 11.0f, 8.0f, 11.0f)
                curveTo(8.55f, 11.0f, 9.0f, 11.45f, 9.0f, 12.0f)
                curveTo(9.0f, 12.55f, 8.56f, 13.0f, 8.0f, 13.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(11.44f, 13.0f, 11.0f, 12.55f, 11.0f, 12.0f)
                curveTo(11.0f, 11.45f, 11.45f, 11.0f, 12.0f, 11.0f)
                curveTo(12.55f, 11.0f, 13.0f, 11.45f, 13.0f, 12.0f)
                curveTo(13.0f, 12.55f, 12.56f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(15.44f, 13.0f, 15.0f, 12.55f, 15.0f, 12.0f)
                curveTo(15.0f, 11.45f, 15.45f, 11.0f, 16.0f, 11.0f)
                curveTo(16.55f, 11.0f, 17.0f, 11.45f, 17.0f, 12.0f)
                curveTo(17.0f, 12.55f, 16.56f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _moresquare!!
    }

private var _moresquare: ImageVector? = null

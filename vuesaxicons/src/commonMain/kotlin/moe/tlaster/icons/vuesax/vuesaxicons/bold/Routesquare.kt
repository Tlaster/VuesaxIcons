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

public val BoldGroup.Routesquare: ImageVector
    get() {
        if (_routesquare != null) {
            return _routesquare!!
        }
        _routesquare = Builder(name = "Routesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(17.35f, 9.05f)
                lineTo(15.01f, 16.59f)
                curveTo(14.45f, 18.38f, 11.94f, 18.41f, 11.35f, 16.63f)
                lineTo(10.65f, 14.56f)
                curveTo(10.46f, 13.99f, 10.01f, 13.53f, 9.44f, 13.35f)
                lineTo(7.36f, 12.65f)
                curveTo(5.6f, 12.06f, 5.62f, 9.53f, 7.41f, 8.99f)
                lineTo(14.95f, 6.64f)
                curveTo(16.43f, 6.19f, 17.82f, 7.58f, 17.35f, 9.05f)
                close()
            }
        }
        .build()
        return _routesquare!!
    }

private var _routesquare: ImageVector? = null

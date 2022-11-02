package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Usersquare: ImageVector
    get() {
        if (_usersquare != null) {
            return _usersquare!!
        }
        _usersquare = Builder(name = "Usersquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(22.0f, 19.0f, 20.71f, 20.93f, 18.44f, 21.66f)
                curveTo(17.78f, 21.89f, 17.02f, 22.0f, 16.19f, 22.0f)
                horizontalLineTo(7.81f)
                curveTo(6.98f, 22.0f, 6.22f, 21.89f, 5.56f, 21.66f)
                curveTo(3.29f, 20.93f, 2.0f, 19.0f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4406f, 21.66f)
                curveTo(17.7806f, 21.89f, 17.0206f, 22.0f, 16.1906f, 22.0f)
                horizontalLineTo(7.8106f)
                curveTo(6.9805f, 22.0f, 6.2206f, 21.89f, 5.5606f, 21.66f)
                curveTo(5.9106f, 19.02f, 8.6706f, 16.97f, 12.0005f, 16.97f)
                curveTo(15.3305f, 16.97f, 18.0906f, 19.02f, 18.4406f, 21.66f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5799f, 11.58f)
                curveTo(15.5799f, 13.56f, 13.9799f, 15.17f, 11.9999f, 15.17f)
                curveTo(10.0199f, 15.17f, 8.4199f, 13.56f, 8.4199f, 11.58f)
                curveTo(8.4199f, 9.6f, 10.0199f, 8.0f, 11.9999f, 8.0f)
                curveTo(13.9799f, 8.0f, 15.5799f, 9.6f, 15.5799f, 11.58f)
                close()
            }
        }
        .build()
        return _usersquare!!
    }

private var _usersquare: ImageVector? = null

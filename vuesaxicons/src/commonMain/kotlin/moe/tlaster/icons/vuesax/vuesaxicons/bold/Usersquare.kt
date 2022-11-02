package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Usersquare: ImageVector
    get() {
        if (_usersquare != null) {
            return _usersquare!!
        }
        _usersquare = Builder(name = "Usersquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2.0f, 19.0f, 3.29f, 20.93f, 5.56f, 21.66f)
                curveTo(6.22f, 21.89f, 6.98f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.19f)
                curveTo(17.02f, 22.0f, 17.78f, 21.89f, 18.44f, 21.66f)
                curveTo(20.71f, 20.93f, 22.0f, 19.0f, 22.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(20.5f, 16.19f)
                curveTo(20.5f, 18.33f, 19.66f, 19.68f, 17.97f, 20.24f)
                curveTo(17.0f, 18.33f, 14.7f, 16.97f, 12.0f, 16.97f)
                curveTo(9.3f, 16.97f, 7.01f, 18.32f, 6.03f, 20.24f)
                horizontalLineTo(6.02f)
                curveTo(4.35f, 19.7f, 3.5f, 18.34f, 3.5f, 16.2f)
                verticalLineTo(7.81f)
                curveTo(3.5f, 4.99f, 4.99f, 3.5f, 7.81f, 3.5f)
                horizontalLineTo(16.19f)
                curveTo(19.01f, 3.5f, 20.5f, 4.99f, 20.5f, 7.81f)
                verticalLineTo(16.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0019f, 8.0f)
                curveTo(10.0219f, 8.0f, 8.4219f, 9.6f, 8.4219f, 11.58f)
                curveTo(8.4219f, 13.56f, 10.0219f, 15.17f, 12.0019f, 15.17f)
                curveTo(13.9819f, 15.17f, 15.5819f, 13.56f, 15.5819f, 11.58f)
                curveTo(15.5819f, 9.6f, 13.9819f, 8.0f, 12.0019f, 8.0f)
                close()
            }
        }
        .build()
        return _usersquare!!
    }

private var _usersquare: ImageVector? = null

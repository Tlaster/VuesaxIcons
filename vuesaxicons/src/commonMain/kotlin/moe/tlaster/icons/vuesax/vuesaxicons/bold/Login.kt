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

public val BoldGroup.Login: ImageVector
    get() {
        if (_login != null) {
            return _login!!
        }
        _login = Builder(name = "Login", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7584f, 2.0f)
                curveTo(10.2784f, 2.0f, 9.8984f, 2.38f, 9.8984f, 2.86f)
                verticalLineTo(11.32f)
                horizontalLineTo(13.5684f)
                lineTo(11.9984f, 9.75f)
                curveTo(11.7084f, 9.46f, 11.7084f, 8.98f, 11.9984f, 8.69f)
                curveTo(12.2884f, 8.4f, 12.7684f, 8.4f, 13.0584f, 8.69f)
                lineTo(15.8984f, 11.54f)
                curveTo(16.1884f, 11.83f, 16.1884f, 12.31f, 15.8984f, 12.6f)
                lineTo(13.0584f, 15.45f)
                curveTo(12.9084f, 15.6f, 12.7184f, 15.67f, 12.5284f, 15.67f)
                curveTo(12.3384f, 15.67f, 12.1484f, 15.6f, 11.9984f, 15.45f)
                curveTo(11.7084f, 15.16f, 11.7084f, 14.68f, 11.9984f, 14.39f)
                lineTo(13.5584f, 12.83f)
                horizontalLineTo(9.8984f)
                verticalLineTo(21.16f)
                curveTo(9.8984f, 21.63f, 10.2784f, 22.02f, 10.7584f, 22.02f)
                curveTo(16.6484f, 22.02f, 20.7584f, 17.91f, 20.7584f, 12.02f)
                curveTo(20.7584f, 6.13f, 16.6384f, 2.0f, 10.7584f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9883f, 11.3203f)
                curveTo(3.5783f, 11.3203f, 3.2383f, 11.6603f, 3.2383f, 12.0703f)
                curveTo(3.2383f, 12.4803f, 3.5783f, 12.8203f, 3.9883f, 12.8203f)
                horizontalLineTo(9.8883f)
                verticalLineTo(11.3203f)
                horizontalLineTo(3.9883f)
                close()
            }
        }
        .build()
        return _login!!
    }

private var _login: ImageVector? = null

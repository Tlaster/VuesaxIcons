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
                moveTo(16.8f, 2.0f)
                horizontalLineTo(14.2f)
                curveTo(11.0f, 2.0f, 9.0f, 4.0f, 9.0f, 7.2f)
                verticalLineTo(11.25f)
                horizontalLineTo(13.44f)
                lineTo(11.37f, 9.18f)
                curveTo(11.22f, 9.03f, 11.15f, 8.84f, 11.15f, 8.65f)
                curveTo(11.15f, 8.46f, 11.22f, 8.27f, 11.37f, 8.12f)
                curveTo(11.66f, 7.83f, 12.14f, 7.83f, 12.43f, 8.12f)
                lineTo(15.78f, 11.47f)
                curveTo(16.07f, 11.76f, 16.07f, 12.24f, 15.78f, 12.53f)
                lineTo(12.43f, 15.88f)
                curveTo(12.14f, 16.17f, 11.66f, 16.17f, 11.37f, 15.88f)
                curveTo(11.08f, 15.59f, 11.08f, 15.11f, 11.37f, 14.82f)
                lineTo(13.44f, 12.75f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.8f)
                curveTo(9.0f, 20.0f, 11.0f, 22.0f, 14.2f, 22.0f)
                horizontalLineTo(16.79f)
                curveTo(19.99f, 22.0f, 21.99f, 20.0f, 21.99f, 16.8f)
                verticalLineTo(7.2f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 16.8f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 11.25f)
                curveTo(2.34f, 11.25f, 2.0f, 11.59f, 2.0f, 12.0f)
                curveTo(2.0f, 12.41f, 2.34f, 12.75f, 2.75f, 12.75f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.75f)
                close()
            }
        }
        .build()
        return _login!!
    }

private var _login: ImageVector? = null

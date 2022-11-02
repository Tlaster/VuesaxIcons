package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 22.75f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 22.75f, 2.75f, 22.41f, 2.75f, 22.0f)
                curveTo(2.75f, 21.59f, 3.09f, 21.25f, 3.5f, 21.25f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 21.25f, 21.25f, 21.59f, 21.25f, 22.0f)
                curveTo(21.25f, 22.41f, 20.91f, 22.75f, 20.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9995f, 18.2499f)
                curveTo(18.8095f, 18.2499f, 18.6195f, 18.1799f, 18.4695f, 18.0299f)
                lineTo(4.4694f, 4.0299f)
                curveTo(4.1795f, 3.7399f, 4.1795f, 3.2599f, 4.4694f, 2.9699f)
                curveTo(4.7594f, 2.6799f, 5.2394f, 2.6799f, 5.5294f, 2.9699f)
                lineTo(19.5295f, 16.9699f)
                curveTo(19.8195f, 17.2599f, 19.8195f, 17.7399f, 19.5295f, 18.0299f)
                curveTo(19.3795f, 18.1799f, 19.1895f, 18.2499f, 18.9995f, 18.2499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 14.52f)
                curveTo(4.59f, 14.52f, 4.25f, 14.18f, 4.25f, 13.77f)
                verticalLineTo(3.5f)
                curveTo(4.25f, 3.09f, 4.59f, 2.75f, 5.0f, 2.75f)
                horizontalLineTo(15.27f)
                curveTo(15.68f, 2.75f, 16.02f, 3.09f, 16.02f, 3.5f)
                curveTo(16.02f, 3.91f, 15.68f, 4.25f, 15.27f, 4.25f)
                horizontalLineTo(5.75f)
                verticalLineTo(13.77f)
                curveTo(5.75f, 14.18f, 5.41f, 14.52f, 5.0f, 14.52f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null

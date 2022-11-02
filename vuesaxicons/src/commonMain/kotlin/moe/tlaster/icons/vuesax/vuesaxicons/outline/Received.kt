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

public val OutlineGroup.Received: ImageVector
    get() {
        if (_received != null) {
            return _received!!
        }
        _received = Builder(name = "Received", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9995f, 18.2499f)
                curveTo(4.8095f, 18.2499f, 4.6195f, 18.1799f, 4.4694f, 18.0299f)
                curveTo(4.1795f, 17.7399f, 4.1795f, 17.2599f, 4.4694f, 16.9699f)
                lineTo(18.4695f, 2.9699f)
                curveTo(18.7595f, 2.6799f, 19.2395f, 2.6799f, 19.5295f, 2.9699f)
                curveTo(19.8195f, 3.2599f, 19.8195f, 3.7399f, 19.5295f, 4.0299f)
                lineTo(5.5294f, 18.0299f)
                curveTo(5.3794f, 18.1799f, 5.1894f, 18.2499f, 4.9995f, 18.2499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.27f, 18.25f)
                horizontalLineTo(5.0f)
                curveTo(4.59f, 18.25f, 4.25f, 17.91f, 4.25f, 17.5f)
                verticalLineTo(7.23f)
                curveTo(4.25f, 6.82f, 4.59f, 6.48f, 5.0f, 6.48f)
                curveTo(5.41f, 6.48f, 5.75f, 6.82f, 5.75f, 7.23f)
                verticalLineTo(16.75f)
                horizontalLineTo(15.27f)
                curveTo(15.68f, 16.75f, 16.02f, 17.09f, 16.02f, 17.5f)
                curveTo(16.02f, 17.91f, 15.68f, 18.25f, 15.27f, 18.25f)
                close()
            }
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
        }
        .build()
        return _received!!
    }

private var _received: ImageVector? = null

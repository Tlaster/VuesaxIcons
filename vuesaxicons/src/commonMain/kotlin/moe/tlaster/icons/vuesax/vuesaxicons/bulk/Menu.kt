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

public val BulkGroup.Menu: ImageVector
    get() {
        if (_menu != null) {
            return _menu!!
        }
        _menu = Builder(name = "Menu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.25f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 8.25f, 6.25f, 7.91f, 6.25f, 7.5f)
                curveTo(6.25f, 7.09f, 6.59f, 6.75f, 7.0f, 6.75f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 6.75f, 17.75f, 7.09f, 17.75f, 7.5f)
                curveTo(17.75f, 7.91f, 17.41f, 8.25f, 17.0f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 12.75f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12.0f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7.0f, 11.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 11.25f, 17.75f, 11.59f, 17.75f, 12.0f)
                curveTo(17.75f, 12.41f, 17.41f, 12.75f, 17.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.25f)
                horizontalLineTo(7.0f)
                curveTo(6.59f, 17.25f, 6.25f, 16.91f, 6.25f, 16.5f)
                curveTo(6.25f, 16.09f, 6.59f, 15.75f, 7.0f, 15.75f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 15.75f, 17.75f, 16.09f, 17.75f, 16.5f)
                curveTo(17.75f, 16.91f, 17.41f, 17.25f, 17.0f, 17.25f)
                close()
            }
        }
        .build()
        return _menu!!
    }

private var _menu: ImageVector? = null

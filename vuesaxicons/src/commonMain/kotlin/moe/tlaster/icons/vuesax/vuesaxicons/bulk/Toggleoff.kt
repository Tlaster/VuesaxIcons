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

public val BulkGroup.Toggleoff: ImageVector
    get() {
        if (_toggleoff != null) {
            return _toggleoff!!
        }
        _toggleoff = Builder(name = "Toggleoff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.65f, 3.8599f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 3.8599f, 2.0f, 5.1099f, 2.0f, 9.2099f)
                verticalLineTo(14.7899f)
                curveTo(2.0f, 18.8899f, 3.25f, 20.1399f, 7.35f, 20.1399f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 20.1399f, 22.0f, 18.8899f, 22.0f, 14.7899f)
                verticalLineTo(9.2099f)
                curveTo(22.0f, 5.1099f, 20.75f, 3.8599f, 16.65f, 3.8599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7898f, 7.5801f)
                horizontalLineTo(8.5598f)
                curveTo(6.3098f, 7.5801f, 5.2598f, 8.6301f, 5.2598f, 10.8801f)
                verticalLineTo(13.1101f)
                curveTo(5.2598f, 15.3601f, 6.3098f, 16.4101f, 8.5598f, 16.4101f)
                horizontalLineTo(10.7898f)
                curveTo(13.0398f, 16.4101f, 14.0898f, 15.3601f, 14.0898f, 13.1101f)
                verticalLineTo(10.8801f)
                curveTo(14.0898f, 8.6301f, 13.0398f, 7.5801f, 10.7898f, 7.5801f)
                close()
            }
        }
        .build()
        return _toggleoff!!
    }

private var _toggleoff: ImageVector? = null

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

public val BulkGroup.Toggleon: ImageVector
    get() {
        if (_toggleon != null) {
            return _toggleon!!
        }
        _toggleon = Builder(name = "Toggleon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.35f, 3.8599f)
                horizontalLineTo(16.65f)
                curveTo(20.75f, 3.8599f, 22.0f, 5.1099f, 22.0f, 9.2099f)
                verticalLineTo(14.7899f)
                curveTo(22.0f, 18.8899f, 20.75f, 20.1399f, 16.65f, 20.1399f)
                horizontalLineTo(7.35f)
                curveTo(3.25f, 20.1399f, 2.0f, 18.8899f, 2.0f, 14.7899f)
                verticalLineTo(9.2099f)
                curveTo(2.0f, 5.1099f, 3.25f, 3.8599f, 7.35f, 3.8599f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2102f, 7.5801f)
                horizontalLineTo(15.4402f)
                curveTo(17.6902f, 7.5801f, 18.7402f, 8.6301f, 18.7402f, 10.8801f)
                verticalLineTo(13.1101f)
                curveTo(18.7402f, 15.3601f, 17.6902f, 16.4101f, 15.4402f, 16.4101f)
                horizontalLineTo(13.2102f)
                curveTo(10.9602f, 16.4101f, 9.9102f, 15.3601f, 9.9102f, 13.1101f)
                verticalLineTo(10.8801f)
                curveTo(9.9102f, 8.6301f, 10.9602f, 7.5801f, 13.2102f, 7.5801f)
                close()
            }
        }
        .build()
        return _toggleon!!
    }

private var _toggleon: ImageVector? = null

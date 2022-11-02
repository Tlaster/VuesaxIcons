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

public val BulkGroup.Strongbox: ImageVector
    get() {
        if (_strongbox != null) {
            return _strongbox!!
        }
        _strongbox = Builder(name = "Strongbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.1599f)
                horizontalLineTo(14.33f)
                curveTo(14.32f, 10.0899f, 14.32f, 10.0099f, 14.3f, 9.9399f)
                curveTo(14.09f, 9.1399f, 13.44f, 8.4899f, 12.64f, 8.2799f)
                curveTo(11.2f, 7.8999f, 9.89f, 8.8399f, 9.67f, 10.1599f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.6599f)
                horizontalLineTo(9.91f)
                curveTo(10.11f, 12.0399f, 10.39f, 12.3599f, 10.75f, 12.5799f)
                verticalLineTo(14.5599f)
                curveTo(10.75f, 15.2499f, 11.31f, 15.8099f, 12.0f, 15.8099f)
                curveTo(12.69f, 15.8099f, 13.25f, 15.2499f, 13.25f, 14.5599f)
                verticalLineTo(12.5799f)
                curveTo(13.61f, 12.3599f, 13.89f, 12.0399f, 14.09f, 11.6599f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.1599f)
                close()
            }
        }
        .build()
        return _strongbox!!
    }

private var _strongbox: ImageVector? = null

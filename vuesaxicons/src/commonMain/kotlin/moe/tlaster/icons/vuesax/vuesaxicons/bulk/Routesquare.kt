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

public val BulkGroup.Routesquare: ImageVector
    get() {
        if (_routesquare != null) {
            return _routesquare!!
        }
        _routesquare = Builder(name = "Routesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.82f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.82f, 4.17f, 21.99f, 7.81f, 21.99f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 21.99f, 21.99f, 19.82f, 21.99f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3509f, 9.0498f)
                lineTo(15.0109f, 16.5898f)
                curveTo(14.4509f, 18.3798f, 11.9409f, 18.4098f, 11.3509f, 16.6298f)
                lineTo(10.651f, 14.5598f)
                curveTo(10.461f, 13.9898f, 10.0109f, 13.5298f, 9.441f, 13.3498f)
                lineTo(7.3609f, 12.6498f)
                curveTo(5.591f, 12.0598f, 5.621f, 9.5298f, 7.411f, 8.9898f)
                lineTo(14.951f, 6.6398f)
                curveTo(16.431f, 6.1898f, 17.8209f, 7.5798f, 17.3509f, 9.0498f)
                close()
            }
        }
        .build()
        return _routesquare!!
    }

private var _routesquare: ImageVector? = null

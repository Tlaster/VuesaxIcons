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

public val BulkGroup.Scissor1: ImageVector
    get() {
        if (_scissor1 != null) {
            return _scissor1!!
        }
        _scissor1 = Builder(name = "Scissor1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(14.1692f, 11.9899f)
                lineTo(17.7692f, 9.2999f)
                curveTo(18.0992f, 9.0499f, 18.1692f, 8.5799f, 17.9192f, 8.2499f)
                curveTo(17.6692f, 7.9199f, 17.1992f, 7.8499f, 16.8692f, 8.0999f)
                lineTo(12.9192f, 11.0499f)
                lineTo(10.5192f, 9.2499f)
                curveTo(10.5292f, 9.1599f, 10.5492f, 9.0699f, 10.5492f, 8.9699f)
                curveTo(10.5492f, 7.6999f, 9.5192f, 6.6699f, 8.2492f, 6.6699f)
                curveTo(6.9792f, 6.6699f, 5.9492f, 7.6999f, 5.9492f, 8.9699f)
                curveTo(5.9492f, 10.2399f, 6.9792f, 11.2699f, 8.2492f, 11.2699f)
                curveTo(8.8692f, 11.2699f, 9.4292f, 11.0199f, 9.8492f, 10.6199f)
                lineTo(11.6792f, 11.9899f)
                lineTo(9.8392f, 13.3699f)
                curveTo(9.4292f, 12.9799f, 8.8692f, 12.7299f, 8.2592f, 12.7299f)
                curveTo(6.9892f, 12.7299f, 5.9592f, 13.7599f, 5.9592f, 15.0299f)
                curveTo(5.9592f, 16.2999f, 6.9892f, 17.3299f, 8.2592f, 17.3299f)
                curveTo(9.5292f, 17.3299f, 10.5592f, 16.2999f, 10.5592f, 15.0299f)
                curveTo(10.5592f, 14.9299f, 10.5392f, 14.8299f, 10.5292f, 14.7299f)
                lineTo(12.9392f, 12.9299f)
                lineTo(16.8892f, 15.8799f)
                curveTo(17.0192f, 15.9799f, 17.1792f, 16.0299f, 17.3392f, 16.0299f)
                curveTo(17.5692f, 16.0299f, 17.7892f, 15.9299f, 17.9392f, 15.7299f)
                curveTo(18.1892f, 15.3999f, 18.1192f, 14.9299f, 17.7892f, 14.6799f)
                lineTo(14.1692f, 11.9899f)
                close()
            }
        }
        .build()
        return _scissor1!!
    }

private var _scissor1: ImageVector? = null

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

public val BulkGroup.Bucketsquare: ImageVector
    get() {
        if (_bucketsquare != null) {
            return _bucketsquare!!
        }
        _bucketsquare = Builder(name = "Bucketsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(15.6595f, 11.93f)
                curveTo(15.6495f, 11.79f, 15.5895f, 11.64f, 15.4895f, 11.54f)
                lineTo(10.7895f, 6.84f)
                lineTo(10.2395f, 6.29f)
                curveTo(10.0495f, 6.1f, 9.7495f, 6.1f, 9.5595f, 6.29f)
                curveTo(9.3695f, 6.48f, 9.3695f, 6.78f, 9.5595f, 6.97f)
                lineTo(10.1095f, 7.52f)
                lineTo(6.5095f, 11.12f)
                curveTo(6.0995f, 11.53f, 5.8795f, 11.95f, 5.8695f, 12.36f)
                curveTo(5.8595f, 12.8f, 6.0695f, 13.24f, 6.5095f, 13.69f)
                lineTo(9.0795f, 16.26f)
                curveTo(9.9395f, 17.11f, 10.7995f, 17.11f, 11.6495f, 16.26f)
                lineTo(15.4995f, 12.41f)
                curveTo(15.6095f, 12.27f, 15.6695f, 12.09f, 15.6595f, 11.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9589f, 14.1902f)
                curveTo(16.7989f, 14.0102f, 16.4889f, 14.0102f, 16.3189f, 14.1902f)
                curveTo(16.1189f, 14.4002f, 15.1289f, 15.5202f, 15.1289f, 16.3602f)
                curveTo(15.1289f, 17.1902f, 15.7989f, 17.8602f, 16.6289f, 17.8602f)
                curveTo(17.4589f, 17.8602f, 18.1289f, 17.1902f, 18.1289f, 16.3602f)
                curveTo(18.1389f, 15.5202f, 17.1589f, 14.4102f, 16.9589f, 14.1902f)
                close()
            }
        }
        .build()
        return _bucketsquare!!
    }

private var _bucketsquare: ImageVector? = null

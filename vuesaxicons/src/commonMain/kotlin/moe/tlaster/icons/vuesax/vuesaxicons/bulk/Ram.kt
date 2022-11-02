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

public val BulkGroup.Ram: ImageVector
    get() {
        if (_ram != null) {
            return _ram!!
        }
        _ram = Builder(name = "Ram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 10.0f)
                verticalLineTo(12.17f)
                curveTo(18.5f, 12.7f, 18.71f, 13.21f, 19.09f, 13.59f)
                lineTo(19.91f, 14.41f)
                curveTo(20.29f, 14.79f, 20.5f, 15.3f, 20.5f, 15.83f)
                verticalLineTo(17.0f)
                curveTo(20.5f, 19.85f, 19.12f, 21.8f, 16.01f, 21.98f)
                lineTo(15.99f, 18.99f)
                curveTo(15.98f, 17.89f, 15.09f, 17.0f, 13.99f, 17.0f)
                horizontalLineTo(9.98f)
                curveTo(8.87f, 17.0f, 7.98f, 17.9f, 7.98f, 19.0f)
                lineTo(7.99f, 21.98f)
                curveTo(4.83f, 21.8f, 3.5f, 19.85f, 3.5f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(3.5f, 4.0f, 4.97f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(15.5f)
                curveTo(18.97f, 2.0f, 20.5f, 4.0f, 20.5f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(20.5f, 8.55f, 20.05f, 9.0f, 19.5f, 9.0f)
                curveTo(18.95f, 9.0f, 18.5f, 9.45f, 18.5f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0105f, 21.98f)
                curveTo(15.8505f, 21.99f, 15.6805f, 22.0f, 15.5005f, 22.0f)
                horizontalLineTo(8.5005f)
                curveTo(8.3205f, 22.0f, 8.1505f, 22.0f, 7.9905f, 21.98f)
                lineTo(7.9805f, 19.0f)
                curveTo(7.9805f, 17.9f, 8.8705f, 17.0f, 9.9805f, 17.0f)
                horizontalLineTo(13.9905f)
                curveTo(15.0905f, 17.0f, 15.9805f, 17.89f, 15.9905f, 18.99f)
                lineTo(16.0105f, 21.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9707f, 8.53f)
                horizontalLineTo(7.9707f)
                curveTo(7.5607f, 8.53f, 7.2207f, 8.19f, 7.2207f, 7.78f)
                curveTo(7.2207f, 7.37f, 7.5607f, 7.03f, 7.9707f, 7.03f)
                horizontalLineTo(13.9707f)
                curveTo(14.3807f, 7.03f, 14.7207f, 7.37f, 14.7207f, 7.78f)
                curveTo(14.7207f, 8.19f, 14.3907f, 8.53f, 13.9707f, 8.53f)
                close()
            }
        }
        .build()
        return _ram!!
    }

private var _ram: ImageVector? = null

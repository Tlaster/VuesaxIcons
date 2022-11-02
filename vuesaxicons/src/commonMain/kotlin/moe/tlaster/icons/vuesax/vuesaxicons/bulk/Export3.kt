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

public val BulkGroup.Export3: ImageVector
    get() {
        if (_export3 != null) {
            return _export3!!
        }
        _export3 = Builder(name = "Export3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8f, 9.0f)
                horizontalLineTo(7.2f)
                curveTo(4.0f, 9.0f, 2.0f, 11.0f, 2.0f, 14.2f)
                verticalLineTo(16.79f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 7.2f, 22.0f)
                horizontalLineTo(16.79f)
                curveTo(19.99f, 22.0f, 21.99f, 20.0f, 21.99f, 16.8f)
                verticalLineTo(14.2f)
                curveTo(22.0f, 11.0f, 20.0f, 9.0f, 16.8f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8798f, 5.5699f)
                lineTo(12.5298f, 2.2199f)
                curveTo(12.2398f, 1.9299f, 11.7598f, 1.9299f, 11.4698f, 2.2199f)
                lineTo(8.1198f, 5.5699f)
                curveTo(7.8298f, 5.8599f, 7.8298f, 6.3399f, 8.1198f, 6.6299f)
                curveTo(8.4098f, 6.9199f, 8.8898f, 6.9199f, 9.1798f, 6.6299f)
                lineTo(11.2498f, 4.5599f)
                verticalLineTo(15.2499f)
                curveTo(11.2498f, 15.6599f, 11.5898f, 15.9999f, 11.9998f, 15.9999f)
                curveTo(12.4098f, 15.9999f, 12.7498f, 15.6599f, 12.7498f, 15.2499f)
                verticalLineTo(4.5599f)
                lineTo(14.8198f, 6.6299f)
                curveTo(14.9698f, 6.7799f, 15.1598f, 6.8499f, 15.3498f, 6.8499f)
                curveTo(15.5398f, 6.8499f, 15.7298f, 6.7799f, 15.8798f, 6.6299f)
                curveTo(16.1798f, 6.3399f, 16.1798f, 5.8699f, 15.8798f, 5.5699f)
                close()
            }
        }
        .build()
        return _export3!!
    }

private var _export3: ImageVector? = null

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

public val BulkGroup.Tagcross: ImageVector
    get() {
        if (_tagcross != null) {
            return _tagcross!!
        }
        _tagcross = Builder(name = "Tagcross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.2797f, 20.25f)
                horizontalLineTo(16.9997f)
                curveTo(19.7597f, 20.25f, 21.9997f, 18.01f, 21.9997f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(21.9997f, 5.99f, 19.7597f, 3.75f, 16.9997f, 3.75f)
                horizontalLineTo(10.2797f)
                curveTo(8.8697f, 3.75f, 7.5297f, 4.34f, 6.5797f, 5.39f)
                lineTo(3.0497f, 9.27f)
                curveTo(1.6397f, 10.82f, 1.6397f, 13.18f, 3.0497f, 14.73f)
                lineTo(6.5797f, 18.61f)
                curveTo(7.5297f, 19.66f, 8.8697f, 20.25f, 10.2797f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.59f, 12.0f)
                lineTo(16.53f, 10.06f)
                curveTo(16.82f, 9.77f, 16.82f, 9.29f, 16.53f, 9.0f)
                curveTo(16.24f, 8.71f, 15.76f, 8.71f, 15.47f, 9.0f)
                lineTo(13.53f, 10.94f)
                lineTo(11.59f, 9.0f)
                curveTo(11.3f, 8.71f, 10.82f, 8.71f, 10.53f, 9.0f)
                curveTo(10.24f, 9.29f, 10.24f, 9.77f, 10.53f, 10.06f)
                lineTo(12.47f, 12.0f)
                lineTo(10.53f, 13.94f)
                curveTo(10.24f, 14.23f, 10.24f, 14.71f, 10.53f, 15.0f)
                curveTo(10.68f, 15.15f, 10.87f, 15.22f, 11.06f, 15.22f)
                curveTo(11.25f, 15.22f, 11.44f, 15.15f, 11.59f, 15.0f)
                lineTo(13.53f, 13.06f)
                lineTo(15.47f, 15.0f)
                curveTo(15.62f, 15.15f, 15.81f, 15.22f, 16.0f, 15.22f)
                curveTo(16.19f, 15.22f, 16.38f, 15.15f, 16.53f, 15.0f)
                curveTo(16.82f, 14.71f, 16.82f, 14.23f, 16.53f, 13.94f)
                lineTo(14.59f, 12.0f)
                close()
            }
        }
        .build()
        return _tagcross!!
    }

private var _tagcross: ImageVector? = null

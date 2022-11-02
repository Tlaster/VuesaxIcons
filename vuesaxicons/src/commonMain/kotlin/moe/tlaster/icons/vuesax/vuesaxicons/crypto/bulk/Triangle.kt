package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BulkGroup

public val BulkGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0494f, 2.85f)
                lineTo(1.2594f, 11.64f)
                curveTo(1.0594f, 11.84f, 1.0594f, 12.15f, 1.2594f, 12.35f)
                lineTo(10.0494f, 21.14f)
                curveTo(10.3694f, 21.45f, 10.8994f, 21.23f, 10.8994f, 20.79f)
                verticalLineTo(18.2f)
                curveTo(10.8994f, 18.07f, 10.8494f, 17.94f, 10.7494f, 17.85f)
                lineTo(5.2494f, 12.35f)
                curveTo(5.0494f, 12.15f, 5.0494f, 11.84f, 5.2494f, 11.64f)
                lineTo(10.7494f, 6.14f)
                curveTo(10.8394f, 6.05f, 10.8994f, 5.92f, 10.8994f, 5.79f)
                verticalLineTo(3.2f)
                curveTo(10.8994f, 2.76f, 10.3594f, 2.54f, 10.0494f, 2.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7504f, 2.85f)
                lineTo(22.5403f, 11.64f)
                curveTo(22.7403f, 11.84f, 22.7403f, 12.15f, 22.5403f, 12.35f)
                lineTo(13.7504f, 21.14f)
                curveTo(13.4404f, 21.45f, 12.9004f, 21.23f, 12.9004f, 20.79f)
                verticalLineTo(18.2f)
                curveTo(12.9004f, 18.07f, 12.9504f, 17.94f, 13.0504f, 17.85f)
                lineTo(18.5504f, 12.35f)
                curveTo(18.7504f, 12.15f, 18.7504f, 11.84f, 18.5504f, 11.64f)
                lineTo(13.0504f, 6.14f)
                curveTo(12.9604f, 6.05f, 12.9004f, 5.92f, 12.9004f, 5.79f)
                verticalLineTo(3.2f)
                curveTo(12.9004f, 2.76f, 13.4404f, 2.54f, 13.7504f, 2.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0494f, 9.85f)
                lineTo(8.2594f, 11.64f)
                curveTo(8.0594f, 11.84f, 8.0594f, 12.15f, 8.2594f, 12.35f)
                lineTo(10.0494f, 14.14f)
                curveTo(10.3694f, 14.45f, 10.8994f, 14.23f, 10.8994f, 13.79f)
                verticalLineTo(10.2f)
                curveTo(10.8994f, 9.76f, 10.3594f, 9.54f, 10.0494f, 9.85f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null

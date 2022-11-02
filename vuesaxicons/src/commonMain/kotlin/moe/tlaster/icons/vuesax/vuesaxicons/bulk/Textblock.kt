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

public val BulkGroup.Textblock: ImageVector
    get() {
        if (_textblock != null) {
            return _textblock!!
        }
        _textblock = Builder(name = "Textblock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.3403f, 8.21f)
                curveTo(14.0003f, 6.54f, 10.0103f, 6.54f, 6.6703f, 8.21f)
                curveTo(6.2903f, 8.4f, 6.1403f, 8.85f, 6.3303f, 9.22f)
                curveTo(6.4603f, 9.48f, 6.7303f, 9.63f, 7.0003f, 9.63f)
                curveTo(7.1103f, 9.63f, 7.2303f, 9.6f, 7.3403f, 9.55f)
                curveTo(8.5703f, 8.94f, 9.9003f, 8.6f, 11.2503f, 8.5f)
                verticalLineTo(16.29f)
                curveTo(11.2503f, 16.7f, 11.5903f, 17.04f, 12.0003f, 17.04f)
                curveTo(12.4103f, 17.04f, 12.7503f, 16.7f, 12.7503f, 16.29f)
                verticalLineTo(8.5f)
                curveTo(14.1003f, 8.6f, 15.4303f, 8.94f, 16.6603f, 9.55f)
                curveTo(17.0303f, 9.73f, 17.4803f, 9.59f, 17.6703f, 9.21f)
                curveTo(17.8603f, 8.85f, 17.7103f, 8.4f, 17.3403f, 8.21f)
                close()
            }
        }
        .build()
        return _textblock!!
    }

private var _textblock: ImageVector? = null

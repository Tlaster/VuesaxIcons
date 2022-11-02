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

public val BulkGroup.Arrowup1: ImageVector
    get() {
        if (_arrowup1 != null) {
            return _arrowup1!!
        }
        _arrowup1 = Builder(name = "Arrowup1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(22.0f, 19.82f, 19.83f, 21.99f, 16.19f, 21.99f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 22.0f, 2.0f, 19.83f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.17f, 4.17f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.18f)
                curveTo(19.83f, 2.0f, 22.0f, 4.17f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5309f, 5.47f)
                lineTo(16.8209f, 9.76f)
                curveTo(17.1109f, 10.05f, 17.1109f, 10.53f, 16.8209f, 10.82f)
                curveTo(16.5309f, 11.11f, 16.0509f, 11.11f, 15.7609f, 10.82f)
                lineTo(12.7509f, 7.81f)
                verticalLineTo(18.0f)
                curveTo(12.7509f, 18.41f, 12.4109f, 18.75f, 12.0009f, 18.75f)
                curveTo(11.5909f, 18.75f, 11.2509f, 18.41f, 11.2509f, 18.0f)
                verticalLineTo(7.81f)
                lineTo(8.2409f, 10.82f)
                curveTo(7.9509f, 11.11f, 7.4709f, 11.11f, 7.1809f, 10.82f)
                curveTo(7.0309f, 10.67f, 6.9609f, 10.48f, 6.9609f, 10.29f)
                curveTo(6.9609f, 10.1f, 7.0409f, 9.9f, 7.1809f, 9.76f)
                lineTo(11.4709f, 5.47f)
                curveTo(11.6109f, 5.33f, 11.8009f, 5.25f, 12.0009f, 5.25f)
                curveTo(12.2009f, 5.25f, 12.3909f, 5.33f, 12.5309f, 5.47f)
                close()
            }
        }
        .build()
        return _arrowup1!!
    }

private var _arrowup1: ImageVector? = null

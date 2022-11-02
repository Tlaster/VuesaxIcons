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

public val BulkGroup.Bag: ImageVector
    get() {
        if (_bag != null) {
            return _bag!!
        }
        _bag = Builder(name = "Bag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.24f, 5.5801f)
                horizontalLineTo(18.84f)
                lineTo(15.46f, 2.2001f)
                curveTo(15.19f, 1.9301f, 14.75f, 1.9301f, 14.47f, 2.2001f)
                curveTo(14.2f, 2.4701f, 14.2f, 2.9101f, 14.47f, 3.1901f)
                lineTo(16.86f, 5.5801f)
                horizontalLineTo(7.14f)
                lineTo(9.53f, 3.1901f)
                curveTo(9.8f, 2.9201f, 9.8f, 2.4801f, 9.53f, 2.2001f)
                curveTo(9.26f, 1.9301f, 8.82f, 1.9301f, 8.54f, 2.2001f)
                lineTo(5.17f, 5.5801f)
                horizontalLineTo(4.77f)
                curveTo(3.87f, 5.5801f, 2.0f, 5.5801f, 2.0f, 8.1401f)
                curveTo(2.0f, 9.1101f, 2.2f, 9.7501f, 2.62f, 10.1701f)
                curveTo(2.86f, 10.4201f, 3.15f, 10.5501f, 3.46f, 10.6201f)
                curveTo(3.75f, 10.6901f, 4.06f, 10.7001f, 4.36f, 10.7001f)
                horizontalLineTo(19.64f)
                curveTo(19.95f, 10.7001f, 20.24f, 10.6801f, 20.52f, 10.6201f)
                curveTo(21.36f, 10.4201f, 22.0f, 9.8201f, 22.0f, 8.1401f)
                curveTo(22.0f, 5.5801f, 20.13f, 5.5801f, 19.24f, 5.5801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.6509f, 10.7001f)
                horizontalLineTo(4.3609f)
                curveTo(4.0609f, 10.7001f, 3.7509f, 10.6901f, 3.4609f, 10.6201f)
                lineTo(4.7209f, 18.3001f)
                curveTo(5.0009f, 20.0201f, 5.7509f, 22.0001f, 9.0809f, 22.0001f)
                horizontalLineTo(14.6909f)
                curveTo(18.0609f, 22.0001f, 18.6609f, 20.3101f, 19.0209f, 18.4201f)
                lineTo(20.5309f, 10.6201f)
                curveTo(20.2509f, 10.6801f, 19.9509f, 10.7001f, 19.6509f, 10.7001f)
                close()
                moveTo(10.6109f, 17.1601f)
                curveTo(10.6109f, 17.5501f, 10.3009f, 17.8601f, 9.9109f, 17.8601f)
                curveTo(9.5209f, 17.8601f, 9.2109f, 17.5501f, 9.2109f, 17.1601f)
                verticalLineTo(13.8601f)
                curveTo(9.2109f, 13.4701f, 9.5209f, 13.1601f, 9.9109f, 13.1601f)
                curveTo(10.3009f, 13.1601f, 10.6109f, 13.4701f, 10.6109f, 13.8601f)
                verticalLineTo(17.1601f)
                close()
                moveTo(14.8909f, 17.1601f)
                curveTo(14.8909f, 17.5501f, 14.5809f, 17.8601f, 14.1909f, 17.8601f)
                curveTo(13.8009f, 17.8601f, 13.4909f, 17.5501f, 13.4909f, 17.1601f)
                verticalLineTo(13.8601f)
                curveTo(13.4909f, 13.4701f, 13.8009f, 13.1601f, 14.1909f, 13.1601f)
                curveTo(14.5809f, 13.1601f, 14.8909f, 13.4701f, 14.8909f, 13.8601f)
                verticalLineTo(17.1601f)
                close()
            }
        }
        .build()
        return _bag!!
    }

private var _bag: ImageVector? = null

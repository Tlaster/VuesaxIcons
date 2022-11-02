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

public val BulkGroup.Bagtick: ImageVector
    get() {
        if (_bagtick != null) {
            return _bagtick!!
        }
        _bagtick = Builder(name = "Bagtick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(19.6609f, 10.7001f)
                horizontalLineTo(4.3609f)
                curveTo(4.0709f, 10.7001f, 3.7509f, 10.6901f, 3.4609f, 10.6101f)
                lineTo(4.7209f, 18.3001f)
                curveTo(5.0109f, 20.0201f, 5.7609f, 22.0001f, 9.0909f, 22.0001f)
                horizontalLineTo(14.7009f)
                curveTo(18.0709f, 22.0001f, 18.6709f, 20.3101f, 19.0309f, 18.4201f)
                lineTo(20.5409f, 10.6101f)
                curveTo(20.2609f, 10.6801f, 19.9609f, 10.7001f, 19.6609f, 10.7001f)
                close()
                moveTo(14.8809f, 15.0501f)
                lineTo(11.6309f, 18.0501f)
                curveTo(11.4909f, 18.1801f, 11.3009f, 18.2501f, 11.1209f, 18.2501f)
                curveTo(10.9309f, 18.2501f, 10.7409f, 18.1801f, 10.5909f, 18.0301f)
                lineTo(9.0909f, 16.5301f)
                curveTo(8.8009f, 16.2401f, 8.8009f, 15.7601f, 9.0909f, 15.4701f)
                curveTo(9.3809f, 15.1801f, 9.8609f, 15.1801f, 10.1509f, 15.4701f)
                lineTo(11.1409f, 16.4601f)
                lineTo(13.8609f, 13.9501f)
                curveTo(14.1609f, 13.6701f, 14.6409f, 13.6901f, 14.9209f, 13.9901f)
                curveTo(15.2109f, 14.3001f, 15.1909f, 14.7701f, 14.8809f, 15.0501f)
                close()
            }
        }
        .build()
        return _bagtick!!
    }

private var _bagtick: ImageVector? = null

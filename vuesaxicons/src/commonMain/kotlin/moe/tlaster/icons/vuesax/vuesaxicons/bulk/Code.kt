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

public val BulkGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(6.8909f, 15.75f)
                curveTo(6.6109f, 15.75f, 6.3509f, 15.6f, 6.2209f, 15.34f)
                curveTo(6.0309f, 14.97f, 6.1809f, 14.52f, 6.5609f, 14.33f)
                curveTo(7.4309f, 13.9f, 8.1709f, 13.24f, 8.7009f, 12.44f)
                curveTo(8.8809f, 12.17f, 8.8809f, 11.83f, 8.7009f, 11.56f)
                curveTo(8.1609f, 10.76f, 7.4209f, 10.1f, 6.5609f, 9.67f)
                curveTo(6.1809f, 9.49f, 6.0309f, 9.04f, 6.2209f, 8.66f)
                curveTo(6.4009f, 8.29f, 6.8509f, 8.14f, 7.2209f, 8.33f)
                curveTo(8.3209f, 8.88f, 9.2609f, 9.71f, 9.9409f, 10.73f)
                curveTo(10.4509f, 11.5f, 10.4509f, 12.5f, 9.9409f, 13.27f)
                curveTo(9.2609f, 14.29f, 8.3209f, 15.12f, 7.2209f, 15.67f)
                curveTo(7.1209f, 15.72f, 7.0009f, 15.75f, 6.8909f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.75f)
                horizontalLineTo(13.0f)
                curveTo(12.59f, 15.75f, 12.25f, 15.41f, 12.25f, 15.0f)
                curveTo(12.25f, 14.59f, 12.59f, 14.25f, 13.0f, 14.25f)
                horizontalLineTo(17.0f)
                curveTo(17.41f, 14.25f, 17.75f, 14.59f, 17.75f, 15.0f)
                curveTo(17.75f, 15.41f, 17.41f, 15.75f, 17.0f, 15.75f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null

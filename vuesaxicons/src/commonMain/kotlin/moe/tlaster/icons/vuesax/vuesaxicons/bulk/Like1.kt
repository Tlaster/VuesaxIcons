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

public val BulkGroup.Like1: ImageVector
    get() {
        if (_like1 != null) {
            return _like1!!
        }
        _like1 = Builder(name = "Like1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.6509f, 10.03f)
                curveTo(21.2609f, 9.47f, 20.5709f, 9.15f, 19.7809f, 9.15f)
                horizontalLineTo(15.6809f)
                curveTo(15.4109f, 9.15f, 15.1609f, 9.04f, 14.9909f, 8.84f)
                curveTo(14.8109f, 8.64f, 14.7409f, 8.36f, 14.7809f, 8.07f)
                lineTo(15.2909f, 4.79f)
                curveTo(15.5109f, 3.81f, 14.8609f, 2.71f, 13.8809f, 2.38f)
                curveTo(12.9709f, 2.04f, 11.9009f, 2.5f, 11.4709f, 3.15f)
                lineTo(7.2509f, 9.42f)
                lineTo(7.1309f, 9.62f)
                verticalLineTo(18.46f)
                lineTo(7.2809f, 18.61f)
                lineTo(10.4509f, 21.06f)
                curveTo(10.8709f, 21.48f, 11.8209f, 21.71f, 12.4909f, 21.71f)
                horizontalLineTo(16.3909f)
                curveTo(17.7309f, 21.71f, 19.0809f, 20.7f, 19.3809f, 19.47f)
                lineTo(21.8409f, 11.98f)
                curveTo(22.1009f, 11.27f, 22.0309f, 10.58f, 21.6509f, 10.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.21f, 6.3799f)
                horizontalLineTo(4.18f)
                curveTo(2.63f, 6.3799f, 2.0f, 6.9799f, 2.0f, 8.4599f)
                verticalLineTo(18.5199f)
                curveTo(2.0f, 19.9999f, 2.63f, 20.5999f, 4.18f, 20.5999f)
                horizontalLineTo(5.21f)
                curveTo(6.76f, 20.5999f, 7.39f, 19.9999f, 7.39f, 18.5199f)
                verticalLineTo(8.4599f)
                curveTo(7.39f, 6.9799f, 6.76f, 6.3799f, 5.21f, 6.3799f)
                close()
            }
        }
        .build()
        return _like1!!
    }

private var _like1: ImageVector? = null

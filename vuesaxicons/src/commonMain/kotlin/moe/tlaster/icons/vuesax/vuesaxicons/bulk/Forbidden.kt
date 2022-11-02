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

public val BulkGroup.Forbidden: ImageVector
    get() {
        if (_forbidden != null) {
            return _forbidden!!
        }
        _forbidden = Builder(name = "Forbidden", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9f, 2.0f)
                horizontalLineTo(9.1f)
                curveTo(8.42f, 2.0f, 7.46f, 2.4f, 6.98f, 2.88f)
                lineTo(2.88f, 6.98f)
                curveTo(2.4f, 7.46f, 2.0f, 8.42f, 2.0f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2.0f, 15.58f, 2.4f, 16.54f, 2.88f, 17.02f)
                lineTo(6.98f, 21.12f)
                curveTo(7.46f, 21.6f, 8.42f, 22.0f, 9.1f, 22.0f)
                horizontalLineTo(14.9f)
                curveTo(15.58f, 22.0f, 16.54f, 21.6f, 17.02f, 21.12f)
                lineTo(21.12f, 17.02f)
                curveTo(21.6f, 16.54f, 22.0f, 15.58f, 22.0f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(22.0f, 8.42f, 21.6f, 7.46f, 21.12f, 6.98f)
                lineTo(17.02f, 2.88f)
                curveTo(16.54f, 2.4f, 15.58f, 2.0f, 14.9f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0209f, 21.75f)
                curveTo(2.8309f, 21.75f, 2.6409f, 21.68f, 2.4909f, 21.53f)
                curveTo(2.2009f, 21.24f, 2.2009f, 20.76f, 2.4909f, 20.47f)
                lineTo(20.4709f, 2.49f)
                curveTo(20.7609f, 2.2f, 21.2409f, 2.2f, 21.5309f, 2.49f)
                curveTo(21.8209f, 2.78f, 21.8209f, 3.26f, 21.5309f, 3.55f)
                lineTo(3.5509f, 21.53f)
                curveTo(3.4109f, 21.68f, 3.2209f, 21.75f, 3.0209f, 21.75f)
                close()
            }
        }
        .build()
        return _forbidden!!
    }

private var _forbidden: ImageVector? = null

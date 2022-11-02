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

public val BulkGroup.Pause: ImageVector
    get() {
        if (_pause != null) {
            return _pause!!
        }
        _pause = Builder(name = "Pause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.65f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(10.65f, 3.54f, 10.08f, 3.0f, 8.64f, 3.0f)
                horizontalLineTo(5.01f)
                curveTo(3.57f, 3.0f, 3.0f, 3.54f, 3.0f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(3.0f, 20.46f, 3.57f, 21.0f, 5.01f, 21.0f)
                horizontalLineTo(8.64f)
                curveTo(10.08f, 21.0f, 10.65f, 20.46f, 10.65f, 19.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9996f, 19.11f)
                verticalLineTo(4.89f)
                curveTo(20.9996f, 3.54f, 20.4296f, 3.0f, 18.9896f, 3.0f)
                horizontalLineTo(15.3596f)
                curveTo(13.9296f, 3.0f, 13.3496f, 3.54f, 13.3496f, 4.89f)
                verticalLineTo(19.11f)
                curveTo(13.3496f, 20.46f, 13.9196f, 21.0f, 15.3596f, 21.0f)
                horizontalLineTo(18.9896f)
                curveTo(20.4296f, 21.0f, 20.9996f, 20.46f, 20.9996f, 19.11f)
                close()
            }
        }
        .build()
        return _pause!!
    }

private var _pause: ImageVector? = null

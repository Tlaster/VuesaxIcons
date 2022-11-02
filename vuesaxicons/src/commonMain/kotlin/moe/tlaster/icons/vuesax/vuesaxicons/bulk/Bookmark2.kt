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

public val BulkGroup.Bookmark2: ImageVector
    get() {
        if (_bookmark2 != null) {
            return _bookmark2!!
        }
        _bookmark2 = Builder(name = "Bookmark2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.96f)
                verticalLineTo(12.08f)
                curveTo(17.0f, 14.07f, 15.59f, 14.84f, 13.86f, 13.8f)
                lineTo(12.54f, 13.0f)
                curveTo(12.24f, 12.82f, 11.76f, 12.82f, 11.46f, 13.0f)
                lineTo(10.14f, 13.8f)
                curveTo(8.41f, 14.84f, 7.0f, 14.07f, 7.0f, 12.08f)
                verticalLineTo(4.99f)
                curveTo(7.01f, 3.0f, 8.01f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                curveTo(15.98f, 2.0f, 16.98f, 2.99f, 17.0f, 4.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 11.9f)
                verticalLineTo(14.93f)
                curveTo(22.0f, 19.98f, 20.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 19.98f, 2.0f, 14.93f)
                verticalLineTo(11.9f)
                curveTo(2.0f, 7.66f, 3.41f, 5.56f, 6.82f, 4.99f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.08f)
                curveTo(7.0f, 14.07f, 8.41f, 14.84f, 10.14f, 13.8f)
                lineTo(11.46f, 13.0f)
                curveTo(11.76f, 12.82f, 12.24f, 12.82f, 12.54f, 13.0f)
                lineTo(13.86f, 13.8f)
                curveTo(15.59f, 14.84f, 17.0f, 14.07f, 17.0f, 12.08f)
                verticalLineTo(4.96f)
                curveTo(20.54f, 5.48f, 22.0f, 7.59f, 22.0f, 11.9f)
                close()
            }
        }
        .build()
        return _bookmark2!!
    }

private var _bookmark2: ImageVector? = null

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

public val BulkGroup.Shapes1: ImageVector
    get() {
        if (_shapes1 != null) {
            return _shapes1!!
        }
        _shapes1 = Builder(name = "Shapes1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.75f, 7.0f)
                horizontalLineTo(11.0f)
                horizontalLineTo(7.0f)
                curveTo(4.24f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 19.76f, 4.24f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(12.0f)
                curveTo(14.76f, 22.0f, 17.0f, 19.76f, 17.0f, 17.0f)
                verticalLineTo(13.0f)
                verticalLineTo(12.25f)
                curveTo(17.0f, 9.35f, 14.65f, 7.0f, 11.75f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4993f, 2.0f)
                curveTo(13.6293f, 2.0f, 11.2793f, 4.2f, 11.0293f, 7.0f)
                horizontalLineTo(11.7493f)
                curveTo(14.6493f, 7.0f, 16.9993f, 9.35f, 16.9993f, 12.25f)
                verticalLineTo(12.97f)
                curveTo(19.7993f, 12.72f, 21.9993f, 10.36f, 21.9993f, 7.5f)
                curveTo(21.9993f, 4.46f, 19.5393f, 2.0f, 16.4993f, 2.0f)
                close()
            }
        }
        .build()
        return _shapes1!!
    }

private var _shapes1: ImageVector? = null

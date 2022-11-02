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

public val BulkGroup.Element1: ImageVector
    get() {
        if (_element1 != null) {
            return _element1!!
        }
        _element1 = Builder(name = "Element1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(11.0f, 2.6f, 10.36f, 2.0f, 8.77f, 2.0f)
                horizontalLineTo(4.73f)
                curveTo(3.14f, 2.0f, 2.5f, 2.6f, 2.5f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.5f, 21.4f, 3.14f, 22.0f, 4.73f, 22.0f)
                horizontalLineTo(8.77f)
                curveTo(10.36f, 22.0f, 11.0f, 21.4f, 11.0f, 19.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5f, 10.9f)
                verticalLineTo(4.1f)
                curveTo(21.5f, 2.6f, 20.86f, 2.0f, 19.27f, 2.0f)
                horizontalLineTo(15.23f)
                curveTo(13.64f, 2.0f, 13.0f, 2.6f, 13.0f, 4.1f)
                verticalLineTo(10.9f)
                curveTo(13.0f, 12.4f, 13.64f, 13.0f, 15.23f, 13.0f)
                horizontalLineTo(19.27f)
                curveTo(20.86f, 13.0f, 21.5f, 12.4f, 21.5f, 10.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.5f, 19.9f)
                verticalLineTo(17.1f)
                curveTo(21.5f, 15.6f, 20.86f, 15.0f, 19.27f, 15.0f)
                horizontalLineTo(15.23f)
                curveTo(13.64f, 15.0f, 13.0f, 15.6f, 13.0f, 17.1f)
                verticalLineTo(19.9f)
                curveTo(13.0f, 21.4f, 13.64f, 22.0f, 15.23f, 22.0f)
                horizontalLineTo(19.27f)
                curveTo(20.86f, 22.0f, 21.5f, 21.4f, 21.5f, 19.9f)
                close()
            }
        }
        .build()
        return _element1!!
    }

private var _element1: ImageVector? = null

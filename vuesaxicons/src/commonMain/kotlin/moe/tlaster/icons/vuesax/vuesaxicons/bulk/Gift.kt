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

public val BulkGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9707f, 10.0f)
                verticalLineTo(18.0f)
                curveTo(19.9707f, 21.0f, 18.9707f, 22.0f, 15.9707f, 22.0f)
                horizontalLineTo(7.9707f)
                curveTo(4.9707f, 22.0f, 3.9707f, 21.0f, 3.9707f, 18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.9707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(21.5f, 9.1f, 20.97f, 10.0f, 19.5f, 10.0f)
                horizontalLineTo(4.5f)
                curveTo(2.97f, 10.0f, 2.5f, 9.1f, 2.5f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(2.5f, 5.9f, 2.97f, 5.0f, 4.5f, 5.0f)
                horizontalLineTo(19.5f)
                curveTo(20.97f, 5.0f, 21.5f, 5.9f, 21.5f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.6408f, 4.9999f)
                horizontalLineTo(6.1208f)
                curveTo(5.7808f, 4.6299f, 5.7908f, 4.0599f, 6.1508f, 3.6999f)
                lineTo(7.5708f, 2.2799f)
                curveTo(7.9408f, 1.9099f, 8.5508f, 1.9099f, 8.9208f, 2.2799f)
                lineTo(11.6408f, 4.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8696f, 4.9999f)
                horizontalLineTo(12.3496f)
                lineTo(15.0696f, 2.2799f)
                curveTo(15.4396f, 1.9099f, 16.0496f, 1.9099f, 16.4196f, 2.2799f)
                lineTo(17.8396f, 3.6999f)
                curveTo(18.1996f, 4.0599f, 18.2096f, 4.6299f, 17.8696f, 4.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.9395f, 10.0f)
                verticalLineTo(15.14f)
                curveTo(8.9395f, 15.94f, 9.8195f, 16.41f, 10.4895f, 15.98f)
                lineTo(11.4295f, 15.36f)
                curveTo(11.7695f, 15.14f, 12.1995f, 15.14f, 12.5295f, 15.36f)
                lineTo(13.4195f, 15.96f)
                curveTo(14.0795f, 16.4f, 14.9695f, 15.93f, 14.9695f, 15.13f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.9395f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null

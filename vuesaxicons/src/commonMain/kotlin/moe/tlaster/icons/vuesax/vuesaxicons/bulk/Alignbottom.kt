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

public val BulkGroup.Alignbottom: ImageVector
    get() {
        if (_alignbottom != null) {
            return _alignbottom!!
        }
        _alignbottom = Builder(name = "Alignbottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.98f, 19.3799f)
                horizontalLineTo(17.02f)
                curveTo(18.61f, 19.3799f, 19.25f, 18.7799f, 19.25f, 17.2599f)
                verticalLineTo(5.3799f)
                horizontalLineTo(13.75f)
                verticalLineTo(17.2599f)
                curveTo(13.76f, 18.7799f, 14.4f, 19.3799f, 15.98f, 19.3799f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.48f, 14.3799f)
                horizontalLineTo(8.52f)
                curveTo(10.11f, 14.3799f, 10.75f, 13.7699f, 10.75f, 12.2599f)
                verticalLineTo(5.3799f)
                horizontalLineTo(5.25f)
                verticalLineTo(12.2599f)
                curveTo(5.26f, 13.7699f, 5.9f, 14.3799f, 7.48f, 14.3799f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 6.1199f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 6.1199f, 2.0f, 5.7899f, 2.0f, 5.3799f)
                curveTo(2.0f, 4.9699f, 2.34f, 4.6299f, 2.75f, 4.6299f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 4.6299f, 22.0f, 4.9699f, 22.0f, 5.3799f)
                curveTo(22.0f, 5.7899f, 21.66f, 6.1199f, 21.25f, 6.1199f)
                close()
            }
        }
        .build()
        return _alignbottom!!
    }

private var _alignbottom: ImageVector? = null

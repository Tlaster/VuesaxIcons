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

public val BulkGroup.Alignleft: ImageVector
    get() {
        if (_alignleft != null) {
            return _alignleft!!
        }
        _alignleft = Builder(name = "Alignleft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3809f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(19.3809f, 18.61f, 18.7809f, 19.25f, 17.2609f, 19.25f)
                horizontalLineTo(5.3809f)
                verticalLineTo(13.75f)
                horizontalLineTo(17.2609f)
                curveTo(18.7809f, 13.75f, 19.3809f, 14.39f, 19.3809f, 15.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.3809f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(14.3809f, 10.11f, 13.7709f, 10.75f, 12.2609f, 10.75f)
                horizontalLineTo(5.3809f)
                verticalLineTo(5.25f)
                horizontalLineTo(12.2609f)
                curveTo(13.7709f, 5.25f, 14.3809f, 5.89f, 14.3809f, 7.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3791f, 22.0f)
                curveTo(4.9691f, 22.0f, 4.6291f, 21.66f, 4.6291f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(4.6191f, 2.33f, 4.9591f, 2.0f, 5.3791f, 2.0f)
                curveTo(5.7991f, 2.0f, 6.1291f, 2.34f, 6.1291f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(6.1191f, 21.66f, 5.7891f, 22.0f, 5.3791f, 22.0f)
                close()
            }
        }
        .build()
        return _alignleft!!
    }

private var _alignleft: ImageVector? = null

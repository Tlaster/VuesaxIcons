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

public val BulkGroup.Alignright: ImageVector
    get() {
        if (_alignright != null) {
            return _alignright!!
        }
        _alignright = Builder(name = "Alignright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6191f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(4.6191f, 18.61f, 5.2191f, 19.25f, 6.7391f, 19.25f)
                horizontalLineTo(18.6191f)
                verticalLineTo(13.75f)
                horizontalLineTo(6.7391f)
                curveTo(5.2191f, 13.75f, 4.6191f, 14.39f, 4.6191f, 15.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6191f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(9.6191f, 10.11f, 10.2291f, 10.75f, 11.7391f, 10.75f)
                horizontalLineTo(18.6191f)
                verticalLineTo(5.25f)
                horizontalLineTo(11.7391f)
                curveTo(10.2291f, 5.25f, 9.6191f, 5.89f, 9.6191f, 7.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6191f, 22.0f)
                curveTo(18.2091f, 22.0f, 17.8691f, 21.66f, 17.8691f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(17.8691f, 2.34f, 18.2091f, 2.0f, 18.6191f, 2.0f)
                curveTo(19.0291f, 2.0f, 19.3691f, 2.34f, 19.3691f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(19.3791f, 21.66f, 19.0391f, 22.0f, 18.6191f, 22.0f)
                close()
            }
        }
        .build()
        return _alignright!!
    }

private var _alignright: ImageVector? = null

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

public val BulkGroup.Arrowleft3: ImageVector
    get() {
        if (_arrowleft3 != null) {
            return _arrowleft3!!
        }
        _arrowleft3 = Builder(name = "Arrowleft3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.7702f, 8.52f)
                lineTo(15.8202f, 12.31f)
                verticalLineTo(17.92f)
                curveTo(15.8202f, 18.88f, 14.6602f, 19.36f, 13.9802f, 18.68f)
                lineTo(8.8002f, 13.51f)
                curveTo(7.9702f, 12.68f, 7.9702f, 11.33f, 8.8002f, 10.5f)
                lineTo(10.7702f, 8.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8195f, 6.0799f)
                verticalLineTo(12.3099f)
                lineTo(10.7695f, 8.5199f)
                lineTo(13.9795f, 5.3099f)
                curveTo(14.6595f, 4.6399f, 15.8195f, 5.1199f, 15.8195f, 6.0799f)
                close()
            }
        }
        .build()
        return _arrowleft3!!
    }

private var _arrowleft3: ImageVector? = null

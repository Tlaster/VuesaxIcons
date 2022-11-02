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

public val BulkGroup.Arrowright3: ImageVector
    get() {
        if (_arrowright3 != null) {
            return _arrowright3!!
        }
        _arrowright3 = Builder(name = "Arrowright3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.2297f, 8.52f)
                lineTo(8.1797f, 12.31f)
                verticalLineTo(17.92f)
                curveTo(8.1797f, 18.88f, 9.3397f, 19.36f, 10.0197f, 18.68f)
                lineTo(15.1997f, 13.5f)
                curveTo(16.0297f, 12.67f, 16.0297f, 11.32f, 15.1997f, 10.49f)
                lineTo(13.2297f, 8.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1797f, 6.0799f)
                verticalLineTo(12.3099f)
                lineTo(13.2297f, 8.5199f)
                lineTo(10.0197f, 5.3099f)
                curveTo(9.3397f, 4.6399f, 8.1797f, 5.1199f, 8.1797f, 6.0799f)
                close()
            }
        }
        .build()
        return _arrowright3!!
    }

private var _arrowright3: ImageVector? = null

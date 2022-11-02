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

public val BulkGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7f, 8.9799f)
                lineTo(4.14f, 17.7099f)
                curveTo(4.05f, 17.3799f, 4.0f, 17.0299f, 4.0f, 16.6699f)
                verticalLineTo(7.3299f)
                curveTo(4.0f, 4.2499f, 7.33f, 2.3299f, 10.0f, 3.8699f)
                lineTo(14.04f, 6.1999f)
                lineTo(18.09f, 8.5399f)
                curveTo(18.31f, 8.6699f, 18.52f, 8.8099f, 18.7f, 8.9799f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0907f, 15.4598f)
                lineTo(14.0407f, 17.7998f)
                lineTo(10.0007f, 20.1298f)
                curveTo(8.0907f, 21.2298f, 5.8407f, 20.5698f, 4.7207f, 18.9598f)
                lineTo(5.1407f, 18.7098f)
                lineTo(19.5807f, 10.0498f)
                curveTo(20.5807f, 11.8498f, 20.0907f, 14.3098f, 18.0907f, 15.4598f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null

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

public val BulkGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.6499f)
                verticalLineTo(16.3499f)
                curveTo(18.5f, 19.4699f, 15.59f, 21.9999f, 12.0f, 21.9999f)
                curveTo(8.41f, 21.9999f, 5.5f, 19.4699f, 5.5f, 16.3499f)
                verticalLineTo(12.6499f)
                curveTo(5.5f, 15.7699f, 8.41f, 17.9999f, 12.0f, 17.9999f)
                curveTo(15.59f, 17.9999f, 18.5f, 15.7699f, 18.5f, 12.6499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 7.6499f)
                verticalLineTo(12.6499f)
                curveTo(18.5f, 15.7699f, 15.59f, 17.9999f, 12.0f, 17.9999f)
                curveTo(8.41f, 17.9999f, 5.5f, 15.7699f, 5.5f, 12.6499f)
                verticalLineTo(7.6499f)
                curveTo(5.5f, 8.5599f, 5.75f, 9.3999f, 6.19f, 10.1199f)
                curveTo(7.26f, 11.8799f, 9.46f, 12.9999f, 12.0f, 12.9999f)
                curveTo(14.54f, 12.9999f, 16.74f, 11.8799f, 17.81f, 10.1199f)
                curveTo(18.25f, 9.3999f, 18.5f, 8.5599f, 18.5f, 7.6499f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 7.65f)
                curveTo(18.5f, 8.56f, 18.25f, 9.4f, 17.81f, 10.12f)
                curveTo(16.74f, 11.88f, 14.54f, 13.0f, 12.0f, 13.0f)
                curveTo(9.46f, 13.0f, 7.26f, 11.88f, 6.19f, 10.12f)
                curveTo(5.75f, 9.4f, 5.5f, 8.56f, 5.5f, 7.65f)
                curveTo(5.5f, 4.53f, 8.41f, 2.0f, 12.0f, 2.0f)
                curveTo(13.8f, 2.0f, 15.42f, 2.63f, 16.6f, 3.65f)
                curveTo(17.77f, 4.68f, 18.5f, 6.09f, 18.5f, 7.65f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null

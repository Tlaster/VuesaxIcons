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

public val BulkGroup.Home2: ImageVector
    get() {
        if (_home2 != null) {
            return _home2!!
        }
        _home2 = Builder(name = "Home2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0402f, 6.8199f)
                lineTo(14.2802f, 2.7899f)
                curveTo(12.7102f, 1.6899f, 10.3002f, 1.7499f, 8.7902f, 2.9199f)
                lineTo(3.7802f, 6.8299f)
                curveTo(2.7802f, 7.6099f, 1.9902f, 9.2099f, 1.9902f, 10.4699f)
                verticalLineTo(17.3699f)
                curveTo(1.9902f, 19.9199f, 4.0602f, 21.9999f, 6.6102f, 21.9999f)
                horizontalLineTo(17.3902f)
                curveTo(19.9402f, 21.9999f, 22.0102f, 19.9299f, 22.0102f, 17.3799f)
                verticalLineTo(10.5999f)
                curveTo(22.0102f, 9.2499f, 21.1402f, 7.5899f, 20.0402f, 6.8199f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.75f)
                curveTo(11.59f, 18.75f, 11.25f, 18.41f, 11.25f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(11.25f, 14.59f, 11.59f, 14.25f, 12.0f, 14.25f)
                curveTo(12.41f, 14.25f, 12.75f, 14.59f, 12.75f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.41f, 12.41f, 18.75f, 12.0f, 18.75f)
                close()
            }
        }
        .build()
        return _home2!!
    }

private var _home2: ImageVector? = null

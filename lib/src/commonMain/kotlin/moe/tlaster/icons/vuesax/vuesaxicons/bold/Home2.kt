package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Home2: ImageVector
    get() {
        if (_home2 != null) {
            return _home2!!
        }
        _home2 = Builder(name = "Home2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0402f, 6.8217f)
                lineTo(14.2802f, 2.7917f)
                curveTo(12.7102f, 1.6917f, 10.3002f, 1.7516f, 8.7902f, 2.9216f)
                lineTo(3.7802f, 6.8316f)
                curveTo(2.7802f, 7.6116f, 1.9902f, 9.2116f, 1.9902f, 10.4716f)
                verticalLineTo(17.3716f)
                curveTo(1.9902f, 19.9216f, 4.0602f, 22.0016f, 6.6102f, 22.0016f)
                horizontalLineTo(17.3902f)
                curveTo(19.9402f, 22.0016f, 22.0102f, 19.9316f, 22.0102f, 17.3816f)
                verticalLineTo(10.6016f)
                curveTo(22.0102f, 9.2516f, 21.1402f, 7.5917f, 20.0402f, 6.8217f)
                close()
                moveTo(12.7502f, 18.0016f)
                curveTo(12.7502f, 18.4116f, 12.4102f, 18.7516f, 12.0002f, 18.7516f)
                curveTo(11.5902f, 18.7516f, 11.2502f, 18.4116f, 11.2502f, 18.0016f)
                verticalLineTo(15.0016f)
                curveTo(11.2502f, 14.5916f, 11.5902f, 14.2516f, 12.0002f, 14.2516f)
                curveTo(12.4102f, 14.2516f, 12.7502f, 14.5916f, 12.7502f, 15.0016f)
                verticalLineTo(18.0016f)
                close()
            }
        }
        .build()
        return _home2!!
    }

private var _home2: ImageVector? = null

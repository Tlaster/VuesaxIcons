package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5992f, 15.7799f)
                curveTo(9.4092f, 15.7799f, 9.2192f, 15.7099f, 9.0692f, 15.5599f)
                lineTo(6.5792f, 13.0699f)
                curveTo(5.9892f, 12.4799f, 5.9892f, 11.5299f, 6.5792f, 10.9399f)
                lineTo(9.0692f, 8.4499f)
                curveTo(9.3592f, 8.1599f, 9.8392f, 8.1599f, 10.1292f, 8.4499f)
                curveTo(10.4192f, 8.7399f, 10.4192f, 9.2199f, 10.1292f, 9.5099f)
                lineTo(7.6392f, 11.9999f)
                lineTo(10.1292f, 14.4999f)
                curveTo(10.4192f, 14.7899f, 10.4192f, 15.2699f, 10.1292f, 15.5599f)
                curveTo(9.9792f, 15.6999f, 9.7892f, 15.7799f, 9.5992f, 15.7799f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.3998f, 15.7802f)
                curveTo(14.2098f, 15.7802f, 14.0198f, 15.7102f, 13.8698f, 15.5602f)
                curveTo(13.5798f, 15.2702f, 13.5798f, 14.7902f, 13.8698f, 14.5002f)
                lineTo(16.3598f, 12.0002f)
                lineTo(13.8698f, 9.5002f)
                curveTo(13.5798f, 9.2102f, 13.5798f, 8.7302f, 13.8698f, 8.4402f)
                curveTo(14.1598f, 8.1502f, 14.6398f, 8.1502f, 14.9298f, 8.4402f)
                lineTo(17.4198f, 10.9302f)
                curveTo(18.0098f, 11.5202f, 18.0098f, 12.4702f, 17.4198f, 13.0602f)
                lineTo(14.9298f, 15.5502f)
                curveTo(14.7898f, 15.7002f, 14.5898f, 15.7802f, 14.3998f, 15.7802f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null

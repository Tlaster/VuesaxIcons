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

public val OutlineGroup.Health: ImageVector
    get() {
        if (_health != null) {
            return _health!!
        }
        _health = Builder(name = "Health", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9697f, 22.75f)
                horizontalLineTo(8.9697f)
                curveTo(3.5397f, 22.75f, 1.2197f, 20.43f, 1.2197f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(1.2197f, 3.57f, 3.5397f, 1.25f, 8.9697f, 1.25f)
                horizontalLineTo(14.9697f)
                curveTo(20.3997f, 1.25f, 22.7197f, 3.57f, 22.7197f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.7197f, 20.43f, 20.4097f, 22.75f, 14.9697f, 22.75f)
                close()
                moveTo(8.9697f, 2.75f)
                curveTo(4.3597f, 2.75f, 2.7197f, 4.39f, 2.7197f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.7197f, 19.61f, 4.3597f, 21.25f, 8.9697f, 21.25f)
                horizontalLineTo(14.9697f)
                curveTo(19.5797f, 21.25f, 21.2197f, 19.61f, 21.2197f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(21.2197f, 4.39f, 19.5797f, 2.75f, 14.9697f, 2.75f)
                horizontalLineTo(8.9697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4502f, 18.0599f)
                curveTo(11.2102f, 18.0599f, 10.6302f, 17.9699f, 10.2902f, 17.0999f)
                lineTo(9.1502f, 14.2199f)
                curveTo(8.9902f, 13.8099f, 8.4202f, 13.4299f, 7.9902f, 13.4299f)
                lineTo(1.9902f, 13.4499f)
                curveTo(1.5802f, 13.4499f, 1.2402f, 13.1199f, 1.2402f, 12.6999f)
                curveTo(1.2402f, 12.2899f, 1.5702f, 11.9499f, 1.9902f, 11.9499f)
                lineTo(7.9902f, 11.9299f)
                horizontalLineTo(8.0002f)
                curveTo(9.0502f, 11.9299f, 10.1702f, 12.6899f, 10.5602f, 13.6699f)
                lineTo(11.4702f, 15.9699f)
                lineTo(13.5302f, 10.7499f)
                curveTo(13.8402f, 9.9699f, 14.3902f, 9.8599f, 14.6202f, 9.8399f)
                curveTo(14.8502f, 9.8299f, 15.4102f, 9.8799f, 15.8002f, 10.6199f)
                lineTo(16.8402f, 12.5899f)
                curveTo(17.0202f, 12.9299f, 17.5602f, 13.2599f, 17.9502f, 13.2599f)
                horizontalLineTo(22.0102f)
                curveTo(22.4202f, 13.2599f, 22.7602f, 13.5999f, 22.7602f, 14.0099f)
                curveTo(22.7602f, 14.4199f, 22.4202f, 14.7599f, 22.0102f, 14.7599f)
                horizontalLineTo(17.9502f)
                curveTo(17.0002f, 14.7599f, 15.9602f, 14.1299f, 15.5202f, 13.2899f)
                lineTo(14.7402f, 11.8099f)
                lineTo(12.6402f, 17.0999f)
                curveTo(12.2702f, 17.9599f, 11.6802f, 18.0599f, 11.4502f, 18.0599f)
                close()
            }
        }
        .build()
        return _health!!
    }

private var _health: ImageVector? = null

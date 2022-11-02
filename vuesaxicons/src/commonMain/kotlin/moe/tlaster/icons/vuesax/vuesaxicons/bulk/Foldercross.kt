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

public val BulkGroup.Foldercross: ImageVector
    get() {
        if (_foldercross != null) {
            return _foldercross!!
        }
        _foldercross = Builder(name = "Foldercross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.8709f, 9.44f)
                horizontalLineTo(2.1309f)
                verticalLineTo(6.42f)
                curveTo(2.1309f, 3.98f, 4.1109f, 2.0f, 6.5509f, 2.0f)
                horizontalLineTo(8.8809f)
                curveTo(10.5109f, 2.0f, 11.0209f, 2.53f, 11.6709f, 3.4f)
                lineTo(13.0709f, 5.26f)
                curveTo(13.3809f, 5.67f, 13.4209f, 5.73f, 14.0009f, 5.73f)
                horizontalLineTo(16.7909f)
                curveTo(19.1609f, 5.72f, 21.1809f, 7.28f, 21.8709f, 9.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.99f, 10.8399f)
                curveTo(21.97f, 10.3599f, 21.89f, 9.8899f, 21.74f, 9.4399f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.6499f)
                curveTo(2.0f, 19.5999f, 4.4f, 21.9999f, 7.35f, 21.9999f)
                horizontalLineTo(16.65f)
                curveTo(19.6f, 21.9999f, 22.0f, 19.5999f, 22.0f, 16.6499f)
                verticalLineTo(11.0699f)
                curveTo(22.0f, 10.9999f, 22.0f, 10.9099f, 21.99f, 10.8399f)
                close()
                moveTo(14.34f, 17.7799f)
                curveTo(14.19f, 17.9199f, 14.0f, 17.9999f, 13.81f, 17.9999f)
                curveTo(13.62f, 17.9999f, 13.43f, 17.9299f, 13.28f, 17.7799f)
                lineTo(12.04f, 16.5399f)
                lineTo(10.76f, 17.8199f)
                curveTo(10.61f, 17.9699f, 10.42f, 18.0399f, 10.23f, 18.0399f)
                curveTo(10.04f, 18.0399f, 9.85f, 17.9699f, 9.7f, 17.8199f)
                curveTo(9.41f, 17.5299f, 9.41f, 17.0499f, 9.7f, 16.7599f)
                lineTo(10.98f, 15.4799f)
                lineTo(9.74f, 14.2399f)
                curveTo(9.45f, 13.9499f, 9.45f, 13.4699f, 9.74f, 13.1799f)
                curveTo(10.03f, 12.8899f, 10.51f, 12.8899f, 10.8f, 13.1799f)
                lineTo(12.04f, 14.4199f)
                lineTo(13.24f, 13.2199f)
                curveTo(13.53f, 12.9299f, 14.01f, 12.9299f, 14.3f, 13.2199f)
                curveTo(14.59f, 13.5099f, 14.59f, 13.9899f, 14.3f, 14.2799f)
                lineTo(13.1f, 15.4799f)
                lineTo(14.34f, 16.7199f)
                curveTo(14.63f, 17.0099f, 14.63f, 17.4899f, 14.34f, 17.7799f)
                close()
            }
        }
        .build()
        return _foldercross!!
    }

private var _foldercross: ImageVector? = null

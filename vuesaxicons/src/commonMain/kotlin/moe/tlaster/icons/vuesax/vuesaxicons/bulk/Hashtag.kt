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

public val BulkGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8604f, 6.6499f)
                horizontalLineTo(10.1404f)
                curveTo(8.2204f, 6.6499f, 6.6504f, 8.2099f, 6.6504f, 10.1399f)
                verticalLineTo(13.8599f)
                curveTo(6.6504f, 15.7799f, 8.2204f, 17.3499f, 10.1404f, 17.3499f)
                horizontalLineTo(13.8604f)
                curveTo(15.7804f, 17.3499f, 17.3504f, 15.7899f, 17.3504f, 13.8599f)
                verticalLineTo(10.1399f)
                curveTo(17.3504f, 8.2199f, 15.7804f, 6.6499f, 13.8604f, 6.6499f)
                close()
                moveTo(15.9504f, 10.1399f)
                verticalLineTo(11.2999f)
                horizontalLineTo(12.7004f)
                verticalLineTo(8.0499f)
                horizontalLineTo(13.8604f)
                curveTo(15.0104f, 8.0499f, 15.9504f, 8.9899f, 15.9504f, 10.1399f)
                close()
                moveTo(10.1404f, 8.0499f)
                horizontalLineTo(11.3004f)
                verticalLineTo(11.3099f)
                horizontalLineTo(8.0504f)
                verticalLineTo(10.1499f)
                curveTo(8.0504f, 8.9899f, 8.9904f, 8.0499f, 10.1404f, 8.0499f)
                close()
                moveTo(8.0504f, 13.8599f)
                verticalLineTo(12.6999f)
                horizontalLineTo(11.3104f)
                verticalLineTo(15.9599f)
                horizontalLineTo(10.1504f)
                curveTo(8.9904f, 15.9499f, 8.0504f, 15.0099f, 8.0504f, 13.8599f)
                close()
                moveTo(13.8604f, 15.9499f)
                horizontalLineTo(12.7004f)
                verticalLineTo(12.6999f)
                horizontalLineTo(15.9604f)
                verticalLineTo(13.8599f)
                curveTo(15.9504f, 15.0099f, 15.0104f, 15.9499f, 13.8604f, 15.9499f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null

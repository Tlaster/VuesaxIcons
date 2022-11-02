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

public val BulkGroup.Volumelow: ImageVector
    get() {
        if (_volumelow != null) {
            return _volumelow!!
        }
        _volumelow = Builder(name = "Volumelow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.75f)
                horizontalLineTo(18.0f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12.0f)
                curveTo(17.25f, 11.59f, 17.59f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12.0f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 7.4102f)
                verticalLineTo(16.5902f)
                curveTo(15.75f, 18.3102f, 15.13f, 19.6002f, 14.02f, 20.2202f)
                curveTo(13.57f, 20.4702f, 13.07f, 20.5902f, 12.55f, 20.5902f)
                curveTo(11.75f, 20.5902f, 10.89f, 20.3202f, 10.01f, 19.7702f)
                lineTo(7.09f, 17.9402f)
                curveTo(6.89f, 17.8202f, 6.66f, 17.7502f, 6.43f, 17.7502f)
                horizontalLineTo(5.5f)
                verticalLineTo(6.2502f)
                horizontalLineTo(6.43f)
                curveTo(6.66f, 6.2502f, 6.89f, 6.1802f, 7.09f, 6.0602f)
                lineTo(10.01f, 4.2302f)
                curveTo(11.47f, 3.3202f, 12.9f, 3.1602f, 14.02f, 3.7802f)
                curveTo(15.13f, 4.4002f, 15.75f, 5.6902f, 15.75f, 7.4102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 6.25f)
                verticalLineTo(17.75f)
                horizontalLineTo(5.0f)
                curveTo(2.58f, 17.75f, 1.25f, 16.42f, 1.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(1.25f, 7.58f, 2.58f, 6.25f, 5.0f, 6.25f)
                horizontalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _volumelow!!
    }

private var _volumelow: ImageVector? = null

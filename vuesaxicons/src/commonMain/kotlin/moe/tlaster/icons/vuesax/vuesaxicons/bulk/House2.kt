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

public val BulkGroup.House2: ImageVector
    get() {
        if (_house2 != null) {
            return _house2!!
        }
        _house2 = Builder(name = "House2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.75f, 22.0f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22.0f, 22.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22.0f)
                curveTo(1.25f, 21.58f, 1.59f, 21.25f, 2.0f, 21.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 21.25f, 22.75f, 21.58f, 22.75f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9992f, 9.9802f)
                verticalLineTo(21.2502f)
                horizontalLineTo(2.9492f)
                lineTo(2.9992f, 9.9702f)
                curveTo(2.9992f, 9.3602f, 3.2792f, 8.7802f, 3.7692f, 8.4002f)
                lineTo(10.7692f, 2.9602f)
                curveTo(11.4892f, 2.3902f, 12.5092f, 2.3902f, 13.2292f, 2.9602f)
                lineTo(20.2292f, 8.4002f)
                curveTo(20.7192f, 8.7802f, 20.9992f, 9.3602f, 20.9992f, 9.9802f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 8.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.25f, 9.75f, 7.91f, 9.75f, 7.5f)
                curveTo(9.75f, 7.09f, 10.09f, 6.75f, 10.5f, 6.75f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 6.75f, 14.25f, 7.09f, 14.25f, 7.5f)
                curveTo(14.25f, 7.91f, 13.91f, 8.25f, 13.5f, 8.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 11.0f)
                horizontalLineTo(8.5f)
                curveTo(7.67f, 11.0f, 7.0f, 11.67f, 7.0f, 12.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.5f)
                curveTo(17.0f, 11.67f, 16.33f, 11.0f, 15.5f, 11.0f)
                close()
                moveTo(10.75f, 17.75f)
                curveTo(10.75f, 18.16f, 10.41f, 18.5f, 10.0f, 18.5f)
                curveTo(9.59f, 18.5f, 9.25f, 18.16f, 9.25f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(9.25f, 15.84f, 9.59f, 15.5f, 10.0f, 15.5f)
                curveTo(10.41f, 15.5f, 10.75f, 15.84f, 10.75f, 16.25f)
                verticalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _house2!!
    }

private var _house2: ImageVector? = null

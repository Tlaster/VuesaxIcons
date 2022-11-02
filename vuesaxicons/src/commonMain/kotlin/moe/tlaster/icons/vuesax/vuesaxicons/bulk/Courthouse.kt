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

public val BulkGroup.Courthouse: ImageVector
    get() {
        if (_courthouse != null) {
            return _courthouse!!
        }
        _courthouse = Builder(name = "Courthouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.42f, 1.3802f)
                curveTo(17.21f, 1.2402f, 16.95f, 1.2102f, 16.72f, 1.3002f)
                curveTo(15.29f, 1.8702f, 13.71f, 1.8702f, 12.28f, 1.3002f)
                curveTo(12.05f, 1.2102f, 11.79f, 1.2402f, 11.58f, 1.3802f)
                curveTo(11.37f, 1.5202f, 11.25f, 1.7502f, 11.25f, 2.0002f)
                verticalLineTo(5.0002f)
                verticalLineTo(8.0002f)
                curveTo(11.25f, 8.4102f, 11.59f, 8.7502f, 12.0f, 8.7502f)
                curveTo(12.41f, 8.7502f, 12.75f, 8.4102f, 12.75f, 8.0002f)
                verticalLineTo(6.0202f)
                curveTo(13.33f, 6.1602f, 13.91f, 6.2402f, 14.5f, 6.2402f)
                curveTo(15.44f, 6.2402f, 16.38f, 6.0602f, 17.28f, 5.7002f)
                curveTo(17.56f, 5.5902f, 17.75f, 5.3102f, 17.75f, 5.0002f)
                verticalLineTo(2.0002f)
                curveTo(17.75f, 1.7502f, 17.63f, 1.5202f, 17.42f, 1.3802f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.25f)
                horizontalLineTo(20.75f)
                verticalLineTo(11.0f)
                curveTo(20.75f, 8.58f, 19.42f, 7.25f, 17.0f, 7.25f)
                horizontalLineTo(7.0f)
                curveTo(4.58f, 7.25f, 3.25f, 8.58f, 3.25f, 11.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22.0f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(4.0f)
                horizontalLineTo(20.0f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 22.75f, 22.75f, 22.41f, 22.75f, 22.0f)
                curveTo(22.75f, 21.59f, 22.41f, 21.25f, 22.0f, 21.25f)
                close()
                moveTo(19.25f, 12.75f)
                verticalLineTo(21.25f)
                horizontalLineTo(16.74f)
                verticalLineTo(12.75f)
                horizontalLineTo(19.25f)
                close()
                moveTo(11.24f, 21.25f)
                horizontalLineTo(8.74f)
                verticalLineTo(12.75f)
                horizontalLineTo(11.24f)
                verticalLineTo(21.25f)
                close()
                moveTo(12.74f, 12.75f)
                horizontalLineTo(15.24f)
                verticalLineTo(21.25f)
                horizontalLineTo(12.74f)
                verticalLineTo(12.75f)
                close()
                moveTo(4.75f, 12.75f)
                horizontalLineTo(7.24f)
                verticalLineTo(21.25f)
                horizontalLineTo(4.75f)
                verticalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _courthouse!!
    }

private var _courthouse: ImageVector? = null

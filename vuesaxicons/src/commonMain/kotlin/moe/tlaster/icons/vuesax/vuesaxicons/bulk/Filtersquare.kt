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

public val BulkGroup.Filtersquare: ImageVector
    get() {
        if (_filtersquare != null) {
            return _filtersquare!!
        }
        _filtersquare = Builder(name = "Filtersquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(22.0f, 19.83f, 19.83f, 22.0f, 16.19f, 22.0f)
                horizontalLineTo(7.81f)
                curveTo(7.61f, 22.0f, 7.41f, 21.99f, 7.22f, 21.98f)
                curveTo(5.99f, 21.9f, 4.95f, 21.55f, 4.13f, 20.95f)
                curveTo(3.71f, 20.66f, 3.34f, 20.29f, 3.05f, 19.87f)
                curveTo(2.36f, 18.92f, 2.0f, 17.68f, 2.0f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(2.0f, 4.37f, 3.94f, 2.24f, 7.22f, 2.03f)
                curveTo(7.41f, 2.01f, 7.61f, 2.0f, 7.81f, 2.0f)
                horizontalLineTo(16.19f)
                curveTo(17.68f, 2.0f, 18.92f, 2.36f, 19.87f, 3.05f)
                curveTo(20.29f, 3.34f, 20.66f, 3.71f, 20.95f, 4.13f)
                curveTo(21.64f, 5.08f, 22.0f, 6.32f, 22.0f, 7.81f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.16f, 6.6499f)
                horizontalLineTo(15.83f)
                curveTo(16.47f, 6.6499f, 16.99f, 7.1699f, 16.99f, 7.8099f)
                verticalLineTo(9.0899f)
                curveTo(16.99f, 9.5599f, 16.7f, 10.1399f, 16.41f, 10.4299f)
                lineTo(13.91f, 12.6399f)
                curveTo(13.56f, 12.9299f, 13.33f, 13.5099f, 13.33f, 13.9799f)
                verticalLineTo(16.4799f)
                curveTo(13.33f, 16.8299f, 13.1f, 17.2899f, 12.81f, 17.4699f)
                lineTo(12.0f, 17.9799f)
                curveTo(11.24f, 18.4499f, 10.2f, 17.9199f, 10.2f, 16.9899f)
                verticalLineTo(13.9099f)
                curveTo(10.2f, 13.4999f, 9.97f, 12.9799f, 9.73f, 12.6899f)
                lineTo(7.52f, 10.3599f)
                curveTo(7.23f, 10.0799f, 7.0f, 9.5499f, 7.0f, 9.1999f)
                verticalLineTo(7.8699f)
                curveTo(7.0f, 7.1699f, 7.52f, 6.6499f, 8.16f, 6.6499f)
                close()
            }
        }
        .build()
        return _filtersquare!!
    }

private var _filtersquare: ImageVector? = null

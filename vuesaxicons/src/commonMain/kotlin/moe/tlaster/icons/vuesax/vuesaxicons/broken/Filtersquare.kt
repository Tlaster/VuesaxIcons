package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Filtersquare: ImageVector
    get() {
        if (_filtersquare != null) {
            return _filtersquare!!
        }
        _filtersquare = Builder(name = "Filtersquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.92f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
        }
        .build()
        return _filtersquare!!
    }

private var _filtersquare: ImageVector? = null

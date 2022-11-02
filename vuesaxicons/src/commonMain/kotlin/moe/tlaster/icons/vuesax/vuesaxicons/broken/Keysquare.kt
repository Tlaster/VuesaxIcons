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

public val BrokenGroup.Keysquare: ImageVector
    get() {
        if (_keysquare != null) {
            return _keysquare!!
        }
        _keysquare = Builder(name = "Keysquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.97f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2792f, 13.61f)
                curveTo(15.1492f, 14.74f, 13.5292f, 15.09f, 12.0992f, 14.64f)
                lineTo(9.5092f, 17.22f)
                curveTo(9.3292f, 17.41f, 8.9592f, 17.53f, 8.6892f, 17.49f)
                lineTo(7.4892f, 17.33f)
                curveTo(7.0892f, 17.28f, 6.7292f, 16.9f, 6.6692f, 16.51f)
                lineTo(6.5092f, 15.31f)
                curveTo(6.4692f, 15.05f, 6.5992f, 14.68f, 6.7792f, 14.49f)
                lineTo(9.3592f, 11.91f)
                curveTo(8.9192f, 10.48f, 9.2592f, 8.86f, 10.3892f, 7.73f)
                curveTo(12.0092f, 6.11f, 14.6492f, 6.11f, 16.2792f, 7.73f)
                curveTo(17.8992f, 9.34f, 17.8992f, 11.98f, 16.2792f, 13.61f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4496f, 16.28f)
                lineTo(9.5996f, 15.42f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.3949f, 10.7f)
                horizontalLineTo(13.4039f)
            }
        }
        .build()
        return _keysquare!!
    }

private var _keysquare: ImageVector? = null

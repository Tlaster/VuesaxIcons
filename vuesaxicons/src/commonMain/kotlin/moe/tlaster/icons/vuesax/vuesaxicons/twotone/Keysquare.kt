package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Keysquare: ImageVector
    get() {
        if (_keysquare != null) {
            return _keysquare!!
        }
        _keysquare = Builder(name = "Keysquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2792f, 13.6096f)
                curveTo(15.1492f, 14.7396f, 13.5292f, 15.0896f, 12.0992f, 14.6396f)
                lineTo(9.5092f, 17.2196f)
                curveTo(9.3292f, 17.4096f, 8.9592f, 17.5296f, 8.6892f, 17.4896f)
                lineTo(7.4892f, 17.3296f)
                curveTo(7.0892f, 17.2796f, 6.7292f, 16.8996f, 6.6692f, 16.5096f)
                lineTo(6.5092f, 15.3096f)
                curveTo(6.4692f, 15.0496f, 6.5992f, 14.6796f, 6.7792f, 14.4896f)
                lineTo(9.3592f, 11.9096f)
                curveTo(8.9192f, 10.4796f, 9.2592f, 8.8596f, 10.3892f, 7.7297f)
                curveTo(12.0092f, 6.1097f, 14.6492f, 6.1097f, 16.2792f, 7.7297f)
                curveTo(17.8992f, 9.3397f, 17.8992f, 11.9796f, 16.2792f, 13.6096f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4496f, 16.2799f)
                lineTo(9.5996f, 15.4199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 2.0f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3949f, 10.7002f)
                horizontalLineTo(13.4039f)
            }
        }
        .build()
        return _keysquare!!
    }

private var _keysquare: ImageVector? = null

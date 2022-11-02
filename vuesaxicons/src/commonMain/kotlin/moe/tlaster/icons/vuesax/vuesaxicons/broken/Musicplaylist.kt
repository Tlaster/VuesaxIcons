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

public val BrokenGroup.Musicplaylist: ImageVector
    get() {
        if (_musicplaylist != null) {
            return _musicplaylist!!
        }
        _musicplaylist = Builder(name = "Musicplaylist", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 8.5f, 4.0f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 7.0f, 22.0f, 8.5f, 22.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 20.5f, 20.0f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.5f, 2.0f, 17.0f)
                verticalLineTo(16.17f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.5f)
                horizontalLineTo(18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 4.5f)
                horizontalLineTo(13.17f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                horizontalLineTo(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.8895f, 19.1099f)
                curveTo(9.6462f, 19.1099f, 10.2595f, 18.4965f, 10.2595f, 17.7399f)
                curveTo(10.2595f, 16.9832f, 9.6462f, 16.3699f, 8.8895f, 16.3699f)
                curveTo(8.1329f, 16.3699f, 7.5195f, 16.9832f, 7.5195f, 17.7399f)
                curveTo(7.5195f, 18.4965f, 8.1329f, 19.1099f, 8.8895f, 19.1099f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.2798f, 16.83f)
                verticalLineTo(11.4799f)
                curveTo(15.2798f, 10.3399f, 14.5698f, 10.18f, 13.8398f, 10.38f)
                lineTo(11.0997f, 11.13f)
                curveTo(10.5997f, 11.27f, 10.2598f, 11.6599f, 10.2598f, 12.2299f)
                verticalLineTo(13.18f)
                verticalLineTo(13.82f)
                verticalLineTo(17.74f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.9091f, 18.2f)
                curveTo(14.6657f, 18.2f, 15.2791f, 17.5866f, 15.2791f, 16.83f)
                curveTo(15.2791f, 16.0733f, 14.6657f, 15.46f, 13.9091f, 15.46f)
                curveTo(13.1524f, 15.46f, 12.5391f, 16.0733f, 12.5391f, 16.83f)
                curveTo(12.5391f, 17.5866f, 13.1524f, 18.2f, 13.9091f, 18.2f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.2598f, 13.83f)
                lineTo(15.2798f, 12.46f)
            }
        }
        .build()
        return _musicplaylist!!
    }

private var _musicplaylist: ImageVector? = null

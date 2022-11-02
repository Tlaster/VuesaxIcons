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

public val BrokenGroup.Boxtime: ImageVector
    get() {
        if (_boxtime != null) {
            return _boxtime!!
        }
        _boxtime = Builder(name = "Boxtime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1699f, 7.4399f)
                lineTo(11.9999f, 12.5499f)
                lineTo(20.7699f, 7.4699f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.61f)
                verticalLineTo(12.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.3906f, 14.83f)
                verticalLineTo(9.17f)
                curveTo(2.3906f, 7.79f, 3.3806f, 6.11f, 4.5906f, 5.44f)
                lineTo(9.9306f, 2.48f)
                curveTo(11.0706f, 1.84f, 12.9306f, 1.84f, 14.0706f, 2.48f)
                lineTo(19.4106f, 5.44f)
                curveTo(20.6206f, 6.11f, 21.6106f, 7.79f, 21.6106f, 9.17f)
                verticalLineTo(14.83f)
                curveTo(21.6106f, 14.88f, 21.6106f, 14.92f, 21.6006f, 14.97f)
                curveTo(20.9006f, 14.36f, 20.0006f, 14.0f, 19.0006f, 14.0f)
                curveTo(18.0606f, 14.0f, 17.1906f, 14.33f, 16.5006f, 14.88f)
                curveTo(15.5806f, 15.61f, 15.0006f, 16.74f, 15.0006f, 18.0f)
                curveTo(15.0006f, 18.75f, 15.2106f, 19.46f, 15.5806f, 20.06f)
                curveTo(15.6706f, 20.22f, 15.7806f, 20.37f, 15.9006f, 20.51f)
                lineTo(14.0706f, 21.52f)
                curveTo(12.9306f, 22.16f, 11.0706f, 22.16f, 9.9306f, 21.52f)
                lineTo(4.5906f, 18.56f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                curveTo(23.0f, 19.2f, 22.47f, 20.27f, 21.64f, 21.0f)
                curveTo(20.93f, 21.62f, 20.01f, 22.0f, 19.0f, 22.0f)
                curveTo(16.79f, 22.0f, 15.0f, 20.21f, 15.0f, 18.0f)
                curveTo(15.0f, 16.74f, 15.58f, 15.61f, 16.5f, 14.88f)
                curveTo(17.19f, 14.33f, 18.06f, 14.0f, 19.0f, 14.0f)
                curveTo(21.21f, 14.0f, 23.0f, 15.79f, 23.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.25f, 16.75f)
                verticalLineTo(18.25f)
                lineTo(18.0f, 19.0f)
            }
        }
        .build()
        return _boxtime!!
    }

private var _boxtime: ImageVector? = null

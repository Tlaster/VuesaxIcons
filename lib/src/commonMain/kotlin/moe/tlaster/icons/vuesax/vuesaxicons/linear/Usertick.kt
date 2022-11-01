package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Usertick: ImageVector
    get() {
        if (_usertick != null) {
            return _usertick!!
        }
        _usertick = Builder(name = "Usertick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveTo(14.7614f, 12.0f, 17.0f, 9.7614f, 17.0f, 7.0f)
                curveTo(17.0f, 4.2386f, 14.7614f, 2.0f, 12.0f, 2.0f)
                curveTo(9.2386f, 2.0f, 7.0f, 4.2386f, 7.0f, 7.0f)
                curveTo(7.0f, 9.7614f, 9.2386f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.41f, 22.0f)
                curveTo(3.41f, 18.13f, 7.26f, 15.0f, 12.0f, 15.0f)
                curveTo(12.96f, 15.0f, 13.89f, 15.13f, 14.76f, 15.37f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                curveTo(22.0f, 18.75f, 21.79f, 19.46f, 21.42f, 20.06f)
                curveTo(21.21f, 20.42f, 20.94f, 20.74f, 20.63f, 21.0f)
                curveTo(19.93f, 21.63f, 19.01f, 22.0f, 18.0f, 22.0f)
                curveTo(16.54f, 22.0f, 15.27f, 21.22f, 14.58f, 20.06f)
                curveTo(14.21f, 19.46f, 14.0f, 18.75f, 14.0f, 18.0f)
                curveTo(14.0f, 16.74f, 14.58f, 15.61f, 15.5f, 14.88f)
                curveTo(16.19f, 14.33f, 17.06f, 14.0f, 18.0f, 14.0f)
                curveTo(20.21f, 14.0f, 22.0f, 15.79f, 22.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.4399f, 18.0f)
                lineTo(17.4299f, 18.99f)
                lineTo(19.5599f, 17.02f)
            }
        }
        .build()
        return _usertick!!
    }

private var _usertick: ImageVector? = null

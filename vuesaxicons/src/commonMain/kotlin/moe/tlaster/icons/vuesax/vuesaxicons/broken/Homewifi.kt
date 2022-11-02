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

public val BrokenGroup.Homewifi: ImageVector
    get() {
        if (_homewifi != null) {
            return _homewifi!!
        }
        _homewifi = Builder(name = "Homewifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0293f, 11.2799f)
                curveTo(1.8593f, 10.2999f, 2.3593f, 8.9899f, 3.1393f, 8.3699f)
                lineTo(10.0693f, 2.8198f)
                curveTo(11.1293f, 1.9698f, 12.8593f, 1.9698f, 13.9293f, 2.8298f)
                lineTo(20.8593f, 8.3699f)
                curveTo(21.6293f, 8.9899f, 22.1293f, 10.2999f, 21.9693f, 11.2799f)
                lineTo(20.6393f, 19.2399f)
                curveTo(20.3993f, 20.6499f, 19.0293f, 21.81f, 17.5993f, 21.81f)
                horizontalLineTo(6.3993f)
                curveTo(4.9593f, 21.81f, 3.5993f, 20.6599f, 3.3593f, 19.2399f)
                lineTo(2.7193f, 15.3799f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.8809f, 14.3802f)
                curveTo(11.1509f, 13.1702f, 12.8508f, 13.1702f, 14.1208f, 14.3802f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.75f, 11.45f)
                curveTo(8.4f, 11.68f, 8.07f, 11.95f, 7.75f, 12.26f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.24f, 12.26f)
                curveTo(15.7f, 11.73f, 15.1f, 11.32f, 14.48f, 11.02f)
                curveTo(13.68f, 10.64f, 12.84f, 10.45f, 12.0f, 10.45f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9955f, 16.5f)
                horizontalLineTo(12.0045f)
            }
        }
        .build()
        return _homewifi!!
    }

private var _homewifi: ImageVector? = null

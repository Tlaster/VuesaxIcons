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

public val TwotoneGroup.Cloudadd: ImageVector
    get() {
        if (_cloudadd != null) {
            return _cloudadd!!
        }
        _cloudadd = Builder(name = "Cloudadd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5393f, 11.1201f)
                curveTo(0.8593f, 11.4501f, 0.8593f, 18.2601f, 5.5393f, 18.5901f)
                horizontalLineTo(7.4593f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.59f, 11.1201f)
                curveTo(2.38f, 2.1901f, 15.92f, -1.3799f, 17.47f, 8.0001f)
                curveTo(21.8f, 8.5501f, 23.55f, 14.3201f, 20.27f, 17.1901f)
                curveTo(19.27f, 18.1001f, 17.98f, 18.6001f, 16.63f, 18.5901f)
                horizontalLineTo(16.54f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 16.5298f)
                curveTo(17.0f, 17.2698f, 16.84f, 17.9698f, 16.54f, 18.5898f)
                curveTo(16.46f, 18.7698f, 16.37f, 18.9398f, 16.27f, 19.0998f)
                curveTo(15.41f, 20.5498f, 13.82f, 21.5298f, 12.0f, 21.5298f)
                curveTo(10.18f, 21.5298f, 8.59f, 20.5498f, 7.73f, 19.0998f)
                curveTo(7.63f, 18.9398f, 7.54f, 18.7698f, 7.46f, 18.5898f)
                curveTo(7.16f, 17.9698f, 7.0f, 17.2698f, 7.0f, 16.5298f)
                curveTo(7.0f, 13.7698f, 9.24f, 11.5298f, 12.0f, 11.5298f)
                curveTo(14.76f, 11.5298f, 17.0f, 13.7698f, 17.0f, 16.5298f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4404f, 16.5298f)
                lineTo(11.4304f, 17.5198f)
                lineTo(13.5604f, 15.5498f)
            }
        }
        .build()
        return _cloudadd!!
    }

private var _cloudadd: ImageVector? = null

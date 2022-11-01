package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Zoom: ImageVector
    get() {
        if (_zoom != null) {
            return _zoom!!
        }
        _zoom = Builder(name = "Zoom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(6.0f, 9.6798f)
                verticalLineTo(12.4798f)
                curveTo(6.0f, 14.0198f, 7.25f, 15.2598f, 8.79f, 15.2498f)
                lineTo(12.47f, 15.2198f)
                curveTo(12.98f, 15.2198f, 13.39f, 14.7997f, 13.39f, 14.2997f)
                verticalLineTo(11.5298f)
                curveTo(13.39f, 9.9998f, 12.15f, 8.7598f, 10.62f, 8.7598f)
                horizontalLineTo(6.93f)
                curveTo(6.41f, 8.7598f, 6.0f, 9.1698f, 6.0f, 9.6798f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0005f, 9.2402f)
                verticalLineTo(14.7802f)
                lineTo(15.2305f, 12.9302f)
                verticalLineTo(11.0902f)
                lineTo(18.0005f, 9.2402f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _zoom!!
    }

private var _zoom: ImageVector? = null

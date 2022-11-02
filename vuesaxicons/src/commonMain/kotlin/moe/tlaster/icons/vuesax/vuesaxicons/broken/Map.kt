package moe.tlaster.icons.vuesax.vuesaxicons.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 17.5f, 21.5f, 19.25f, 20.38f, 20.38f)
                lineTo(14.0f, 14.0f)
                lineTo(21.73f, 6.27f)
                curveTo(21.91f, 7.06f, 22.0f, 7.96f, 22.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(18.96f, 2.0f, 21.04f, 3.26f, 21.73f, 6.27f)
                lineTo(6.27f, 21.73f)
                curveTo(3.26f, 21.04f, 2.0f, 18.96f, 2.0f, 15.0f)
                verticalLineTo(12.94f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.3795f, 20.38f)
                curveTo(19.2495f, 21.5f, 17.4995f, 22.0f, 14.9995f, 22.0f)
                horizontalLineTo(8.9995f)
                curveTo(7.9595f, 22.0f, 7.0595f, 21.91f, 6.2695f, 21.73f)
                lineTo(13.9995f, 14.0f)
                lineTo(20.3795f, 20.38f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.2393f, 7.98f)
                curveTo(6.9193f, 5.05f, 11.3193f, 5.05f, 11.9993f, 7.98f)
                curveTo(12.3893f, 9.7f, 11.3093f, 11.16f, 10.3593f, 12.06f)
                curveTo(9.6693f, 12.72f, 8.5793f, 12.72f, 7.8793f, 12.06f)
                curveTo(6.9293f, 11.16f, 5.8393f, 9.7f, 6.2393f, 7.98f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0941f, 8.7f)
                horizontalLineTo(9.1031f)
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null

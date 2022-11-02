package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Previous: ImageVector
    get() {
        if (_previous != null) {
            return _previous!!
        }
        _previous = Builder(name = "Previous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6896f, 20.0902f)
                curveTo(17.1196f, 20.0902f, 16.5596f, 19.9402f, 16.0396f, 19.6402f)
                lineTo(7.7496f, 14.8602f)
                curveTo(6.7196f, 14.2602f, 6.0996f, 13.1902f, 6.0996f, 12.0002f)
                curveTo(6.0996f, 10.8102f, 6.7196f, 9.7402f, 7.7496f, 9.1402f)
                lineTo(16.0396f, 4.3602f)
                curveTo(17.0696f, 3.7602f, 18.2996f, 3.7602f, 19.3396f, 4.3602f)
                curveTo(20.3796f, 4.9602f, 20.9896f, 6.0202f, 20.9896f, 7.2202f)
                verticalLineTo(16.7902f)
                curveTo(20.9896f, 17.9802f, 20.3696f, 19.0502f, 19.3396f, 19.6502f)
                curveTo(18.8196f, 19.9402f, 18.2596f, 20.0902f, 17.6896f, 20.0902f)
                close()
                moveTo(17.6896f, 5.4102f)
                curveTo(17.3796f, 5.4102f, 17.0696f, 5.4902f, 16.7896f, 5.6502f)
                lineTo(8.4996f, 10.4302f)
                curveTo(7.9396f, 10.7602f, 7.5996f, 11.3402f, 7.5996f, 11.9902f)
                curveTo(7.5996f, 12.6402f, 7.9396f, 13.2202f, 8.4996f, 13.5502f)
                lineTo(16.7896f, 18.3302f)
                curveTo(17.3496f, 18.6602f, 18.0296f, 18.6602f, 18.5896f, 18.3302f)
                curveTo(19.1496f, 18.0002f, 19.4896f, 17.4202f, 19.4896f, 16.7702f)
                verticalLineTo(7.2002f)
                curveTo(19.4896f, 6.5502f, 19.1496f, 5.9702f, 18.5896f, 5.6402f)
                curveTo(18.3096f, 5.5002f, 17.9996f, 5.4102f, 17.6896f, 5.4102f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7598f, 18.9298f)
                curveTo(3.3498f, 18.9298f, 3.0098f, 18.5898f, 3.0098f, 18.1798f)
                verticalLineTo(5.8198f)
                curveTo(3.0098f, 5.4098f, 3.3498f, 5.0698f, 3.7598f, 5.0698f)
                curveTo(4.1698f, 5.0698f, 4.5098f, 5.4098f, 4.5098f, 5.8198f)
                verticalLineTo(18.1798f)
                curveTo(4.5098f, 18.5898f, 4.1698f, 18.9298f, 3.7598f, 18.9298f)
                close()
            }
        }
        .build()
        return _previous!!
    }

private var _previous: ImageVector? = null

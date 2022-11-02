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

public val TwotoneGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4004f, 2.1001f)
                horizontalLineTo(18.6004f)
                curveTo(19.7004f, 2.1001f, 20.6004f, 3.0001f, 20.6004f, 4.1001f)
                verticalLineTo(6.3001f)
                curveTo(20.6004f, 7.1001f, 20.1004f, 8.1001f, 19.6004f, 8.6001f)
                lineTo(15.3004f, 12.4001f)
                curveTo(14.7004f, 12.9001f, 14.3004f, 13.9001f, 14.3004f, 14.7001f)
                verticalLineTo(19.0001f)
                curveTo(14.3004f, 19.6001f, 13.9004f, 20.4001f, 13.4004f, 20.7001f)
                lineTo(12.0004f, 21.6001f)
                curveTo(10.7004f, 22.4001f, 8.9004f, 21.5001f, 8.9004f, 19.9001f)
                verticalLineTo(14.6001f)
                curveTo(8.9004f, 13.9001f, 8.5004f, 13.0001f, 8.1004f, 12.5001f)
                lineTo(4.3004f, 8.5001f)
                curveTo(3.8004f, 8.0001f, 3.4004f, 7.1001f, 3.4004f, 6.5001f)
                verticalLineTo(4.2001f)
                curveTo(3.4004f, 3.0001f, 4.3004f, 2.1001f, 5.4004f, 2.1001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.93f, 2.1001f)
                lineTo(6.0f, 10.0001f)
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null

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

public val LinearGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4f, 2.1f)
                horizontalLineTo(18.6f)
                curveTo(19.7f, 2.1f, 20.6f, 3.0f, 20.6f, 4.1f)
                verticalLineTo(6.3f)
                curveTo(20.6f, 7.1f, 20.1f, 8.1f, 19.6f, 8.6f)
                lineTo(15.3f, 12.4f)
                curveTo(14.7f, 12.9f, 14.3f, 13.9f, 14.3f, 14.7f)
                verticalLineTo(19.0f)
                curveTo(14.3f, 19.6f, 13.9f, 20.4f, 13.4f, 20.7f)
                lineTo(12.0f, 21.6f)
                curveTo(10.7f, 22.4f, 8.9f, 21.5f, 8.9f, 19.9f)
                verticalLineTo(14.6f)
                curveTo(8.9f, 13.9f, 8.5f, 13.0f, 8.1f, 12.5f)
                lineTo(4.3f, 8.5f)
                curveTo(3.8f, 8.0f, 3.4f, 7.1f, 3.4f, 6.5f)
                verticalLineTo(4.2f)
                curveTo(3.4f, 3.0f, 4.3f, 2.1f, 5.4f, 2.1f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.93f, 2.1f)
                lineTo(6.0f, 10.0f)
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null

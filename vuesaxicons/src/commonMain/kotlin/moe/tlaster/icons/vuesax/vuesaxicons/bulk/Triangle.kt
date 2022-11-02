package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Triangle: ImageVector
    get() {
        if (_triangle != null) {
            return _triangle!!
        }
        _triangle = Builder(name = "Triangle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5901f)
                verticalLineTo(13.6101f)
                lineTo(2.65f, 20.1501f)
                curveTo(1.8f, 19.1401f, 1.75f, 17.6101f, 2.7f, 15.9001f)
                lineTo(5.82f, 10.2901f)
                lineTo(8.76f, 5.0001f)
                curveTo(9.65f, 3.4001f, 10.82f, 2.5901f, 12.0f, 2.5901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.6f, strokeAlpha
                    = 0.6f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.3504f, 20.1501f)
                curveTo(20.7004f, 20.9401f, 19.5704f, 21.4101f, 18.0604f, 21.4101f)
                horizontalLineTo(5.9404f)
                curveTo(4.4304f, 21.4101f, 3.3004f, 20.9401f, 2.6504f, 20.1501f)
                lineTo(12.0004f, 13.6101f)
                lineTo(21.3504f, 20.1501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.35f, 20.1501f)
                lineTo(12.0f, 13.6101f)
                verticalLineTo(2.5901f)
                curveTo(13.18f, 2.5901f, 14.35f, 3.4001f, 15.24f, 5.0001f)
                lineTo(18.18f, 10.2901f)
                lineTo(21.3f, 15.9001f)
                curveTo(22.25f, 17.6101f, 22.2f, 19.1401f, 21.35f, 20.1501f)
                close()
            }
        }
        .build()
        return _triangle!!
    }

private var _triangle: ImageVector? = null

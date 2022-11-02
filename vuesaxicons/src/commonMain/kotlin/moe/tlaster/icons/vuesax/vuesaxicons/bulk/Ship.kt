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

public val BulkGroup.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6297f, 14.6601f)
                lineTo(21.2197f, 16.5201f)
                curveTo(20.5097f, 19.72f, 17.9997f, 22.0001f, 14.3797f, 22.0001f)
                horizontalLineTo(9.6197f)
                curveTo(5.9997f, 22.0001f, 3.4897f, 19.72f, 2.7797f, 16.5201f)
                lineTo(2.3697f, 14.6601f)
                curveTo(2.1697f, 13.7501f, 2.7097f, 12.7201f, 3.5797f, 12.3701f)
                lineTo(4.9997f, 11.8f)
                lineTo(10.5098f, 9.5901f)
                curveTo(10.9898f, 9.4001f, 11.4997f, 9.3f, 11.9997f, 9.3f)
                curveTo(12.4997f, 9.3f, 13.0097f, 9.4001f, 13.4897f, 9.5901f)
                lineTo(18.9997f, 11.8f)
                lineTo(20.4198f, 12.3701f)
                curveTo(21.2898f, 12.7201f, 21.8298f, 13.7501f, 21.6297f, 14.6601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                verticalLineTo(11.8f)
                lineTo(13.49f, 9.59f)
                curveTo(12.53f, 9.21f, 11.47f, 9.21f, 10.51f, 9.59f)
                lineTo(5.0f, 11.8f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 6.35f, 6.35f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(17.65f, 5.0f, 19.0f, 6.35f, 19.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 5.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(3.0f)
                curveTo(9.5f, 2.45f, 9.95f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(14.05f, 2.0f, 14.5f, 2.45f, 14.5f, 3.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _ship!!
    }

private var _ship: ImageVector? = null

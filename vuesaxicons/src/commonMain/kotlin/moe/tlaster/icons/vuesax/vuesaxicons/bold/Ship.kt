package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Ship: ImageVector
    get() {
        if (_ship != null) {
            return _ship!!
        }
        _ship = Builder(name = "Ship", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6297f, 14.6608f)
                lineTo(21.2197f, 16.5208f)
                curveTo(20.5097f, 19.7208f, 17.9997f, 22.0008f, 14.3797f, 22.0008f)
                horizontalLineTo(9.6197f)
                curveTo(5.9997f, 22.0008f, 3.4897f, 19.7208f, 2.7797f, 16.5208f)
                lineTo(2.3697f, 14.6608f)
                curveTo(2.1697f, 13.7508f, 2.7097f, 12.7208f, 3.5797f, 12.3708f)
                lineTo(4.9997f, 11.8008f)
                lineTo(10.5097f, 9.5908f)
                curveTo(10.9897f, 9.4008f, 11.4997f, 9.3008f, 11.9997f, 9.3008f)
                curveTo(12.4997f, 9.3008f, 13.0097f, 9.4008f, 13.4897f, 9.5908f)
                lineTo(18.9997f, 11.8008f)
                lineTo(20.4197f, 12.3708f)
                curveTo(21.2897f, 12.7208f, 21.8297f, 13.7508f, 21.6297f, 14.6608f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                verticalLineTo(9.44f)
                curveTo(19.0f, 9.79f, 18.64f, 10.04f, 18.31f, 9.9f)
                lineTo(14.04f, 8.19f)
                curveTo(12.73f, 7.68f, 11.27f, 7.68f, 9.95f, 8.2f)
                lineTo(5.69f, 9.91f)
                curveTo(5.36f, 10.05f, 5.0f, 9.8f, 5.0f, 9.45f)
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

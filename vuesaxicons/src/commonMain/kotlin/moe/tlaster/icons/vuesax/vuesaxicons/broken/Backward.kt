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

public val BrokenGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0002f, 8.3399f)
                verticalLineTo(15.6599f)
                curveTo(22.0002f, 17.1599f, 20.3703f, 18.0999f, 19.0703f, 17.3499f)
                lineTo(15.9002f, 15.5299f)
                lineTo(12.7303f, 13.7f)
                curveTo(12.5303f, 13.58f, 12.3702f, 13.45f, 12.2402f, 13.29f)
                verticalLineTo(10.73f)
                curveTo(12.3702f, 10.57f, 12.5303f, 10.44f, 12.7303f, 10.32f)
                lineTo(15.9002f, 8.4899f)
                lineTo(19.0703f, 6.67f)
                curveTo(20.3703f, 5.9f, 22.0002f, 6.8399f, 22.0002f, 8.3399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.3209f, 6.6501f)
                curveTo(10.6209f, 5.9001f, 12.2508f, 6.8401f, 12.2508f, 8.3401f)
                verticalLineTo(15.6601f)
                curveTo(12.2508f, 17.1601f, 10.6209f, 18.1001f, 9.3209f, 17.3501f)
                lineTo(6.1508f, 15.5301f)
                lineTo(2.9809f, 13.7001f)
                curveTo(1.6809f, 12.9501f, 1.6809f, 11.0801f, 2.9809f, 10.3201f)
                lineTo(5.3909f, 8.9301f)
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null

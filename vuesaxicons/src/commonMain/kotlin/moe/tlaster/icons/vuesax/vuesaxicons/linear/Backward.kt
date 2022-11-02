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

public val LinearGroup.Backward: ImageVector
    get() {
        if (_backward != null) {
            return _backward!!
        }
        _backward = Builder(name = "Backward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 8.3399f)
                verticalLineTo(15.6599f)
                curveTo(22.0f, 17.1599f, 20.37f, 18.0999f, 19.07f, 17.3499f)
                lineTo(15.9f, 15.5299f)
                lineTo(12.73f, 13.7f)
                curveTo(12.53f, 13.58f, 12.37f, 13.45f, 12.24f, 13.29f)
                verticalLineTo(10.73f)
                curveTo(12.37f, 10.57f, 12.53f, 10.44f, 12.73f, 10.32f)
                lineTo(15.9f, 8.4899f)
                lineTo(19.07f, 6.67f)
                curveTo(20.37f, 5.9f, 22.0f, 6.8399f, 22.0f, 8.3399f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.24f, 8.3399f)
                verticalLineTo(15.6599f)
                curveTo(12.24f, 17.1599f, 10.61f, 18.0999f, 9.31f, 17.3499f)
                lineTo(6.14f, 15.5299f)
                lineTo(2.97f, 13.7f)
                curveTo(1.67f, 12.95f, 1.67f, 11.08f, 2.97f, 10.32f)
                lineTo(6.14f, 8.4899f)
                lineTo(9.31f, 6.67f)
                curveTo(10.61f, 5.9f, 12.24f, 6.8399f, 12.24f, 8.3399f)
                close()
            }
        }
        .build()
        return _backward!!
    }

private var _backward: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 21.0401f)
                horizontalLineTo(7.0f)
                curveTo(3.83f, 21.0401f, 1.25f, 18.4601f, 1.25f, 15.2901f)
                verticalLineTo(5.7101f)
                curveTo(1.25f, 4.4101f, 1.85f, 3.9601f, 2.21f, 3.8101f)
                curveTo(2.57f, 3.6601f, 3.31f, 3.5501f, 4.23f, 4.4701f)
                lineTo(6.82f, 7.0601f)
                curveTo(6.92f, 7.1601f, 7.08f, 7.1601f, 7.17f, 7.0601f)
                lineTo(10.76f, 3.4701f)
                curveTo(11.42f, 2.8101f, 12.58f, 2.8101f, 13.23f, 3.4701f)
                lineTo(16.82f, 7.0601f)
                curveTo(16.92f, 7.1601f, 17.08f, 7.1601f, 17.17f, 7.0601f)
                lineTo(19.76f, 4.4701f)
                curveTo(20.68f, 3.5501f, 21.42f, 3.6701f, 21.78f, 3.8101f)
                curveTo(22.14f, 3.9601f, 22.74f, 4.4001f, 22.74f, 5.7101f)
                verticalLineTo(15.3001f)
                curveTo(22.75f, 18.7301f, 20.44f, 21.0401f, 17.0f, 21.0401f)
                close()
                moveTo(2.81f, 5.2401f)
                curveTo(2.78f, 5.3201f, 2.75f, 5.4701f, 2.75f, 5.7101f)
                verticalLineTo(15.3001f)
                curveTo(2.75f, 17.6401f, 4.66f, 19.5501f, 7.0f, 19.5501f)
                horizontalLineTo(17.0f)
                curveTo(19.58f, 19.5501f, 21.25f, 17.8801f, 21.25f, 15.3001f)
                verticalLineTo(5.7101f)
                curveTo(21.25f, 5.4701f, 21.22f, 5.3301f, 21.19f, 5.2501f)
                curveTo(21.11f, 5.2901f, 20.99f, 5.3701f, 20.82f, 5.5401f)
                lineTo(18.23f, 8.1301f)
                curveTo(17.57f, 8.7901f, 16.41f, 8.7901f, 15.76f, 8.1301f)
                lineTo(12.17f, 4.5401f)
                curveTo(12.07f, 4.4401f, 11.91f, 4.4401f, 11.82f, 4.5401f)
                lineTo(8.24f, 8.1201f)
                curveTo(7.58f, 8.7801f, 6.42f, 8.7801f, 5.77f, 8.1201f)
                lineTo(3.18f, 5.5301f)
                curveTo(3.01f, 5.3601f, 2.88f, 5.2801f, 2.81f, 5.2401f)
                close()
            }
        }
        .build()
        return _crown!!
    }

private var _crown: ImageVector? = null

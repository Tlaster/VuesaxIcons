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

public val OutlineGroup.Component: ImageVector
    get() {
        if (_component != null) {
            return _component!!
        }
        _component = Builder(name = "Component", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 22.75f)
                curveTo(10.8298f, 22.75f, 9.7398f, 22.3f, 8.9198f, 21.48f)
                lineTo(2.5298f, 15.09f)
                curveTo(1.7098f, 14.27f, 1.2598f, 13.17f, 1.2598f, 12.01f)
                curveTo(1.2598f, 10.85f, 1.7098f, 9.75f, 2.5298f, 8.93f)
                lineTo(8.9198f, 2.54f)
                curveTo(9.7398f, 1.72f, 10.8398f, 1.27f, 11.9998f, 1.27f)
                curveTo(13.1598f, 1.27f, 14.2597f, 1.72f, 15.0797f, 2.54f)
                lineTo(21.4698f, 8.93f)
                curveTo(22.2898f, 9.75f, 22.7397f, 10.85f, 22.7397f, 12.01f)
                curveTo(22.7397f, 13.17f, 22.2898f, 14.27f, 21.4698f, 15.09f)
                lineTo(15.0797f, 21.48f)
                curveTo(14.2597f, 22.3f, 13.1698f, 22.75f, 11.9998f, 22.75f)
                close()
                moveTo(11.9998f, 2.75f)
                curveTo(11.2298f, 2.75f, 10.5098f, 3.05f, 9.9798f, 3.58f)
                lineTo(3.5898f, 9.97f)
                curveTo(3.0498f, 10.51f, 2.7598f, 11.23f, 2.7598f, 11.99f)
                curveTo(2.7598f, 12.75f, 3.0598f, 13.48f, 3.5898f, 14.01f)
                lineTo(9.9798f, 20.4f)
                curveTo(11.0498f, 21.47f, 12.9497f, 21.47f, 14.0197f, 20.4f)
                lineTo(20.4098f, 14.01f)
                curveTo(20.9498f, 13.47f, 21.2397f, 12.76f, 21.2397f, 11.99f)
                curveTo(21.2397f, 11.22f, 20.9398f, 10.5f, 20.4098f, 9.97f)
                lineTo(14.0197f, 3.58f)
                curveTo(13.4897f, 3.05f, 12.7698f, 2.75f, 11.9998f, 2.75f)
                close()
            }
        }
        .build()
        return _component!!
    }

private var _component: ImageVector? = null

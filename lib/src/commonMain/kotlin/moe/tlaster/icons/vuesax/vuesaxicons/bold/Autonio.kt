package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Autonio: ImageVector
    get() {
        if (_autonio != null) {
            return _autonio!!
        }
        _autonio = Builder(name = "Autonio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.7f, 16.14f)
                horizontalLineTo(6.44f)
                curveTo(6.25f, 16.14f, 6.13f, 15.93f, 6.23f, 15.76f)
                lineTo(8.36f, 12.21f)
                curveTo(8.46f, 12.05f, 8.69f, 12.05f, 8.79f, 12.21f)
                lineTo(10.92f, 15.76f)
                curveTo(11.02f, 15.93f, 10.9f, 16.14f, 10.7f, 16.14f)
                close()
                moveTo(9.87f, 10.14f)
                curveTo(9.68f, 10.14f, 9.56f, 9.93f, 9.66f, 9.76f)
                lineTo(11.79f, 6.21f)
                curveTo(11.89f, 6.05f, 12.12f, 6.05f, 12.22f, 6.21f)
                lineTo(14.35f, 9.76f)
                curveTo(14.45f, 9.93f, 14.33f, 10.14f, 14.14f, 10.14f)
                horizontalLineTo(9.87f)
                close()
                moveTo(17.56f, 16.14f)
                horizontalLineTo(13.3f)
                curveTo(13.11f, 16.14f, 12.99f, 15.93f, 13.09f, 15.76f)
                lineTo(15.22f, 12.21f)
                curveTo(15.32f, 12.05f, 15.55f, 12.05f, 15.65f, 12.21f)
                lineTo(17.78f, 15.76f)
                curveTo(17.87f, 15.93f, 17.75f, 16.14f, 17.56f, 16.14f)
                close()
            }
        }
        .build()
        return _autonio!!
    }

private var _autonio: ImageVector? = null

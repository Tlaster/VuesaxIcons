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

public val BoldGroup.Avalanche: ImageVector
    get() {
        if (_avalanche != null) {
            return _avalanche!!
        }
        _avalanche = Builder(name = "Avalanche", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.72f, 15.41f)
                curveTo(10.39f, 15.94f, 9.81f, 16.26f, 9.18f, 16.26f)
                horizontalLineTo(6.44f)
                curveTo(6.09f, 16.26f, 5.87f, 15.88f, 6.05f, 15.58f)
                lineTo(11.66f, 5.97f)
                curveTo(11.82f, 5.69f, 12.22f, 5.67f, 12.41f, 5.93f)
                lineTo(13.97f, 8.02f)
                curveTo(14.42f, 8.62f, 14.45f, 9.43f, 14.06f, 10.07f)
                lineTo(10.72f, 15.41f)
                close()
                moveTo(17.55f, 16.26f)
                horizontalLineTo(13.71f)
                curveTo(13.36f, 16.26f, 13.14f, 15.88f, 13.32f, 15.57f)
                lineTo(15.24f, 12.37f)
                curveTo(15.42f, 12.08f, 15.84f, 12.08f, 16.02f, 12.37f)
                lineTo(17.94f, 15.57f)
                curveTo(18.12f, 15.87f, 17.9f, 16.26f, 17.55f, 16.26f)
                close()
            }
        }
        .build()
        return _avalanche!!
    }

private var _avalanche: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Forbidden: ImageVector
    get() {
        if (_forbidden != null) {
            return _forbidden!!
        }
        _forbidden = Builder(name = "Forbidden", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9f, 22.75f)
                horizontalLineTo(9.1f)
                curveTo(8.21f, 22.75f, 7.07f, 22.28f, 6.45f, 21.65f)
                lineTo(2.35f, 17.55f)
                curveTo(1.72f, 16.92f, 1.25f, 15.78f, 1.25f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(1.25f, 8.21f, 1.72f, 7.07f, 2.35f, 6.45f)
                lineTo(6.45f, 2.35f)
                curveTo(7.08f, 1.72f, 8.22f, 1.25f, 9.1f, 1.25f)
                horizontalLineTo(14.9f)
                curveTo(15.79f, 1.25f, 16.93f, 1.72f, 17.55f, 2.35f)
                lineTo(21.65f, 6.45f)
                curveTo(22.28f, 7.08f, 22.75f, 8.22f, 22.75f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(22.75f, 15.79f, 22.28f, 16.93f, 21.65f, 17.55f)
                lineTo(17.55f, 21.65f)
                curveTo(16.92f, 22.28f, 15.79f, 22.75f, 14.9f, 22.75f)
                close()
                moveTo(9.1f, 2.75f)
                curveTo(8.61f, 2.75f, 7.85f, 3.06f, 7.51f, 3.41f)
                lineTo(3.41f, 7.51f)
                curveTo(3.07f, 7.86f, 2.75f, 8.61f, 2.75f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2.75f, 15.39f, 3.06f, 16.15f, 3.41f, 16.49f)
                lineTo(7.51f, 20.59f)
                curveTo(7.86f, 20.93f, 8.61f, 21.25f, 9.1f, 21.25f)
                horizontalLineTo(14.9f)
                curveTo(15.39f, 21.25f, 16.15f, 20.94f, 16.49f, 20.59f)
                lineTo(20.59f, 16.49f)
                curveTo(20.93f, 16.14f, 21.25f, 15.39f, 21.25f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(21.25f, 8.61f, 20.94f, 7.85f, 20.59f, 7.51f)
                lineTo(16.49f, 3.41f)
                curveTo(16.14f, 3.07f, 15.39f, 2.75f, 14.9f, 2.75f)
                horizontalLineTo(9.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9389f, 19.8299f)
                curveTo(4.7489f, 19.8299f, 4.5589f, 19.7599f, 4.4089f, 19.6099f)
                curveTo(4.1189f, 19.3199f, 4.1189f, 18.8399f, 4.4089f, 18.5499f)
                lineTo(18.5489f, 4.4099f)
                curveTo(18.8389f, 4.1199f, 19.3189f, 4.1199f, 19.6089f, 4.4099f)
                curveTo(19.8989f, 4.6999f, 19.8989f, 5.1799f, 19.6089f, 5.4699f)
                lineTo(5.4689f, 19.6099f)
                curveTo(5.3189f, 19.7599f, 5.1289f, 19.8299f, 4.9389f, 19.8299f)
                close()
            }
        }
        .build()
        return _forbidden!!
    }

private var _forbidden: ImageVector? = null

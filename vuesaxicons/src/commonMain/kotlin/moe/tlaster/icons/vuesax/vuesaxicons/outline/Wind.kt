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

public val OutlineGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 22.75f)
                curveTo(16.16f, 22.75f, 14.25f, 20.84f, 14.25f, 18.5f)
                verticalLineTo(18.0f)
                curveTo(14.25f, 17.59f, 14.59f, 17.25f, 15.0f, 17.25f)
                curveTo(15.41f, 17.25f, 15.75f, 17.59f, 15.75f, 18.0f)
                verticalLineTo(18.5f)
                curveTo(15.75f, 20.02f, 16.98f, 21.25f, 18.5f, 21.25f)
                curveTo(20.02f, 21.25f, 21.25f, 20.02f, 21.25f, 18.5f)
                curveTo(21.25f, 16.98f, 20.02f, 15.75f, 18.5f, 15.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 15.75f, 1.25f, 15.41f, 1.25f, 15.0f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2.0f, 14.25f)
                horizontalLineTo(18.5f)
                curveTo(20.84f, 14.25f, 22.75f, 16.16f, 22.75f, 18.5f)
                curveTo(22.75f, 20.84f, 20.84f, 22.75f, 18.5f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 12.75f, 1.25f, 12.41f, 1.25f, 12.0f)
                curveTo(1.25f, 11.59f, 1.59f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(18.5f)
                curveTo(20.02f, 11.25f, 21.25f, 10.02f, 21.25f, 8.5f)
                curveTo(21.25f, 6.98f, 20.02f, 5.75f, 18.5f, 5.75f)
                curveTo(16.98f, 5.75f, 15.75f, 6.98f, 15.75f, 8.5f)
                verticalLineTo(9.0f)
                curveTo(15.75f, 9.41f, 15.41f, 9.75f, 15.0f, 9.75f)
                curveTo(14.59f, 9.75f, 14.25f, 9.41f, 14.25f, 9.0f)
                verticalLineTo(8.5f)
                curveTo(14.25f, 6.16f, 16.16f, 4.25f, 18.5f, 4.25f)
                curveTo(20.84f, 4.25f, 22.75f, 6.16f, 22.75f, 8.5f)
                curveTo(22.75f, 10.84f, 20.84f, 12.75f, 18.5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.31f, 9.7501f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 9.7501f, 1.25f, 9.4101f, 1.25f, 9.0001f)
                curveTo(1.25f, 8.5901f, 1.59f, 8.2501f, 2.0f, 8.2501f)
                horizontalLineTo(9.31f)
                curveTo(10.38f, 8.2501f, 11.25f, 7.3801f, 11.25f, 6.3101f)
                curveTo(11.25f, 5.2401f, 10.38f, 4.3701f, 9.31f, 4.3701f)
                curveTo(8.24f, 4.3701f, 7.37f, 5.2401f, 7.37f, 6.3101f)
                verticalLineTo(6.6901f)
                curveTo(7.37f, 7.1001f, 7.03f, 7.4401f, 6.62f, 7.4401f)
                curveTo(6.21f, 7.4401f, 5.87f, 7.1001f, 5.87f, 6.6901f)
                verticalLineTo(6.3101f)
                curveTo(5.87f, 4.4101f, 7.41f, 2.8701f, 9.31f, 2.8701f)
                curveTo(11.21f, 2.8701f, 12.75f, 4.4101f, 12.75f, 6.3101f)
                curveTo(12.75f, 8.2101f, 11.21f, 9.7501f, 9.31f, 9.7501f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null

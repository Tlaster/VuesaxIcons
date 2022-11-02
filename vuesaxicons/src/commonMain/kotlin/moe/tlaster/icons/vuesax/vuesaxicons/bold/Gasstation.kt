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

public val BoldGroup.Gasstation: ImageVector
    get() {
        if (_gasstation != null) {
            return _gasstation!!
        }
        _gasstation = Builder(name = "Gasstation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.34f, 9.33f)
                lineTo(20.34f, 8.33f)
                curveTo(19.97f, 8.15f, 19.51f, 8.29f, 19.33f, 8.66f)
                curveTo(19.14f, 9.04f, 19.29f, 9.49f, 19.66f, 9.67f)
                lineTo(21.25f, 10.46f)
                verticalLineTo(15.25f)
                lineTo(17.5f, 15.26f)
                verticalLineTo(5.0f)
                curveTo(17.5f, 3.0f, 16.16f, 2.0f, 14.5f, 2.0f)
                horizontalLineTo(6.5f)
                curveTo(4.84f, 2.0f, 3.5f, 3.0f, 3.5f, 5.0f)
                verticalLineTo(21.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.25f, 1.25f, 21.59f, 1.25f, 22.0f)
                curveTo(1.25f, 22.41f, 1.59f, 22.75f, 2.0f, 22.75f)
                horizontalLineTo(19.0f)
                curveTo(19.41f, 22.75f, 19.75f, 22.41f, 19.75f, 22.0f)
                curveTo(19.75f, 21.59f, 19.41f, 21.25f, 19.0f, 21.25f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.76f)
                lineTo(22.0f, 16.75f)
                curveTo(22.42f, 16.75f, 22.75f, 16.41f, 22.75f, 16.0f)
                verticalLineTo(10.0f)
                curveTo(22.75f, 9.72f, 22.59f, 9.46f, 22.34f, 9.33f)
                close()
                moveTo(6.0f, 6.89f)
                curveTo(6.0f, 5.5f, 6.85f, 5.0f, 7.89f, 5.0f)
                horizontalLineTo(13.12f)
                curveTo(14.15f, 5.0f, 15.0f, 5.5f, 15.0f, 6.89f)
                verticalLineTo(8.12f)
                curveTo(15.0f, 9.5f, 14.15f, 10.0f, 13.11f, 10.0f)
                horizontalLineTo(7.89f)
                curveTo(6.85f, 10.0f, 6.0f, 9.5f, 6.0f, 8.11f)
                verticalLineTo(6.89f)
                close()
                moveTo(6.5f, 12.25f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 12.25f, 10.25f, 12.59f, 10.25f, 13.0f)
                curveTo(10.25f, 13.41f, 9.91f, 13.75f, 9.5f, 13.75f)
                horizontalLineTo(6.5f)
                curveTo(6.09f, 13.75f, 5.75f, 13.41f, 5.75f, 13.0f)
                curveTo(5.75f, 12.59f, 6.09f, 12.25f, 6.5f, 12.25f)
                close()
            }
        }
        .build()
        return _gasstation!!
    }

private var _gasstation: ImageVector? = null

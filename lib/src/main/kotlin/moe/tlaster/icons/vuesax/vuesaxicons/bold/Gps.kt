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

public val BoldGroup.Gps: ImageVector
    get() {
        if (_gps != null) {
            return _gps!!
        }
        _gps = Builder(name = "Gps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.25f)
                horizontalLineTo(19.96f)
                curveTo(19.6f, 7.44f, 16.56f, 4.39f, 12.75f, 4.04f)
                verticalLineTo(2.0f)
                curveTo(12.75f, 1.59f, 12.41f, 1.25f, 12.0f, 1.25f)
                curveTo(11.59f, 1.25f, 11.25f, 1.59f, 11.25f, 2.0f)
                verticalLineTo(4.04f)
                curveTo(7.44f, 4.4f, 4.39f, 7.44f, 4.04f, 11.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 11.25f, 1.25f, 11.59f, 1.25f, 12.0f)
                curveTo(1.25f, 12.41f, 1.59f, 12.75f, 2.0f, 12.75f)
                horizontalLineTo(4.04f)
                curveTo(4.4f, 16.56f, 7.44f, 19.61f, 11.25f, 19.96f)
                verticalLineTo(22.0f)
                curveTo(11.25f, 22.41f, 11.59f, 22.75f, 12.0f, 22.75f)
                curveTo(12.41f, 22.75f, 12.75f, 22.41f, 12.75f, 22.0f)
                verticalLineTo(19.96f)
                curveTo(16.56f, 19.6f, 19.61f, 16.56f, 19.96f, 12.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 12.75f, 22.75f, 12.41f, 22.75f, 12.0f)
                curveTo(22.75f, 11.59f, 22.41f, 11.25f, 22.0f, 11.25f)
                close()
                moveTo(12.0f, 15.12f)
                curveTo(10.28f, 15.12f, 8.88f, 13.72f, 8.88f, 12.0f)
                curveTo(8.88f, 10.28f, 10.28f, 8.88f, 12.0f, 8.88f)
                curveTo(13.72f, 8.88f, 15.12f, 10.28f, 15.12f, 12.0f)
                curveTo(15.12f, 13.72f, 13.72f, 15.12f, 12.0f, 15.12f)
                close()
            }
        }
        .build()
        return _gps!!
    }

private var _gps: ImageVector? = null

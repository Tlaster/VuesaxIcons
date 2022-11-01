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

public val BoldGroup.Xiaomi: ImageVector
    get() {
        if (_xiaomi != null) {
            return _xiaomi!!
        }
        _xiaomi = Builder(name = "Xiaomi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(11.25f, 15.0f)
                curveTo(11.25f, 15.41f, 10.91f, 15.75f, 10.5f, 15.75f)
                curveTo(10.09f, 15.75f, 9.75f, 15.41f, 9.75f, 15.0f)
                verticalLineTo(12.0f)
                curveTo(9.75f, 11.59f, 10.09f, 11.25f, 10.5f, 11.25f)
                curveTo(10.91f, 11.25f, 11.25f, 11.59f, 11.25f, 12.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(14.25f, 15.0f)
                curveTo(14.25f, 15.41f, 13.91f, 15.75f, 13.5f, 15.75f)
                curveTo(13.09f, 15.75f, 12.75f, 15.41f, 12.75f, 15.0f)
                verticalLineTo(11.0f)
                curveTo(12.75f, 10.31f, 12.19f, 9.75f, 11.5f, 9.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(15.0f)
                curveTo(8.25f, 15.41f, 7.91f, 15.75f, 7.5f, 15.75f)
                curveTo(7.09f, 15.75f, 6.75f, 15.41f, 6.75f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(6.75f, 8.59f, 7.09f, 8.25f, 7.5f, 8.25f)
                horizontalLineTo(11.5f)
                curveTo(13.02f, 8.25f, 14.25f, 9.48f, 14.25f, 11.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(17.25f, 15.0f)
                curveTo(17.25f, 15.41f, 16.91f, 15.75f, 16.5f, 15.75f)
                curveTo(16.09f, 15.75f, 15.75f, 15.41f, 15.75f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(15.75f, 8.59f, 16.09f, 8.25f, 16.5f, 8.25f)
                curveTo(16.91f, 8.25f, 17.25f, 8.59f, 17.25f, 9.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _xiaomi!!
    }

private var _xiaomi: ImageVector? = null

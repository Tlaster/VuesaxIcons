package moe.tlaster.icons.vuesax.vuesaxicons.crypto.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BoldGroup

public val BoldGroup.Emercoin: ImageVector
    get() {
        if (_emercoin != null) {
            return _emercoin!!
        }
        _emercoin = Builder(name = "Emercoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.25f, 16.0f)
                curveTo(17.25f, 16.41f, 16.91f, 16.75f, 16.5f, 16.75f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 16.75f, 6.75f, 16.41f, 6.75f, 16.0f)
                curveTo(6.75f, 15.59f, 7.09f, 15.25f, 7.5f, 15.25f)
                horizontalLineTo(15.75f)
                verticalLineTo(8.75f)
                horizontalLineTo(13.25f)
                verticalLineTo(12.0f)
                curveTo(13.25f, 12.41f, 12.91f, 12.75f, 12.5f, 12.75f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 12.75f, 6.75f, 12.41f, 6.75f, 12.0f)
                curveTo(6.75f, 11.59f, 7.09f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(11.75f)
                verticalLineTo(8.75f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 8.75f, 6.75f, 8.41f, 6.75f, 8.0f)
                curveTo(6.75f, 7.59f, 7.09f, 7.25f, 7.5f, 7.25f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 7.25f, 17.25f, 7.59f, 17.25f, 8.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _emercoin!!
    }

private var _emercoin: ImageVector? = null

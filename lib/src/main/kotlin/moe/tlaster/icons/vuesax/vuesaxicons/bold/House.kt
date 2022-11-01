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

public val BoldGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.2488f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.9788f)
                curveTo(21.0f, 9.3588f, 20.72f, 8.7788f, 20.23f, 8.3988f)
                lineTo(19.0f, 7.4387f)
                lineTo(18.98f, 4.9887f)
                curveTo(18.98f, 4.4387f, 18.53f, 3.9987f, 17.98f, 3.9987f)
                horizontalLineTo(14.57f)
                lineTo(13.23f, 2.9588f)
                curveTo(12.51f, 2.3888f, 11.49f, 2.3888f, 10.77f, 2.9588f)
                lineTo(3.77f, 8.3988f)
                curveTo(3.28f, 8.7788f, 3.0f, 9.3588f, 3.0f, 9.9688f)
                lineTo(2.95f, 21.2488f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.2488f, 1.25f, 21.5888f, 1.25f, 21.9988f)
                curveTo(1.25f, 22.4088f, 1.59f, 22.7488f, 2.0f, 22.7488f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 22.7488f, 22.75f, 22.4088f, 22.75f, 21.9988f)
                curveTo(22.75f, 21.5888f, 22.41f, 21.2488f, 22.0f, 21.2488f)
                close()
                moveTo(6.5f, 12.7487f)
                verticalLineTo(11.2487f)
                curveTo(6.5f, 10.6987f, 6.95f, 10.2487f, 7.5f, 10.2487f)
                horizontalLineTo(9.5f)
                curveTo(10.05f, 10.2487f, 10.5f, 10.6987f, 10.5f, 11.2487f)
                verticalLineTo(12.7487f)
                curveTo(10.5f, 13.2987f, 10.05f, 13.7487f, 9.5f, 13.7487f)
                horizontalLineTo(7.5f)
                curveTo(6.95f, 13.7487f, 6.5f, 13.2987f, 6.5f, 12.7487f)
                close()
                moveTo(14.5f, 21.2488f)
                horizontalLineTo(9.5f)
                verticalLineTo(18.4987f)
                curveTo(9.5f, 17.6687f, 10.17f, 16.9987f, 11.0f, 16.9987f)
                horizontalLineTo(13.0f)
                curveTo(13.83f, 16.9987f, 14.5f, 17.6687f, 14.5f, 18.4987f)
                verticalLineTo(21.2488f)
                close()
                moveTo(17.5f, 12.7487f)
                curveTo(17.5f, 13.2987f, 17.05f, 13.7487f, 16.5f, 13.7487f)
                horizontalLineTo(14.5f)
                curveTo(13.95f, 13.7487f, 13.5f, 13.2987f, 13.5f, 12.7487f)
                verticalLineTo(11.2487f)
                curveTo(13.5f, 10.6987f, 13.95f, 10.2487f, 14.5f, 10.2487f)
                horizontalLineTo(16.5f)
                curveTo(17.05f, 10.2487f, 17.5f, 10.6987f, 17.5f, 11.2487f)
                verticalLineTo(12.7487f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null

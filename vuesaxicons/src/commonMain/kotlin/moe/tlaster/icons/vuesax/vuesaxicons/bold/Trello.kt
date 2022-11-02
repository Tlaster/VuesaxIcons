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

public val BoldGroup.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1898f, 2.0f)
                horizontalLineTo(7.8198f)
                curveTo(4.1798f, 2.0f, 2.0098f, 4.17f, 2.0098f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0098f, 19.82f, 4.1798f, 21.99f, 7.8198f, 21.99f)
                horizontalLineTo(16.1898f)
                curveTo(19.8298f, 21.99f, 21.9998f, 19.82f, 21.9998f, 16.18f)
                verticalLineTo(7.81f)
                curveTo(21.9998f, 4.17f, 19.8298f, 2.0f, 16.1898f, 2.0f)
                close()
                moveTo(10.7698f, 16.49f)
                curveTo(10.7698f, 17.16f, 10.2197f, 17.71f, 9.5497f, 17.71f)
                horizontalLineTo(7.0997f)
                curveTo(6.4297f, 17.71f, 5.8798f, 17.16f, 5.8798f, 16.49f)
                verticalLineTo(7.51f)
                curveTo(5.8798f, 6.84f, 6.4297f, 6.29f, 7.0997f, 6.29f)
                horizontalLineTo(9.5497f)
                curveTo(10.2197f, 6.29f, 10.7698f, 6.84f, 10.7698f, 7.51f)
                verticalLineTo(16.49f)
                close()
                moveTo(18.1198f, 12.65f)
                curveTo(18.1198f, 13.19f, 17.6798f, 13.63f, 17.1398f, 13.63f)
                horizontalLineTo(14.1998f)
                curveTo(13.6598f, 13.63f, 13.2197f, 13.19f, 13.2197f, 12.65f)
                verticalLineTo(7.26f)
                curveTo(13.2197f, 6.72f, 13.6598f, 6.28f, 14.1998f, 6.28f)
                horizontalLineTo(17.1398f)
                curveTo(17.6798f, 6.28f, 18.1198f, 6.72f, 18.1198f, 7.26f)
                verticalLineTo(12.65f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null

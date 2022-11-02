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

public val BoldGroup.Icon: ImageVector
    get() {
        if (_icon != null) {
            return _icon!!
        }
        _icon = Builder(name = "Icon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.9998f, 7.5f)
                curveTo(10.9998f, 7.78f, 10.7798f, 8.0f, 10.4998f, 8.0f)
                horizontalLineTo(8.9998f)
                curveTo(8.4498f, 8.0f, 7.9998f, 8.45f, 7.9998f, 9.0f)
                verticalLineTo(10.5f)
                curveTo(7.9998f, 10.78f, 7.7798f, 11.0f, 7.4998f, 11.0f)
                horizontalLineTo(5.4998f)
                curveTo(5.2198f, 11.0f, 4.9998f, 10.78f, 4.9998f, 10.5f)
                verticalLineTo(9.0f)
                curveTo(4.9998f, 6.79f, 6.7898f, 5.0f, 8.9998f, 5.0f)
                horizontalLineTo(10.4998f)
                curveTo(10.7798f, 5.0f, 10.9998f, 5.22f, 10.9998f, 5.5f)
                verticalLineTo(7.5f)
                close()
                moveTo(18.9998f, 15.0f)
                curveTo(18.9998f, 17.21f, 17.2098f, 19.0f, 14.9998f, 19.0f)
                horizontalLineTo(13.4998f)
                curveTo(13.2198f, 19.0f, 12.9998f, 18.78f, 12.9998f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(12.9998f, 16.22f, 13.2198f, 16.0f, 13.4998f, 16.0f)
                horizontalLineTo(14.9998f)
                curveTo(15.5498f, 16.0f, 15.9998f, 15.55f, 15.9998f, 15.0f)
                verticalLineTo(13.5f)
                curveTo(15.9998f, 13.22f, 16.2198f, 13.0f, 16.4998f, 13.0f)
                horizontalLineTo(18.4998f)
                curveTo(18.7798f, 13.0f, 18.9998f, 13.22f, 18.9998f, 13.5f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _icon!!
    }

private var _icon: ImageVector? = null

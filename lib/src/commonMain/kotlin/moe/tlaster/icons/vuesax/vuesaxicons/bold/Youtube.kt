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

public val BoldGroup.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 4.0f, 2.0f, 6.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 18.0f, 4.0f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(17.0f)
                curveTo(20.0f, 20.0f, 22.0f, 18.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 6.0f, 20.0f, 4.0f, 17.0f, 4.0f)
                close()
                moveTo(13.89f, 13.03f)
                lineTo(11.42f, 14.51f)
                curveTo(10.42f, 15.11f, 9.6f, 14.65f, 9.6f, 13.48f)
                verticalLineTo(10.51f)
                curveTo(9.6f, 9.34f, 10.42f, 8.88f, 11.42f, 9.48f)
                lineTo(13.89f, 10.96f)
                curveTo(14.84f, 11.54f, 14.84f, 12.46f, 13.89f, 13.03f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null

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

public val BoldGroup.Happyemoji: ImageVector
    get() {
        if (_happyemoji != null) {
            return _happyemoji!!
        }
        _happyemoji = Builder(name = "Happyemoji", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9707f, 2.0f)
                curveTo(6.4507f, 2.0f, 1.9707f, 6.48f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.52f, 6.4507f, 22.0f, 11.9707f, 22.0f)
                curveTo(17.4907f, 22.0f, 21.9707f, 17.52f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.48f, 17.5007f, 2.0f, 11.9707f, 2.0f)
                close()
                moveTo(17.4007f, 16.43f)
                curveTo(16.1707f, 18.2f, 14.1507f, 19.25f, 12.0007f, 19.25f)
                curveTo(9.8507f, 19.25f, 7.8307f, 18.2f, 6.6007f, 16.43f)
                curveTo(6.3607f, 16.09f, 6.4507f, 15.62f, 6.7907f, 15.39f)
                curveTo(7.1307f, 15.15f, 7.6007f, 15.24f, 7.8307f, 15.58f)
                curveTo(8.7807f, 16.94f, 10.3407f, 17.76f, 12.0007f, 17.76f)
                curveTo(13.6607f, 17.76f, 15.2207f, 16.95f, 16.1707f, 15.58f)
                curveTo(16.4107f, 15.24f, 16.8707f, 15.16f, 17.2107f, 15.39f)
                curveTo(17.5607f, 15.62f, 17.6407f, 16.09f, 17.4007f, 16.43f)
                close()
            }
        }
        .build()
        return _happyemoji!!
    }

private var _happyemoji: ImageVector? = null

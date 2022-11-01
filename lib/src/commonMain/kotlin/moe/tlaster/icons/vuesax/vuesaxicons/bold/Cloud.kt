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

public val BoldGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.74f, 12.9089f)
                curveTo(21.48f, 12.0489f, 21.05f, 11.2989f, 20.48f, 10.6889f)
                curveTo(19.75f, 9.8589f, 18.78f, 9.2889f, 17.69f, 9.0389f)
                curveTo(17.14f, 6.5389f, 15.6f, 4.7389f, 13.41f, 4.0689f)
                curveTo(11.03f, 3.3289f, 8.27f, 4.0489f, 6.54f, 5.8589f)
                curveTo(5.02f, 7.4489f, 4.52f, 9.6389f, 5.11f, 11.9689f)
                curveTo(3.11f, 12.4589f, 2.12f, 14.1289f, 2.01f, 15.7189f)
                curveTo(2.0f, 15.8289f, 2.0f, 15.9289f, 2.0f, 16.0289f)
                curveTo(2.0f, 17.9089f, 3.23f, 20.0189f, 5.97f, 20.2189f)
                horizontalLineTo(16.35f)
                curveTo(17.77f, 20.2189f, 19.13f, 19.6889f, 20.17f, 18.7389f)
                curveTo(21.8f, 17.3089f, 22.4f, 15.0789f, 21.74f, 12.9089f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null

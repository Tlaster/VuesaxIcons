package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Civic: ImageVector
    get() {
        if (_civic != null) {
            return _civic!!
        }
        _civic = Builder(name = "Civic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2991f, 10.1286f)
                curveTo(14.5791f, 11.2286f, 14.0891f, 12.2486f, 13.2491f, 12.7686f)
                verticalLineTo(14.7486f)
                curveTo(13.2491f, 15.4386f, 12.6891f, 15.9986f, 11.9991f, 15.9986f)
                curveTo(11.3091f, 15.9986f, 10.7491f, 15.4386f, 10.7491f, 14.7486f)
                verticalLineTo(12.7686f)
                curveTo(10.0691f, 12.3486f, 9.6191f, 11.5986f, 9.6191f, 10.7486f)
                curveTo(9.6191f, 9.2286f, 11.0591f, 8.0486f, 12.6391f, 8.4686f)
                curveTo(13.4391f, 8.6786f, 14.0891f, 9.3286f, 14.2991f, 10.1286f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(16.74f, 1.25f, 20.86f, 4.29f, 22.27f, 8.8f)
                curveTo(22.39f, 9.2f, 22.17f, 9.62f, 21.78f, 9.74f)
                curveTo(21.38f, 9.86f, 20.96f, 9.64f, 20.84f, 9.25f)
                curveTo(19.63f, 5.36f, 16.08f, 2.75f, 12.01f, 2.75f)
                curveTo(6.91f, 2.75f, 2.76f, 6.9f, 2.76f, 12.0f)
                curveTo(2.76f, 17.1f, 6.91f, 21.25f, 12.01f, 21.25f)
                curveTo(16.07f, 21.25f, 19.62f, 18.65f, 20.83f, 14.78f)
                curveTo(20.95f, 14.38f, 21.37f, 14.17f, 21.77f, 14.29f)
                curveTo(22.17f, 14.41f, 22.38f, 14.84f, 22.26f, 15.23f)
                curveTo(20.84f, 19.73f, 16.72f, 22.75f, 12.0f, 22.75f)
                close()
            }
        }
        .build()
        return _civic!!
    }

private var _civic: ImageVector? = null

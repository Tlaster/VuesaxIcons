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

public val BoldGroup.Spotify: ImageVector
    get() {
        if (_spotify != null) {
            return _spotify!!
        }
        _spotify = Builder(name = "Spotify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.42f, 16.58f)
                curveTo(15.27f, 16.79f, 15.04f, 16.89f, 14.81f, 16.89f)
                curveTo(14.66f, 16.89f, 14.51f, 16.84f, 14.37f, 16.75f)
                curveTo(12.83f, 15.65f, 10.86f, 15.41f, 9.1f, 16.1f)
                curveTo(8.72f, 16.25f, 8.28f, 16.06f, 8.13f, 15.68f)
                curveTo(7.98f, 15.29f, 8.17f, 14.86f, 8.55f, 14.71f)
                curveTo(10.79f, 13.82f, 13.29f, 14.13f, 15.24f, 15.53f)
                curveTo(15.59f, 15.78f, 15.66f, 16.25f, 15.42f, 16.58f)
                close()
                moveTo(16.52f, 13.79f)
                curveTo(16.37f, 14.0f, 16.14f, 14.1f, 15.91f, 14.1f)
                curveTo(15.76f, 14.1f, 15.61f, 14.05f, 15.47f, 13.96f)
                curveTo(13.35f, 12.44f, 10.64f, 12.11f, 8.21f, 13.07f)
                curveTo(7.83f, 13.22f, 7.39f, 13.03f, 7.24f, 12.65f)
                curveTo(7.09f, 12.26f, 7.28f, 11.83f, 7.66f, 11.68f)
                curveTo(10.56f, 10.53f, 13.81f, 10.93f, 16.34f, 12.75f)
                curveTo(16.68f, 12.99f, 16.76f, 13.46f, 16.52f, 13.79f)
                close()
                moveTo(18.09f, 11.11f)
                curveTo(17.94f, 11.32f, 17.71f, 11.42f, 17.48f, 11.42f)
                curveTo(17.33f, 11.42f, 17.18f, 11.37f, 17.04f, 11.28f)
                curveTo(14.06f, 9.14f, 10.24f, 8.67f, 6.84f, 10.03f)
                curveTo(6.45f, 10.18f, 6.02f, 9.99f, 5.87f, 9.61f)
                curveTo(5.72f, 9.23f, 5.91f, 8.79f, 6.29f, 8.64f)
                curveTo(10.17f, 7.1f, 14.52f, 7.63f, 17.92f, 10.07f)
                curveTo(18.26f, 10.3f, 18.34f, 10.77f, 18.09f, 11.11f)
                close()
            }
        }
        .build()
        return _spotify!!
    }

private var _spotify: ImageVector? = null

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

public val BoldGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8894f, 5.1786f)
                verticalLineTo(16.4786f)
                curveTo(20.8894f, 18.4586f, 19.2794f, 20.0686f, 17.2994f, 20.0686f)
                curveTo(15.3294f, 20.0686f, 13.7094f, 18.4586f, 13.7094f, 16.4786f)
                curveTo(13.7094f, 14.5086f, 15.3294f, 12.8986f, 17.2994f, 12.8986f)
                curveTo(18.1394f, 12.8986f, 18.8894f, 13.1886f, 19.4994f, 13.6686f)
                verticalLineTo(7.7186f)
                lineTo(10.2894f, 10.3386f)
                verticalLineTo(18.4086f)
                curveTo(10.2894f, 20.3886f, 8.6694f, 21.9986f, 6.6994f, 21.9986f)
                curveTo(4.7194f, 21.9986f, 3.1094f, 20.3886f, 3.1094f, 18.4086f)
                curveTo(3.1094f, 16.4386f, 4.7194f, 14.8286f, 6.6994f, 14.8286f)
                curveTo(7.5294f, 14.8286f, 8.2794f, 15.1186f, 8.8894f, 15.5886f)
                verticalLineTo(6.7486f)
                curveTo(8.8894f, 5.2786f, 9.7794f, 4.1386f, 11.1894f, 3.7586f)
                lineTo(16.9694f, 2.1786f)
                curveTo(18.1394f, 1.8586f, 19.1294f, 1.9686f, 19.8294f, 2.5086f)
                curveTo(20.5394f, 3.0386f, 20.8894f, 3.9386f, 20.8894f, 5.1786f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null

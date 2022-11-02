package moe.tlaster.icons.vuesax.vuesaxicons.bulk

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
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2894f, 10.3398f)
                verticalLineTo(18.4098f)
                curveTo(10.2894f, 20.3898f, 8.6694f, 21.9998f, 6.6994f, 21.9998f)
                curveTo(4.7194f, 21.9998f, 3.1094f, 20.3898f, 3.1094f, 18.4098f)
                curveTo(3.1094f, 16.4398f, 4.7194f, 14.8298f, 6.6994f, 14.8298f)
                curveTo(7.5294f, 14.8298f, 8.2794f, 15.1198f, 8.8894f, 15.5898f)
                verticalLineTo(10.7398f)
                lineTo(10.2894f, 10.3398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8909f, 7.3198f)
                verticalLineTo(16.4798f)
                curveTo(20.8909f, 18.4598f, 19.2809f, 20.0698f, 17.3009f, 20.0698f)
                curveTo(15.3309f, 20.0698f, 13.7109f, 18.4598f, 13.7109f, 16.4798f)
                curveTo(13.7109f, 14.5098f, 15.3309f, 12.8998f, 17.3009f, 12.8998f)
                curveTo(18.1409f, 12.8998f, 18.8909f, 13.1898f, 19.5009f, 13.6698f)
                verticalLineTo(7.7198f)
                lineTo(20.8909f, 7.3198f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.8906f, 5.1801f)
                verticalLineTo(7.3201f)
                lineTo(8.8906f, 10.7401f)
                verticalLineTo(6.7501f)
                curveTo(8.8906f, 5.2801f, 9.7806f, 4.1401f, 11.1906f, 3.7601f)
                lineTo(16.9706f, 2.1801f)
                curveTo(18.1406f, 1.8601f, 19.1306f, 1.9701f, 19.8306f, 2.5101f)
                curveTo(20.5406f, 3.0401f, 20.8906f, 3.9401f, 20.8906f, 5.1801f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null

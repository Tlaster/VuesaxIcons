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

public val BoldGroup.Lampon: ImageVector
    get() {
        if (_lampon != null) {
            return _lampon!!
        }
        _lampon = Builder(name = "Lampon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2107f, 6.3615f)
                curveTo(18.1707f, 4.2615f, 16.1607f, 2.7115f, 13.8307f, 2.2015f)
                curveTo(11.3907f, 1.6615f, 8.8907f, 2.2415f, 6.9807f, 3.7815f)
                curveTo(5.0607f, 5.3115f, 3.9707f, 7.6015f, 3.9707f, 10.0515f)
                curveTo(3.9707f, 12.6415f, 5.5207f, 15.3515f, 7.8607f, 16.9215f)
                verticalLineTo(17.7515f)
                curveTo(7.8507f, 18.0315f, 7.8407f, 18.4615f, 8.1807f, 18.8115f)
                curveTo(8.5307f, 19.1715f, 9.0507f, 19.2115f, 9.4607f, 19.2115f)
                horizontalLineTo(14.5907f)
                curveTo(15.1307f, 19.2115f, 15.5407f, 19.0615f, 15.8207f, 18.7815f)
                curveTo(16.2007f, 18.3915f, 16.1907f, 17.8915f, 16.1807f, 17.6215f)
                verticalLineTo(16.9215f)
                curveTo(19.2807f, 14.8315f, 21.2307f, 10.4215f, 19.2107f, 6.3615f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2592f, 21.9984f)
                curveTo(15.1992f, 21.9984f, 15.1292f, 21.9884f, 15.0692f, 21.9684f)
                curveTo(13.0592f, 21.3984f, 10.9492f, 21.3984f, 8.9392f, 21.9684f)
                curveTo(8.5692f, 22.0684f, 8.1792f, 21.8584f, 8.0792f, 21.4884f)
                curveTo(7.9692f, 21.1184f, 8.1892f, 20.7284f, 8.5592f, 20.6284f)
                curveTo(10.8192f, 19.9884f, 13.1992f, 19.9884f, 15.4592f, 20.6284f)
                curveTo(15.8292f, 20.7384f, 16.0492f, 21.1184f, 15.9392f, 21.4884f)
                curveTo(15.8392f, 21.7984f, 15.5592f, 21.9984f, 15.2592f, 21.9984f)
                close()
            }
        }
        .build()
        return _lampon!!
    }

private var _lampon: ImageVector? = null

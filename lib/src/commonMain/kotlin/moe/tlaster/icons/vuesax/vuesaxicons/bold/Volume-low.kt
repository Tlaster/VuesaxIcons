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

public val BoldGroup.`Volume-low`: ImageVector
    get() {
        if (`_volume-low` != null) {
            return `_volume-low`!!
        }
        `_volume-low` = Builder(name = "Volume-low", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3284f, 16.7503f)
                curveTo(19.1684f, 16.7503f, 19.0184f, 16.7003f, 18.8784f, 16.6003f)
                curveTo(18.5484f, 16.3503f, 18.4784f, 15.8803f, 18.7284f, 15.5503f)
                curveTo(20.2984f, 13.4603f, 20.2984f, 10.5403f, 18.7284f, 8.4503f)
                curveTo(18.4784f, 8.1203f, 18.5484f, 7.6503f, 18.8784f, 7.4003f)
                curveTo(19.2084f, 7.1503f, 19.6784f, 7.2203f, 19.9284f, 7.5503f)
                curveTo(21.8984f, 10.1703f, 21.8984f, 13.8303f, 19.9284f, 16.4503f)
                curveTo(19.7884f, 16.6503f, 19.5584f, 16.7503f, 19.3284f, 16.7503f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3481f, 3.7817f)
                curveTo(14.2281f, 3.1617f, 12.7981f, 3.3217f, 11.3381f, 4.2317f)
                lineTo(8.4181f, 6.0617f)
                curveTo(8.2181f, 6.1817f, 7.9881f, 6.2517f, 7.7581f, 6.2517f)
                horizontalLineTo(6.8281f)
                horizontalLineTo(6.3281f)
                curveTo(3.9081f, 6.2517f, 2.5781f, 7.5817f, 2.5781f, 10.0017f)
                verticalLineTo(14.0017f)
                curveTo(2.5781f, 16.4217f, 3.9081f, 17.7517f, 6.3281f, 17.7517f)
                horizontalLineTo(6.8281f)
                horizontalLineTo(7.7581f)
                curveTo(7.9881f, 17.7517f, 8.2181f, 17.8217f, 8.4181f, 17.9417f)
                lineTo(11.3381f, 19.7717f)
                curveTo(12.2181f, 20.3217f, 13.0781f, 20.5917f, 13.8781f, 20.5917f)
                curveTo(14.3981f, 20.5917f, 14.8981f, 20.4717f, 15.3481f, 20.2217f)
                curveTo(16.4581f, 19.6017f, 17.0781f, 18.3117f, 17.0781f, 16.5917f)
                verticalLineTo(7.4117f)
                curveTo(17.0781f, 5.6917f, 16.4581f, 4.4017f, 15.3481f, 3.7817f)
                close()
            }
        }
        .build()
        return `_volume-low`!!
    }

private var `_volume-low`: ImageVector? = null

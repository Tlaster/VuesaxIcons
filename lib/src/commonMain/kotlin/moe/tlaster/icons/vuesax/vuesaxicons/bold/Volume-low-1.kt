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

public val BoldGroup.`Volume-low-1`: ImageVector
    get() {
        if (`_volume-low-1` != null) {
            return `_volume-low-1`!!
        }
        `_volume-low-1` = Builder(name = "Volume-low-1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.75f)
                horizontalLineTo(18.0f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12.0f)
                curveTo(17.25f, 11.59f, 17.59f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12.0f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.02f, 3.7817f)
                curveTo(12.9f, 3.1617f, 11.47f, 3.3217f, 10.01f, 4.2317f)
                lineTo(7.09f, 6.0617f)
                curveTo(6.89f, 6.1817f, 6.66f, 6.2517f, 6.43f, 6.2517f)
                horizontalLineTo(5.5f)
                horizontalLineTo(5.0f)
                curveTo(2.58f, 6.2517f, 1.25f, 7.5817f, 1.25f, 10.0017f)
                verticalLineTo(14.0017f)
                curveTo(1.25f, 16.4217f, 2.58f, 17.7517f, 5.0f, 17.7517f)
                horizontalLineTo(5.5f)
                horizontalLineTo(6.43f)
                curveTo(6.66f, 17.7517f, 6.89f, 17.8217f, 7.09f, 17.9417f)
                lineTo(10.01f, 19.7717f)
                curveTo(10.89f, 20.3217f, 11.75f, 20.5917f, 12.55f, 20.5917f)
                curveTo(13.07f, 20.5917f, 13.57f, 20.4717f, 14.02f, 20.2217f)
                curveTo(15.13f, 19.6017f, 15.75f, 18.3117f, 15.75f, 16.5917f)
                verticalLineTo(7.4117f)
                curveTo(15.75f, 5.6917f, 15.13f, 4.4017f, 14.02f, 3.7817f)
                close()
            }
        }
        .build()
        return `_volume-low-1`!!
    }

private var `_volume-low-1`: ImageVector? = null

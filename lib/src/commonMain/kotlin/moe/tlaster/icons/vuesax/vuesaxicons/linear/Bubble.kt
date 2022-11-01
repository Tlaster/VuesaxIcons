package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Bubble: ImageVector
    get() {
        if (_bubble != null) {
            return _bubble!!
        }
        _bubble = Builder(name = "Bubble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.59f, 12.26f)
                curveTo(18.4232f, 12.26f, 20.72f, 9.9632f, 20.72f, 7.13f)
                curveTo(20.72f, 4.2968f, 18.4232f, 2.0f, 15.59f, 2.0f)
                curveTo(12.7567f, 2.0f, 10.46f, 4.2968f, 10.46f, 7.13f)
                curveTo(10.46f, 9.9632f, 12.7567f, 12.26f, 15.59f, 12.26f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.36f, 19.44f)
                curveTo(8.0611f, 19.44f, 9.44f, 18.0611f, 9.44f, 16.36f)
                curveTo(9.44f, 14.659f, 8.0611f, 13.28f, 6.36f, 13.28f)
                curveTo(4.659f, 13.28f, 3.28f, 14.659f, 3.28f, 16.36f)
                curveTo(3.28f, 18.0611f, 4.659f, 19.44f, 6.36f, 19.44f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.62f, 22.0f)
                curveTo(18.0338f, 22.0f, 19.18f, 20.8539f, 19.18f, 19.44f)
                curveTo(19.18f, 18.0262f, 18.0338f, 16.88f, 16.62f, 16.88f)
                curveTo(15.2061f, 16.88f, 14.06f, 18.0262f, 14.06f, 19.44f)
                curveTo(14.06f, 20.8539f, 15.2061f, 22.0f, 16.62f, 22.0f)
                close()
            }
        }
        .build()
        return _bubble!!
    }

private var _bubble: ImageVector? = null

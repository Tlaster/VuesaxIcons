package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Directdown: ImageVector
    get() {
        if (_directdown != null) {
            return _directdown!!
        }
        _directdown = Builder(name = "Directdown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 21.7498f)
                curveTo(10.5298f, 21.7498f, 9.1898f, 20.9398f, 8.5098f, 19.6398f)
                lineTo(2.4098f, 8.0498f)
                curveTo(1.5898f, 6.4998f, 1.8599f, 4.6998f, 3.0798f, 3.4498f)
                curveTo(4.2998f, 2.1998f, 6.0999f, 1.8998f, 7.6599f, 2.6798f)
                lineTo(10.8998f, 4.2998f)
                curveTo(11.5798f, 4.6398f, 12.3998f, 4.6398f, 13.0898f, 4.2998f)
                lineTo(16.3298f, 2.6798f)
                curveTo(17.8998f, 1.8998f, 19.6998f, 2.1998f, 20.9198f, 3.4498f)
                curveTo(22.1398f, 4.6998f, 22.4098f, 6.4998f, 21.5898f, 8.0498f)
                lineTo(15.4898f, 19.6398f)
                curveTo(14.8098f, 20.9398f, 13.4698f, 21.7498f, 11.9998f, 21.7498f)
                close()
                moveTo(5.8798f, 3.7498f)
                curveTo(5.1698f, 3.7498f, 4.5498f, 4.0898f, 4.1498f, 4.4998f)
                curveTo(3.5498f, 5.1198f, 3.1198f, 6.1898f, 3.7299f, 7.3498f)
                lineTo(9.8299f, 18.9398f)
                curveTo(10.2598f, 19.7598f, 11.0698f, 20.2498f, 11.9898f, 20.2498f)
                curveTo(12.9098f, 20.2498f, 13.7198f, 19.7598f, 14.1498f, 18.9398f)
                lineTo(20.2498f, 7.3498f)
                curveTo(20.8598f, 6.1898f, 20.4398f, 5.1098f, 19.8298f, 4.4998f)
                curveTo(19.2298f, 3.8898f, 18.1698f, 3.4398f, 16.9898f, 4.0198f)
                lineTo(13.7498f, 5.6398f)
                curveTo(12.6398f, 6.1898f, 11.3298f, 6.1898f, 10.2198f, 5.6398f)
                lineTo(6.9899f, 4.0198f)
                curveTo(6.6098f, 3.8298f, 6.2298f, 3.7498f, 5.8798f, 3.7498f)
                close()
            }
        }
        .build()
        return _directdown!!
    }

private var _directdown: ImageVector? = null

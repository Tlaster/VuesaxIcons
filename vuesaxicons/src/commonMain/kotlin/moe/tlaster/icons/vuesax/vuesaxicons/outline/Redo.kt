package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8691f, 19.0601f)
                horizontalLineTo(8.8691f)
                curveTo(5.6991f, 19.0601f, 3.1191f, 16.4801f, 3.1191f, 13.3101f)
                curveTo(3.1191f, 10.1401f, 5.6991f, 7.5601f, 8.8691f, 7.5601f)
                horizontalLineTo(19.8691f)
                curveTo(20.2791f, 7.5601f, 20.6191f, 7.9001f, 20.6191f, 8.3101f)
                curveTo(20.6191f, 8.7201f, 20.2791f, 9.0601f, 19.8691f, 9.0601f)
                horizontalLineTo(8.8691f)
                curveTo(6.5291f, 9.0601f, 4.6191f, 10.9701f, 4.6191f, 13.3101f)
                curveTo(4.6191f, 15.6501f, 6.5291f, 17.5601f, 8.8691f, 17.5601f)
                horizontalLineTo(16.8691f)
                curveTo(17.2791f, 17.5601f, 17.6191f, 17.9001f, 17.6191f, 18.3101f)
                curveTo(17.6191f, 18.7201f, 17.2891f, 19.0601f, 16.8691f, 19.0601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5698f, 11.5599f)
                curveTo(17.3798f, 11.5599f, 17.1898f, 11.4899f, 17.0398f, 11.3399f)
                curveTo(16.7498f, 11.0499f, 16.7498f, 10.5699f, 17.0398f, 10.2799f)
                lineTo(19.0698f, 8.2499f)
                lineTo(17.0398f, 6.2199f)
                curveTo(16.7498f, 5.9299f, 16.7498f, 5.4499f, 17.0398f, 5.1599f)
                curveTo(17.3298f, 4.8699f, 17.8098f, 4.8699f, 18.0998f, 5.1599f)
                lineTo(20.6598f, 7.7199f)
                curveTo(20.9498f, 8.0099f, 20.9498f, 8.4899f, 20.6598f, 8.7799f)
                lineTo(18.0998f, 11.3399f)
                curveTo(17.9498f, 11.4899f, 17.7598f, 11.5599f, 17.5698f, 11.5599f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null

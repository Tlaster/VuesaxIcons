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

public val OutlineGroup.Musicnote: ImageVector
    get() {
        if (_musicnote != null) {
            return _musicnote!!
        }
        _musicnote = Builder(name = "Musicnote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9707f, 22.75f)
                curveTo(5.3507f, 22.75f, 3.2207f, 20.62f, 3.2207f, 18.0f)
                curveTo(3.2207f, 15.38f, 5.3507f, 13.25f, 7.9707f, 13.25f)
                curveTo(10.5907f, 13.25f, 12.7207f, 15.38f, 12.7207f, 18.0f)
                curveTo(12.7207f, 20.62f, 10.5907f, 22.75f, 7.9707f, 22.75f)
                close()
                moveTo(7.9707f, 14.75f)
                curveTo(6.1807f, 14.75f, 4.7207f, 16.21f, 4.7207f, 18.0f)
                curveTo(4.7207f, 19.79f, 6.1807f, 21.25f, 7.9707f, 21.25f)
                curveTo(9.7607f, 21.25f, 11.2207f, 19.79f, 11.2207f, 18.0f)
                curveTo(11.2207f, 16.21f, 9.7707f, 14.75f, 7.9707f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9707f, 18.75f)
                curveTo(11.5607f, 18.75f, 11.2207f, 18.41f, 11.2207f, 18.0f)
                verticalLineTo(4.0f)
                curveTo(11.2207f, 3.59f, 11.5607f, 3.25f, 11.9707f, 3.25f)
                curveTo(12.3807f, 3.25f, 12.7207f, 3.59f, 12.7207f, 4.0f)
                verticalLineTo(18.0f)
                curveTo(12.7207f, 18.41f, 12.3907f, 18.75f, 11.9707f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1305f, 10.2299f)
                curveTo(18.8005f, 10.2299f, 18.4505f, 10.1699f, 18.1105f, 10.0599f)
                lineTo(13.6905f, 8.5899f)
                curveTo(12.3105f, 8.1299f, 11.2305f, 6.6299f, 11.2305f, 5.1799f)
                verticalLineTo(3.9999f)
                curveTo(11.2305f, 3.0299f, 11.6305f, 2.1899f, 12.3105f, 1.6899f)
                curveTo(13.0005f, 1.1899f, 13.9205f, 1.0899f, 14.8405f, 1.3899f)
                lineTo(19.2605f, 2.8599f)
                curveTo(20.6405f, 3.3199f, 21.7205f, 4.8199f, 21.7205f, 6.2699f)
                verticalLineTo(7.4399f)
                curveTo(21.7205f, 8.4099f, 21.3205f, 9.2499f, 20.6405f, 9.7499f)
                curveTo(20.2105f, 10.0799f, 19.6805f, 10.2299f, 19.1305f, 10.2299f)
                close()
                moveTo(13.8205f, 2.7199f)
                curveTo(13.5805f, 2.7199f, 13.3605f, 2.7799f, 13.1905f, 2.9099f)
                curveTo(12.8905f, 3.1199f, 12.7305f, 3.5099f, 12.7305f, 3.9999f)
                verticalLineTo(5.1699f)
                curveTo(12.7305f, 5.9699f, 13.4005f, 6.8999f, 14.1605f, 7.1599f)
                lineTo(18.5805f, 8.6299f)
                curveTo(19.0405f, 8.7899f, 19.4705f, 8.7499f, 19.7605f, 8.5399f)
                curveTo(20.0605f, 8.3299f, 20.2205f, 7.9399f, 20.2205f, 7.4499f)
                verticalLineTo(6.2799f)
                curveTo(20.2205f, 5.4799f, 19.5505f, 4.5499f, 18.7905f, 4.2899f)
                lineTo(14.3705f, 2.8199f)
                curveTo(14.1805f, 2.7499f, 13.9905f, 2.7199f, 13.8205f, 2.7199f)
                close()
            }
        }
        .build()
        return _musicnote!!
    }

private var _musicnote: ImageVector? = null

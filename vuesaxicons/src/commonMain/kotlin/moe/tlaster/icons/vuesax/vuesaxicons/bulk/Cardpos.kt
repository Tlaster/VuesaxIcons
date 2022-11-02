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

public val BulkGroup.Cardpos: ImageVector
    get() {
        if (_cardpos != null) {
            return _cardpos!!
        }
        _cardpos = Builder(name = "Cardpos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 22.0f)
                horizontalLineTo(2.75f)
                curveTo(2.34f, 22.0f, 2.0f, 21.66f, 2.0f, 21.25f)
                curveTo(2.0f, 20.84f, 2.34f, 20.5f, 2.75f, 20.5f)
                horizontalLineTo(21.25f)
                curveTo(21.66f, 20.5f, 22.0f, 20.84f, 22.0f, 21.25f)
                curveTo(22.0f, 21.66f, 21.66f, 22.0f, 21.25f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5909f, 13.7002f)
                lineTo(13.3609f, 20.9302f)
                curveTo(11.9409f, 22.3502f, 9.6509f, 22.3502f, 8.2409f, 20.9402f)
                lineTo(3.6309f, 16.3302f)
                lineTo(15.9909f, 3.9702f)
                lineTo(20.6009f, 8.5802f)
                curveTo(22.0109f, 9.9902f, 22.0109f, 12.2802f, 20.5909f, 13.7002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9906f, 3.9702f)
                lineTo(3.6205f, 16.3302f)
                lineTo(2.7106f, 15.4202f)
                curveTo(1.3005f, 14.0102f, 1.3005f, 11.7202f, 2.7206f, 10.3002f)
                lineTo(9.9506f, 3.0702f)
                curveTo(11.3706f, 1.6502f, 13.6606f, 1.6502f, 15.0705f, 3.0602f)
                lineTo(15.9906f, 3.9702f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8903f, 17.5999f)
                lineTo(11.5403f, 18.9499f)
                curveTo(11.2603f, 19.2299f, 10.8103f, 19.2299f, 10.5303f, 18.9499f)
                curveTo(10.2503f, 18.6699f, 10.2503f, 18.2199f, 10.5303f, 17.9399f)
                lineTo(11.8803f, 16.5899f)
                curveTo(12.1603f, 16.3099f, 12.6103f, 16.3099f, 12.8903f, 16.5899f)
                curveTo(13.1703f, 16.8699f, 13.1703f, 17.3199f, 12.8903f, 17.5999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2694f, 13.22f)
                lineTo(14.5794f, 15.91f)
                curveTo(14.2994f, 16.19f, 13.8494f, 16.19f, 13.5694f, 15.91f)
                curveTo(13.2894f, 15.63f, 13.2894f, 15.18f, 13.5694f, 14.9f)
                lineTo(16.2594f, 12.21f)
                curveTo(16.5394f, 11.93f, 16.9894f, 11.93f, 17.2694f, 12.21f)
                curveTo(17.5394f, 12.49f, 17.5394f, 12.94f, 17.2694f, 13.22f)
                close()
            }
        }
        .build()
        return _cardpos!!
    }

private var _cardpos: ImageVector? = null

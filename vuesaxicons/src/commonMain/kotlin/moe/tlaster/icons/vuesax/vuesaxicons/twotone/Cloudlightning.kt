package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Cloudlightning: ImageVector
    get() {
        if (_cloudlightning != null) {
            return _cloudlightning!!
        }
        _cloudlightning = Builder(name = "Cloudlightning", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.6097f, 19.9999f)
                curveTo(17.9497f, 20.0099f, 19.2397f, 19.5099f, 20.2297f, 18.6099f)
                curveTo(23.4997f, 15.7499f, 21.7497f, 10.0099f, 17.4397f, 9.4699f)
                curveTo(15.8997f, 0.1299f, 2.4297f, 3.67f, 5.6197f, 12.5599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2794f, 12.9698f)
                curveTo(6.7494f, 12.6998f, 6.1594f, 12.5598f, 5.5694f, 12.5698f)
                curveTo(0.9094f, 12.8998f, 0.9194f, 19.6798f, 5.5694f, 20.0098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8203f, 9.89f)
                curveTo(16.3403f, 9.63f, 16.9003f, 9.49f, 17.4803f, 9.48f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2291f, 19.1598f)
                horizontalLineTo(10.2291f)
                verticalLineTo(21.4898f)
                curveTo(10.2291f, 21.8298f, 10.6591f, 21.9998f, 10.8791f, 21.7398f)
                lineTo(13.3291f, 18.9498f)
                curveTo(13.6291f, 18.6098f, 13.4991f, 18.3298f, 13.0491f, 18.3298f)
                horizontalLineTo(12.0491f)
                verticalLineTo(15.9998f)
                curveTo(12.0491f, 15.6598f, 11.6191f, 15.4898f, 11.3991f, 15.7498f)
                lineTo(8.9491f, 18.5398f)
                curveTo(8.6491f, 18.8798f, 8.7791f, 19.1598f, 9.2291f, 19.1598f)
                close()
            }
        }
        .build()
        return _cloudlightning!!
    }

private var _cloudlightning: ImageVector? = null

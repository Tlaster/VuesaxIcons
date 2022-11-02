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

public val TwotoneGroup.Cloudminus: ImageVector
    get() {
        if (_cloudminus != null) {
            return _cloudminus!!
        }
        _cloudminus = Builder(name = "Cloudminus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9707f, 20.0f)
                horizontalLineTo(8.9707f)
            }
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
        }
        .build()
        return _cloudminus!!
    }

private var _cloudminus: ImageVector? = null

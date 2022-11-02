package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Linkcircle: ImageVector
    get() {
        if (_linkcircle != null) {
            return _linkcircle!!
        }
        _linkcircle = Builder(name = "Linkcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.9407f, 14.5099f)
                curveTo(7.3207f, 14.2799f, 6.7707f, 13.8299f, 6.4207f, 13.1899f)
                curveTo(5.6207f, 11.7299f, 6.1107f, 9.8299f, 7.5307f, 8.9499f)
                lineTo(9.8707f, 7.4999f)
                curveTo(11.2807f, 6.6199f, 13.1007f, 7.0999f, 13.9007f, 8.5499f)
                curveTo(14.7007f, 10.0099f, 14.2107f, 11.9099f, 12.7907f, 12.7899f)
                lineTo(12.4807f, 13.0099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.1092f, 9.45f)
                curveTo(16.7292f, 9.6799f, 17.2792f, 10.1299f, 17.6292f, 10.7699f)
                curveTo(18.4292f, 12.2299f, 17.9392f, 14.1299f, 16.5192f, 15.0099f)
                lineTo(14.1792f, 16.4599f)
                curveTo(12.7692f, 17.3399f, 10.9492f, 16.8599f, 10.1492f, 15.4099f)
                curveTo(9.3492f, 13.9499f, 9.8392f, 12.05f, 11.2592f, 11.17f)
                lineTo(11.5692f, 10.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(2.75f, 7.67f, 2.0f, 9.75f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.57f, 2.0f, 9.2f, 2.3f, 7.97f, 2.85f)
            }
        }
        .build()
        return _linkcircle!!
    }

private var _linkcircle: ImageVector? = null

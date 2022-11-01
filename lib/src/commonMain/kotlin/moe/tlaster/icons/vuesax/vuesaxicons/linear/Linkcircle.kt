package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Linkcircle: ImageVector
    get() {
        if (_linkcircle != null) {
            return _linkcircle!!
        }
        _linkcircle = Builder(name = "Linkcircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.94f, 14.5099f)
                curveTo(7.32f, 14.2799f, 6.77f, 13.8299f, 6.42f, 13.1899f)
                curveTo(5.62f, 11.7299f, 6.11f, 9.8299f, 7.53f, 8.9499f)
                lineTo(9.87f, 7.4999f)
                curveTo(11.28f, 6.6199f, 13.1f, 7.0999f, 13.9f, 8.5499f)
                curveTo(14.7f, 10.0099f, 14.21f, 11.9099f, 12.79f, 12.7899f)
                lineTo(12.48f, 13.0099f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.11f, 9.45f)
                curveTo(16.73f, 9.6799f, 17.28f, 10.1299f, 17.63f, 10.7699f)
                curveTo(18.43f, 12.2299f, 17.94f, 14.1299f, 16.52f, 15.0099f)
                lineTo(14.1799f, 16.4599f)
                curveTo(12.7699f, 17.3399f, 10.9499f, 16.8599f, 10.1499f, 15.4099f)
                curveTo(9.3499f, 13.9499f, 9.8399f, 12.05f, 11.2599f, 11.17f)
                lineTo(11.57f, 10.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _linkcircle!!
    }

private var _linkcircle: ImageVector? = null

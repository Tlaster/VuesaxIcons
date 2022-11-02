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

public val BrokenGroup.Ethereumclassic: ImageVector
    get() {
        if (_ethereumclassic != null) {
            return _ethereumclassic!!
        }
        _ethereumclassic = Builder(name = "Ethereumclassic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9001f, 9.1001f)
                lineTo(11.6701f, 6.9801f)
                curveTo(11.8801f, 6.8901f, 12.1201f, 6.8901f, 12.3201f, 6.9801f)
                lineTo(17.0901f, 9.1001f)
                curveTo(17.5101f, 9.2901f, 17.9001f, 8.7801f, 17.6101f, 8.4201f)
                lineTo(12.6101f, 2.3101f)
                curveTo(12.2701f, 1.8901f, 11.7101f, 1.8901f, 11.3701f, 2.3101f)
                lineTo(6.3701f, 8.4201f)
                curveTo(6.0901f, 8.7801f, 6.4801f, 9.2901f, 6.9001f, 9.1001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9006f, 14.9f)
                lineTo(11.6805f, 17.02f)
                curveTo(11.8905f, 17.11f, 12.1305f, 17.11f, 12.3305f, 17.02f)
                lineTo(17.1105f, 14.9f)
                curveTo(17.5305f, 14.71f, 17.9205f, 15.22f, 17.6305f, 15.58f)
                lineTo(12.6305f, 21.69f)
                curveTo(12.2905f, 22.11f, 11.7305f, 22.11f, 11.3905f, 21.69f)
                lineTo(6.3906f, 15.58f)
                curveTo(6.0905f, 15.22f, 6.4706f, 14.71f, 6.9006f, 14.9f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0098f, 12.6199f)
                lineTo(17.2397f, 11.9999f)
                lineTo(11.9998f, 9.3799f)
                lineTo(6.7598f, 11.9999f)
                lineTo(11.9998f, 14.6199f)
                lineTo(12.7997f, 14.2199f)
            }
        }
        .build()
        return _ethereumclassic!!
    }

private var _ethereumclassic: ImageVector? = null

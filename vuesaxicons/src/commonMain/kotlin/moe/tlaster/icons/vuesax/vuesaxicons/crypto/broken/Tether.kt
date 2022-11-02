package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Tether: ImageVector
    get() {
        if (_tether != null) {
            return _tether!!
        }
        _tether = Builder(name = "Tether", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.1004f, 16.2201f)
                lineTo(14.0804f, 19.8701f)
                curveTo(12.9304f, 20.9101f, 11.0604f, 20.9101f, 9.9104f, 19.8701f)
                lineTo(2.9804f, 13.5801f)
                curveTo(2.0204f, 12.7101f, 1.7104f, 11.0601f, 2.2904f, 9.9001f)
                lineTo(4.6904f, 5.0801f)
                curveTo(5.1604f, 4.1301f, 6.4104f, 3.3601f, 7.4704f, 3.3601f)
                horizontalLineTo(16.5304f)
                curveTo(17.5904f, 3.3601f, 18.8404f, 4.1301f, 19.3104f, 5.0801f)
                lineTo(21.7104f, 9.9001f)
                curveTo(22.2904f, 11.0601f, 21.9704f, 12.7101f, 21.0204f, 13.5801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                verticalLineTo(8.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 8.5f)
                horizontalLineTo(16.0f)
            }
        }
        .build()
        return _tether!!
    }

private var _tether: ImageVector? = null

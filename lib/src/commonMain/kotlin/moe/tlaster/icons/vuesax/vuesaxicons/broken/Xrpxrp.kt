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

public val BrokenGroup.Xrpxrp: ImageVector
    get() {
        if (_xrpxrp != null) {
            return _xrpxrp!!
        }
        _xrpxrp = Builder(name = "Xrpxrp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.3304f, 6.15f)
                lineTo(20.6904f, 3.79f)
                curveTo(21.3504f, 3.13f, 20.8804f, 2.0f, 19.9504f, 2.0f)
                horizontalLineTo(18.5404f)
                curveTo(17.7104f, 2.0f, 16.9104f, 2.33f, 16.3204f, 2.92f)
                lineTo(12.7404f, 6.5f)
                curveTo(12.3304f, 6.91f, 11.6704f, 6.91f, 11.2604f, 6.5f)
                lineTo(7.6804f, 2.92f)
                curveTo(7.0904f, 2.33f, 6.2904f, 2.0f, 5.4604f, 2.0f)
                horizontalLineTo(4.0504f)
                curveTo(3.1204f, 2.0f, 2.6504f, 3.13f, 3.3104f, 3.79f)
                lineTo(9.0404f, 9.52f)
                curveTo(10.6804f, 11.16f, 13.3304f, 11.16f, 14.9704f, 9.52f)
                lineTo(15.5304f, 8.96f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4604f, 21.97f)
                horizontalLineTo(4.0504f)
                curveTo(3.1204f, 21.97f, 2.6504f, 20.84f, 3.3104f, 20.18f)
                lineTo(9.0404f, 14.45f)
                curveTo(10.6804f, 12.81f, 13.3304f, 12.81f, 14.9704f, 14.45f)
                lineTo(20.7004f, 20.18f)
                curveTo(21.3604f, 20.84f, 20.8904f, 21.97f, 19.9604f, 21.97f)
                horizontalLineTo(18.5504f)
                curveTo(17.7204f, 21.97f, 16.9204f, 21.64f, 16.3304f, 21.05f)
                lineTo(12.7504f, 17.47f)
                curveTo(12.3404f, 17.06f, 11.6804f, 17.06f, 11.2704f, 17.47f)
                lineTo(7.6904f, 21.05f)
                curveTo(7.0904f, 21.64f, 6.2904f, 21.97f, 5.4604f, 21.97f)
                close()
            }
        }
        .build()
        return _xrpxrp!!
    }

private var _xrpxrp: ImageVector? = null

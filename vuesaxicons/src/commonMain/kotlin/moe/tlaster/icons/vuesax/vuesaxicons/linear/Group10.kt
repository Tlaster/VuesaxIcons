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

public val LinearGroup.Group10: ImageVector
    get() {
        if (_group10 != null) {
            return _group10!!
        }
        _group10 = Builder(name = "Group10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.07f, 2.8201f)
                lineTo(3.14f, 8.3701f)
                curveTo(2.36f, 8.9901f, 1.86f, 10.3001f, 2.03f, 11.2801f)
                lineTo(3.36f, 19.2401f)
                curveTo(3.6f, 20.6601f, 4.96f, 21.8101f, 6.4f, 21.8101f)
                horizontalLineTo(17.6f)
                curveTo(19.03f, 21.8101f, 20.4f, 20.6501f, 20.64f, 19.2401f)
                lineTo(21.97f, 11.2801f)
                curveTo(22.13f, 10.3001f, 21.63f, 8.9901f, 20.86f, 8.3701f)
                lineTo(13.93f, 2.8301f)
                curveTo(12.86f, 1.9701f, 11.13f, 1.9701f, 10.07f, 2.8201f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.5f)
                curveTo(13.3807f, 15.5f, 14.5f, 14.3807f, 14.5f, 13.0f)
                curveTo(14.5f, 11.6193f, 13.3807f, 10.5f, 12.0f, 10.5f)
                curveTo(10.6193f, 10.5f, 9.5f, 11.6193f, 9.5f, 13.0f)
                curveTo(9.5f, 14.3807f, 10.6193f, 15.5f, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _group10!!
    }

private var _group10: ImageVector? = null

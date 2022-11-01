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

public val LinearGroup.Omegacircle: ImageVector
    get() {
        if (_omegacircle != null) {
            return _omegacircle!!
        }
        _omegacircle = Builder(name = "Omegacircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 16.5f)
                horizontalLineTo(13.9f)
                lineTo(15.52f, 14.71f)
                curveTo(16.32f, 13.82f, 16.76f, 12.69f, 16.76f, 11.53f)
                curveTo(16.76f, 10.33f, 16.26f, 9.18f, 15.37f, 8.33f)
                curveTo(14.48f, 7.48f, 13.27f, 7.0f, 12.0f, 7.0f)
                curveTo(10.74f, 7.0f, 9.53f, 7.48f, 8.63f, 8.33f)
                curveTo(7.74f, 9.18f, 7.24f, 10.33f, 7.24f, 11.53f)
                curveTo(7.24f, 12.7f, 7.68f, 13.83f, 8.48f, 14.71f)
                lineTo(10.1f, 16.5f)
                horizontalLineTo(7.0f)
            }
        }
        .build()
        return _omegacircle!!
    }

private var _omegacircle: ImageVector? = null

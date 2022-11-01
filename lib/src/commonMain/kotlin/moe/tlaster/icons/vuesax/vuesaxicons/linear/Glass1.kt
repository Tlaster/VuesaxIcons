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

public val LinearGroup.Glass1: ImageVector
    get() {
        if (_glass1 != null) {
            return _glass1!!
        }
        _glass1 = Builder(name = "Glass1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.16f, 22.0f)
                curveTo(3.98f, 22.0f, 3.14f, 19.47f, 4.5f, 16.39f)
                lineTo(8.75f, 6.74f)
                horizontalLineTo(8.45f)
                curveTo(7.8f, 6.74f, 7.2f, 6.48f, 6.77f, 6.05f)
                curveTo(6.33f, 5.62f, 6.07f, 5.02f, 6.07f, 4.37f)
                curveTo(6.07f, 3.07f, 7.13f, 2.0f, 8.44f, 2.0f)
                horizontalLineTo(15.55f)
                curveTo(16.21f, 2.0f, 16.8f, 2.27f, 17.23f, 2.7f)
                curveTo(17.79f, 3.26f, 18.07f, 4.08f, 17.86f, 4.95f)
                curveTo(17.59f, 6.03f, 16.55f, 6.74f, 15.44f, 6.74f)
                horizontalLineTo(15.28f)
                lineTo(19.5f, 16.4f)
                curveTo(20.85f, 19.48f, 19.97f, 22.0f, 15.83f, 22.0f)
                horizontalLineTo(8.16f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.94f, 13.1201f)
                curveTo(5.94f, 13.1201f, 9.0f, 13.0001f, 12.0f, 14.0001f)
                curveTo(15.0f, 15.0001f, 17.83f, 13.1101f, 17.83f, 13.1101f)
            }
        }
        .build()
        return _glass1!!
    }

private var _glass1: ImageVector? = null

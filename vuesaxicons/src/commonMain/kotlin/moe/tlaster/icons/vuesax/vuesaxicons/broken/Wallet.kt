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

public val BrokenGroup.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 9.28f, 3.64f, 7.38f, 6.19f, 7.06f)
                curveTo(6.45f, 7.02f, 6.72f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(17.26f, 7.0f, 17.51f, 7.01f, 17.75f, 7.05f)
                curveTo(20.33f, 7.35f, 22.0f, 9.26f, 22.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 17.0f)
                verticalLineTo(16.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.7495f, 7.05f)
                curveTo(17.5095f, 7.01f, 17.2595f, 7.0f, 16.9995f, 7.0f)
                horizontalLineTo(6.9995f)
                curveTo(6.7194f, 7.0f, 6.4495f, 7.02f, 6.1894f, 7.06f)
                curveTo(6.3295f, 6.78f, 6.5294f, 6.52f, 6.7695f, 6.28f)
                lineTo(10.0195f, 3.02f)
                curveTo(11.3895f, 1.66f, 13.6095f, 1.66f, 14.9795f, 3.02f)
                lineTo(16.7295f, 4.79f)
                curveTo(17.3695f, 5.42f, 17.7095f, 6.22f, 17.7495f, 7.05f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.5f)
                horizontalLineTo(19.0f)
                curveTo(17.9f, 12.5f, 17.0f, 13.4f, 17.0f, 14.5f)
                curveTo(17.0f, 15.6f, 17.9f, 16.5f, 19.0f, 16.5f)
                horizontalLineTo(22.0f)
            }
        }
        .build()
        return _wallet!!
    }

private var _wallet: ImageVector? = null

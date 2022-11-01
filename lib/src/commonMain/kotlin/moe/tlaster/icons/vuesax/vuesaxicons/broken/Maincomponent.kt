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

public val BrokenGroup.Maincomponent: ImageVector
    get() {
        if (_maincomponent != null) {
            return _maincomponent!!
        }
        _maincomponent = Builder(name = "Maincomponent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7398f, 18.24f)
                lineTo(3.0598f, 14.56f)
                curveTo(1.6598f, 13.16f, 1.6598f, 10.86f, 3.0598f, 9.45f)
                lineTo(9.4498f, 3.06f)
                curveTo(10.8498f, 1.66f, 13.1498f, 1.66f, 14.5598f, 3.06f)
                lineTo(20.9498f, 9.45f)
                curveTo(22.3498f, 10.85f, 22.3498f, 13.15f, 20.9498f, 14.56f)
                lineTo(14.5598f, 20.95f)
                curveTo(13.1598f, 22.35f, 10.8598f, 22.35f, 9.4498f, 20.95f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.25f, 6.25f)
                lineTo(17.75f, 17.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 8.5f)
                lineTo(6.25f, 17.75f)
            }
        }
        .build()
        return _maincomponent!!
    }

private var _maincomponent: ImageVector? = null

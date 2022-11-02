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

public val BrokenGroup.Eos: ImageVector
    get() {
        if (_eos != null) {
            return _eos!!
        }
        _eos = Builder(name = "Eos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.48f, 15.6201f)
                lineTo(5.22f, 16.9401f)
                curveTo(5.1f, 17.5201f, 5.43f, 18.2401f, 5.95f, 18.5401f)
                lineTo(11.27f, 21.5801f)
                curveTo(11.68f, 21.8101f, 12.35f, 21.8101f, 12.76f, 21.5801f)
                lineTo(18.08f, 18.5401f)
                curveTo(18.6f, 18.2401f, 18.92f, 17.5301f, 18.81f, 16.9401f)
                lineTo(17.1f, 8.3701f)
                curveTo(17.06f, 8.1601f, 16.92f, 7.8601f, 16.78f, 7.7001f)
                lineTo(13.18f, 3.3801f)
                curveTo(12.55f, 2.6201f, 11.51f, 2.6201f, 10.88f, 3.3801f)
                lineTo(7.28f, 7.7001f)
                curveTo(7.15f, 7.8601f, 7.0f, 8.1601f, 6.96f, 8.3701f)
                lineTo(6.44f, 10.9801f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.8097f, 8.52f)
                lineTo(12.4697f, 20.68f)
                curveTo(12.3097f, 21.12f, 11.6897f, 21.12f, 11.5297f, 20.68f)
                lineTo(7.1797f, 8.5f)
            }
        }
        .build()
        return _eos!!
    }

private var _eos: ImageVector? = null

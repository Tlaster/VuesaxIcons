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

public val LinearGroup.Polkadotdot: ImageVector
    get() {
        if (_polkadotdot != null) {
            return _polkadotdot!!
        }
        _polkadotdot = Builder(name = "Polkadotdot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.4f, 13.0f)
                curveTo(4.8f, 12.0f, 4.5f, 10.8f, 4.5f, 9.5f)
                curveTo(4.5f, 5.4f, 7.9f, 2.0f, 12.0f, 2.0f)
                curveTo(16.1f, 2.0f, 19.5f, 5.4f, 19.5f, 9.5f)
                curveTo(19.5f, 13.6f, 16.1f, 17.0f, 12.0f, 17.0f)
                curveTo(12.0f, 17.0f, 9.3f, 17.0f, 8.3f, 19.2f)
                curveTo(8.1f, 19.7f, 8.0f, 20.3f, 8.0f, 21.0f)
                lineTo(10.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 21.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _polkadotdot!!
    }

private var _polkadotdot: ImageVector? = null

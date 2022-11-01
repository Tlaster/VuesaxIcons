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

public val BrokenGroup.Polkadotdot: ImageVector
    get() {
        if (_polkadotdot != null) {
            return _polkadotdot!!
        }
        _polkadotdot = Builder(name = "Polkadotdot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 9.5f)
                curveTo(19.5f, 13.64f, 16.14f, 17.0f, 12.0f, 17.0f)
                curveTo(12.0f, 17.0f, 9.31f, 17.0f, 8.34f, 19.2f)
                curveTo(8.13f, 19.69f, 8.0f, 20.28f, 8.0f, 21.0f)
                lineTo(10.0f, 7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.37f, 13.0f)
                curveTo(4.82f, 11.95f, 4.5f, 10.76f, 4.5f, 9.5f)
                curveTo(4.5f, 5.36f, 7.86f, 2.0f, 12.0f, 2.0f)
                curveTo(14.46f, 2.0f, 16.65f, 3.19f, 18.02f, 5.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                verticalLineTo(21.0f)
            }
        }
        .build()
        return _polkadotdot!!
    }

private var _polkadotdot: ImageVector? = null

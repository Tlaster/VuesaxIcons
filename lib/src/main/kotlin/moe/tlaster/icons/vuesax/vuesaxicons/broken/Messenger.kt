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

public val BrokenGroup.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.13f, 5.55f)
                curveTo(2.8f, 7.12f, 2.0f, 9.11f, 2.0f, 11.26f)
                curveTo(2.0f, 14.16f, 3.44f, 16.74f, 5.68f, 18.44f)
                verticalLineTo(22.0f)
                lineTo(9.04f, 20.11f)
                curveTo(9.98f, 20.38f, 10.97f, 20.52f, 12.0f, 20.52f)
                curveTo(17.52f, 20.52f, 22.0f, 16.37f, 22.0f, 11.26f)
                curveTo(22.0f, 6.15f, 17.52f, 2.0f, 12.0f, 2.0f)
                curveTo(10.62f, 2.0f, 9.3f, 2.26f, 8.11f, 2.73f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.28f, 9.25f)
                lineTo(7.5f, 13.75f)
                lineTo(11.19f, 12.85f)
                lineTo(12.74f, 13.75f)
                lineTo(16.5f, 9.25f)
                lineTo(12.99f, 10.15f)
                lineTo(11.28f, 9.25f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null

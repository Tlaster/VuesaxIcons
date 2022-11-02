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

public val BrokenGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9494f, 3.39f)
                lineTo(13.8194f, 2.44f)
                curveTo(12.8194f, 1.61f, 11.9994f, 1.99f, 11.9994f, 3.29f)
                verticalLineTo(20.71f)
                curveTo(11.9994f, 22.01f, 12.8194f, 22.39f, 13.8194f, 21.56f)
                lineTo(17.6694f, 18.35f)
                curveTo(18.2094f, 17.9f, 18.2194f, 17.15f, 17.7094f, 16.68f)
                lineTo(5.3594f, 5.36f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.3594f, 18.64f)
                lineTo(17.7094f, 7.32f)
                curveTo(18.2194f, 6.85f, 18.2094f, 6.1f, 17.6694f, 5.65f)
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
